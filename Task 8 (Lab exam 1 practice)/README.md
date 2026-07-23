1. Create a class name "Course" that that has the purpose of "managing a subject's student roster and marks, and computing class statistics", that should have methods "addStudent(String name, double marks), getHighestScorer(), and countTopGrades(double threshold)", than create its object in the Main public class and take input from terminal and should output, here is example input and output is given
**Example Input:** Math101 Asif 85 Bob 72 Charlie 91
**Example Output:** Highest Scorer: Charlie (91), Number of A+ (80+): 2
2. Create a class name "ShoppingCart" that that has the purpose of "maintaining a list of items with their prices and quantities, calculating total cost, and applying bulk discounts", that should have methods "addItem(String itemName, double price, int qty), applyDiscount(double percentage), and calculateTotalWithTax(double taxRate)", than create its object in the Main public class and take input from terminal and should output, here is example input and output is given
**Example Input:** Laptop 1000 1 Mouse 50 2 Discount 10 Tax 5
**Example Output:** Subtotal: 1100, Total after 10% discount and 5% tax: 1039.5
3. Create a class name "LibraryShelf" that that has the purpose of "keeping track of books, their authors, and availability status for a library system", that should have methods "addBook(String title, String author), borrowBook(String title), returnBook(String title), and showAvailableBooks()", than create its object in the Main public class and take input from terminal and should output, here is example input and output is given
**Example Input:** Add "Java Basics" Smith Add "Design Patterns" Gamma Borrow "Java Basics"
**Example Output:** Successfully borrowed Java Basics. Available Books: Design Patterns by Gamma
4. Create a class name "PayrollSystem" that that has the purpose of "tracking employee working hours and calculating weekly salary including overtime pay (1.5x after 40 hours)", that should have methods "addEmployee(String id, double hourlyRate), logHours(String id, double hours), and getHighestPaidEmployee()", than create its object in the Main public class and take input from terminal and should output, here is example input and output is given
**Example Input:** Alice 20 45 Bob 30 40
**Example Output:** Alice Pay: 950.0, Bob Pay: 1200.0, Top Earner: Bob
5. Create a class name "WardManager" that that has the purpose of "registering hospital patients with their severities, discharging treated patients, and identifying the most critical case", that should have methods "admitPatient(String name, int severityLevel), dischargePatient(String name), and getMostCriticalPatient()", than create its object in the Main public class and take input from terminal and should output, here is example input and output is given
**Example Input:** Admit John 3 Admit Mary 9 Admit Tom 5 Discharge John
**Example Output:** Most Critical: Mary (Severity 9), Total Current Patients: 2
6. Create a class name "SocialMediaPost" that that has the purpose of "tracking comments and likes on a specific post and calculating user engagement scores", that should have methods "addLike(), addComment(String user, String comment), getTopCommenter(), and getEngagementScore()", than create its object in the Main public class and take input from terminal and should output, here is example input and output is given
**Example Input:** Like Like Comment Alice "Nice" Comment Bob "Wow" Comment Alice "Agree"
**Example Output:** Engagement Score: 8 (1 per like, 2 per comment). Top Commenter: Alice
7. Create a class name "FleetManager" that that has the purpose of "managing a fleet of delivery trucks, tracking distance traveled, and identifying vehicles needing refueling", that should have methods "addVehicle(String plate, double fuelCapacity, double mpg), drive(String plate, double miles), and getVehiclesNeedingFuel(double thresholdPercentage)", than create its object in the Main public class and take input from terminal and should output, here is example input and output is given
**Example Input:** TruckA 50 10 Drive TruckA 400
**Example Output:** TruckA remaining fuel: 10 gallons (20%). Needs Refuel: True
8. Create a class name "RestaurantReservations" that that has the purpose of "managing table bookings, finding available tables for a specific party size, and freeing up tables", that should have methods "addTable(int tableId, int capacity), bookTable(String customerName, int partySize), and cancelBooking(String customerName)", than create its object in the Main public class and take input from terminal and should output, here is example input and output is given
**Example Input:** Table 1 2 Table 2 4 Book Asif 3 Book Sara 2
**Example Output:** Asif assigned Table 2. Sara assigned Table 1. Total available capacity: 0
9. Create a class name "StockPortfolio" that that has the purpose of "tracking bought stocks, updating live prices, and determining total portfolio profit or loss", that should have methods "buyStock(String ticker, int shares, double buyPrice), updateLivePrice(String ticker, double currentPrice), and getOverallProfitLoss()", than create its object in the Main public class and take input from terminal and should output, here is example input and output is given
**Example Input:** Buy AAPL 10 150 Update AAPL 160 Buy TSLA 5 200 Update TSLA 190
**Example Output:** Current Portfolio Value: 2550. Total Profit/Loss: +50
10. Create a class name "HotelManager" that that has the purpose of "managing room statuses (clean, occupied, dirty), checking in guests, and calculating housekeeping workload", that should have methods "addRoom(String roomNumber), checkIn(String roomNumber), checkOut(String roomNumber), and getDirtyRooms()", than create its object in the Main public class and take input from terminal and should output, here is example input and output is given
**Example Input:** Add 101 Add 102 CheckIn 101 CheckOut 101
**Example Output:** Room 101 is dirty. Available Clean Rooms: 102
11. Create a class name "PropertyLister" that that has the purpose of "storing real estate listings with prices and square footage, filtering by budget, and finding the best value property", that should have methods "addProperty(String id, double price, double sqFt), getPropertiesUnderBudget(double budget), and getBestValueProperty()", than create its object in the Main public class and take input from terminal and should output, here is example input and output is given
**Example Input:** PropA 100000 1000 PropB 150000 2000 Budget 120000
**Example Output:** Under budget: PropA. Best Value (Price/SqFt): PropB
12. Create a class name "TournamentLeaderboard" that that has the purpose of "maintaining player scores across multiple rounds and sorting the current standings", that should have methods "addScore(String player, int points), getTopThree(), and getWinner()", than create its object in the Main public class and take input from terminal and should output, here is example input and output is given
**Example Input:** Alice 50 Bob 70 Alice 30 Charlie 60
**Example Output:** 1. Alice (80) 2. Bob (70) 3. Charlie (60). Current Winner: Alice
13. Create a class name "SensorAggregator" that that has the purpose of "collecting temperature readings from IoT sensors over time and computing the peak and average readings", that should have methods "recordReading(String sensorId, double temp), getAverage(String sensorId), and getOverallPeakReading()", than create its object in the Main public class and take input from terminal and should output, here is example input and output is given
**Example Input:** Sensor1 25.5 Sensor2 30.0 Sensor1 27.5 Sensor3 35.2
**Example Output:** Sensor1 Avg: 26.5. Overall Peak: 35.2 (Sensor3)
14. Create a class name "ExpenseManager" that that has the purpose of "categorizing daily expenses, computing total spent per category, and warning if a category exceeds its budget", that should have methods "setBudget(String category, double limit), addExpense(String category, double amount), and getOverBudgetCategories()", than create its object in the Main public class and take input from terminal and should output, here is example input and output is given
**Example Input:** Budget Food 100 Food 50 Travel 20 Food 60
**Example Output:** Food Total: 110. Warning: Food is over budget by 10!
15. Create a class name "KanbanBoard" that that has the purpose of "managing tasks across 'To Do', 'In Progress', and 'Done' states, and assigning tasks to users", that should have methods "createTask(String taskId, String assignee), moveTask(String taskId, String newState), and getPendingTaskCount(String assignee)", than create its object in the Main public class and take input from terminal and should output, here is example input and output is given
**Example Input:** Task1 Dev1 Task2 Dev1 Move Task1 "In Progress" Move Task1 "Done"
**Example Output:** Completed Tasks: Task1. Dev1 Pending Tasks: 1
