def main():
    month = int(input("Enter the month (1-12): "))
    year = int(input("Enter the year: "))

    if month == 1:
        print(f"{year} January has 31 days")
    elif month == 2:
        if (year % 4) == 0:
            print(f"{year} February has 29 days")
        else:
            print(f"{year} February has 28 days")
    elif month == 3:
        print(f"{year} March has 31 days")
    elif month == 4:
        print(f"{year} April has 30 days")
    elif month == 5:
        print(f"{year} May has 31 days")
    elif month == 6:
        print(f"{year} June has 30 days")
    elif month == 7:
        print(f"{year} July has 31 days")
    elif month == 8:
        print(f"{year} August has 31 days")
    elif month == 9:
        print(f"{year} September has 30 days")
    elif month == 10:
        print(f"{year} October has 31 days")
    elif month == 11:
        print(f"{year} November has 30 days")
    elif month == 12:
        print(f"{year} December has 31 days")
    else:
        print("Invalid month")

if __name__ == "__main__":
    main()
