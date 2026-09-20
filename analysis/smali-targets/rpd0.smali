.class public abstract Lp/rpd0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final F:Lp/r201;

.field public static final G:Lp/j561;


# instance fields
.field public final A:J

.field public B:Z

.field public final C:Lp/pf40;

.field public D:Lp/pf40;

.field public E:Landroid/os/Bundle;

.field public final a:Ljava/lang/Object;

.field public final b:Landroid/net/Uri;

.field public final c:Lp/opd0;

.field public final d:Lp/npd0;

.field public final e:Lp/qgd0;

.field public final f:Landroid/content/Context;

.field public final g:Lp/psd0;

.field public final h:Lp/pqd0;

.field public final i:Ljava/lang/String;

.field public final j:Lp/n301;

.field public final k:Lp/ggd0;

.field public final l:Landroid/os/Handler;

.field public final m:Lp/uh9;

.field public final n:Lp/kpd0;

.field public final o:Landroid/os/Handler;

.field public final p:Z

.field public final q:Z

.field public final r:Lp/pf40;

.field public s:Lp/cap0;

.field public t:Lp/pdp0;

.field public u:Landroid/app/PendingIntent;

.field public v:Lp/ppd0;

.field public w:Lp/esa0;

.field public x:Lp/tnd0;

.field public y:Lp/pgd0;

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lp/r201;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lp/r201;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lp/rpd0;->F:Lp/r201;

    .line 8
    .line 9
    new-instance v0, Lp/j77;

    .line 10
    .line 11
    const/4 v1, 0x7

    .line 12
    invoke-direct {v0, v1}, Lp/j77;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lp/kgg1;->u(Lp/j561;)Lp/j561;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lp/rpd0;->G:Lp/j561;

    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public constructor <init>(Lp/ggd0;Landroid/content/Context;Ljava/lang/String;Lp/g7p0;Lp/pf40;Lp/pf40;Lp/pf40;Lp/qgd0;Landroid/os/Bundle;Landroid/os/Bundle;Lp/uh9;ZZ)V
    .locals 11

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lp/rpd0;->a:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "Init "

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v1, " [AndroidXMedia3/1.11.0] ["

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    sget-object v1, Lp/h0b1;->a:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v1, "]"

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0}, Lp/yif1;->w(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Lp/rpd0;->k:Lp/ggd0;

    .line 52
    .line 53
    iput-object p2, p0, Lp/rpd0;->f:Landroid/content/Context;

    .line 54
    .line 55
    iput-object p3, p0, Lp/rpd0;->i:Ljava/lang/String;

    .line 56
    .line 57
    const/4 p1, 0x0

    .line 58
    iput-object p1, p0, Lp/rpd0;->u:Landroid/app/PendingIntent;

    .line 59
    .line 60
    move-object/from16 v6, p5

    .line 61
    .line 62
    iput-object v6, p0, Lp/rpd0;->C:Lp/pf40;

    .line 63
    .line 64
    move-object/from16 v7, p6

    .line 65
    .line 66
    iput-object v7, p0, Lp/rpd0;->D:Lp/pf40;

    .line 67
    .line 68
    move-object/from16 p1, p7

    .line 69
    .line 70
    iput-object p1, p0, Lp/rpd0;->r:Lp/pf40;

    .line 71
    .line 72
    move-object/from16 p1, p8

    .line 73
    .line 74
    iput-object p1, p0, Lp/rpd0;->e:Lp/qgd0;

    .line 75
    .line 76
    move-object/from16 v10, p10

    .line 77
    .line 78
    iput-object v10, p0, Lp/rpd0;->E:Landroid/os/Bundle;

    .line 79
    .line 80
    move-object/from16 p1, p11

    .line 81
    .line 82
    iput-object p1, p0, Lp/rpd0;->m:Lp/uh9;

    .line 83
    .line 84
    move/from16 v5, p12

    .line 85
    .line 86
    iput-boolean v5, p0, Lp/rpd0;->p:Z

    .line 87
    .line 88
    move/from16 p1, p13

    .line 89
    .line 90
    iput-boolean p1, p0, Lp/rpd0;->q:Z

    .line 91
    .line 92
    new-instance p1, Lp/psd0;

    .line 93
    .line 94
    invoke-direct {p1, p0}, Lp/psd0;-><init>(Lp/rpd0;)V

    .line 95
    .line 96
    .line 97
    iput-object p1, p0, Lp/rpd0;->g:Lp/psd0;

    .line 98
    .line 99
    new-instance v0, Landroid/os/Handler;

    .line 100
    .line 101
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 106
    .line 107
    .line 108
    iput-object v0, p0, Lp/rpd0;->o:Landroid/os/Handler;

    .line 109
    .line 110
    invoke-interface {p4}, Lp/g7p0;->c0()Landroid/os/Looper;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    new-instance v3, Landroid/os/Handler;

    .line 115
    .line 116
    invoke-direct {v3, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 117
    .line 118
    .line 119
    iput-object v3, p0, Lp/rpd0;->l:Landroid/os/Handler;

    .line 120
    .line 121
    sget-object v1, Lp/cap0;->H:Lp/cap0;

    .line 122
    .line 123
    iput-object v1, p0, Lp/rpd0;->s:Lp/cap0;

    .line 124
    .line 125
    new-instance v1, Lp/opd0;

    .line 126
    .line 127
    invoke-direct {v1, p0, v0}, Lp/opd0;-><init>(Lp/rpd0;Landroid/os/Looper;)V

    .line 128
    .line 129
    .line 130
    iput-object v1, p0, Lp/rpd0;->c:Lp/opd0;

    .line 131
    .line 132
    new-instance v1, Lp/npd0;

    .line 133
    .line 134
    invoke-direct {v1, p0, v0}, Lp/npd0;-><init>(Lp/rpd0;Landroid/os/Looper;)V

    .line 135
    .line 136
    .line 137
    iput-object v1, p0, Lp/rpd0;->d:Lp/npd0;

    .line 138
    .line 139
    new-instance v0, Landroid/net/Uri$Builder;

    .line 140
    .line 141
    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    .line 142
    .line 143
    .line 144
    const-string v1, "androidx"

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    const-string v1, "media3.session"

    .line 151
    .line 152
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    if-nez p3, :cond_0

    .line 157
    .line 158
    const-string p3, ""

    .line 159
    .line 160
    :cond_0
    invoke-virtual {v0, p3}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 161
    .line 162
    .line 163
    move-result-object p3

    .line 164
    invoke-virtual {p3}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    iput-object v2, p0, Lp/rpd0;->b:Landroid/net/Uri;

    .line 169
    .line 170
    sget-object v8, Lp/rnd0;->g:Lp/nxz0;

    .line 171
    .line 172
    sget-object v9, Lp/rnd0;->h:Lp/b7p0;

    .line 173
    .line 174
    new-instance v0, Lp/pqd0;

    .line 175
    .line 176
    move-object v1, p0

    .line 177
    move-object/from16 v4, p9

    .line 178
    .line 179
    invoke-direct/range {v0 .. v10}, Lp/pqd0;-><init>(Lp/rpd0;Landroid/net/Uri;Landroid/os/Handler;Landroid/os/Bundle;ZLp/pf40;Lp/pf40;Lp/nxz0;Lp/b7p0;Landroid/os/Bundle;)V

    .line 180
    .line 181
    .line 182
    move-object v9, v3

    .line 183
    iput-object v0, p0, Lp/rpd0;->h:Lp/pqd0;

    .line 184
    .line 185
    iget-object v0, v0, Lp/pqd0;->j:Landroidx/media3/session/legacy/MediaSessionCompat;

    .line 186
    .line 187
    invoke-virtual {v0}, Landroidx/media3/session/legacy/MediaSessionCompat;->getSessionToken()Landroidx/media3/session/legacy/MediaSessionCompat$Token;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-virtual {v0}, Landroidx/media3/session/legacy/MediaSessionCompat$Token;->getToken()Landroid/media/session/MediaSession$Token;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    new-instance v0, Lp/n301;

    .line 196
    .line 197
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    const/16 v3, 0xa

    .line 202
    .line 203
    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    const v2, 0x3c42a3ec

    .line 208
    .line 209
    .line 210
    const/4 v8, 0x0

    .line 211
    move-object v5, p1

    .line 212
    move-object/from16 v6, p9

    .line 213
    .line 214
    invoke-direct/range {v0 .. v8}, Lp/n301;-><init>(IIILjava/lang/String;Lp/jv30;Landroid/os/Bundle;Landroid/media/session/MediaSession$Token;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    iput-object v0, p0, Lp/rpd0;->j:Lp/n301;

    .line 218
    .line 219
    new-instance p1, Lp/pdp0;

    .line 220
    .line 221
    invoke-direct {p1, p4}, Lp/pdp0;-><init>(Lp/g7p0;)V

    .line 222
    .line 223
    .line 224
    iput-object p1, p0, Lp/rpd0;->t:Lp/pdp0;

    .line 225
    .line 226
    new-instance p2, Lp/zaz;

    .line 227
    .line 228
    const/16 v0, 0x1c

    .line 229
    .line 230
    invoke-direct {p2, v0, p0, p1}, Lp/zaz;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    invoke-static {v9, p2}, Lp/h0b1;->c0(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 234
    .line 235
    .line 236
    const-wide/16 p1, 0xbb8

    .line 237
    .line 238
    iput-wide p1, p0, Lp/rpd0;->A:J

    .line 239
    .line 240
    new-instance p1, Lp/kpd0;

    .line 241
    .line 242
    const/4 p2, 0x0

    .line 243
    invoke-direct {p1, p0, p2}, Lp/kpd0;-><init>(Lp/rpd0;I)V

    .line 244
    .line 245
    .line 246
    iput-object p1, p0, Lp/rpd0;->n:Lp/kpd0;

    .line 247
    .line 248
    new-instance p1, Lp/kpd0;

    .line 249
    .line 250
    const/4 p2, 0x1

    .line 251
    invoke-direct {p1, p0, p2}, Lp/kpd0;-><init>(Lp/rpd0;I)V

    .line 252
    .line 253
    .line 254
    invoke-static {v9, p1}, Lp/h0b1;->c0(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 255
    .line 256
    .line 257
    return-void
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
.end method

.method public static a(Lp/rpd0;Landroid/app/PendingIntent;)V
    .locals 7

    .line 1
    iput-object p1, p0, Lp/rpd0;->u:Landroid/app/PendingIntent;

    .line 2
    .line 3
    iget-object v0, p0, Lp/rpd0;->g:Lp/psd0;

    .line 4
    .line 5
    iget-object v1, v0, Lp/psd0;->m:Lp/bxb;

    .line 6
    .line 7
    invoke-virtual {v1}, Lp/bxb;->u()Lp/pf40;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    :goto_0
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-ge v3, v4, :cond_1

    .line 18
    .line 19
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, Lp/tnd0;

    .line 24
    .line 25
    iget v5, v4, Lp/tnd0;->b:I

    .line 26
    .line 27
    const/4 v6, 0x3

    .line 28
    if-lt v5, v6, :cond_0

    .line 29
    .line 30
    iget-object v5, v0, Lp/psd0;->m:Lp/bxb;

    .line 31
    .line 32
    invoke-virtual {v5, v4}, Lp/bxb;->A(Lp/tnd0;)Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-eqz v5, :cond_0

    .line 37
    .line 38
    new-instance v5, Lp/mcd0;

    .line 39
    .line 40
    invoke-direct {v5, p1}, Lp/mcd0;-><init>(Landroid/app/PendingIntent;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v4, v5}, Lp/rpd0;->f(Lp/tnd0;Lp/qpd0;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v4}, Lp/rpd0;->r(Lp/tnd0;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_0

    .line 51
    .line 52
    :try_start_0
    iget-object v4, p0, Lp/rpd0;->h:Lp/pqd0;

    .line 53
    .line 54
    iget-object v4, v4, Lp/pqd0;->f:Lp/nqd0;

    .line 55
    .line 56
    invoke-virtual {v4, v2, p1}, Lp/nqd0;->c(ILandroid/app/PendingIntent;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :catch_0
    move-exception v4

    .line 61
    const-string v5, "Exception in using media1 API"

    .line 62
    .line 63
    invoke-static {v5, v4}, Lp/yif1;->s(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    :cond_0
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    return-void
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
.end method

.method public static b(Lp/rpd0;Lp/h001;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lp/rpd0;->h:Lp/pqd0;

    .line 2
    .line 3
    iget-object v1, p0, Lp/rpd0;->g:Lp/psd0;

    .line 4
    .line 5
    iget-object v1, v1, Lp/psd0;->m:Lp/bxb;

    .line 6
    .line 7
    invoke-virtual {v1}, Lp/bxb;->u()Lp/pf40;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    :goto_0
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    const-string v5, "Exception in using media1 API"

    .line 18
    .line 19
    if-ge v3, v4, :cond_4

    .line 20
    .line 21
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, Lp/tnd0;

    .line 26
    .line 27
    invoke-virtual {p0, v4}, Lp/rpd0;->r(Lp/tnd0;)Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    iget v7, v4, Lp/tnd0;->b:I

    .line 32
    .line 33
    if-nez v6, :cond_3

    .line 34
    .line 35
    if-eqz v7, :cond_0

    .line 36
    .line 37
    iget v6, v4, Lp/tnd0;->c:I

    .line 38
    .line 39
    const/4 v8, 0x4

    .line 40
    if-ge v6, v8, :cond_0

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_0
    invoke-virtual {p0, v4}, Lp/rpd0;->r(Lp/tnd0;)Z

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    if-nez v6, :cond_2

    .line 48
    .line 49
    if-nez v7, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    new-instance v5, Lp/zca0;

    .line 53
    .line 54
    const/16 v6, 0x10

    .line 55
    .line 56
    invoke-direct {v5, p1, v6}, Lp/zca0;-><init>(Ljava/lang/Object;I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v4, v5}, Lp/rpd0;->f(Lp/tnd0;Lp/qpd0;)V

    .line 60
    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    :goto_1
    :try_start_0
    iget-object v4, v0, Lp/pqd0;->f:Lp/nqd0;

    .line 64
    .line 65
    invoke-virtual {v4, v2, p1}, Lp/nqd0;->g(ILp/h001;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :catch_0
    move-exception v4

    .line 70
    invoke-static {v5, v4}, Lp/yif1;->s(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    :cond_3
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    :try_start_1
    iget-object p0, v0, Lp/pqd0;->f:Lp/nqd0;

    .line 77
    .line 78
    invoke-virtual {p0, v2, p1}, Lp/nqd0;->g(ILp/h001;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 79
    .line 80
    .line 81
    goto :goto_3

    .line 82
    :catch_1
    move-exception p0

    .line 83
    invoke-static {v5, p0}, Lp/yif1;->s(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    :goto_3
    return-void
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
.end method

.method public static c(Lp/rpd0;)V
    .locals 8

    .line 1
    iget-object v1, p0, Lp/rpd0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    iget-boolean v0, p0, Lp/rpd0;->z:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    monitor-exit v1

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    move-object p0, v0

    .line 12
    goto :goto_2

    .line 13
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    iget-object v0, p0, Lp/rpd0;->t:Lp/pdp0;

    .line 15
    .line 16
    invoke-virtual {v0}, Lp/pdp0;->c1()Lp/n201;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    iget-object v0, p0, Lp/rpd0;->c:Lp/opd0;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    iget-object v0, p0, Lp/rpd0;->s:Lp/cap0;

    .line 30
    .line 31
    iget-object v0, v0, Lp/cap0;->c:Lp/n201;

    .line 32
    .line 33
    invoke-static {v3, v0}, Lp/dzd0;->a(Lp/n201;Lp/n201;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    iget-object v0, p0, Lp/rpd0;->g:Lp/psd0;

    .line 40
    .line 41
    iget-object v0, v0, Lp/psd0;->m:Lp/bxb;

    .line 42
    .line 43
    invoke-virtual {v0}, Lp/bxb;->u()Lp/pf40;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const/4 v2, 0x0

    .line 48
    :goto_0
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-ge v2, v4, :cond_1

    .line 53
    .line 54
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    check-cast v4, Lp/tnd0;

    .line 59
    .line 60
    invoke-virtual {v0}, Lp/bxb;->R()V

    .line 61
    .line 62
    .line 63
    iget-object v5, v0, Lp/bxb;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v5, Lp/uj5;

    .line 66
    .line 67
    invoke-virtual {v5, v4}, Lp/ab21;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    check-cast v5, Lp/rxi;

    .line 72
    .line 73
    const/16 v5, 0x10

    .line 74
    .line 75
    invoke-virtual {v0, v4, v5}, Lp/bxb;->B(Lp/tnd0;I)Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    const/16 v6, 0x11

    .line 80
    .line 81
    invoke-virtual {v0, v4, v6}, Lp/bxb;->B(Lp/tnd0;I)Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    new-instance v7, Lp/lpd0;

    .line 86
    .line 87
    invoke-direct {v7, v3, v5, v6, v4}, Lp/lpd0;-><init>(Lp/n201;ZZLp/tnd0;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v4, v7}, Lp/rpd0;->f(Lp/tnd0;Lp/qpd0;)V

    .line 91
    .line 92
    .line 93
    add-int/lit8 v2, v2, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    :try_start_1
    iget-object v0, p0, Lp/rpd0;->h:Lp/pqd0;

    .line 97
    .line 98
    iget-object v1, v0, Lp/pqd0;->f:Lp/nqd0;

    .line 99
    .line 100
    const/4 v5, 0x1

    .line 101
    const/4 v6, 0x0

    .line 102
    const/4 v2, 0x0

    .line 103
    const/4 v4, 0x1

    .line 104
    invoke-virtual/range {v1 .. v6}, Lp/nqd0;->b(ILp/n201;ZZI)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :catch_0
    move-exception v0

    .line 109
    const-string v1, "Exception in using media1 API"

    .line 110
    .line 111
    invoke-static {v1, v0}, Lp/yif1;->s(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    :cond_2
    :goto_1
    invoke-virtual {p0}, Lp/rpd0;->D()V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :goto_2
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 119
    throw p0
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
.end method

.method public static l(Landroid/net/Uri;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "androidx"

    .line 10
    .line 11
    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string v1, "media3.session"

    .line 22
    .line 23
    invoke-static {p0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 p0, 0x0

    .line 37
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Ljava/lang/String;

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_1
    :goto_0
    const-string p0, ""

    .line 45
    .line 46
    return-object p0
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
.end method

.method public static t(Lp/tnd0;)Z
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Lp/tnd0;->a:Landroidx/media3/session/legacy/MediaSessionManager$RemoteUserInfo;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/media3/session/legacy/MediaSessionManager$RemoteUserInfo;->getPackageName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "com.android.systemui"

    .line 10
    .line 11
    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
.end method


# virtual methods
.method public final A(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp/rpd0;->l:Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lp/h0b1;->c0(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
.end method

.method public final B()V
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Release "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, " [AndroidXMedia3/1.11.0] ["

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    sget-object v1, Lp/h0b1;->a:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v1, "] ["

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lp/dgd0;->b()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, "]"

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v0}, Lp/yif1;->w(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lp/rpd0;->a:Ljava/lang/Object;

    .line 54
    .line 55
    monitor-enter v0

    .line 56
    :try_start_0
    iget-boolean v1, p0, Lp/rpd0;->z:Z

    .line 57
    .line 58
    if-eqz v1, :cond_0

    .line 59
    .line 60
    monitor-exit v0

    .line 61
    return-void

    .line 62
    :catchall_0
    move-exception v1

    .line 63
    goto :goto_2

    .line 64
    :cond_0
    const/4 v1, 0x1

    .line 65
    iput-boolean v1, p0, Lp/rpd0;->z:Z

    .line 66
    .line 67
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    iget-object v0, p0, Lp/rpd0;->d:Lp/npd0;

    .line 69
    .line 70
    iget-object v2, v0, Lp/npd0;->a:Lp/kgd0;

    .line 71
    .line 72
    const/4 v3, 0x0

    .line 73
    if-eqz v2, :cond_1

    .line 74
    .line 75
    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 76
    .line 77
    .line 78
    iput-object v3, v0, Lp/npd0;->a:Lp/kgd0;

    .line 79
    .line 80
    :cond_1
    iget-object v0, p0, Lp/rpd0;->l:Landroid/os/Handler;

    .line 81
    .line 82
    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 86
    .line 87
    const/4 v2, 0x0

    .line 88
    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 89
    .line 90
    .line 91
    :try_start_1
    iget-object v3, p0, Lp/rpd0;->l:Landroid/os/Handler;

    .line 92
    .line 93
    invoke-virtual {v3}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v3}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-virtual {v3}, Ljava/lang/Thread;->isAlive()Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-eqz v3, :cond_2

    .line 106
    .line 107
    new-instance v3, Ljava/util/concurrent/CountDownLatch;

    .line 108
    .line 109
    invoke-direct {v3, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 110
    .line 111
    .line 112
    new-instance v4, Lp/kgd0;

    .line 113
    .line 114
    move-object v5, p0

    .line 115
    check-cast v5, Lp/dhd0;

    .line 116
    .line 117
    const/4 v6, 0x3

    .line 118
    invoke-direct {v4, v5, v0, v3, v6}, Lp/kgd0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, v4}, Lp/rpd0;->A(Ljava/lang/Runnable;)V

    .line 122
    .line 123
    .line 124
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 125
    .line 126
    const-wide/16 v5, 0x3e8

    .line 127
    .line 128
    invoke-virtual {v3, v5, v6, v4}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 129
    .line 130
    .line 131
    move-result v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 132
    goto :goto_0

    .line 133
    :catch_0
    move-exception v3

    .line 134
    const-string v4, "Exception thrown while closing"

    .line 135
    .line 136
    invoke-static {v4, v3}, Lp/yif1;->x0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 137
    .line 138
    .line 139
    :cond_2
    move v3, v2

    .line 140
    :goto_0
    if-nez v3, :cond_3

    .line 141
    .line 142
    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_3

    .line 147
    .line 148
    :try_start_2
    iget-object v0, p0, Lp/rpd0;->h:Lp/pqd0;

    .line 149
    .line 150
    invoke-virtual {v0}, Lp/pqd0;->j()V

    .line 151
    .line 152
    .line 153
    iget-object v0, p0, Lp/rpd0;->g:Lp/psd0;

    .line 154
    .line 155
    invoke-virtual {v0}, Lp/psd0;->i2()V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    .line 156
    .line 157
    .line 158
    goto :goto_1

    .line 159
    :catch_1
    move-exception v0

    .line 160
    const-string v1, "Exception thrown during emergency main thread release fallback"

    .line 161
    .line 162
    invoke-static {v1, v0}, Lp/yif1;->x0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 163
    .line 164
    .line 165
    :cond_3
    :goto_1
    return-void

    .line 166
    :goto_2
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 167
    throw v1
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
.end method

.method public final C(Lp/tnd0;)Lp/tnd0;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lp/rpd0;->B:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Lp/rpd0;->t(Lp/tnd0;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lp/rpd0;->j()Lp/tnd0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    return-object p1
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
.end method

.method public final D()V
    .locals 6

    .line 1
    iget-object v0, p0, Lp/rpd0;->l:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Lp/rpd0;->n:Lp/kpd0;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v2, p0, Lp/rpd0;->q:Z

    .line 9
    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    const-wide/16 v2, 0x0

    .line 13
    .line 14
    iget-wide v4, p0, Lp/rpd0;->A:J

    .line 15
    .line 16
    cmp-long v2, v4, v2

    .line 17
    .line 18
    if-lez v2, :cond_1

    .line 19
    .line 20
    iget-object v2, p0, Lp/rpd0;->t:Lp/pdp0;

    .line 21
    .line 22
    invoke-virtual {v2}, Lp/pdp0;->i()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    iget-object v2, p0, Lp/rpd0;->t:Lp/pdp0;

    .line 29
    .line 30
    invoke-virtual {v2}, Lp/pdp0;->c()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    :cond_0
    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
.end method

.method public final E()V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lp/rpd0;->l:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v1, "Player callback method is called from a wrong thread. See javadoc of MediaSession for details."

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public final d(Landroid/view/KeyEvent;ZZ)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lp/rpd0;->k:Lp/ggd0;

    .line 2
    .line 3
    iget-object v0, v0, Lp/ggd0;->a:Lp/dhd0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lp/rpd0;->j()Lp/tnd0;

    .line 6
    .line 7
    .line 8
    move-result-object v4

    .line 9
    if-nez v4, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/16 v0, 0x55

    .line 17
    .line 18
    const/16 v1, 0x4f

    .line 19
    .line 20
    if-eq p1, v0, :cond_1

    .line 21
    .line 22
    if-ne p1, v1, :cond_2

    .line 23
    .line 24
    :cond_1
    if-eqz p2, :cond_2

    .line 25
    .line 26
    const/16 p1, 0x57

    .line 27
    .line 28
    :cond_2
    if-eq p1, v1, :cond_7

    .line 29
    .line 30
    const/16 p2, 0x7e

    .line 31
    .line 32
    if-eq p1, p2, :cond_6

    .line 33
    .line 34
    const/16 p2, 0x7f

    .line 35
    .line 36
    if-eq p1, p2, :cond_5

    .line 37
    .line 38
    const/16 p2, 0x110

    .line 39
    .line 40
    if-eq p1, p2, :cond_4

    .line 41
    .line 42
    const/16 p2, 0x111

    .line 43
    .line 44
    if-eq p1, p2, :cond_3

    .line 45
    .line 46
    packed-switch p1, :pswitch_data_0

    .line 47
    .line 48
    .line 49
    :goto_0
    const/4 p1, 0x0

    .line 50
    return p1

    .line 51
    :pswitch_0
    new-instance p1, Lp/pxi;

    .line 52
    .line 53
    const/16 p2, 0x8

    .line 54
    .line 55
    invoke-direct {p1, p0, v4, p2}, Lp/pxi;-><init>(Lp/rpd0;Lp/tnd0;I)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :pswitch_1
    new-instance p1, Lp/pxi;

    .line 60
    .line 61
    const/16 p2, 0x9

    .line 62
    .line 63
    invoke-direct {p1, p0, v4, p2}, Lp/pxi;-><init>(Lp/rpd0;Lp/tnd0;I)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :pswitch_2
    new-instance p1, Lp/pxi;

    .line 68
    .line 69
    const/4 p2, 0x1

    .line 70
    invoke-direct {p1, p0, v4, p2}, Lp/pxi;-><init>(Lp/rpd0;Lp/tnd0;I)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    :pswitch_3
    new-instance p1, Lp/pxi;

    .line 75
    .line 76
    const/4 p2, 0x7

    .line 77
    invoke-direct {p1, p0, v4, p2}, Lp/pxi;-><init>(Lp/rpd0;Lp/tnd0;I)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_4
    :pswitch_4
    new-instance p1, Lp/pxi;

    .line 82
    .line 83
    const/4 p2, 0x6

    .line 84
    invoke-direct {p1, p0, v4, p2}, Lp/pxi;-><init>(Lp/rpd0;Lp/tnd0;I)V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_5
    new-instance p1, Lp/pxi;

    .line 89
    .line 90
    const/4 p2, 0x5

    .line 91
    invoke-direct {p1, p0, v4, p2}, Lp/pxi;-><init>(Lp/rpd0;Lp/tnd0;I)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_6
    new-instance p1, Lp/pxi;

    .line 96
    .line 97
    const/4 p2, 0x4

    .line 98
    invoke-direct {p1, p0, v4, p2}, Lp/pxi;-><init>(Lp/rpd0;Lp/tnd0;I)V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_7
    :pswitch_5
    invoke-virtual {p0}, Lp/rpd0;->E()V

    .line 103
    .line 104
    .line 105
    iget-object p1, p0, Lp/rpd0;->t:Lp/pdp0;

    .line 106
    .line 107
    invoke-virtual {p1}, Lp/pdp0;->o()Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eqz p1, :cond_8

    .line 112
    .line 113
    new-instance p1, Lp/pxi;

    .line 114
    .line 115
    const/4 p2, 0x2

    .line 116
    invoke-direct {p1, p0, v4, p2}, Lp/pxi;-><init>(Lp/rpd0;Lp/tnd0;I)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_8
    new-instance p1, Lp/pxi;

    .line 121
    .line 122
    const/4 p2, 0x3

    .line 123
    invoke-direct {p1, p0, v4, p2}, Lp/pxi;-><init>(Lp/rpd0;Lp/tnd0;I)V

    .line 124
    .line 125
    .line 126
    :goto_1
    if-eqz p3, :cond_a

    .line 127
    .line 128
    new-instance p2, Lp/mxz0;

    .line 129
    .line 130
    const-string p3, "androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY"

    .line 131
    .line 132
    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 133
    .line 134
    invoke-direct {p2, p3, v0}, Lp/mxz0;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 135
    .line 136
    .line 137
    new-instance v5, Lp/zca0;

    .line 138
    .line 139
    invoke-direct {v5, p2}, Lp/zca0;-><init>(Lp/mxz0;)V

    .line 140
    .line 141
    .line 142
    iget-object p2, p0, Lp/rpd0;->l:Landroid/os/Handler;

    .line 143
    .line 144
    invoke-virtual {p2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 149
    .line 150
    .line 151
    move-result-object p3

    .line 152
    if-ne p2, p3, :cond_9

    .line 153
    .line 154
    invoke-virtual {p0, v4, v5}, Lp/rpd0;->e(Lp/tnd0;Lp/zca0;)Lp/u790;

    .line 155
    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_9
    new-instance v3, Lp/syw0;

    .line 159
    .line 160
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 161
    .line 162
    .line 163
    new-instance v1, Lp/feb;

    .line 164
    .line 165
    const/16 v6, 0xe

    .line 166
    .line 167
    move-object v2, p0

    .line 168
    invoke-direct/range {v1 .. v6}, Lp/feb;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0, v1}, Lp/rpd0;->A(Ljava/lang/Runnable;)V

    .line 172
    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_a
    :goto_2
    move-object v2, p0

    .line 176
    :goto_3
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 177
    .line 178
    .line 179
    iget-object p1, v2, Lp/rpd0;->g:Lp/psd0;

    .line 180
    .line 181
    iget-object p1, p1, Lp/psd0;->m:Lp/bxb;

    .line 182
    .line 183
    invoke-virtual {p1, v4}, Lp/bxb;->q(Lp/tnd0;)V

    .line 184
    .line 185
    .line 186
    const/4 p1, 0x1

    .line 187
    return p1

    .line 188
    nop

    .line 189
    :pswitch_data_0
    .packed-switch 0x55
        :pswitch_5
        :pswitch_2
        :pswitch_4
        :pswitch_3
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
.end method

.method public final e(Lp/tnd0;Lp/zca0;)Lp/u790;
    .locals 6

    .line 1
    iget-object v0, p0, Lp/rpd0;->g:Lp/psd0;

    .line 2
    .line 3
    const/16 v1, -0x64

    .line 4
    .line 5
    :try_start_0
    iget-object v2, v0, Lp/psd0;->m:Lp/bxb;

    .line 6
    .line 7
    invoke-virtual {v2, p1}, Lp/bxb;->x(Lp/tnd0;)Lp/mqi0;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    sget-object v3, Lp/rpd0;->F:Lp/r201;

    .line 14
    .line 15
    invoke-virtual {v2, v3}, Lp/mqi0;->c(Ljava/lang/Object;)Lp/atz0;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget v3, v2, Lp/atz0;->e:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception p2

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    invoke-virtual {p0, p1}, Lp/rpd0;->q(Lp/tnd0;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    new-instance p2, Lp/r201;

    .line 31
    .line 32
    invoke-direct {p2, v1}, Lp/r201;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-static {p2}, Lp/vgg1;->A(Ljava/lang/Object;)Lp/te40;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :cond_1
    new-instance v2, Lp/r201;

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    invoke-direct {v2, v3}, Lp/r201;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-static {v2}, Lp/vgg1;->A(Ljava/lang/Object;)Lp/te40;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    :goto_0
    iget-object v4, p1, Lp/tnd0;->e:Lp/snd0;

    .line 51
    .line 52
    if-eqz v4, :cond_2

    .line 53
    .line 54
    iget-object p2, p2, Lp/zca0;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p2, Lp/mxz0;

    .line 57
    .line 58
    sget-object v5, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 59
    .line 60
    invoke-interface {v4, v3, p2}, Lp/snd0;->j(ILp/mxz0;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    .line 63
    :cond_2
    return-object v2

    .line 64
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    const-string v1, "Exception in "

    .line 67
    .line 68
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-static {p1, p2}, Lp/yif1;->x0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    new-instance p1, Lp/r201;

    .line 82
    .line 83
    const/4 p2, -0x1

    .line 84
    invoke-direct {p1, p2}, Lp/r201;-><init>(I)V

    .line 85
    .line 86
    .line 87
    invoke-static {p1}, Lp/vgg1;->A(Ljava/lang/Object;)Lp/te40;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    return-object p1

    .line 92
    :catch_1
    iget-object p2, v0, Lp/psd0;->m:Lp/bxb;

    .line 93
    .line 94
    invoke-virtual {p2, p1}, Lp/bxb;->L(Lp/tnd0;)V

    .line 95
    .line 96
    .line 97
    new-instance p1, Lp/r201;

    .line 98
    .line 99
    invoke-direct {p1, v1}, Lp/r201;-><init>(I)V

    .line 100
    .line 101
    .line 102
    invoke-static {p1}, Lp/vgg1;->A(Ljava/lang/Object;)Lp/te40;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    return-object p1
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
.end method

.method public final f(Lp/tnd0;Lp/qpd0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lp/rpd0;->g:Lp/psd0;

    .line 2
    .line 3
    :try_start_0
    iget-object v1, v0, Lp/psd0;->m:Lp/bxb;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Lp/bxb;->x(Lp/tnd0;)Lp/mqi0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Lp/mqi0;->e()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception p2

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    invoke-virtual {p0, p1}, Lp/rpd0;->q(Lp/tnd0;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_1
    const/4 v1, 0x0

    .line 26
    :goto_0
    iget-object v2, p1, Lp/tnd0;->e:Lp/snd0;

    .line 27
    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    invoke-interface {p2, v2, v1}, Lp/qpd0;->e(Lp/snd0;I)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v1, "Exception in "

    .line 37
    .line 38
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {p1, p2}, Lp/yif1;->x0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :catch_1
    iget-object p2, v0, Lp/psd0;->m:Lp/bxb;

    .line 53
    .line 54
    invoke-virtual {p2, p1}, Lp/bxb;->L(Lp/tnd0;)V

    .line 55
    .line 56
    .line 57
    :cond_2
    :goto_2
    return-void
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
.end method

.method public final g(Lp/qpd0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lp/rpd0;->g:Lp/psd0;

    .line 2
    .line 3
    iget-object v0, v0, Lp/psd0;->m:Lp/bxb;

    .line 4
    .line 5
    invoke-virtual {v0}, Lp/bxb;->u()Lp/pf40;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    move v2, v1

    .line 11
    :goto_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-ge v2, v3, :cond_0

    .line 16
    .line 17
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Lp/tnd0;

    .line 22
    .line 23
    invoke-virtual {p0, v3, p1}, Lp/rpd0;->f(Lp/tnd0;Lp/qpd0;)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    :try_start_0
    iget-object v0, p0, Lp/rpd0;->h:Lp/pqd0;

    .line 30
    .line 31
    iget-object v0, v0, Lp/pqd0;->f:Lp/nqd0;

    .line 32
    .line 33
    invoke-interface {p1, v0, v1}, Lp/qpd0;->e(Lp/snd0;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :catch_0
    move-exception p1

    .line 38
    const-string v0, "Exception in using media1 API"

    .line 39
    .line 40
    invoke-static {v0, p1}, Lp/yif1;->s(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    return-void
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
.end method

.method public final h()Landroid/os/Handler;
    .locals 1

    .line 1
    iget-object v0, p0, Lp/rpd0;->l:Landroid/os/Handler;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public i()Lp/wsv0;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lp/rpd0;->E()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lp/rpd0;->g:Lp/psd0;

    .line 5
    .line 6
    iget-object v0, v0, Lp/psd0;->m:Lp/bxb;

    .line 7
    .line 8
    invoke-virtual {v0}, Lp/bxb;->u()Lp/pf40;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lp/rpd0;->h:Lp/pqd0;

    .line 13
    .line 14
    iget-object v1, v1, Lp/pqd0;->a:Lp/bxb;

    .line 15
    .line 16
    invoke-virtual {v1}, Lp/bxb;->u()Lp/pf40;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    add-int/2addr v3, v2

    .line 29
    invoke-static {v3}, Lp/pf40;->n(I)Lp/jf40;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget-boolean v3, p0, Lp/rpd0;->B:Z

    .line 34
    .line 35
    if-nez v3, :cond_0

    .line 36
    .line 37
    invoke-virtual {v2, v0}, Lp/bf40;->e(Ljava/lang/Iterable;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, v1}, Lp/bf40;->e(Ljava/lang/Iterable;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Lp/jf40;->g()Lp/wsv0;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0

    .line 48
    :cond_0
    const/4 v3, 0x0

    .line 49
    move v4, v3

    .line 50
    :goto_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-ge v4, v5, :cond_2

    .line 55
    .line 56
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    check-cast v5, Lp/tnd0;

    .line 61
    .line 62
    invoke-static {v5}, Lp/rpd0;->t(Lp/tnd0;)Z

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    if-nez v6, :cond_1

    .line 67
    .line 68
    invoke-virtual {v2, v5}, Lp/bf40;->c(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    :goto_1
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-ge v3, v0, :cond_4

    .line 79
    .line 80
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Lp/tnd0;

    .line 85
    .line 86
    invoke-static {v0}, Lp/rpd0;->t(Lp/tnd0;)Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-nez v4, :cond_3

    .line 91
    .line 92
    invoke-virtual {v2, v0}, Lp/bf40;->c(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_4
    invoke-virtual {v2}, Lp/jf40;->g()Lp/wsv0;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    return-object v0
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
.end method

.method public final j()Lp/tnd0;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lp/rpd0;->E()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lp/rpd0;->g:Lp/psd0;

    .line 5
    .line 6
    iget-object v0, v0, Lp/psd0;->m:Lp/bxb;

    .line 7
    .line 8
    invoke-virtual {v0}, Lp/bxb;->u()Lp/pf40;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-ge v1, v2, :cond_1

    .line 18
    .line 19
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lp/tnd0;

    .line 24
    .line 25
    invoke-virtual {p0, v2}, Lp/rpd0;->r(Lp/tnd0;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    return-object v2

    .line 32
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v0, 0x0

    .line 36
    return-object v0
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
.end method

.method public final k()Landroid/media/session/MediaSession$Token;
    .locals 1

    .line 1
    iget-object v0, p0, Lp/rpd0;->h:Lp/pqd0;

    .line 2
    .line 3
    iget-object v0, v0, Lp/pqd0;->j:Landroidx/media3/session/legacy/MediaSessionCompat;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/media3/session/legacy/MediaSessionCompat;->getSessionToken()Landroidx/media3/session/legacy/MediaSessionCompat$Token;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroidx/media3/session/legacy/MediaSessionCompat$Token;->getToken()Landroid/media/session/MediaSession$Token;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public final m()Lp/tnd0;
    .locals 5

    .line 1
    iget-object v0, p0, Lp/rpd0;->h:Lp/pqd0;

    .line 2
    .line 3
    iget-object v0, v0, Lp/pqd0;->a:Lp/bxb;

    .line 4
    .line 5
    invoke-virtual {v0}, Lp/bxb;->u()Lp/pf40;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    move v2, v1

    .line 11
    :goto_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-ge v2, v3, :cond_1

    .line 16
    .line 17
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Lp/tnd0;

    .line 22
    .line 23
    invoke-static {v3}, Lp/rpd0;->t(Lp/tnd0;)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    return-object v3

    .line 30
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget-object v0, p0, Lp/rpd0;->g:Lp/psd0;

    .line 34
    .line 35
    iget-object v0, v0, Lp/psd0;->m:Lp/bxb;

    .line 36
    .line 37
    invoke-virtual {v0}, Lp/bxb;->u()Lp/pf40;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :goto_1
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-ge v1, v2, :cond_3

    .line 46
    .line 47
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Lp/tnd0;

    .line 52
    .line 53
    invoke-static {v2}, Lp/rpd0;->t(Lp/tnd0;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    return-object v2

    .line 60
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    const/4 v0, 0x0

    .line 64
    return-object v0
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
.end method

.method public final n()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lp/rpd0;->b:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public final o(Lp/b7p0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lp/rpd0;->c:Lp/opd0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1, v1}, Lp/opd0;->a(ZZ)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lp/kcd0;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lp/kcd0;-><init>(Lp/b7p0;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lp/rpd0;->g(Lp/qpd0;)V

    .line 13
    .line 14
    .line 15
    :try_start_0
    iget-object p1, p0, Lp/rpd0;->h:Lp/pqd0;

    .line 16
    .line 17
    iget-object p1, p1, Lp/pqd0;->f:Lp/nqd0;

    .line 18
    .line 19
    iget-object v0, p0, Lp/rpd0;->s:Lp/cap0;

    .line 20
    .line 21
    iget-object v0, v0, Lp/cap0;->s:Lp/x6r;

    .line 22
    .line 23
    invoke-virtual {p1}, Lp/nqd0;->p()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catch_0
    move-exception p1

    .line 28
    const-string v0, "Exception in using media1 API"

    .line 29
    .line 30
    invoke-static {v0, p1}, Lp/yif1;->s(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    return-void
    .line 34
    .line 35
.end method

.method public final p(Lp/tnd0;Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lp/rpd0;->w:Lp/esa0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lp/rpd0;->k:Lp/ggd0;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lp/esa0;->c(Lp/ggd0;)Lp/u790;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-static {v0}, Lp/vgg1;->A(Ljava/lang/Object;)Lp/te40;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    new-instance v1, Lp/fmd0;

    .line 19
    .line 20
    invoke-direct {v1, p0, p1, p2}, Lp/fmd0;-><init>(Lp/rpd0;Lp/tnd0;Z)V

    .line 21
    .line 22
    .line 23
    new-instance p1, Lp/xgi;

    .line 24
    .line 25
    const/4 p2, 0x6

    .line 26
    invoke-direct {p1, p0, p2}, Lp/xgi;-><init>(Ljava/lang/Object;I)V

    .line 27
    .line 28
    .line 29
    new-instance p2, Lp/lk00;

    .line 30
    .line 31
    move-object v2, v0

    .line 32
    check-cast v2, Lp/u790;

    .line 33
    .line 34
    const/16 v3, 0x16

    .line 35
    .line 36
    invoke-direct {p2, v3, v2, v1}, Lp/lk00;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v0, p2, p1}, Lp/u790;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 40
    .line 41
    .line 42
    return-void
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
.end method

.method public abstract q(Lp/tnd0;)Z
.end method

.method public final r(Lp/tnd0;)Z
    .locals 2

    .line 1
    iget-object v0, p1, Lp/tnd0;->a:Landroidx/media3/session/legacy/MediaSessionManager$RemoteUserInfo;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/session/legacy/MediaSessionManager$RemoteUserInfo;->getPackageName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lp/rpd0;->f:Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget v0, p1, Lp/tnd0;->b:I

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1}, Lp/tnd0;->b()Landroid/os/Bundle;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-string v0, "androidx.media3.session.MediaNotificationManager"

    .line 29
    .line 30
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    return p1

    .line 38
    :cond_0
    return v1
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
.end method

.method public final s()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lp/rpd0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lp/rpd0;->z:Z

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v1
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public final u(Lp/tnd0;Lp/wsv0;)Lp/u790;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lp/rpd0;->C(Lp/tnd0;)Lp/tnd0;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lp/rpd0;->e:Lp/qgd0;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-virtual {p2, p1}, Lp/pf40;->r(I)Lp/kf40;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_0
    invoke-virtual {p1}, Lp/d7;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Lp/d7;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lp/ufd0;

    .line 25
    .line 26
    iget-object v0, v0, Lp/ufd0;->b:Lp/ofd0;

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 33
    .line 34
    .line 35
    new-instance p2, Lp/qe40;

    .line 36
    .line 37
    invoke-direct {p2, p1}, Lp/qe40;-><init>(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-static {p2}, Lp/vgg1;->A(Ljava/lang/Object;)Lp/te40;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    :goto_0
    check-cast p2, Lp/u790;

    .line 46
    .line 47
    return-object p2
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
.end method

.method public final v(Lp/tnd0;)Lp/te40;
    .locals 10

    .line 1
    iget-object v0, p1, Lp/tnd0;->a:Landroidx/media3/session/legacy/MediaSessionManager$RemoteUserInfo;

    .line 2
    .line 3
    iget-boolean v1, p0, Lp/rpd0;->B:Z

    .line 4
    .line 5
    iget-object v2, p0, Lp/rpd0;->h:Lp/pqd0;

    .line 6
    .line 7
    if-eqz v1, :cond_3

    .line 8
    .line 9
    invoke-static {p1}, Lp/rpd0;->t(Lp/tnd0;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    sget-object p1, Lp/nxz0;->b:Lp/nxz0;

    .line 19
    .line 20
    sget-object p1, Lp/b7p0;->b:Lp/b7p0;

    .line 21
    .line 22
    iget-object v5, v2, Lp/pqd0;->v:Lp/nxz0;

    .line 23
    .line 24
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v6, v2, Lp/pqd0;->w:Lp/b7p0;

    .line 28
    .line 29
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object p1, v2, Lp/pqd0;->u:Lp/pf40;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    const/4 v0, 0x0

    .line 39
    if-nez p1, :cond_1

    .line 40
    .line 41
    iget-object p1, v2, Lp/pqd0;->u:Lp/pf40;

    .line 42
    .line 43
    if-nez p1, :cond_0

    .line 44
    .line 45
    move-object p1, v0

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-static {p1}, Lp/pf40;->p(Ljava/util/Collection;)Lp/pf40;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    :goto_0
    move-object v8, p1

    .line 52
    move-object v7, v0

    .line 53
    goto :goto_2

    .line 54
    :cond_1
    iget-object p1, v2, Lp/pqd0;->t:Lp/pf40;

    .line 55
    .line 56
    if-nez p1, :cond_2

    .line 57
    .line 58
    move-object p1, v0

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    invoke-static {p1}, Lp/pf40;->p(Ljava/util/Collection;)Lp/pf40;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    :goto_1
    move-object v7, p1

    .line 65
    move-object v8, v0

    .line 66
    :goto_2
    new-instance v3, Lp/rnd0;

    .line 67
    .line 68
    const/4 v4, 0x1

    .line 69
    const/4 v9, 0x0

    .line 70
    invoke-direct/range {v3 .. v9}, Lp/rnd0;-><init>(ZLp/nxz0;Lp/b7p0;Lp/pf40;Lp/pf40;Landroid/os/Bundle;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v3}, Lp/vgg1;->A(Ljava/lang/Object;)Lp/te40;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    return-object p1

    .line 78
    :cond_3
    iget-object v1, p0, Lp/rpd0;->e:Lp/qgd0;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Landroidx/media3/session/legacy/MediaSessionManager$RemoteUserInfo;->getPackageName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v0}, Landroidx/media3/session/legacy/MediaSessionManager$RemoteUserInfo;->getUid()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    const-string v1, "MLS: onConnect: package=%s, uid=%d"

    .line 100
    .line 101
    invoke-static {v1, v0}, Lcom/spotify/base/java/logging/Logger;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    sget-object v0, Lp/rnd0;->g:Lp/nxz0;

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    new-instance v1, Ljava/util/HashSet;

    .line 110
    .line 111
    iget-object v0, v0, Lp/nxz0;->a:Lp/hg40;

    .line 112
    .line 113
    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 114
    .line 115
    .line 116
    iget-object v0, p0, Lp/rpd0;->k:Lp/ggd0;

    .line 117
    .line 118
    invoke-virtual {v0}, Lp/ggd0;->e()Lp/pf40;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    new-instance v4, Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    :cond_4
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    if-eqz v5, :cond_5

    .line 136
    .line 137
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    check-cast v5, Lp/bcf;

    .line 142
    .line 143
    iget-object v5, v5, Lp/bcf;->a:Lp/mxz0;

    .line 144
    .line 145
    if-eqz v5, :cond_4

    .line 146
    .line 147
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_5
    invoke-interface {v1, v4}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 152
    .line 153
    .line 154
    new-instance v3, Lp/nxz0;

    .line 155
    .line 156
    invoke-direct {v3, v1}, Lp/nxz0;-><init>(Ljava/util/HashSet;)V

    .line 157
    .line 158
    .line 159
    new-instance v1, Lp/a7p0;

    .line 160
    .line 161
    invoke-direct {v1}, Lp/a7p0;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1}, Lp/a7p0;->b()V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1}, Lp/a7p0;->d()Lp/b7p0;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-static {v3, v1}, Lp/rnd0;->a(Lp/nxz0;Lp/b7p0;)Lp/rnd0;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-virtual {p0, p1}, Lp/rpd0;->r(Lp/tnd0;)Z

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    if-eqz p1, :cond_7

    .line 180
    .line 181
    const/4 p1, 0x1

    .line 182
    iput-boolean p1, p0, Lp/rpd0;->B:Z

    .line 183
    .line 184
    invoke-virtual {v0}, Lp/ggd0;->e()Lp/pf40;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    if-eqz v3, :cond_6

    .line 193
    .line 194
    iget-object p1, v0, Lp/ggd0;->a:Lp/dhd0;

    .line 195
    .line 196
    invoke-virtual {p1}, Lp/rpd0;->E()V

    .line 197
    .line 198
    .line 199
    iget-object p1, p1, Lp/rpd0;->C:Lp/pf40;

    .line 200
    .line 201
    iput-object p1, v2, Lp/pqd0;->t:Lp/pf40;

    .line 202
    .line 203
    goto :goto_4

    .line 204
    :cond_6
    iput-object p1, v2, Lp/pqd0;->u:Lp/pf40;

    .line 205
    .line 206
    invoke-virtual {v2}, Lp/pqd0;->m()V

    .line 207
    .line 208
    .line 209
    :goto_4
    iget-object p1, v1, Lp/rnd0;->b:Lp/nxz0;

    .line 210
    .line 211
    iget-object v0, v1, Lp/rnd0;->c:Lp/b7p0;

    .line 212
    .line 213
    invoke-virtual {v2, p1, v0}, Lp/pqd0;->k(Lp/nxz0;Lp/b7p0;)V

    .line 214
    .line 215
    .line 216
    :cond_7
    invoke-static {v1}, Lp/vgg1;->A(Ljava/lang/Object;)Lp/te40;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    return-object p1
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
.end method

.method public final w(Lp/tnd0;Lp/mxz0;Landroid/os/Bundle;)Lp/y790;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lp/rpd0;->C(Lp/tnd0;)Lp/tnd0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lp/rpd0;->e:Lp/qgd0;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Lp/qgd0;->a:Lp/sgd0;

    .line 11
    .line 12
    iget-object p1, p1, Lp/tnd0;->a:Landroidx/media3/session/legacy/MediaSessionManager$RemoteUserInfo;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroidx/media3/session/legacy/MediaSessionManager$RemoteUserInfo;->getPackageName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object p2, p2, Lp/mxz0;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, p1, p2, p3}, Lp/sgd0;->c(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lp/y790;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
.end method

.method public final x(Lp/tnd0;Landroid/content/Intent;)Z
    .locals 10

    .line 1
    iget v0, p1, Lp/tnd0;->b:I

    .line 2
    .line 3
    invoke-static {p2}, Lp/ti5;->C(Landroid/content/Intent;)Landroid/view/KeyEvent;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    const-string v4, "android.intent.action.MEDIA_BUTTON"

    .line 16
    .line 17
    invoke-static {v3, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/4 v4, 0x0

    .line 22
    if-eqz v3, :cond_f

    .line 23
    .line 24
    iget-object v3, p0, Lp/rpd0;->f:Landroid/content/Context;

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    invoke-virtual {v2}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-static {v2, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_f

    .line 41
    .line 42
    :cond_0
    if-nez v1, :cond_1

    .line 43
    .line 44
    goto/16 :goto_3

    .line 45
    .line 46
    :cond_1
    invoke-virtual {p0}, Lp/rpd0;->E()V

    .line 47
    .line 48
    .line 49
    iget-object v2, p0, Lp/rpd0;->e:Lp/qgd0;

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getAction()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    const/16 v5, 0x4f

    .line 59
    .line 60
    const/4 v6, 0x1

    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eq p1, v5, :cond_e

    .line 68
    .line 69
    const/16 p2, 0x7e

    .line 70
    .line 71
    if-eq p1, p2, :cond_e

    .line 72
    .line 73
    const/16 p2, 0x7f

    .line 74
    .line 75
    if-eq p1, p2, :cond_e

    .line 76
    .line 77
    const/16 p2, 0x110

    .line 78
    .line 79
    if-eq p1, p2, :cond_e

    .line 80
    .line 81
    const/16 p2, 0x111

    .line 82
    .line 83
    if-eq p1, p2, :cond_e

    .line 84
    .line 85
    packed-switch p1, :pswitch_data_0

    .line 86
    .line 87
    .line 88
    goto/16 :goto_3

    .line 89
    .line 90
    :cond_2
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    const-string v7, "android.software.leanback"

    .line 99
    .line 100
    invoke-virtual {v3, v7}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    const/4 v7, 0x0

    .line 105
    const/16 v8, 0x55

    .line 106
    .line 107
    iget-object v9, p0, Lp/rpd0;->d:Lp/npd0;

    .line 108
    .line 109
    if-eq v2, v5, :cond_4

    .line 110
    .line 111
    if-eq v2, v8, :cond_4

    .line 112
    .line 113
    iget-object p1, v9, Lp/npd0;->a:Lp/kgd0;

    .line 114
    .line 115
    if-eqz p1, :cond_3

    .line 116
    .line 117
    invoke-virtual {v9, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 118
    .line 119
    .line 120
    iget-object p1, v9, Lp/npd0;->a:Lp/kgd0;

    .line 121
    .line 122
    iput-object v7, v9, Lp/npd0;->a:Lp/kgd0;

    .line 123
    .line 124
    move-object v7, p1

    .line 125
    :cond_3
    if-eqz v7, :cond_a

    .line 126
    .line 127
    invoke-static {v9, v7}, Lp/h0b1;->c0(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_4
    if-nez v3, :cond_8

    .line 132
    .line 133
    if-nez v0, :cond_8

    .line 134
    .line 135
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    if-eqz v3, :cond_5

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_5
    iget-object v3, v9, Lp/npd0;->a:Lp/kgd0;

    .line 143
    .line 144
    if-eqz v3, :cond_7

    .line 145
    .line 146
    if-eqz v3, :cond_6

    .line 147
    .line 148
    invoke-virtual {v9, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 149
    .line 150
    .line 151
    iput-object v7, v9, Lp/npd0;->a:Lp/kgd0;

    .line 152
    .line 153
    :cond_6
    move p1, v6

    .line 154
    goto :goto_2

    .line 155
    :cond_7
    new-instance p2, Lp/kgd0;

    .line 156
    .line 157
    const/4 v0, 0x5

    .line 158
    invoke-direct {p2, v9, p1, v1, v0}, Lp/kgd0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 159
    .line 160
    .line 161
    iput-object p2, v9, Lp/npd0;->a:Lp/kgd0;

    .line 162
    .line 163
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    int-to-long v0, p1

    .line 168
    invoke-virtual {v9, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 169
    .line 170
    .line 171
    return v6

    .line 172
    :cond_8
    :goto_0
    iget-object p1, v9, Lp/npd0;->a:Lp/kgd0;

    .line 173
    .line 174
    if-eqz p1, :cond_9

    .line 175
    .line 176
    invoke-virtual {v9, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 177
    .line 178
    .line 179
    iget-object p1, v9, Lp/npd0;->a:Lp/kgd0;

    .line 180
    .line 181
    iput-object v7, v9, Lp/npd0;->a:Lp/kgd0;

    .line 182
    .line 183
    move-object v7, p1

    .line 184
    :cond_9
    if-eqz v7, :cond_a

    .line 185
    .line 186
    invoke-static {v9, v7}, Lp/h0b1;->c0(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 187
    .line 188
    .line 189
    :cond_a
    :goto_1
    move p1, v4

    .line 190
    :goto_2
    iget-boolean v3, p0, Lp/rpd0;->B:Z

    .line 191
    .line 192
    if-nez v3, :cond_d

    .line 193
    .line 194
    iget-object p2, p0, Lp/rpd0;->h:Lp/pqd0;

    .line 195
    .line 196
    if-eq v2, v8, :cond_b

    .line 197
    .line 198
    if-ne v2, v5, :cond_c

    .line 199
    .line 200
    :cond_b
    if-eqz p1, :cond_c

    .line 201
    .line 202
    invoke-virtual {p2}, Lp/pqd0;->onSkipToNext()V

    .line 203
    .line 204
    .line 205
    return v6

    .line 206
    :cond_c
    if-eqz v0, :cond_f

    .line 207
    .line 208
    iget-object p1, p2, Lp/pqd0;->j:Landroidx/media3/session/legacy/MediaSessionCompat;

    .line 209
    .line 210
    invoke-virtual {p1}, Landroidx/media3/session/legacy/MediaSessionCompat;->getController()Landroidx/media3/session/legacy/MediaControllerCompat;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    invoke-virtual {p1, v1}, Landroidx/media3/session/legacy/MediaControllerCompat;->dispatchMediaButtonEvent(Landroid/view/KeyEvent;)Z

    .line 215
    .line 216
    .line 217
    return v6

    .line 218
    :cond_d
    const-string v0, "androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY"

    .line 219
    .line 220
    invoke-virtual {p2, v0, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 221
    .line 222
    .line 223
    move-result p2

    .line 224
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-gtz v0, :cond_e

    .line 229
    .line 230
    invoke-virtual {p0, v1, p1, p2}, Lp/rpd0;->d(Landroid/view/KeyEvent;ZZ)Z

    .line 231
    .line 232
    .line 233
    move-result p1

    .line 234
    if-eqz p1, :cond_f

    .line 235
    .line 236
    :cond_e
    :pswitch_0
    return v6

    .line 237
    :cond_f
    :goto_3
    return v4

    .line 238
    nop

    .line 239
    :pswitch_data_0
    .packed-switch 0x55
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
.end method

.method public final y(Lp/tnd0;Lp/b7p0;)V
    .locals 8

    .line 1
    invoke-virtual {p0, p1}, Lp/rpd0;->C(Lp/tnd0;)Lp/tnd0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lp/rpd0;->e:Lp/qgd0;

    .line 6
    .line 7
    iget-object v1, v0, Lp/qgd0;->a:Lp/sgd0;

    .line 8
    .line 9
    iget-object v0, v0, Lp/qgd0;->b:Lp/ljn0;

    .line 10
    .line 11
    iget-object v2, v0, Lp/ljn0;->a:Ljava/util/List;

    .line 12
    .line 13
    if-eqz v2, :cond_b

    .line 14
    .line 15
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    goto/16 :goto_1

    .line 22
    .line 23
    :cond_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/4 v4, 0x1

    .line 28
    if-ne v3, v4, :cond_a

    .line 29
    .line 30
    invoke-virtual {p2, v4}, Lp/b7p0;->a(I)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const/4 v4, 0x2

    .line 35
    invoke-virtual {p2, v4}, Lp/b7p0;->a(I)Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-nez p2, :cond_2

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 45
    .line 46
    const-string p2, "Play and/or prepare is required when setting media items"

    .line 47
    .line 48
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    :goto_0
    const/4 p2, 0x0

    .line 53
    invoke-interface {v2, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    check-cast p2, Lp/ufd0;

    .line 58
    .line 59
    iget-object v2, p2, Lp/ufd0;->a:Ljava/lang/String;

    .line 60
    .line 61
    iget-object p2, p2, Lp/ufd0;->f:Lp/pfd0;

    .line 62
    .line 63
    iget-object v4, p2, Lp/pfd0;->a:Landroid/net/Uri;

    .line 64
    .line 65
    iget-object v5, p2, Lp/pfd0;->b:Ljava/lang/String;

    .line 66
    .line 67
    iget-object p2, p2, Lp/pfd0;->c:Landroid/os/Bundle;

    .line 68
    .line 69
    const/4 v6, 0x3

    .line 70
    if-eqz p2, :cond_3

    .line 71
    .line 72
    const-string v7, "android.media.session.extra.LEGACY_STREAM_TYPE"

    .line 73
    .line 74
    invoke-virtual {p2, v7, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    :cond_3
    invoke-static {v2}, Lp/wl51;->J0(Ljava/lang/CharSequence;)Z

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    if-nez v7, :cond_5

    .line 83
    .line 84
    iget-object p1, p1, Lp/tnd0;->a:Landroidx/media3/session/legacy/MediaSessionManager$RemoteUserInfo;

    .line 85
    .line 86
    invoke-virtual {p1}, Landroidx/media3/session/legacy/MediaSessionManager$RemoteUserInfo;->getPackageName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-eqz v3, :cond_4

    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    new-instance v3, Lp/rla0;

    .line 96
    .line 97
    invoke-direct {v3, v2, v6, p2}, Lp/rla0;-><init>(Ljava/lang/String;ILandroid/os/Bundle;)V

    .line 98
    .line 99
    .line 100
    sget-object p2, Lp/vnd0;->h:Lp/vnd0;

    .line 101
    .line 102
    invoke-virtual {v1, p1, p2, v3}, Lp/sgd0;->b(Ljava/lang/String;Lp/vnd0;Lp/th00;)V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 107
    .line 108
    const-string p2, "Play must be executed when setting media id"

    .line 109
    .line 110
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p1

    .line 114
    :cond_5
    if-eqz v4, :cond_7

    .line 115
    .line 116
    iget-object p1, p1, Lp/tnd0;->a:Landroidx/media3/session/legacy/MediaSessionManager$RemoteUserInfo;

    .line 117
    .line 118
    invoke-virtual {p1}, Landroidx/media3/session/legacy/MediaSessionManager$RemoteUserInfo;->getPackageName()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    if-eqz v3, :cond_6

    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    new-instance v2, Lp/rgd0;

    .line 128
    .line 129
    const/4 v3, 0x0

    .line 130
    invoke-direct {v2, v4, p2, v3}, Lp/rgd0;-><init>(Landroid/net/Uri;Landroid/os/Bundle;I)V

    .line 131
    .line 132
    .line 133
    sget-object p2, Lp/vnd0;->X:Lp/vnd0;

    .line 134
    .line 135
    invoke-virtual {v1, p1, p2, v2}, Lp/sgd0;->b(Ljava/lang/String;Lp/vnd0;Lp/th00;)V

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    new-instance v2, Lp/rgd0;

    .line 143
    .line 144
    const/4 v3, 0x1

    .line 145
    invoke-direct {v2, v4, p2, v3}, Lp/rgd0;-><init>(Landroid/net/Uri;Landroid/os/Bundle;I)V

    .line 146
    .line 147
    .line 148
    sget-object p2, Lp/vnd0;->Y:Lp/vnd0;

    .line 149
    .line 150
    invoke-virtual {v1, p1, p2, v2}, Lp/sgd0;->b(Ljava/lang/String;Lp/vnd0;Lp/th00;)V

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_7
    if-eqz v5, :cond_9

    .line 155
    .line 156
    iget-object p1, p1, Lp/tnd0;->a:Landroidx/media3/session/legacy/MediaSessionManager$RemoteUserInfo;

    .line 157
    .line 158
    invoke-virtual {p1}, Landroidx/media3/session/legacy/MediaSessionManager$RemoteUserInfo;->getPackageName()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    if-eqz v3, :cond_8

    .line 163
    .line 164
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    new-instance v2, Lp/hgb0;

    .line 168
    .line 169
    const/16 v3, 0x16

    .line 170
    .line 171
    invoke-direct {v2, v3, v5, p2}, Lp/hgb0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    sget-object p2, Lp/vnd0;->i:Lp/vnd0;

    .line 175
    .line 176
    invoke-virtual {v1, p1, p2, v2}, Lp/sgd0;->b(Ljava/lang/String;Lp/vnd0;Lp/th00;)V

    .line 177
    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 181
    .line 182
    const-string p2, "Play not executed when setting media item with search"

    .line 183
    .line 184
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    throw p1

    .line 188
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 189
    .line 190
    const-string p2, "Set media item without playing is not supported."

    .line 191
    .line 192
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    throw p1

    .line 196
    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 197
    .line 198
    const-string p2, "Adding multiple media items is not supported"

    .line 199
    .line 200
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    throw p1

    .line 204
    :cond_b
    :goto_1
    const/4 p1, 0x0

    .line 205
    iput-object p1, v0, Lp/ljn0;->a:Ljava/util/List;

    .line 206
    .line 207
    return-void
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
.end method

.method public final z(Lp/tnd0;Lp/wsv0;IJ)Lp/te40;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lp/rpd0;->C(Lp/tnd0;)Lp/tnd0;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lp/rpd0;->e:Lp/qgd0;

    .line 5
    .line 6
    iget-object p1, p1, Lp/qgd0;->b:Lp/ljn0;

    .line 7
    .line 8
    iput-object p2, p1, Lp/ljn0;->a:Ljava/util/List;

    .line 9
    .line 10
    new-instance p1, Lp/und0;

    .line 11
    .line 12
    invoke-direct {p1, p2, p3, p4, p5}, Lp/und0;-><init>(Ljava/util/List;IJ)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lp/vgg1;->A(Ljava/lang/Object;)Lp/te40;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
.end method
