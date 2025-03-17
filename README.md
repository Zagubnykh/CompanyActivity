# CompanyActivity

1. Создан класс компании Company, содержащей сотрудников и реализующей методы:

- найм одного сотрудника — hire(Employee employee),  
- найм списка сотрудников – hireAll(Collection<Employee> employes),  
- увольнение сотрудника – fire(Employee employee),  
- получение значения дохода компании – getIncome().  

2. Созданы два метода, возвращающие список указанной длины (count). Они содержат сотрудников, отсортированных по убыванию и возрастанию заработной платы:
   
- List<Employee> getTopSalaryStaff(int count),  
- List<Employee> getLowestSalaryStaff(int count).  

4. Созданы классы сотрудников с информацией о зарплатах и условиями начисления зарплаты:  

- Manager — зарплата складывается из фиксированной части и бонуса в виде 5% от заработанных для компании денег. Количество заработанных денег для компании генерируйте случайным образом от 115 000 до 140 000 рублей.  
  
- TopManager — зарплата складывается из фиксированной части и бонуса в виде 150% от заработной платы, если доход компании более 10 млн рублей.  
  
- Operator — зарплата складывается только из фиксированной части.  

Каждый имплементирует интерфейс Employee. В интерфейсе Employee объявлен метод, возвращающий зарплату сотрудника, — getMonthSalary().  

Для демонстрации и тестирования работы классов:  

- Созданы и наняты в компанию: 180 операторов Operator, 80 менеджеров по продажам Manager, 10 топ-менеджеров TopManager.
  
- Распечатан список из 10–15 самых высоких зарплат в компании.
  
- Распечатан список из 30 самых низких зарплат в компании.
  
- Уволены 50% сотрудников.
  
- Распечатан список из 10–15 самых высоких зарплат в компании.
  
- Распечатан список из 30 самых низких зарплат в компании.  
