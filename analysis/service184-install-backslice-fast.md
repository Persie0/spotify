# Fast backslice of candidate service184 install

## All rsp+0x28 accesses before 0x1333835
754- 133305e:	00 
755- 133305f:	e8 88 1c 00 00       	call   1334cec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a270>
756- 1333064:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
757- 133306b:	00 
758- 133306c:	e8 1f ae 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
759- 1333071:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
760- 1333078:	00 
761- 1333079:	e8 4c 32 8f ff       	call   c262ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17326a>
762- 133307e:	48 8d bc 24 48 03 00 	lea    rdi,[rsp+0x348]
763- 1333085:	00 
764- 1333086:	e8 a3 22 39 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
765- 133308b:	4c 8b 6c 24 50       	mov    r13,QWORD PTR [rsp+0x50]
766- 1333090:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
767- 1333097:	00 
768- 1333098:	4c 89 ee             	mov    rsi,r13
769- 133309b:	e8 b2 e2 97 ff       	call   cb1352 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe2f2>
770- 13330a0:	31 c0                	xor    eax,eax
771- 13330a2:	48 8d 8c 24 90 02 00 	lea    rcx,[rsp+0x290]
772- 13330a9:	00 
773- 13330aa:	83 79 18 01          	cmp    DWORD PTR [rcx+0x18],0x1
774- 13330ae:	48 0f 45 c8          	cmovne rcx,rax
775- 13330b2:	48 8b 01             	mov    rax,QWORD PTR [rcx]
776: 13330b5:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
777- 13330ba:	4c 8b 71 08          	mov    r14,QWORD PTR [rcx+0x8]
778- 13330be:	66 0f 6f 01          	movdqa xmm0,XMMWORD PTR [rcx]
779- 13330c2:	66 0f 7f 84 24 d0 00 	movdqa XMMWORD PTR [rsp+0xd0],xmm0
780- 13330c9:	00 00 
781- 13330cb:	66 0f ef c0          	pxor   xmm0,xmm0
782- 13330cf:	66 0f 7f 01          	movdqa XMMWORD PTR [rcx],xmm0
783- 13330d3:	49 8b 77 48          	mov    rsi,QWORD PTR [r15+0x48]
784- 13330d7:	48 8b 06             	mov    rax,QWORD PTR [rsi]
785- 13330da:	48 8d bc 24 d8 01 00 	lea    rdi,[rsp+0x1d8]
786- 13330e1:	00 
787- 13330e2:	31 d2                	xor    edx,edx
788- 13330e4:	ff 50 18             	call   QWORD PTR [rax+0x18]
789- 13330e7:	49 8b 77 28          	mov    rsi,QWORD PTR [r15+0x28]
790- 13330eb:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
791- 13330f2:	00 
792- 13330f3:	e8 4c 55 fe ff       	call   1318644 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15dbc8>
793- 13330f8:	49 8b 77 28          	mov    rsi,QWORD PTR [r15+0x28]
794- 13330fc:	4c 8b a4 24 18 04 00 	mov    r12,QWORD PTR [rsp+0x418]
795- 1333103:	00 
796- 1333104:	66 0f 6f 84 24 10 04 	movdqa xmm0,XMMWORD PTR [rsp+0x410]
797- 133310b:	00 00 
798- 133310d:	41 0f b6 97 cd 00 00 	movzx  edx,BYTE PTR [r15+0xcd]
799- 1333114:	00 
800- 1333115:	48 8d 9c 24 c0 01 00 	lea    rbx,[rsp+0x1c0]
801- 133311c:	00 
802- 133311d:	48 89 df             	mov    rdi,rbx
803- 1333120:	e8 82 24 00 00       	call   13355a7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ab2b>
804- 1333125:	4c 89 74 24 70       	mov    QWORD PTR [rsp+0x70],r14
805- 133312a:	4c 89 e7             	mov    rdi,r12
806- 133312d:	e8 54 b3 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
--
1023- 13334f2:	48 8d 8c 24 a0 03 00 	lea    rcx,[rsp+0x3a0]
1024- 13334f9:	00 
1025- 13334fa:	66 0f 7f 01          	movdqa XMMWORD PTR [rcx],xmm0
1026- 13334fe:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
1027- 1333503:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
1028- 133350a:	00 
1029- 133350b:	48 8d 94 24 10 04 00 	lea    rdx,[rsp+0x410]
1030- 1333512:	00 
1031- 1333513:	4c 89 f6             	mov    rsi,r14
1032- 1333516:	41 ff 56 18          	call   QWORD PTR [r14+0x18]
1033- 133351a:	48 8b 84 24 f0 01 00 	mov    rax,QWORD PTR [rsp+0x1f0]
1034- 1333521:	00 
1035- 1333522:	48 85 c0             	test   rax,rax
1036- 1333525:	4c 8b 6c 24 50       	mov    r13,QWORD PTR [rsp+0x50]
1037- 133352a:	0f 84 1f 0f 00 00    	je     133444f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1799d3>
1038- 1333530:	0f b6 8c 24 a0 03 00 	movzx  ecx,BYTE PTR [rsp+0x3a0]
1039- 1333537:	00 
1040- 1333538:	f6 c1 01             	test   cl,0x1
1041- 133353b:	0f 84 8a 0f 00 00    	je     13344cb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179a4f>
1042- 1333541:	48 8b 8c 24 a8 03 00 	mov    rcx,QWORD PTR [rsp+0x3a8]
1043- 1333548:	00 
1044- 1333549:	e9 7f 0f 00 00       	jmp    13344cd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179a51>
1045: 133354e:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
1046- 1333553:	48 8b 06             	mov    rax,QWORD PTR [rsi]
1047- 1333556:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
1048- 133355d:	00 
1049- 133355e:	ff 50 38             	call   QWORD PTR [rax+0x38]
1050- 1333561:	4d 89 ec             	mov    r12,r13
1051- 1333564:	4c 8b ac 24 10 04 00 	mov    r13,QWORD PTR [rsp+0x410]
1052- 133356b:	00 
1053- 133356c:	4c 8b b4 24 18 04 00 	mov    r14,QWORD PTR [rsp+0x418]
1054- 1333573:	00 
1055- 1333574:	6a 04                	push   0x4
1056- 1333576:	5a                   	pop    rdx
1057- 1333577:	4c 89 ef             	mov    rdi,r13
1058- 133357a:	4c 89 f6             	mov    rsi,r14
1059- 133357d:	e8 56 38 eb ff       	call   11e6dd8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c35c>
1060- 1333582:	41 b7 01             	mov    r15b,0x1
1061- 1333585:	84 c0                	test   al,al
1062- 1333587:	74 15                	je     133359e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178b22>
1063- 1333589:	6a 3f                	push   0x3f
1064- 133358b:	5a                   	pop    rdx
1065- 133358c:	4c 89 ef             	mov    rdi,r13
1066- 133358f:	4c 89 f6             	mov    rsi,r14
1067- 1333592:	e8 41 38 eb ff       	call   11e6dd8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c35c>
1068- 1333597:	41 89 c7             	mov    r15d,eax
1069- 133359a:	41 80 f7 01          	xor    r15b,0x1
1070- 133359e:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
1071- 13335a5:	00 
1072- 13335a6:	e8 7d b8 d4 ff       	call   107ee28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24623e>
1073- 13335ab:	4d 89 e5             	mov    r13,r12
1074- 13335ae:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
1075- 13335b3:	48 8d 83 30 01 00 00 	lea    rax,[rbx+0x130]
--
1187- 13337c3:	74 05                	je     13337ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178d4e>
1188- 13337c5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
1189- 13337ca:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
1190- 13337cf:	48 8d 83 d8 04 00 00 	lea    rax,[rbx+0x4d8]
1191- 13337d6:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
1192- 13337db:	48 8d 83 f8 04 00 00 	lea    rax,[rbx+0x4f8]
1193- 13337e2:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
1194- 13337e7:	48 8d 83 18 05 00 00 	lea    rax,[rbx+0x518]
1195- 13337ee:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
1196- 13337f5:	00 
1197- 13337f6:	48 8d 83 40 05 00 00 	lea    rax,[rbx+0x540]
1198- 13337fd:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
1199- 1333802:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
1200- 1333806:	48 89 ef             	mov    rdi,rbp
1201- 1333809:	4c 89 bc 24 00 01 00 	mov    QWORD PTR [rsp+0x100],r15
1202- 1333810:	00 
1203- 1333811:	ff 50 50             	call   QWORD PTR [rax+0x50]
1204- 1333814:	48 89 83 b0 05 00 00 	mov    QWORD PTR [rbx+0x5b0],rax
1205- 133381b:	48 83 a4 24 e8 01 00 	and    QWORD PTR [rsp+0x1e8],0x0
1206- 1333822:	00 00 
1207- 1333824:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
1208- 1333829:	48 89 83 b8 05 00 00 	mov    QWORD PTR [rbx+0x5b8],rax
1209: 1333830:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
1210- 1333835:	48 89 83 c0 05 00 00 	mov    QWORD PTR [rbx+0x5c0],rax
1211- 133383c:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
1212- 1333841:	48 89 83 c8 05 00 00 	mov    QWORD PTR [rbx+0x5c8],rax
1213- 1333848:	48 8d bb d0 05 00 00 	lea    rdi,[rbx+0x5d0]
1214: 133384f:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
1215- 1333854:	e8 9d 61 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
1216- 1333859:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]
1217- 1333860:	48 8b 07             	mov    rax,QWORD PTR [rdi]
1218- 1333863:	ff 50 20             	call   QWORD PTR [rax+0x20]
1219- 1333866:	4c 89 74 24 70       	mov    QWORD PTR [rsp+0x70],r14
1220- 133386b:	34 01                	xor    al,0x1
1221- 133386d:	88 83 e0 05 00 00    	mov    BYTE PTR [rbx+0x5e0],al
1222- 1333873:	48 83 a3 e8 05 00 00 	and    QWORD PTR [rbx+0x5e8],0x0
1223- 133387a:	00 
1224- 133387b:	48 8d bb f0 05 00 00 	lea    rdi,[rbx+0x5f0]
1225- 1333882:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
1226- 1333887:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
1227- 133388c:	e8 31 de 48 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
1228- 1333891:	48 8d 35 48 92 0a ff 	lea    rsi,[rip+0xffffffffff0a9248]        # 3dcae0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x252f>
1229- 1333898:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
1230- 133389f:	00 
1231- 13338a0:	e8 d9 61 74 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
1232- 13338a5:	4c 8d a4 24 f0 04 00 	lea    r12,[rsp+0x4f0]
1233- 13338ac:	00 
1234- 13338ad:	41 c6 04 24 00       	mov    BYTE PTR [r12],0x0
1235- 13338b2:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
1236- 13338b7:	48 8b 38             	mov    rdi,QWORD PTR [rax]
1237- 13338ba:	4c 8d b4 24 10 04 00 	lea    r14,[rsp+0x410]
1238- 13338c1:	00 
1239- 13338c2:	4c 89 f6             	mov    rsi,r14
1240- 13338c5:	4c 89 e2             	mov    rdx,r12
1241- 13338c8:	e8 91 9e 85 ff       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>
1242- 13338cd:	89 c5                	mov    ebp,eax
1243- 13338cf:	4c 89 f7             	mov    rdi,r14
1244- 13338d2:	e8 b9 a5 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

## Wider window around the final assignment

/tmp/s184bs/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000001332500 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177a84>:
 1332500:	fe 01                	inc    BYTE PTR [rcx]
 1332502:	77 05                	ja     1332509 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177a8d>
 1332504:	4c 21 c8             	and    rax,r9
 1332507:	eb 0d                	jmp    1332516 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177a9a>
 1332509:	4c 39 e8             	cmp    rax,r13
 133250c:	72 08                	jb     1332516 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177a9a>
 133250e:	31 d2                	xor    edx,edx
 1332510:	49 f7 f5             	div    r13
 1332513:	48 89 d0             	mov    rax,rdx
 1332516:	48 39 c8             	cmp    rax,rcx
 1332519:	74 39                	je     1332554 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177ad8>
 133251b:	48 8b 94 24 90 01 00 	mov    rdx,QWORD PTR [rsp+0x190]
 1332522:	00 
 1332523:	48 83 3c c2 00       	cmp    QWORD PTR [rdx+rax*8],0x0
 1332528:	74 40                	je     133256a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177aee>
 133252a:	49 8b 10             	mov    rdx,QWORD PTR [r8]
 133252d:	48 89 17             	mov    QWORD PTR [rdi],rdx
 1332530:	48 8b 94 24 90 01 00 	mov    rdx,QWORD PTR [rsp+0x190]
 1332537:	00 
 1332538:	48 8b 14 c2          	mov    rdx,QWORD PTR [rdx+rax*8]
 133253c:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
 133253f:	49 89 10             	mov    QWORD PTR [r8],rdx
 1332542:	48 8b 94 24 90 01 00 	mov    rdx,QWORD PTR [rsp+0x190]
 1332549:	00 
 133254a:	48 8b 04 c2          	mov    rax,QWORD PTR [rdx+rax*8]
 133254e:	4c 89 00             	mov    QWORD PTR [rax],r8
 1332551:	49 89 f8             	mov    r8,rdi
 1332554:	48 89 c8             	mov    rax,rcx
 1332557:	4c 89 c7             	mov    rdi,r8
 133255a:	4d 8b 00             	mov    r8,QWORD PTR [r8]
 133255d:	48 89 c1             	mov    rcx,rax
 1332560:	4d 85 c0             	test   r8,r8
 1332563:	75 96                	jne    13324fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177a7f>
 1332565:	e9 ac 00 00 00       	jmp    1332616 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177b9a>
 133256a:	48 89 3c c2          	mov    QWORD PTR [rdx+rax*8],rdi
 133256e:	eb e7                	jmp    1332557 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177adb>
 1332570:	48 89 c1             	mov    rcx,rax
 1332573:	48 d1 e9             	shr    rcx,1
 1332576:	83 e0 01             	and    eax,0x1
 1332579:	48 09 c8             	or     rax,rcx
 133257c:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
 1332581:	f3 0f 58 c0          	addss  xmm0,xmm0
 1332585:	f3 0f 5e 84 24 b0 01 	divss  xmm0,DWORD PTR [rsp+0x1b0]
 133258c:	00 00 
 133258e:	66 0f 3a 0a c0 0a    	roundss xmm0,xmm0,0xa
 1332594:	f3 48 0f 2c c0       	cvttss2si rax,xmm0
 1332599:	48 89 c1             	mov    rcx,rax
 133259c:	f3 0f 5c 05 78 c2 05 	subss  xmm0,DWORD PTR [rip+0xffffffffff05c278]        # 38e81c <_ZTSSt12bad_any_cast@@Base-0x19ac>
 13325a3:	ff 
 13325a4:	f3 48 0f 2c f8       	cvttss2si rdi,xmm0
 13325a9:	48 c1 f9 3f          	sar    rcx,0x3f
 13325ad:	48 21 cf             	and    rdi,rcx
 13325b0:	48 09 c7             	or     rdi,rax
 13325b3:	48 83 fd 03          	cmp    rbp,0x3
 13325b7:	72 28                	jb     13325e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177b65>
 13325b9:	f3 48 0f b8 c5       	popcnt rax,rbp
 13325be:	83 f8 01             	cmp    eax,0x1
 13325c1:	77 1e                	ja     13325e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177b65>
 13325c3:	48 8d 47 ff          	lea    rax,[rdi-0x1]
 13325c7:	48 0f bd c8          	bsr    rcx,rax
 13325cb:	83 f1 3f             	xor    ecx,0x3f
 13325ce:	f6 d9                	neg    cl
 13325d0:	6a 01                	push   0x1
 13325d2:	41 5d                	pop    r13
 13325d4:	49 d3 e5             	shl    r13,cl
 13325d7:	48 83 ff 02          	cmp    rdi,0x2
 13325db:	4c 0f 42 ef          	cmovb  r13,rdi
 13325df:	eb 08                	jmp    13325e9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177b6d>
 13325e1:	e8 fa b9 4b 00       	call   17edfe0 <_ZNSt6__ndk112__next_primeEm@plt>
 13325e6:	49 89 c5             	mov    r13,rax
 13325e9:	4d 39 ef             	cmp    r15,r13
 13325ec:	4d 0f 47 ef          	cmova  r13,r15
 13325f0:	49 39 ed             	cmp    r13,rbp
 13325f3:	73 21                	jae    1332616 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177b9a>
 13325f5:	4d 85 ed             	test   r13,r13
 13325f8:	0f 85 36 fe ff ff    	jne    1332434 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1779b8>
 13325fe:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
 1332605:	00 
 1332606:	31 f6                	xor    esi,esi
 1332608:	e8 89 d1 76 ff       	call   a9f796 <JNI_OnUnload@@Base+0x27063>
 133260d:	48 83 a4 24 98 01 00 	and    QWORD PTR [rsp+0x198],0x0
 1332614:	00 00 
 1332616:	48 8b ac 24 98 01 00 	mov    rbp,QWORD PTR [rsp+0x198]
 133261d:	00 
 133261e:	48 8d 45 ff          	lea    rax,[rbp-0x1]
 1332622:	48 85 c5             	test   rbp,rax
 1332625:	75 05                	jne    133262c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177bb0>
 1332627:	49 21 c4             	and    r12,rax
 133262a:	eb 10                	jmp    133263c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177bc0>
 133262c:	4c 39 e5             	cmp    rbp,r12
 133262f:	77 0b                	ja     133263c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177bc0>
 1332631:	4c 89 e0             	mov    rax,r12
 1332634:	31 d2                	xor    edx,edx
 1332636:	48 f7 f5             	div    rbp
 1332639:	49 89 d4             	mov    r12,rdx
 133263c:	48 8b 84 24 90 01 00 	mov    rax,QWORD PTR [rsp+0x190]
 1332643:	00 
 1332644:	4a 8b 04 e0          	mov    rax,QWORD PTR [rax+r12*8]
 1332648:	48 8b 8c 24 f0 01 00 	mov    rcx,QWORD PTR [rsp+0x1f0]
 133264f:	00 
 1332650:	48 85 c0             	test   rax,rax
 1332653:	74 08                	je     133265d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177be1>
 1332655:	48 8b 10             	mov    rdx,QWORD PTR [rax]
 1332658:	48 89 11             	mov    QWORD PTR [rcx],rdx
 133265b:	eb 5a                	jmp    13326b7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177c3b>
 133265d:	48 8b 84 24 a0 01 00 	mov    rax,QWORD PTR [rsp+0x1a0]
 1332664:	00 
 1332665:	48 89 01             	mov    QWORD PTR [rcx],rax
 1332668:	48 89 8c 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rcx
 133266f:	00 
 1332670:	48 8b 84 24 90 01 00 	mov    rax,QWORD PTR [rsp+0x190]
 1332677:	00 
 1332678:	48 8d 94 24 a0 01 00 	lea    rdx,[rsp+0x1a0]
 133267f:	00 
 1332680:	4a 89 14 e0          	mov    QWORD PTR [rax+r12*8],rdx
 1332684:	48 8b 01             	mov    rax,QWORD PTR [rcx]
 1332687:	48 85 c0             	test   rax,rax
 133268a:	74 2e                	je     13326ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177c3e>
 133268c:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
 1332690:	48 8d 55 ff          	lea    rdx,[rbp-0x1]
 1332694:	48 85 d5             	test   rbp,rdx
 1332697:	75 05                	jne    133269e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177c22>
 1332699:	48 21 d0             	and    rax,rdx
 133269c:	eb 0d                	jmp    13326ab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177c2f>
 133269e:	48 39 e8             	cmp    rax,rbp
 13326a1:	72 08                	jb     13326ab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177c2f>
 13326a3:	31 d2                	xor    edx,edx
 13326a5:	48 f7 f5             	div    rbp
 13326a8:	48 89 d0             	mov    rax,rdx
 13326ab:	48 c1 e0 03          	shl    rax,0x3
 13326af:	48 03 84 24 90 01 00 	add    rax,QWORD PTR [rsp+0x190]
 13326b6:	00 
 13326b7:	48 89 08             	mov    QWORD PTR [rax],rcx
 13326ba:	48 83 a4 24 f0 01 00 	and    QWORD PTR [rsp+0x1f0],0x0
 13326c1:	00 00 
 13326c3:	48 ff 84 24 a8 01 00 	inc    QWORD PTR [rsp+0x1a8]
 13326ca:	00 
 13326cb:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
 13326d2:	00 
 13326d3:	e8 f2 7b 74 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
 13326d8:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]
 13326db:	48 85 db             	test   rbx,rbx
 13326de:	0f 85 aa fb ff ff    	jne    133228e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177812>
 13326e4:	48 8b 9c 24 a0 01 00 	mov    rbx,QWORD PTR [rsp+0x1a0]
 13326eb:	00 
 13326ec:	66 0f ef c0          	pxor   xmm0,xmm0
 13326f0:	66 0f 7f 84 24 40 01 	movdqa XMMWORD PTR [rsp+0x140],xmm0
 13326f7:	00 00 
 13326f9:	48 83 a4 24 50 01 00 	and    QWORD PTR [rsp+0x150],0x0
 1332700:	00 00 
 1332702:	48 85 db             	test   rbx,rbx
 1332705:	48 8b 6c 24 20       	mov    rbp,QWORD PTR [rsp+0x20]
 133270a:	0f 84 32 01 00 00    	je     1332842 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177dc6>
 1332710:	45 31 e4             	xor    r12d,r12d
 1332713:	45 31 ff             	xor    r15d,r15d
 1332716:	48 89 d8             	mov    rax,rbx
 1332719:	49 ff c7             	inc    r15
 133271c:	48 8b 00             	mov    rax,QWORD PTR [rax]
 133271f:	49 83 c4 04          	add    r12,0x4
 1332723:	48 85 c0             	test   rax,rax
 1332726:	75 f1                	jne    1332719 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177c9d>
 1332728:	31 ff                	xor    edi,edi
 133272a:	31 f6                	xor    esi,esi
 133272c:	4c 89 fa             	mov    rdx,r15
 133272f:	e8 4c bd 77 ff       	call   aae480 <JNI_OnUnload@@Base+0x35d4d>
 1332734:	48 8d 8c 24 50 01 00 	lea    rcx,[rsp+0x150]
 133273b:	00 
 133273c:	31 d2                	xor    edx,edx
 133273e:	45 31 ed             	xor    r13d,r13d
 1332741:	4c 2b 69 f0          	sub    r13,QWORD PTR [rcx-0x10]
 1332745:	48 89 8c 24 10 02 00 	mov    QWORD PTR [rsp+0x210],rcx
 133274c:	00 
 133274d:	48 85 c0             	test   rax,rax
 1332750:	74 21                	je     1332773 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177cf7>
 1332752:	48 89 c7             	mov    rdi,rax
 1332755:	e8 81 65 77 ff       	call   aa8cdb <JNI_OnUnload@@Base+0x305a8>
 133275a:	eb 19                	jmp    1332775 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177cf9>
 133275c:	66 0f 7f 84 24 40 01 	movdqa XMMWORD PTR [rsp+0x140],xmm0
 1332763:	00 00 
 1332765:	48 83 a4 24 50 01 00 	and    QWORD PTR [rsp+0x150],0x0
 133276c:	00 00 
 133276e:	e9 cf 00 00 00       	jmp    1332842 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177dc6>
 1332773:	31 c0                	xor    eax,eax
 1332775:	49 c1 fd 02          	sar    r13,0x2
 1332779:	4a 8d 0c a8          	lea    rcx,[rax+r13*4]
 133277d:	48 89 8c 24 f8 01 00 	mov    QWORD PTR [rsp+0x1f8],rcx
 1332784:	00 
 1332785:	48 8d 04 90          	lea    rax,[rax+rdx*4]
 1332789:	48 89 84 24 08 02 00 	mov    QWORD PTR [rsp+0x208],rax
 1332790:	00 
 1332791:	4e 8d 3c b9          	lea    r15,[rcx+r15*4]
 1332795:	8b 43 10             	mov    eax,DWORD PTR [rbx+0x10]
 1332798:	89 01                	mov    DWORD PTR [rcx],eax
 133279a:	48 83 c1 04          	add    rcx,0x4
 133279e:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]
 13327a1:	49 83 c4 fc          	add    r12,0xfffffffffffffffc
 13327a5:	75 ee                	jne    1332795 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177d19>
 13327a7:	48 8b 9c 24 f8 01 00 	mov    rbx,QWORD PTR [rsp+0x1f8]
 13327ae:	00 
 13327af:	48 8b 84 24 40 01 00 	mov    rax,QWORD PTR [rsp+0x140]
 13327b6:	00 
 13327b7:	48 85 c0             	test   rax,rax
 13327ba:	74 15                	je     13327d1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177d55>
 13327bc:	31 c9                	xor    ecx,ecx
 13327be:	8b 51 fc             	mov    edx,DWORD PTR [rcx-0x4]
 13327c1:	48 83 c1 fc          	add    rcx,0xfffffffffffffffc
 13327c5:	89 53 fc             	mov    DWORD PTR [rbx-0x4],edx
 13327c8:	48 83 c3 fc          	add    rbx,0xfffffffffffffffc
 13327cc:	48 39 c1             	cmp    rcx,rax
 13327cf:	75 ed                	jne    13327be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177d42>
 13327d1:	4c 8b a4 24 48 01 00 	mov    r12,QWORD PTR [rsp+0x148]
 13327d8:	00 
 13327d9:	4d 85 e4             	test   r12,r12
 13327dc:	74 17                	je     13327f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177d79>
 13327de:	4c 89 ff             	mov    rdi,r15
 13327e1:	31 f6                	xor    esi,esi
 13327e3:	4c 89 e2             	mov    rdx,r12
 13327e6:	e8 e5 d2 4b 00       	call   17efad0 <memcpy@plt>
 13327eb:	48 8b 84 24 48 01 00 	mov    rax,QWORD PTR [rsp+0x148]
 13327f2:	00 
 13327f3:	eb 02                	jmp    13327f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177d7b>
 13327f5:	31 c0                	xor    eax,eax
 13327f7:	4d 01 e7             	add    r15,r12
 13327fa:	48 8b 8c 24 40 01 00 	mov    rcx,QWORD PTR [rsp+0x140]
 1332801:	00 
 1332802:	48 8b 94 24 50 01 00 	mov    rdx,QWORD PTR [rsp+0x150]
 1332809:	00 
 133280a:	48 89 9c 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rbx
 1332811:	00 
 1332812:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
 1332819:	00 
 133281a:	48 89 4f 08          	mov    QWORD PTR [rdi+0x8],rcx
 133281e:	4c 89 bc 24 48 01 00 	mov    QWORD PTR [rsp+0x148],r15
 1332825:	00 
 1332826:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 133282a:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
 133282e:	48 89 84 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rax
 1332835:	00 
 1332836:	48 89 57 18          	mov    QWORD PTR [rdi+0x18],rdx
 133283a:	48 89 0f             	mov    QWORD PTR [rdi],rcx
 133283d:	e8 d4 bc 77 ff       	call   aae516 <JNI_OnUnload@@Base+0x35de3>
 1332842:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
 1332849:	00 
 133284a:	e8 8f b7 84 ff       	call   b7dfde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcaf7e>
 133284f:	4c 8d bc 24 c0 01 00 	lea    r15,[rsp+0x1c0]
 1332856:	00 
 1332857:	4c 89 ff             	mov    rdi,r15
 133285a:	e8 7f b7 84 ff       	call   b7dfde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcaf7e>
 133285f:	66 0f ef c0          	pxor   xmm0,xmm0
 1332863:	66 41 0f 7f 07       	movdqa XMMWORD PTR [r15],xmm0
 1332868:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
 133286d:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
 1332874:	00 
 1332875:	48 8d 8c 24 40 01 00 	lea    rcx,[rsp+0x140]
 133287c:	00 
 133287d:	4c 8d 84 24 c0 01 00 	lea    r8,[rsp+0x1c0]
 1332884:	00 
 1332885:	48 8b b4 24 a8 00 00 	mov    rsi,QWORD PTR [rsp+0xa8]
 133288c:	00 
 133288d:	48 8b 94 24 a0 00 00 	mov    rdx,QWORD PTR [rsp+0xa0]
 1332894:	00 
 1332895:	e8 6c 9c 00 00       	call   133c506 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x181a8a>
 133289a:	4c 8d bc 24 58 01 00 	lea    r15,[rsp+0x158]
 13328a1:	00 
 13328a2:	49 8b 37             	mov    rsi,QWORD PTR [r15]
 13328a5:	49 83 27 00          	and    QWORD PTR [r15],0x0
 13328a9:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
 13328ae:	e8 c9 53 00 00       	call   1337c7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d200>
 13328b3:	4c 89 ff             	mov    rdi,r15
 13328b6:	e8 3d 54 00 00       	call   1337cf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d27c>
 13328bb:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
 13328c2:	00 
 13328c3:	e8 60 8e 74 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 13328c8:	4c 8d bc 24 40 01 00 	lea    r15,[rsp+0x140]
 13328cf:	00 
 13328d0:	4c 89 ff             	mov    rdi,r15
 13328d3:	e8 50 8e 74 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 13328d8:	4c 8b a5 18 02 00 00 	mov    r12,QWORD PTR [rbp+0x218]
 13328df:	49 89 2f             	mov    QWORD PTR [r15],rbp
 13328e2:	48 8d 35 a8 a7 76 ff 	lea    rsi,[rip+0xffffffffff76a7a8]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 13328e9:	48 8d 0d f6 22 01 00 	lea    rcx,[rip+0x122f6]        # 1344be6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a16a>
 13328f0:	4c 8d bc 24 f0 01 00 	lea    r15,[rsp+0x1f0]
 13328f7:	00 
 13328f8:	4c 8d 84 24 40 01 00 	lea    r8,[rsp+0x140]
 13328ff:	00 
 1332900:	6a 08                	push   0x8
 1332902:	41 59                	pop    r9
 1332904:	4c 89 ff             	mov    rdi,r15
 1332907:	31 d2                	xor    edx,edx
 1332909:	e8 86 7e 4a 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 133290e:	4c 8d ac 24 90 01 00 	lea    r13,[rsp+0x190]
 1332915:	00 
 1332916:	4c 89 ef             	mov    rdi,r13
 1332919:	4c 89 e6             	mov    rsi,r12
 133291c:	4c 89 fa             	mov    rdx,r15
 133291f:	e8 f8 c9 fe ff       	call   131f31c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1648a0>
 1332924:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
 1332929:	4c 89 ee             	mov    rsi,r13
 133292c:	e8 c1 72 4a 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 1332931:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
 1332935:	e8 4c bb 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 133293a:	4c 89 ff             	mov    rdi,r15
 133293d:	e8 a6 7e 4a 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 1332942:	48 8d 95 18 01 00 00 	lea    rdx,[rbp+0x118]
 1332949:	48 8b 84 24 d0 00 00 	mov    rax,QWORD PTR [rsp+0xd0]
 1332950:	00 
 1332951:	48 8d b4 24 f0 01 00 	lea    rsi,[rsp+0x1f0]
 1332958:	00 
 1332959:	48 89 06             	mov    QWORD PTR [rsi],rax
 133295c:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
 1332961:	e8 a6 ee 97 ff       	call   cb180c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe7ac>
 1332966:	4c 39 74 24 48       	cmp    QWORD PTR [rsp+0x48],r14
 133296b:	4c 8b 6c 24 30       	mov    r13,QWORD PTR [rsp+0x30]
 1332970:	4c 8b 64 24 70       	mov    r12,QWORD PTR [rsp+0x70]
 1332975:	0f 84 de 00 00 00    	je     1332a59 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177fdd>
 133297b:	4b 8d 1c 26          	lea    rbx,[r14+r12*1]
 133297f:	4c 8d 3d 6a a3 0a ff 	lea    r15,[rip+0xffffffffff0aa36a]        # 3dccf0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x273f>
 1332986:	4c 89 f7             	mov    rdi,r14
 1332989:	4c 89 fe             	mov    rsi,r15
 133298c:	e8 5d cd 76 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
 1332991:	84 c0                	test   al,al
 1332993:	75 0f                	jne    13329a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177f28>
 1332995:	49 83 c6 20          	add    r14,0x20
 1332999:	49 83 c4 e0          	add    r12,0xffffffffffffffe0
 133299d:	75 e7                	jne    1332986 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177f0a>
 133299f:	e9 b5 00 00 00       	jmp    1332a59 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177fdd>
 13329a4:	49 39 de             	cmp    r14,rbx
 13329a7:	0f 84 ac 00 00 00    	je     1332a59 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177fdd>
 13329ad:	48 8b 84 24 98 00 00 	mov    rax,QWORD PTR [rsp+0x98]
 13329b4:	00 
 13329b5:	48 8b 30             	mov    rsi,QWORD PTR [rax]
 13329b8:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
 13329bf:	00 
 13329c0:	e8 99 e9 00 00       	call   134135e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1868e2>
 13329c5:	48 8d b4 24 f0 01 00 	lea    rsi,[rsp+0x1f0]
 13329cc:	00 
 13329cd:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
 13329d2:	e8 ff 5c fa ff       	call   12d86d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11dc5a>
 13329d7:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
 13329de:	00 
 13329df:	e8 a6 33 d6 ff       	call   1095d8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25d1a0>
 13329e4:	4c 8b b5 20 02 00 00 	mov    r14,QWORD PTR [rbp+0x220]
 13329eb:	4c 8d 84 24 40 01 00 	lea    r8,[rsp+0x140]
 13329f2:	00 
 13329f3:	49 89 28             	mov    QWORD PTR [r8],rbp
 13329f6:	48 8d 35 94 a6 76 ff 	lea    rsi,[rip+0xffffffffff76a694]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 13329fd:	48 8d 0d f8 21 01 00 	lea    rcx,[rip+0x121f8]        # 1344bfc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a180>
 1332a04:	4c 8d bc 24 f0 01 00 	lea    r15,[rsp+0x1f0]
 1332a0b:	00 
 1332a0c:	6a 08                	push   0x8
 1332a0e:	41 59                	pop    r9
 1332a10:	4c 89 ff             	mov    rdi,r15
 1332a13:	31 d2                	xor    edx,edx
 1332a15:	e8 7a 7d 4a 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 1332a1a:	4c 8d a4 24 90 01 00 	lea    r12,[rsp+0x190]
 1332a21:	00 
 1332a22:	4c 89 e7             	mov    rdi,r12
 1332a25:	4c 89 f6             	mov    rsi,r14
 1332a28:	4c 89 fa             	mov    rdx,r15
 1332a2b:	e8 88 3c e4 ff       	call   11766b8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33dace>
 1332a30:	4c 89 ef             	mov    rdi,r13
 1332a33:	4c 89 e6             	mov    rsi,r12
 1332a36:	e8 b7 71 4a 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 1332a3b:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
 1332a40:	e8 41 ba 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1332a45:	4c 89 ff             	mov    rdi,r15
 1332a48:	e8 9b 7d 4a 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 1332a4d:	48 8b bd 20 02 00 00 	mov    rdi,QWORD PTR [rbp+0x220]
 1332a54:	e8 c5 ea 00 00       	call   134151e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x186aa2>
 1332a59:	48 89 ef             	mov    rdi,rbp
 1332a5c:	e8 b5 21 01 00       	call   1344c16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a19a>
 1332a61:	48 8d bc 24 50 02 00 	lea    rdi,[rsp+0x250]
 1332a68:	00 
 1332a69:	e8 18 60 00 00       	call   1338a86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e00a>
 1332a6e:	48 8d bc 24 18 01 00 	lea    rdi,[rsp+0x118]
 1332a75:	00 
 1332a76:	e8 8f 78 fe ff       	call   131a30a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f88e>
 1332a7b:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 1332a80:	e8 01 ba 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1332a85:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
 1332a8c:	00 
 1332a8d:	e8 38 38 8f ff       	call   c262ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17326a>
 1332a92:	4c 8b b4 24 b0 00 00 	mov    r14,QWORD PTR [rsp+0xb0]
 1332a99:	00 
 1332a9a:	49 89 2e             	mov    QWORD PTR [r14],rbp
 1332a9d:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
 1332aa4:	00 
 1332aa5:	e8 60 78 fe ff       	call   131a30a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f88e>
 1332aaa:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
 1332ab1:	00 
 1332ab2:	e8 cf b9 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1332ab7:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
 1332abe:	00 
 1332abf:	e8 c2 b9 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1332ac4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1332acb:	00 00 
 1332acd:	48 3b 84 24 30 03 00 	cmp    rax,QWORD PTR [rsp+0x330]
 1332ad4:	00 
 1332ad5:	0f 85 f9 02 00 00    	jne    1332dd4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178358>
 1332adb:	4c 89 f0             	mov    rax,r14
 1332ade:	48 81 c4 38 03 00 00 	add    rsp,0x338
 1332ae5:	5b                   	pop    rbx
 1332ae6:	41 5c                	pop    r12
 1332ae8:	41 5d                	pop    r13
 1332aea:	41 5e                	pop    r14
 1332aec:	41 5f                	pop    r15
 1332aee:	5d                   	pop    rbp
 1332aef:	c3                   	ret
 1332af0:	b0 01                	mov    al,0x1
 1332af2:	e9 a8 f4 ff ff       	jmp    1331f9f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177523>
 1332af7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1332afe:	00 00 
 1332b00:	48 3b 84 24 30 03 00 	cmp    rax,QWORD PTR [rsp+0x330]
 1332b07:	00 
 1332b08:	0f 85 c6 02 00 00    	jne    1332dd4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178358>
 1332b0e:	e8 cc 8b 74 ff       	call   a7b6df <JNI_OnUnload@@Base+0x2fac>
 1332b13:	48 89 6c 24 20       	mov    QWORD PTR [rsp+0x20],rbp
 1332b18:	49 89 c6             	mov    r14,rax
 1332b1b:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
 1332b22:	00 
 1332b23:	e8 62 32 d6 ff       	call   1095d8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25d1a0>
 1332b28:	e9 42 01 00 00       	jmp    1332c6f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1781f3>
 1332b2d:	eb 40                	jmp    1332b6f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1780f3>
 1332b2f:	49 89 c6             	mov    r14,rax
 1332b32:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
 1332b39:	00 
 1332b3a:	e8 e9 8b 74 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 1332b3f:	e9 11 01 00 00       	jmp    1332c55 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1781d9>
 1332b44:	48 89 6c 24 20       	mov    QWORD PTR [rsp+0x20],rbp
 1332b49:	49 89 c6             	mov    r14,rax
 1332b4c:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
 1332b53:	00 
 1332b54:	e8 cf 8b 74 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 1332b59:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
 1332b60:	00 
 1332b61:	e8 c2 8b 74 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 1332b66:	e9 04 01 00 00       	jmp    1332c6f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1781f3>
 1332b6b:	eb 02                	jmp    1332b6f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1780f3>
 1332b6d:	eb 00                	jmp    1332b6f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1780f3>
 1332b6f:	48 89 6c 24 20       	mov    QWORD PTR [rsp+0x20],rbp
 1332b74:	49 89 c6             	mov    r14,rax
 1332b77:	e9 f3 00 00 00       	jmp    1332c6f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1781f3>
 1332b7c:	48 89 5c 24 30       	mov    QWORD PTR [rsp+0x30],rbx
 1332b81:	48 89 6c 24 20       	mov    QWORD PTR [rsp+0x20],rbp
 1332b86:	49 89 c6             	mov    r14,rax
 1332b89:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
 1332b90:	00 
 1332b91:	e8 d4 73 74 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 1332b96:	e9 e1 00 00 00       	jmp    1332c7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178200>
 1332b9b:	48 89 5c 24 30       	mov    QWORD PTR [rsp+0x30],rbx
 1332ba0:	48 89 6c 24 20       	mov    QWORD PTR [rsp+0x20],rbp
 1332ba5:	49 89 c6             	mov    r14,rax
 1332ba8:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
 1332baf:	00 
 1332bb0:	e8 b5 73 74 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 1332bb5:	e9 c2 00 00 00       	jmp    1332c7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178200>
 1332bba:	48 89 5c 24 30       	mov    QWORD PTR [rsp+0x30],rbx
 1332bbf:	48 89 6c 24 20       	mov    QWORD PTR [rsp+0x20],rbp
 1332bc4:	49 89 c6             	mov    r14,rax
 1332bc7:	e9 cb 00 00 00       	jmp    1332c97 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17821b>
 1332bcc:	48 89 5c 24 30       	mov    QWORD PTR [rsp+0x30],rbx
 1332bd1:	48 89 6c 24 20       	mov    QWORD PTR [rsp+0x20],rbp
 1332bd6:	49 89 c6             	mov    r14,rax
 1332bd9:	e9 da 00 00 00       	jmp    1332cb8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17823c>
 1332bde:	48 89 eb             	mov    rbx,rbp
 1332be1:	49 89 c6             	mov    r14,rax
 1332be4:	e9 17 01 00 00       	jmp    1332d00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178284>
 1332be9:	48 89 eb             	mov    rbx,rbp
 1332bec:	49 89 c6             	mov    r14,rax
 1332bef:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
 1332bf6:	00 
 1332bf7:	e8 2c c2 d4 ff       	call   107ee28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24623e>
 1332bfc:	e9 15 01 00 00       	jmp    1332d16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17829a>
 1332c01:	48 89 eb             	mov    rbx,rbp
 1332c04:	49 89 c6             	mov    r14,rax
 1332c07:	e9 17 01 00 00       	jmp    1332d23 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1782a7>
 1332c0c:	49 89 c6             	mov    r14,rax
 1332c0f:	e9 76 01 00 00       	jmp    1332d8a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17830e>
 1332c14:	eb 00                	jmp    1332c16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17819a>
 1332c16:	49 89 c6             	mov    r14,rax
 1332c19:	e9 74 01 00 00       	jmp    1332d92 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178316>
 1332c1e:	49 89 c6             	mov    r14,rax
 1332c21:	4c 89 ff             	mov    rdi,r15
 1332c24:	e8 5d b8 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1332c29:	e9 7e 01 00 00       	jmp    1332dac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178330>
 1332c2e:	49 89 c6             	mov    r14,rax
 1332c31:	e9 76 01 00 00       	jmp    1332dac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178330>
 1332c36:	eb 08                	jmp    1332c40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1781c4>
 1332c38:	49 89 c6             	mov    r14,rax
 1332c3b:	e9 5f 01 00 00       	jmp    1332d9f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178323>
 1332c40:	49 89 c6             	mov    r14,rax
 1332c43:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
 1332c4a:	00 
 1332c4b:	e8 7a 76 74 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
 1332c50:	eb 03                	jmp    1332c55 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1781d9>
 1332c52:	49 89 c6             	mov    r14,rax
 1332c55:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
 1332c5c:	00 
 1332c5d:	e8 7c b3 84 ff       	call   b7dfde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcaf7e>
 1332c62:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
 1332c69:	00 
 1332c6a:	e8 6f b3 84 ff       	call   b7dfde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcaf7e>
 1332c6f:	48 8d bc 24 50 02 00 	lea    rdi,[rsp+0x250]
 1332c76:	00 
 1332c77:	e8 0a 5e 00 00       	call   1338a86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e00a>
 1332c7c:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 1332c81:	48 8b b8 d8 02 00 00 	mov    rdi,QWORD PTR [rax+0x2d8]
 1332c88:	e8 25 b8 76 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 1332c8d:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
 1332c92:	e8 e5 c4 83 ff       	call   b6f17c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc11c>
 1332c97:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 1332c9c:	4c 8d b8 98 02 00 00 	lea    r15,[rax+0x298]
 1332ca3:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
 1332caa:	00 
 1332cab:	e8 96 ea 48 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
 1332cb0:	4c 89 ff             	mov    rdi,r15
 1332cb3:	e8 52 76 fe ff       	call   131a30a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f88e>
 1332cb8:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
 1332cbd:	49 8b bf 88 02 00 00 	mov    rdi,QWORD PTR [r15+0x288]
 1332cc4:	e8 bd b7 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1332cc9:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
 1332cce:	e8 01 6f 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 1332cd3:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
 1332cd8:	e8 f7 6e 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 1332cdd:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
 1332ce2:	e8 ed 6e 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 1332ce7:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
 1332cec:	e8 13 f2 97 ff       	call   cb1f04 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1feea4>
 1332cf1:	4c 89 fb             	mov    rbx,r15
 1332cf4:	49 8b bf 28 02 00 00 	mov    rdi,QWORD PTR [r15+0x228]
 1332cfb:	e8 86 b7 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1332d00:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
 1332d05:	e8 ee 4f 00 00       	call   1337cf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d27c>
 1332d0a:	48 8b bb 10 02 00 00 	mov    rdi,QWORD PTR [rbx+0x210]
 1332d11:	e8 70 b7 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1332d16:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
 1332d1d:	00 
 1332d1e:	e8 9b 5d 00 00       	call   1338abe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e042>
 1332d23:	49 89 df             	mov    r15,rbx
 1332d26:	49 81 c7 38 01 00 00 	add    r15,0x138
 1332d2d:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
 1332d32:	e8 53 30 d6 ff       	call   1095d8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25d1a0>
 1332d37:	4c 89 ff             	mov    rdi,r15
 1332d3a:	e8 8b 35 8f ff       	call   c262ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17326a>
 1332d3f:	48 89 dd             	mov    rbp,rbx
 1332d42:	48 8b bb 30 01 00 00 	mov    rdi,QWORD PTR [rbx+0x130]
 1332d49:	e8 38 b7 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1332d4e:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
 1332d55:	00 
 1332d56:	e8 87 5d 00 00       	call   1338ae2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e066>
 1332d5b:	48 8d bc 24 18 01 00 	lea    rdi,[rsp+0x118]
 1332d62:	00 
 1332d63:	e8 a2 75 fe ff       	call   131a30a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f88e>
 1332d68:	66 0f 6f 84 24 c0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xc0]
 1332d6f:	00 00 
 1332d71:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
 1332d78:	e8 09 b7 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1332d7d:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
 1332d84:	00 
 1332d85:	e8 40 35 8f ff       	call   c262ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17326a>
 1332d8a:	48 89 ef             	mov    rdi,rbp
 1332d8d:	e8 8e b1 4b 00       	call   17edf20 <_ZdlPv@plt>
 1332d92:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
 1332d99:	00 
 1332d9a:	e8 6b 75 fe ff       	call   131a30a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f88e>
 1332d9f:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
 1332da6:	00 
 1332da7:	e8 da b6 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1332dac:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
 1332db3:	00 
 1332db4:	e8 cd b6 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1332db9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1332dc0:	00 00 
 1332dc2:	48 3b 84 24 30 03 00 	cmp    rax,QWORD PTR [rsp+0x330]
 1332dc9:	00 
 1332dca:	75 08                	jne    1332dd4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178358>
 1332dcc:	4c 89 f7             	mov    rdi,r14
 1332dcf:	e8 fc ce 73 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 1332dd4:	e8 d7 cc 4b 00       	call   17efab0 <__stack_chk_fail@plt>
 1332dd9:	cc                   	int3
 1332dda:	53                   	push   rbx
 1332ddb:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
 1332ddf:	48 85 c0             	test   rax,rax
 1332de2:	74 11                	je     1332df5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178379>
 1332de4:	48 89 fb             	mov    rbx,rdi
 1332de7:	31 ff                	xor    edi,edi
 1332de9:	48 89 de             	mov    rsi,rbx
 1332dec:	31 d2                	xor    edx,edx
 1332dee:	ff d0                	call   rax
 1332df0:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
 1332df5:	5b                   	pop    rbx
 1332df6:	c3                   	ret
 1332df7:	48 89 c7             	mov    rdi,rax
 1332dfa:	e8 a6 6c 74 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 1332dff:	cc                   	int3
 1332e00:	55                   	push   rbp
 1332e01:	41 57                	push   r15
 1332e03:	41 56                	push   r14
 1332e05:	41 55                	push   r13
 1332e07:	41 54                	push   r12
 1332e09:	53                   	push   rbx
 1332e0a:	48 81 ec 38 05 00 00 	sub    rsp,0x538
 1332e11:	49 89 cc             	mov    r12,rcx
 1332e14:	49 89 fe             	mov    r14,rdi
 1332e17:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1332e1e:	00 00 
 1332e20:	48 89 84 24 30 05 00 	mov    QWORD PTR [rsp+0x530],rax
 1332e27:	00 
 1332e28:	4c 8b 3e             	mov    r15,QWORD PTR [rsi]
 1332e2b:	49 8b 77 60          	mov    rsi,QWORD PTR [r15+0x60]
 1332e2f:	48 8d aa 70 01 00 00 	lea    rbp,[rdx+0x170]
 1332e36:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 1332e39:	48 8d 9c 24 a0 01 00 	lea    rbx,[rsp+0x1a0]
 1332e40:	00 
 1332e41:	6a 01                	push   0x1
 1332e43:	59                   	pop    rcx
 1332e44:	48 89 df             	mov    rdi,rbx
 1332e47:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx
 1332e4c:	49 89 e8             	mov    r8,rbp
 1332e4f:	ff 50 40             	call   QWORD PTR [rax+0x40]
 1332e52:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 1332e55:	48 85 ff             	test   rdi,rdi
 1332e58:	0f 84 35 01 00 00    	je     1332f93 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178517>
 1332e5e:	4c 89 b4 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],r14
 1332e65:	00 
 1332e66:	4d 8b b7 d0 00 00 00 	mov    r14,QWORD PTR [r15+0xd0]
 1332e6d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1332e70:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
 1332e76:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
 1332e7b:	4c 8d 6b 60          	lea    r13,[rbx+0x60]
 1332e7f:	48 8d bc 24 48 03 00 	lea    rdi,[rsp+0x348]
 1332e86:	00 
 1332e87:	48 89 c6             	mov    rsi,rax
 1332e8a:	e8 d7 6f 39 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
 1332e8f:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
 1332e96:	00 
 1332e97:	4c 89 ee             	mov    rsi,r13
 1332e9a:	e8 41 91 9d ff       	call   d0bfe0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x258f80>
 1332e9f:	48 89 6c 24 50       	mov    QWORD PTR [rsp+0x50],rbp
 1332ea4:	4c 89 6c 24 48       	mov    QWORD PTR [rsp+0x48],r13
 1332ea9:	4c 89 64 24 78       	mov    QWORD PTR [rsp+0x78],r12
 1332eae:	48 8d b3 d8 00 00 00 	lea    rsi,[rbx+0xd8]
 1332eb5:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
 1332ebc:	00 
 1332ebd:	e8 7e b0 4b 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 1332ec2:	40 8a ab d0 00 00 00 	mov    bpl,BYTE PTR [rbx+0xd0]
 1332ec9:	48 8d 9c 24 10 04 00 	lea    rbx,[rsp+0x410]
 1332ed0:	00 
 1332ed1:	48 8d b4 24 48 03 00 	lea    rsi,[rsp+0x348]
 1332ed8:	00 
 1332ed9:	48 89 df             	mov    rdi,rbx
 1332edc:	e8 53 75 39 00       	call   16ca434 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e5a0>
 1332ee1:	66 0f 6f 84 24 80 01 	movdqa xmm0,XMMWORD PTR [rsp+0x180]
 1332ee8:	00 00 
 1332eea:	f3 0f 7f 43 58       	movdqu XMMWORD PTR [rbx+0x58],xmm0
 1332eef:	48 8b 84 24 90 01 00 	mov    rax,QWORD PTR [rsp+0x190]
 1332ef6:	00 
 1332ef7:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
 1332efb:	48 83 a4 24 90 01 00 	and    QWORD PTR [rsp+0x190],0x0
 1332f02:	00 00 
 1332f04:	66 0f ef c0          	pxor   xmm0,xmm0
 1332f08:	66 0f 7f 84 24 80 01 	movdqa XMMWORD PTR [rsp+0x180],xmm0
 1332f0f:	00 00 
 1332f11:	40 88 6b 70          	mov    BYTE PTR [rbx+0x70],bpl
 1332f15:	0f 28 8c 24 60 01 00 	movaps xmm1,XMMWORD PTR [rsp+0x160]
 1332f1c:	00 
 1332f1d:	0f 11 4b 78          	movups XMMWORD PTR [rbx+0x78],xmm1
 1332f21:	48 8b 84 24 70 01 00 	mov    rax,QWORD PTR [rsp+0x170]
 1332f28:	00 
 1332f29:	48 89 83 88 00 00 00 	mov    QWORD PTR [rbx+0x88],rax
 1332f30:	66 0f 7f 84 24 60 01 	movdqa XMMWORD PTR [rsp+0x160],xmm0
 1332f37:	00 00 
 1332f39:	48 83 a4 24 70 01 00 	and    QWORD PTR [rsp+0x170],0x0
 1332f40:	00 00 
 1332f42:	4d 8d 66 30          	lea    r12,[r14+0x30]
 1332f46:	4c 89 e7             	mov    rdi,r12
 1332f49:	48 89 de             	mov    rsi,rbx
 1332f4c:	e8 d5 1d 00 00       	call   1334d26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a2aa>
 1332f51:	48 85 c0             	test   rax,rax
 1332f54:	74 4d                	je     1332fa3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178527>
 1332f56:	48 89 c3             	mov    rbx,rax
 1332f59:	48 8b b8 a8 00 00 00 	mov    rdi,QWORD PTR [rax+0xa8]
 1332f60:	48 85 ff             	test   rdi,rdi
 1332f63:	74 37                	je     1332f9c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178520>
 1332f65:	e8 d6 b1 4b 00       	call   17ee140 <_ZNSt6__ndk119__shared_weak_count4lockEv@plt>
 1332f6a:	48 85 c0             	test   rax,rax
 1332f6d:	74 2d                	je     1332f9c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178520>
 1332f6f:	48 89 c7             	mov    rdi,rax
 1332f72:	48 8b 83 a0 00 00 00 	mov    rax,QWORD PTR [rbx+0xa0]
 1332f79:	48 85 c0             	test   rax,rax
 1332f7c:	74 20                	je     1332f9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178522>
 1332f7e:	48 89 84 24 90 02 00 	mov    QWORD PTR [rsp+0x290],rax
 1332f85:	00 
 1332f86:	48 89 bc 24 98 02 00 	mov    QWORD PTR [rsp+0x298],rdi
 1332f8d:	00 
 1332f8e:	e9 b2 00 00 00       	jmp    1333045 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1785c9>
 1332f93:	49 83 26 00          	and    QWORD PTR [r14],0x0
 1332f97:	e9 7a 14 00 00       	jmp    1334416 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17999a>
 1332f9c:	31 ff                	xor    edi,edi
 1332f9e:	e8 e3 b4 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1332fa3:	49 8d 6e 58          	lea    rbp,[r14+0x58]
 1332fa7:	48 8d b4 24 10 04 00 	lea    rsi,[rsp+0x410]
 1332fae:	00 
 1332faf:	48 89 ef             	mov    rdi,rbp
 1332fb2:	e8 6f 1d 00 00       	call   1334d26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a2aa>
 1332fb7:	48 85 c0             	test   rax,rax
 1332fba:	0f 84 2e 05 00 00    	je     13334ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178a72>
 1332fc0:	49 89 c5             	mov    r13,rax
 1332fc3:	48 8b 80 a0 00 00 00 	mov    rax,QWORD PTR [rax+0xa0]
 1332fca:	48 8b 50 10          	mov    rdx,QWORD PTR [rax+0x10]
 1332fce:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
 1332fd3:	4c 89 eb             	mov    rbx,r13
 1332fd6:	48 83 c3 10          	add    rbx,0x10
 1332fda:	48 8d 8c 24 e0 02 00 	lea    rcx,[rsp+0x2e0]
 1332fe1:	00 
 1332fe2:	48 89 11             	mov    QWORD PTR [rcx],rdx
 1332fe5:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
 1332fec:	00 
 1332fed:	4c 89 f6             	mov    rsi,r14
 1332ff0:	48 89 da             	mov    rdx,rbx
 1332ff3:	e8 f2 1d 00 00       	call   1334dea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a36e>
 1332ff8:	48 8b bc 24 e0 02 00 	mov    rdi,QWORD PTR [rsp+0x2e0]
 1332fff:	00 
 1333000:	48 85 ff             	test   rdi,rdi
 1333003:	74 06                	je     133300b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17858f>
 1333005:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1333008:	ff 50 08             	call   QWORD PTR [rax+0x8]
 133300b:	4c 89 e7             	mov    rdi,r12
 133300e:	48 89 de             	mov    rsi,rbx
 1333011:	e8 b8 1f 00 00       	call   1334fce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a552>
 1333016:	0f 28 84 24 a0 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x3a0]
 133301d:	00 
 133301e:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
 1333023:	48 89 c7             	mov    rdi,rax
 1333026:	e8 df 68 7f ff       	call   b2990a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x768aa>
 133302b:	48 89 ef             	mov    rdi,rbp
 133302e:	4c 89 ee             	mov    rsi,r13
 1333031:	e8 3e 24 00 00       	call   1335474 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a9f8>
 1333036:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
 133303c:	66 0f 7f 84 24 90 02 	movdqa XMMWORD PTR [rsp+0x290],xmm0
 1333043:	00 00 
 1333045:	c7 84 24 a8 02 00 00 	mov    DWORD PTR [rsp+0x2a8],0x1
 133304c:	01 00 00 00 
 1333050:	31 ff                	xor    edi,edi
 1333052:	e8 2f b4 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1333057:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
 133305e:	00 
 133305f:	e8 88 1c 00 00       	call   1334cec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a270>
 1333064:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
 133306b:	00 
 133306c:	e8 1f ae 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1333071:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
 1333078:	00 
 1333079:	e8 4c 32 8f ff       	call   c262ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17326a>
 133307e:	48 8d bc 24 48 03 00 	lea    rdi,[rsp+0x348]
 1333085:	00 
 1333086:	e8 a3 22 39 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
 133308b:	4c 8b 6c 24 50       	mov    r13,QWORD PTR [rsp+0x50]
 1333090:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
 1333097:	00 
 1333098:	4c 89 ee             	mov    rsi,r13
 133309b:	e8 b2 e2 97 ff       	call   cb1352 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe2f2>
 13330a0:	31 c0                	xor    eax,eax
 13330a2:	48 8d 8c 24 90 02 00 	lea    rcx,[rsp+0x290]
 13330a9:	00 
 13330aa:	83 79 18 01          	cmp    DWORD PTR [rcx+0x18],0x1
 13330ae:	48 0f 45 c8          	cmovne rcx,rax
 13330b2:	48 8b 01             	mov    rax,QWORD PTR [rcx]
 13330b5:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
 13330ba:	4c 8b 71 08          	mov    r14,QWORD PTR [rcx+0x8]
 13330be:	66 0f 6f 01          	movdqa xmm0,XMMWORD PTR [rcx]
 13330c2:	66 0f 7f 84 24 d0 00 	movdqa XMMWORD PTR [rsp+0xd0],xmm0
 13330c9:	00 00 
 13330cb:	66 0f ef c0          	pxor   xmm0,xmm0
 13330cf:	66 0f 7f 01          	movdqa XMMWORD PTR [rcx],xmm0
 13330d3:	49 8b 77 48          	mov    rsi,QWORD PTR [r15+0x48]
 13330d7:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 13330da:	48 8d bc 24 d8 01 00 	lea    rdi,[rsp+0x1d8]
 13330e1:	00 
 13330e2:	31 d2                	xor    edx,edx
 13330e4:	ff 50 18             	call   QWORD PTR [rax+0x18]
 13330e7:	49 8b 77 28          	mov    rsi,QWORD PTR [r15+0x28]
 13330eb:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
 13330f2:	00 
 13330f3:	e8 4c 55 fe ff       	call   1318644 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15dbc8>
 13330f8:	49 8b 77 28          	mov    rsi,QWORD PTR [r15+0x28]
 13330fc:	4c 8b a4 24 18 04 00 	mov    r12,QWORD PTR [rsp+0x418]
 1333103:	00 
 1333104:	66 0f 6f 84 24 10 04 	movdqa xmm0,XMMWORD PTR [rsp+0x410]
 133310b:	00 00 
 133310d:	41 0f b6 97 cd 00 00 	movzx  edx,BYTE PTR [r15+0xcd]
 1333114:	00 
 1333115:	48 8d 9c 24 c0 01 00 	lea    rbx,[rsp+0x1c0]
 133311c:	00 
 133311d:	48 89 df             	mov    rdi,rbx
 1333120:	e8 82 24 00 00       	call   13355a7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ab2b>
 1333125:	4c 89 74 24 70       	mov    QWORD PTR [rsp+0x70],r14
 133312a:	4c 89 e7             	mov    rdi,r12
 133312d:	e8 54 b3 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1333132:	49 8b 7f 28          	mov    rdi,QWORD PTR [r15+0x28]
 1333136:	4d 8b 77 38          	mov    r14,QWORD PTR [r15+0x38]
 133313a:	4d 8b 67 40          	mov    r12,QWORD PTR [r15+0x40]
 133313e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1333141:	ff 50 50             	call   QWORD PTR [rax+0x50]
 1333144:	4d 8b 4f 50          	mov    r9,QWORD PTR [r15+0x50]
 1333148:	4d 8b 47 68          	mov    r8,QWORD PTR [r15+0x68]
 133314c:	66 0f 6f 84 24 a0 01 	movdqa xmm0,XMMWORD PTR [rsp+0x1a0]
 1333153:	00 00 
 1333155:	48 83 ec 20          	sub    rsp,0x20
 1333159:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
 133315e:	f3 0f 7f 04 24       	movdqu XMMWORD PTR [rsp],xmm0
 1333163:	48 8d bc 24 d8 01 00 	lea    rdi,[rsp+0x1d8]
 133316a:	00 
 133316b:	4c 89 f6             	mov    rsi,r14
 133316e:	4c 89 e2             	mov    rdx,r12
 1333171:	48 89 c1             	mov    rcx,rax
 1333174:	e8 96 24 00 00       	call   133560f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ab93>
 1333179:	48 83 c4 20          	add    rsp,0x20
 133317d:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
 1333181:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 1333186:	49 8b 6f 28          	mov    rbp,QWORD PTR [r15+0x28]
 133318a:	49 8b 47 30          	mov    rax,QWORD PTR [r15+0x30]
 133318e:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
 1333193:	41 0f 10 47 38       	movups xmm0,XMMWORD PTR [r15+0x38]
 1333198:	0f 29 84 24 f0 00 00 	movaps XMMWORD PTR [rsp+0xf0],xmm0
 133319f:	00 
 13331a0:	41 0f 28 47 50       	movaps xmm0,XMMWORD PTR [r15+0x50]
 13331a5:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
 13331aa:	49 8b 47 70          	mov    rax,QWORD PTR [r15+0x70]
 13331ae:	48 89 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rax
 13331b5:	00 
 13331b6:	49 8b 47 78          	mov    rax,QWORD PTR [r15+0x78]
 13331ba:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 13331bf:	66 41 0f 6f 47 60    	movdqa xmm0,XMMWORD PTR [r15+0x60]
 13331c5:	66 0f 7f 84 24 e0 00 	movdqa XMMWORD PTR [rsp+0xe0],xmm0
 13331cc:	00 00 
 13331ce:	49 8b 87 b0 00 00 00 	mov    rax,QWORD PTR [r15+0xb0]
 13331d5:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 13331da:	45 8a af c8 00 00 00 	mov    r13b,BYTE PTR [r15+0xc8]
 13331e1:	45 8b b7 c9 00 00 00 	mov    r14d,DWORD PTR [r15+0xc9]
 13331e8:	49 8b 87 b8 00 00 00 	mov    rax,QWORD PTR [r15+0xb8]
 13331ef:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
 13331f4:	bf 80 06 00 00       	mov    edi,0x680
 13331f9:	e8 02 ad 4b 00       	call   17edf00 <_Znwm@plt>
 13331fe:	48 89 c3             	mov    rbx,rax
 1333201:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
 1333208:	00 
 1333209:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]
 1333210:	00 
 1333211:	e8 3c e1 97 ff       	call   cb1352 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe2f2>
 1333216:	0f 28 84 24 c0 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x1c0]
 133321d:	00 
 133321e:	0f 29 84 24 50 01 00 	movaps XMMWORD PTR [rsp+0x150],xmm0
 1333225:	00 
 1333226:	48 8b 84 24 c8 01 00 	mov    rax,QWORD PTR [rsp+0x1c8]
 133322d:	00 
 133322e:	48 85 c0             	test   rax,rax
 1333231:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
 1333236:	74 05                	je     133323d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1787c1>
 1333238:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
 133323d:	48 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [rsp+0x1b8]
 1333244:	00 
 1333245:	48 83 a4 24 b8 01 00 	and    QWORD PTR [rsp+0x1b8],0x0
 133324c:	00 00 
 133324e:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
 1333253:	48 89 84 24 e8 01 00 	mov    QWORD PTR [rsp+0x1e8],rax
 133325a:	00 
 133325b:	49 8b 87 c0 00 00 00 	mov    rax,QWORD PTR [r15+0xc0]
 1333262:	48 89 84 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rax
 1333269:	00 
 133326a:	48 8d 05 47 2d 53 00 	lea    rax,[rip+0x532d47]        # 1865fb8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x226a0>
 1333271:	48 89 03             	mov    QWORD PTR [rbx],rax
 1333274:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
 1333278:	48 89 bc 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rdi
 133327f:	00 
 1333280:	e8 cb 46 00 00       	call   1337950 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ced4>
 1333285:	48 8d 05 b4 2a 53 00 	lea    rax,[rip+0x532ab4]        # 1865d40 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22428>
 133328c:	48 89 03             	mov    QWORD PTR [rbx],rax
 133328f:	48 8d 05 8a 2b 53 00 	lea    rax,[rip+0x532b8a]        # 1865e20 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22508>
 1333296:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
 133329a:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 133329f:	48 89 83 18 01 00 00 	mov    QWORD PTR [rbx+0x118],rax
 13332a6:	0f 28 44 24 50       	movaps xmm0,XMMWORD PTR [rsp+0x50]
 13332ab:	0f 29 83 20 01 00 00 	movaps XMMWORD PTR [rbx+0x120],xmm0
 13332b2:	48 8b 84 24 a8 01 00 	mov    rax,QWORD PTR [rsp+0x1a8]
 13332b9:	00 
 13332ba:	66 0f 6f 84 24 a0 01 	movdqa xmm0,XMMWORD PTR [rsp+0x1a0]
 13332c1:	00 00 
 13332c3:	66 0f 7f 83 30 01 00 	movdqa XMMWORD PTR [rbx+0x130],xmm0
 13332ca:	00 
 13332cb:	48 85 c0             	test   rax,rax
 13332ce:	74 05                	je     13332d5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178859>
 13332d0:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
 13332d5:	48 8d bb 40 01 00 00 	lea    rdi,[rbx+0x140]
 13332dc:	48 89 bc 24 20 01 00 	mov    QWORD PTR [rsp+0x120],rdi
 13332e3:	00 
 13332e4:	48 8b 74 24 48       	mov    rsi,QWORD PTR [rsp+0x48]
 13332e9:	e8 28 c7 f4 ff       	call   127fa16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4f9a>
 13332ee:	41 8b 84 24 a8 00 00 	mov    eax,DWORD PTR [r12+0xa8]
 13332f5:	00 
 13332f6:	89 83 50 02 00 00    	mov    DWORD PTR [rbx+0x250],eax
 13332fc:	48 8d bb 58 02 00 00 	lea    rdi,[rbx+0x258]
 1333303:	49 8d b4 24 b8 00 00 	lea    rsi,[r12+0xb8]
 133330a:	00 
 133330b:	48 89 bc 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rdi
 1333312:	00 
 1333313:	e8 bc c9 f4 ff       	call   127fcd4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5258>
 1333318:	49 83 ef 80          	sub    r15,0xffffffffffffff80
 133331c:	41 8b 84 24 ac 00 00 	mov    eax,DWORD PTR [r12+0xac]
 1333323:	00 
 1333324:	89 83 70 02 00 00    	mov    DWORD PTR [rbx+0x270],eax
 133332a:	48 8d 83 78 02 00 00 	lea    rax,[rbx+0x278]
 1333331:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
 1333338:	00 
 1333339:	66 0f ef c0          	pxor   xmm0,xmm0
 133333d:	f3 0f 7f 83 78 02 00 	movdqu XMMWORD PTR [rbx+0x278],xmm0
 1333344:	00 
 1333345:	f3 0f 7f 83 88 02 00 	movdqu XMMWORD PTR [rbx+0x288],xmm0
 133334c:	00 
 133334d:	c7 83 98 02 00 00 00 	mov    DWORD PTR [rbx+0x298],0x3f800000
 1333354:	00 80 3f 
 1333357:	48 8d bb a0 02 00 00 	lea    rdi,[rbx+0x2a0]
 133335e:	48 89 bc 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rdi
 1333365:	00 
 1333366:	4c 89 fe             	mov    rsi,r15
 1333369:	e8 22 6f 74 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 133336e:	66 0f 6f 84 24 f0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xf0]
 1333375:	00 00 
 1333377:	66 0f 7f 83 d0 02 00 	movdqa XMMWORD PTR [rbx+0x2d0],xmm0
 133337e:	00 
 133337f:	48 8d bb e0 02 00 00 	lea    rdi,[rbx+0x2e0]
 1333386:	48 89 bc 24 08 01 00 	mov    QWORD PTR [rsp+0x108],rdi
 133338d:	00 
 133338e:	48 8b 74 24 38       	mov    rsi,QWORD PTR [rsp+0x38]
 1333393:	e8 4e b7 01 00       	call   134eae6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19406a>
 1333398:	41 0f b6 c5          	movzx  eax,r13b
 133339c:	4c 89 f1             	mov    rcx,r14
 133339f:	48 c1 e1 08          	shl    rcx,0x8
 13333a3:	48 09 c8             	or     rax,rcx
 13333a6:	41 8a 8c 24 b0 00 00 	mov    cl,BYTE PTR [r12+0xb0]
 13333ad:	00 
 13333ae:	88 8b 60 03 00 00    	mov    BYTE PTR [rbx+0x360],cl
 13333b4:	89 83 61 03 00 00    	mov    DWORD PTR [rbx+0x361],eax
 13333ba:	48 c1 e8 20          	shr    rax,0x20
 13333be:	88 83 65 03 00 00    	mov    BYTE PTR [rbx+0x365],al
 13333c4:	4c 8d ab 68 03 00 00 	lea    r13,[rbx+0x368]
 13333cb:	48 8d b3 58 01 00 00 	lea    rsi,[rbx+0x158]
 13333d2:	4c 89 ef             	mov    rdi,r13
 13333d5:	e8 80 b6 9d ff       	call   d0ea5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25b9fa>
 13333da:	45 84 f6             	test   r14b,r14b
 13333dd:	0f 84 b8 00 00 00    	je     133349b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178a1f>
 13333e3:	48 8d 35 3b e8 11 ff 	lea    rsi,[rip+0xffffffffff11e83b]        # 451c25 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17831>
 13333ea:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
 13333f1:	00 
 13333f2:	e8 87 66 74 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 13333f7:	48 8d 35 8a 97 0a ff 	lea    rsi,[rip+0xffffffffff0a978a]        # 3dcb88 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x25d7>
 13333fe:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
 1333405:	00 
 1333406:	48 8d 94 24 f0 04 00 	lea    rdx,[rsp+0x4f0]
 133340d:	00 
 133340e:	31 c9                	xor    ecx,ecx
 1333410:	e8 d9 92 9d ff       	call   d0c6ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25968e>
 1333415:	48 8d b4 24 10 04 00 	lea    rsi,[rsp+0x410]
 133341c:	00 
 133341d:	4c 89 ef             	mov    rdi,r13
 1333420:	e8 01 93 9d ff       	call   d0c726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2596c6>
 1333425:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
 133342c:	00 
 133342d:	e8 9a b3 76 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
 1333432:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
 1333439:	00 
 133343a:	e8 51 aa 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 133343f:	48 8d 35 df e7 11 ff 	lea    rsi,[rip+0xffffffffff11e7df]        # 451c25 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17831>
 1333446:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
 133344d:	00 
 133344e:	e8 2b 66 74 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 1333453:	48 8d 35 46 97 0a ff 	lea    rsi,[rip+0xffffffffff0a9746]        # 3dcba0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x25ef>
 133345a:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
 1333461:	00 
 1333462:	48 8d 94 24 f0 04 00 	lea    rdx,[rsp+0x4f0]
 1333469:	00 
 133346a:	31 c9                	xor    ecx,ecx
 133346c:	e8 7d 92 9d ff       	call   d0c6ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25968e>
 1333471:	48 8d b4 24 10 04 00 	lea    rsi,[rsp+0x410]
 1333478:	00 
 1333479:	4c 89 ef             	mov    rdi,r13
 133347c:	e8 a5 92 9d ff       	call   d0c726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2596c6>
 1333481:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
 1333488:	00 
 1333489:	e8 3e b3 76 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
 133348e:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
 1333495:	00 
 1333496:	e8 f5 a9 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 133349b:	48 8b b3 68 03 00 00 	mov    rsi,QWORD PTR [rbx+0x368]
 13334a2:	48 8b 83 70 03 00 00 	mov    rax,QWORD PTR [rbx+0x370]
 13334a9:	48 29 f0             	sub    rax,rsi
 13334ac:	6a 38                	push   0x38
 13334ae:	59                   	pop    rcx
 13334af:	48 99                	cqo
 13334b1:	48 f7 f9             	idiv   rcx
 13334b4:	0f b6 8b d0 01 00 00 	movzx  ecx,BYTE PTR [rbx+0x1d0]
 13334bb:	44 0f b6 83 65 03 00 	movzx  r8d,BYTE PTR [rbx+0x365]
 13334c2:	00 
 13334c3:	44 0f b6 8b 40 02 00 	movzx  r9d,BYTE PTR [rbx+0x240]
 13334ca:	00 
 13334cb:	48 8d bc 24 b8 02 00 	lea    rdi,[rsp+0x2b8]
 13334d2:	00 
 13334d3:	48 89 c2             	mov    rdx,rax
 13334d6:	e8 c9 44 00 00       	call   13379a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17cf28>
 13334db:	41 80 bc 24 61 01 00 	cmp    BYTE PTR [r12+0x161],0x0
 13334e2:	00 00 
 13334e4:	74 68                	je     133354e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178ad2>
 13334e6:	45 31 ff             	xor    r15d,r15d
 13334e9:	e9 c5 00 00 00       	jmp    13335b3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178b37>
 13334ee:	66 0f ef c0          	pxor   xmm0,xmm0
 13334f2:	48 8d 8c 24 a0 03 00 	lea    rcx,[rsp+0x3a0]
 13334f9:	00 
 13334fa:	66 0f 7f 01          	movdqa XMMWORD PTR [rcx],xmm0
 13334fe:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
 1333503:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
 133350a:	00 
 133350b:	48 8d 94 24 10 04 00 	lea    rdx,[rsp+0x410]
 1333512:	00 
 1333513:	4c 89 f6             	mov    rsi,r14
 1333516:	41 ff 56 18          	call   QWORD PTR [r14+0x18]
 133351a:	48 8b 84 24 f0 01 00 	mov    rax,QWORD PTR [rsp+0x1f0]
 1333521:	00 
 1333522:	48 85 c0             	test   rax,rax
 1333525:	4c 8b 6c 24 50       	mov    r13,QWORD PTR [rsp+0x50]
 133352a:	0f 84 1f 0f 00 00    	je     133444f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1799d3>
 1333530:	0f b6 8c 24 a0 03 00 	movzx  ecx,BYTE PTR [rsp+0x3a0]
 1333537:	00 
 1333538:	f6 c1 01             	test   cl,0x1
 133353b:	0f 84 8a 0f 00 00    	je     13344cb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179a4f>
 1333541:	48 8b 8c 24 a8 03 00 	mov    rcx,QWORD PTR [rsp+0x3a8]
 1333548:	00 
 1333549:	e9 7f 0f 00 00       	jmp    13344cd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179a51>
 133354e:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
 1333553:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 1333556:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
 133355d:	00 
 133355e:	ff 50 38             	call   QWORD PTR [rax+0x38]
 1333561:	4d 89 ec             	mov    r12,r13
 1333564:	4c 8b ac 24 10 04 00 	mov    r13,QWORD PTR [rsp+0x410]
 133356b:	00 
 133356c:	4c 8b b4 24 18 04 00 	mov    r14,QWORD PTR [rsp+0x418]
 1333573:	00 
 1333574:	6a 04                	push   0x4
 1333576:	5a                   	pop    rdx
 1333577:	4c 89 ef             	mov    rdi,r13
 133357a:	4c 89 f6             	mov    rsi,r14
 133357d:	e8 56 38 eb ff       	call   11e6dd8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c35c>
 1333582:	41 b7 01             	mov    r15b,0x1
 1333585:	84 c0                	test   al,al
 1333587:	74 15                	je     133359e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178b22>
 1333589:	6a 3f                	push   0x3f
 133358b:	5a                   	pop    rdx
 133358c:	4c 89 ef             	mov    rdi,r13
 133358f:	4c 89 f6             	mov    rsi,r14
 1333592:	e8 41 38 eb ff       	call   11e6dd8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c35c>
 1333597:	41 89 c7             	mov    r15d,eax
 133359a:	41 80 f7 01          	xor    r15b,0x1
 133359e:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
 13335a5:	00 
 13335a6:	e8 7d b8 d4 ff       	call   107ee28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24623e>
 13335ab:	4d 89 e5             	mov    r13,r12
 13335ae:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
 13335b3:	48 8d 83 30 01 00 00 	lea    rax,[rbx+0x130]
 13335ba:	48 8d bb 80 03 00 00 	lea    rdi,[rbx+0x380]
 13335c1:	45 0f b6 c7          	movzx  r8d,r15b
 13335c5:	49 89 c7             	mov    r15,rax
 13335c8:	48 8d 8c 24 b8 02 00 	lea    rcx,[rsp+0x2b8]
 13335cf:	00 
 13335d0:	48 8b 74 24 40       	mov    rsi,QWORD PTR [rsp+0x40]
 13335d5:	48 89 c2             	mov    rdx,rax
 13335d8:	e8 bb c7 00 00       	call   133fd98 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18531c>
 13335dd:	48 8d bc 24 b8 02 00 	lea    rdi,[rsp+0x2b8]
 13335e4:	00 
 13335e5:	e8 3e b8 d4 ff       	call   107ee28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24623e>
 13335ea:	48 8d 83 90 03 00 00 	lea    rax,[rbx+0x390]
 13335f1:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
 13335f8:	00 
 13335f9:	48 83 a3 90 03 00 00 	and    QWORD PTR [rbx+0x390],0x0
 1333600:	00 
 1333601:	4c 8d b3 98 03 00 00 	lea    r14,[rbx+0x398]
 1333608:	6a 01                	push   0x1
 133360a:	59                   	pop    rcx
 133360b:	4c 89 f7             	mov    rdi,r14
 133360e:	4c 89 fe             	mov    rsi,r15
 1333611:	89 ca                	mov    edx,ecx
 1333613:	41 89 c8             	mov    r8d,ecx
 1333616:	49 89 e9             	mov    r9,rbp
 1333619:	e8 66 88 f9 ff       	call   12cbe84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x111408>
 133361e:	4c 89 bc 24 38 01 00 	mov    QWORD PTR [rsp+0x138],r15
 1333625:	00 
 1333626:	48 8d bb a8 03 00 00 	lea    rdi,[rbx+0x3a8]
 133362d:	66 0f 6f 44 24 50    	movdqa xmm0,XMMWORD PTR [rsp+0x50]
 1333633:	66 48 0f 7e c6       	movq   rsi,xmm0
 1333638:	48 89 bc 24 30 01 00 	mov    QWORD PTR [rsp+0x130],rdi
 133363f:	00 
 1333640:	e8 c9 42 fa ff       	call   12d790e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11ce92>
 1333645:	66 0f ef c0          	pxor   xmm0,xmm0
 1333649:	f3 0f 7f 83 b8 03 00 	movdqu XMMWORD PTR [rbx+0x3b8],xmm0
 1333650:	00 
 1333651:	0f 28 84 24 e0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xe0]
 1333658:	00 
 1333659:	0f 11 83 c8 03 00 00 	movups XMMWORD PTR [rbx+0x3c8],xmm0
 1333660:	4c 8d bb d8 03 00 00 	lea    r15,[rbx+0x3d8]
 1333667:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
 133366e:	00 
 133366f:	4c 89 ff             	mov    rdi,r15
 1333672:	e8 db dc 97 ff       	call   cb1352 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe2f2>
 1333677:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 133367c:	48 89 83 40 04 00 00 	mov    QWORD PTR [rbx+0x440],rax
 1333683:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
 1333688:	48 89 83 48 04 00 00 	mov    QWORD PTR [rbx+0x448],rax
 133368f:	83 a3 50 04 00 00 00 	and    DWORD PTR [rbx+0x450],0x0
 1333696:	41 8a 84 24 61 01 00 	mov    al,BYTE PTR [r12+0x161]
 133369d:	00 
 133369e:	88 83 54 04 00 00    	mov    BYTE PTR [rbx+0x454],al
 13336a4:	66 83 a3 55 04 00 00 	and    WORD PTR [rbx+0x455],0x0
 13336ab:	00 
 13336ac:	48 8d bb 58 04 00 00 	lea    rdi,[rbx+0x458]
 13336b3:	48 89 bc 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rdi
 13336ba:	00 
 13336bb:	e8 36 63 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 13336c0:	48 8d bb 68 04 00 00 	lea    rdi,[rbx+0x468]
 13336c7:	48 89 bc 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rdi
 13336ce:	00 
 13336cf:	e8 22 63 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 13336d4:	48 8d bb 78 04 00 00 	lea    rdi,[rbx+0x478]
 13336db:	48 89 bc 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rdi
 13336e2:	00 
 13336e3:	e8 0e 63 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 13336e8:	48 8d bb 88 04 00 00 	lea    rdi,[rbx+0x488]
 13336ef:	48 89 bc 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rdi
 13336f6:	00 
 13336f7:	e8 fa 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 13336fc:	48 8d bb 98 04 00 00 	lea    rdi,[rbx+0x498]
 1333703:	48 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rdi
 133370a:	00 
 133370b:	e8 e6 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 1333710:	48 8d bb a8 04 00 00 	lea    rdi,[rbx+0x4a8]
 1333717:	48 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdi
 133371e:	00 
 133371f:	e8 d2 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 1333724:	48 8d bb b8 04 00 00 	lea    rdi,[rbx+0x4b8]
 133372b:	48 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rdi
 1333732:	00 
 1333733:	e8 be 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 1333738:	48 8d bb c8 04 00 00 	lea    rdi,[rbx+0x4c8]
 133373f:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
 1333746:	00 
 1333747:	e8 aa 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 133374c:	48 83 a3 d8 04 00 00 	and    QWORD PTR [rbx+0x4d8],0x0
 1333753:	00 
 1333754:	48 83 a3 e8 04 00 00 	and    QWORD PTR [rbx+0x4e8],0x0
 133375b:	00 
 133375c:	48 83 a3 f8 04 00 00 	and    QWORD PTR [rbx+0x4f8],0x0
 1333763:	00 
 1333764:	48 83 a3 08 05 00 00 	and    QWORD PTR [rbx+0x508],0x0
 133376b:	00 
 133376c:	31 c0                	xor    eax,eax
 133376e:	88 83 18 05 00 00    	mov    BYTE PTR [rbx+0x518],al
 1333774:	88 83 38 05 00 00    	mov    BYTE PTR [rbx+0x538],al
 133377a:	88 83 40 05 00 00    	mov    BYTE PTR [rbx+0x540],al
 1333780:	88 83 60 05 00 00    	mov    BYTE PTR [rbx+0x560],al
 1333786:	0f 57 c0             	xorps  xmm0,xmm0
 1333789:	0f 11 83 68 05 00 00 	movups XMMWORD PTR [rbx+0x568],xmm0
 1333790:	0f 11 83 78 05 00 00 	movups XMMWORD PTR [rbx+0x578],xmm0
 1333797:	0f 11 83 88 05 00 00 	movups XMMWORD PTR [rbx+0x588],xmm0
 133379e:	c7 83 98 05 00 00 00 	mov    DWORD PTR [rbx+0x598],0x3f800000
 13337a5:	00 80 3f 
 13337a8:	66 0f 6f 84 24 50 01 	movdqa xmm0,XMMWORD PTR [rsp+0x150]
 13337af:	00 00 
 13337b1:	66 0f 7f 83 a0 05 00 	movdqa XMMWORD PTR [rbx+0x5a0],xmm0
 13337b8:	00 
 13337b9:	66 48 0f 3a 16 c0 01 	pextrq rax,xmm0,0x1
 13337c0:	48 85 c0             	test   rax,rax
 13337c3:	74 05                	je     13337ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178d4e>
 13337c5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
 13337ca:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 13337cf:	48 8d 83 d8 04 00 00 	lea    rax,[rbx+0x4d8]
 13337d6:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
 13337db:	48 8d 83 f8 04 00 00 	lea    rax,[rbx+0x4f8]
 13337e2:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
 13337e7:	48 8d 83 18 05 00 00 	lea    rax,[rbx+0x518]
 13337ee:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
 13337f5:	00 
 13337f6:	48 8d 83 40 05 00 00 	lea    rax,[rbx+0x540]
 13337fd:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 1333802:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
 1333806:	48 89 ef             	mov    rdi,rbp
 1333809:	4c 89 bc 24 00 01 00 	mov    QWORD PTR [rsp+0x100],r15
 1333810:	00 
 1333811:	ff 50 50             	call   QWORD PTR [rax+0x50]
 1333814:	48 89 83 b0 05 00 00 	mov    QWORD PTR [rbx+0x5b0],rax
 133381b:	48 83 a4 24 e8 01 00 	and    QWORD PTR [rsp+0x1e8],0x0
 1333822:	00 00 
 1333824:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
 1333829:	48 89 83 b8 05 00 00 	mov    QWORD PTR [rbx+0x5b8],rax
 1333830:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
 1333835:	48 89 83 c0 05 00 00 	mov    QWORD PTR [rbx+0x5c0],rax
 133383c:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
 1333841:	48 89 83 c8 05 00 00 	mov    QWORD PTR [rbx+0x5c8],rax
 1333848:	48 8d bb d0 05 00 00 	lea    rdi,[rbx+0x5d0]
 133384f:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
 1333854:	e8 9d 61 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 1333859:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]
 1333860:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1333863:	ff 50 20             	call   QWORD PTR [rax+0x20]
 1333866:	4c 89 74 24 70       	mov    QWORD PTR [rsp+0x70],r14
 133386b:	34 01                	xor    al,0x1
 133386d:	88 83 e0 05 00 00    	mov    BYTE PTR [rbx+0x5e0],al
 1333873:	48 83 a3 e8 05 00 00 	and    QWORD PTR [rbx+0x5e8],0x0
 133387a:	00 
 133387b:	48 8d bb f0 05 00 00 	lea    rdi,[rbx+0x5f0]
 1333882:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
 1333887:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
 133388c:	e8 31 de 48 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 1333891:	48 8d 35 48 92 0a ff 	lea    rsi,[rip+0xffffffffff0a9248]        # 3dcae0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x252f>
 1333898:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
 133389f:	00 
 13338a0:	e8 d9 61 74 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 13338a5:	4c 8d a4 24 f0 04 00 	lea    r12,[rsp+0x4f0]
 13338ac:	00 
 13338ad:	41 c6 04 24 00       	mov    BYTE PTR [r12],0x0
 13338b2:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 13338b7:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 13338ba:	4c 8d b4 24 10 04 00 	lea    r14,[rsp+0x410]
 13338c1:	00 
 13338c2:	4c 89 f6             	mov    rsi,r14
 13338c5:	4c 89 e2             	mov    rdx,r12
 13338c8:	e8 91 9e 85 ff       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>
 13338cd:	89 c5                	mov    ebp,eax
 13338cf:	4c 89 f7             	mov    rdi,r14
 13338d2:	e8 b9 a5 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 13338d7:	40 88 ab 00 06 00 00 	mov    BYTE PTR [rbx+0x600],bpl
 13338de:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
 13338e3:	48 89 83 08 06 00 00 	mov    QWORD PTR [rbx+0x608],rax
 13338ea:	48 8b 84 24 48 01 00 	mov    rax,QWORD PTR [rsp+0x148]
 13338f1:	00 
 13338f2:	48 89 83 10 06 00 00 	mov    QWORD PTR [rbx+0x610],rax
 13338f9:	48 8d 83 18 06 00 00 	lea    rax,[rbx+0x618]
 1333900:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
 1333905:	80 b9 50 01 00 00 00 	cmp    BYTE PTR [rcx+0x150],0x0
 133390c:	74 0c                	je     133391a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178e9e>
 133390e:	66 0f ef c0          	pxor   xmm0,xmm0
 1333912:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
 1333916:	b0 01                	mov    al,0x1
 1333918:	eb 05                	jmp    133391f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178ea3>
 133391a:	c6 00 00             	mov    BYTE PTR [rax],0x0
 133391d:	31 c0                	xor    eax,eax
 133391f:	88 83 28 06 00 00    	mov    BYTE PTR [rbx+0x628],al
 1333925:	83 a3 30 06 00 00 00 	and    DWORD PTR [rbx+0x630],0x0
 133392c:	48 8d bb 38 06 00 00 	lea    rdi,[rbx+0x638]
 1333933:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
 1333938:	e8 b9 60 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 133393d:	66 0f ef c0          	pxor   xmm0,xmm0
 1333941:	f3 0f 7f 83 48 06 00 	movdqu XMMWORD PTR [rbx+0x648],xmm0
 1333948:	00 
 1333949:	48 8d bb 58 06 00 00 	lea    rdi,[rbx+0x658]
