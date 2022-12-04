} else {
								System.out.println("\nThe Selected Flight is :");
								flt[tkt].getroute();
								arr = seatAvailability();
								if (arr[2] == 1) {
									if (arr[1] == n) {
										section = "Economy Class";
									} else if (arr[1] == 1) {
										section = "First Class";
									}
									System.out.println("\nPress 1 to confirm the desired selected flight else press 0 :");
									cnrf = sc.nextInt();
									if (cnrf == 1) {
										System.out.println("press 1 to make payment and book tickets else press 0 : ");
										pamt = sc.nextInt();
										if (pamt == 1) {
											System.out.println("\n###Your ticket is booked sucessfully###\n");
											System.out.println("\n**************Your Ticket Details**************");
											tckt[id].setticket(id, date, section, arr[0], tkt);
											if (arr[1] == 1)
												flt[id].fare *= 2;
											tckt[id].getticket();
											flt[tkt].getroute();
											id++;
										}
									}
								}
							}
						}

						else if (depr == arvl)
							System.out.println("\n\nError! The entered Departure and Arrival city are same!!");
						else
							System.out.println("\nError! Please enter a Valid City Choice!!");
						break;

					case 2:
						System.out.print("Enter your Ticket Id : ");
						int del = sc.nextInt();
						flag = 0;
						for (int i = 0; i < 10; i++) {
							if (del == tckt[i].ticket) {
								System.out.println("\n################Your Ticket Details##############");
								tckt[del].getticket();
								flt[tckt[del].code].getroute();
								System.out.println("Press 1 to confirm Cancellation of Your Ticket else press 0 : ");
								int d = sc.nextInt();
								flag = 1;
								if (d == 1) {

									tckt[del].ticket = 111;
									System.out.println("\nYour Ticket has been cancelled Successfully.");
									System.out.println("You will get Refund Amount within two days.\n\n");
								}
								break;
							}
						}
						if (flag == 0)
							System.out.println("No such ticket exist of your entered Ticket Id!");
						break;
