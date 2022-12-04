} else {
								System.out.println("\nSelected Flight :");
								flt[tkt].getroute();
								arr = seatAvailability();
								if (arr[2] == 1) {
									if (arr[1] == 0) {
										section = "Economy Class";
									} else if (arr[1] == 1) {
										section = "First Class";
									}
									System.out.println("\nPress 1 to confirm selected flight else press 0 :");
									cnf = sc.nextInt();
									if (cnf == 1) {
										System.out.println("press 1 to make payment and book ticket else press 0 : ");
										pmt = sc.nextInt();
										if (pmt == 1) {
											System.out.println("\nTicket booked sucessfully!!\n");
											System.out.println("\n----------------Your Ticket Details--------------");
											tck[id].setticket(id, date, section, arr[0], tkt);
											if (arr[1] == 1)
												flt[id].fare *= 2;
											tck[id].getticket();
											flt[tkt].getroute();
											id++;
										}
									}
								}
							}
						}

						else if (depr == arvl)
							System.out.println("\n\nError! You have entered same Departure and Arrival city!!");
						else
							System.out.println("\nError! Please enter a Valid City Choice!!");
						break;

					case 2:
						System.out.print("Enter your Ticket Id : ");
						int del = sc.nextInt();
						flag = 0;
						for (int i = 0; i < 10; i++) {
							if (del == tck[i].ticket) {
								System.out.println("\n----------------Your Ticket Details--------------");
								tck[del].getticket();
								flt[tck[del].code].getroute();
								System.out.println("Press 1 to confirm Cancellation of Your Ticket else press 0 : ");
								int d = sc.nextInt();
								flag = 1;
								if (d == 1) {

									tck[del].ticket = 111;
									System.out.println("\nYour Ticket has been cancelled Successfully.");
									System.out.println("You will get Refund Amount within two days.\n\n");
								}
								break;
							}
						}
						if (flag == 0)
							System.out.println("No such ticket exist of your entered Ticket Id!");
						break;
