package homework3Week;



	
	public class Student extends User{//Bir class ne yapabiliyorsa sadece onu yapabilmli


			private String students;
			private String email;
			private String password;
			
			public Student() {
				
				
			}

			public Student(String students, String email, String password) {
				super();
				this.students = students;
				this.email = email;
				this.password = password;
			}
			
			
			@Override
			public void add() {
				System.out.println("Ögrenci eklendi.");
			}
			
			@Override
		    public void delete() {
				
				System.out.println("Ögrenci cikarildi");
			}

			public void changePassword() {
				System.out.println("Parola degistirildi.");
			}

			public String getStudents() {
				return students;
			}

			public void setStudents(String students) {
				this.students = students;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getPassword() {
				return password;
			}

			public void setPassword(String password) {
				this.password = password;
			}
			
		}
	

