.class public abstract Lp/fzg1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lp/sd40;


# direct methods
.method public static final a(Ljava/lang/String;Ljava/lang/String;Lp/h4b1;Lp/fxh0;Lp/eh00;Lp/fyf;Lp/xq00;II)V
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move-object/from16 v0, p6

    .line 10
    .line 11
    sget-object v5, Lp/t6x0;->t:Lp/ia7;

    .line 12
    .line 13
    const v6, -0x2822e055

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v6}, Lp/xq00;->k0(I)Lp/xq00;

    .line 17
    .line 18
    .line 19
    iget-object v6, v0, Lp/xq00;->a:Lp/ug5;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lp/xq00;->g(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    if-eqz v7, :cond_0

    .line 26
    .line 27
    const/4 v7, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v7, 0x2

    .line 30
    :goto_0
    or-int v7, p7, v7

    .line 31
    .line 32
    and-int/lit8 v8, p7, 0x30

    .line 33
    .line 34
    if-nez v8, :cond_2

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Lp/xq00;->g(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    if-eqz v8, :cond_1

    .line 41
    .line 42
    const/16 v8, 0x20

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const/16 v8, 0x10

    .line 46
    .line 47
    :goto_1
    or-int/2addr v7, v8

    .line 48
    :cond_2
    invoke-virtual {v0, v4}, Lp/xq00;->i(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    if-eqz v8, :cond_3

    .line 53
    .line 54
    const/16 v8, 0x800

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    const/16 v8, 0x400

    .line 58
    .line 59
    :goto_2
    or-int/2addr v7, v8

    .line 60
    and-int/lit8 v8, p8, 0x10

    .line 61
    .line 62
    if-eqz v8, :cond_4

    .line 63
    .line 64
    or-int/lit16 v7, v7, 0x6000

    .line 65
    .line 66
    move-object/from16 v10, p4

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_4
    move-object/from16 v10, p4

    .line 70
    .line 71
    invoke-virtual {v0, v10}, Lp/xq00;->i(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v11

    .line 75
    if-eqz v11, :cond_5

    .line 76
    .line 77
    const/16 v11, 0x4000

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_5
    const/16 v11, 0x2000

    .line 81
    .line 82
    :goto_3
    or-int/2addr v7, v11

    .line 83
    :goto_4
    const v11, 0x12493

    .line 84
    .line 85
    .line 86
    and-int/2addr v11, v7

    .line 87
    const v12, 0x12492

    .line 88
    .line 89
    .line 90
    const/4 v14, 0x0

    .line 91
    if-eq v11, v12, :cond_6

    .line 92
    .line 93
    const/4 v11, 0x1

    .line 94
    goto :goto_5

    .line 95
    :cond_6
    move v11, v14

    .line 96
    :goto_5
    and-int/lit8 v12, v7, 0x1

    .line 97
    .line 98
    invoke-virtual {v0, v12, v11}, Lp/xq00;->Y(IZ)Z

    .line 99
    .line 100
    .line 101
    move-result v11

    .line 102
    if-eqz v11, :cond_12

    .line 103
    .line 104
    if-eqz v8, :cond_7

    .line 105
    .line 106
    const/4 v10, 0x0

    .line 107
    :cond_7
    invoke-static {v0}, Lp/leu;->b(Lp/xq00;)Lp/jxu;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    iget-object v8, v8, Lp/jxu;->b:Lp/txu;

    .line 112
    .line 113
    sget-object v12, Lp/bj5;->g:Lp/vi5;

    .line 114
    .line 115
    sget-object v15, Lp/d7f0;->M0:Lp/vb9;

    .line 116
    .line 117
    invoke-static {v12, v15, v0, v14}, Lp/drx0;->a(Lp/wi5;Lp/vb9;Lp/xq00;I)Lp/irx0;

    .line 118
    .line 119
    .line 120
    move-result-object v12

    .line 121
    move-object/from16 p4, v10

    .line 122
    .line 123
    iget-wide v9, v0, Lp/xq00;->T:J

    .line 124
    .line 125
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    invoke-virtual {v0}, Lp/xq00;->m()Lp/wpn0;

    .line 130
    .line 131
    .line 132
    move-result-object v10

    .line 133
    const/16 v16, 0x0

    .line 134
    .line 135
    invoke-static {v0, v4}, Lp/hqg1;->s(Lp/xq00;Lp/fxh0;)Lp/fxh0;

    .line 136
    .line 137
    .line 138
    move-result-object v11

    .line 139
    sget-object v17, Lp/soh;->A:Lp/roh;

    .line 140
    .line 141
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    sget-object v15, Lp/roh;->b:Lp/le;

    .line 145
    .line 146
    if-eqz v6, :cond_11

    .line 147
    .line 148
    invoke-virtual {v0}, Lp/xq00;->m0()V

    .line 149
    .line 150
    .line 151
    iget-boolean v6, v0, Lp/xq00;->S:Z

    .line 152
    .line 153
    if-eqz v6, :cond_8

    .line 154
    .line 155
    invoke-virtual {v0, v15}, Lp/xq00;->l(Lp/eh00;)V

    .line 156
    .line 157
    .line 158
    goto :goto_6

    .line 159
    :cond_8
    invoke-virtual {v0}, Lp/xq00;->w0()V

    .line 160
    .line 161
    .line 162
    :goto_6
    sget-object v6, Lp/roh;->g:Lp/yhh;

    .line 163
    .line 164
    invoke-static {v12, v6, v0}, Lp/zsf1;->F(Ljava/lang/Object;Lp/th00;Lp/xq00;)V

    .line 165
    .line 166
    .line 167
    sget-object v12, Lp/roh;->f:Lp/yhh;

    .line 168
    .line 169
    invoke-static {v10, v12, v0}, Lp/zsf1;->F(Ljava/lang/Object;Lp/th00;Lp/xq00;)V

    .line 170
    .line 171
    .line 172
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object v9

    .line 176
    sget-object v10, Lp/roh;->j:Lp/yhh;

    .line 177
    .line 178
    invoke-static {v9, v10, v0}, Lp/zsf1;->F(Ljava/lang/Object;Lp/th00;Lp/xq00;)V

    .line 179
    .line 180
    .line 181
    sget-object v9, Lp/roh;->k:Lp/vlh;

    .line 182
    .line 183
    invoke-static {v9, v0}, Lp/zsf1;->D(Lp/gh00;Lp/xq00;)V

    .line 184
    .line 185
    .line 186
    sget-object v13, Lp/roh;->d:Lp/yhh;

    .line 187
    .line 188
    invoke-static {v11, v13, v0}, Lp/zsf1;->F(Ljava/lang/Object;Lp/th00;Lp/xq00;)V

    .line 189
    .line 190
    .line 191
    sget-object v18, Lp/cxh0;->a:Lp/cxh0;

    .line 192
    .line 193
    if-nez p4, :cond_9

    .line 194
    .line 195
    const v11, 0x65a59cd9

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0, v11}, Lp/xq00;->i0(I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, v14}, Lp/xq00;->r(Z)V

    .line 202
    .line 203
    .line 204
    move-object/from16 v4, p4

    .line 205
    .line 206
    move-object/from16 v11, v18

    .line 207
    .line 208
    goto :goto_a

    .line 209
    :cond_9
    const v11, 0x65a61d73

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v11}, Lp/xq00;->i0(I)V

    .line 213
    .line 214
    .line 215
    const v11, 0xe000

    .line 216
    .line 217
    .line 218
    and-int/2addr v11, v7

    .line 219
    const/16 v14, 0x4000

    .line 220
    .line 221
    if-ne v11, v14, :cond_a

    .line 222
    .line 223
    const/4 v11, 0x1

    .line 224
    goto :goto_7

    .line 225
    :cond_a
    const/4 v11, 0x0

    .line 226
    :goto_7
    invoke-virtual {v0}, Lp/xq00;->T()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v14

    .line 230
    if-nez v11, :cond_c

    .line 231
    .line 232
    if-ne v14, v5, :cond_b

    .line 233
    .line 234
    goto :goto_8

    .line 235
    :cond_b
    move-object/from16 v4, p4

    .line 236
    .line 237
    goto :goto_9

    .line 238
    :cond_c
    :goto_8
    new-instance v14, Lp/nf10;

    .line 239
    .line 240
    const/16 v11, 0x9

    .line 241
    .line 242
    move-object/from16 v4, p4

    .line 243
    .line 244
    invoke-direct {v14, v11, v4}, Lp/nf10;-><init>(ILp/eh00;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0, v14}, Lp/xq00;->t0(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    :goto_9
    move-object/from16 v23, v14

    .line 251
    .line 252
    check-cast v23, Lp/eh00;

    .line 253
    .line 254
    const/16 v24, 0xf

    .line 255
    .line 256
    const/16 v19, 0x0

    .line 257
    .line 258
    const/16 v20, 0x0

    .line 259
    .line 260
    const/16 v21, 0x0

    .line 261
    .line 262
    const/16 v22, 0x0

    .line 263
    .line 264
    invoke-static/range {v18 .. v24}, Lp/hdi;->x(Lp/fxh0;ZLjava/lang/String;Lp/tix0;Lp/voi0;Lp/eh00;I)Lp/fxh0;

    .line 265
    .line 266
    .line 267
    move-result-object v11

    .line 268
    const/4 v14, 0x0

    .line 269
    invoke-virtual {v0, v14}, Lp/xq00;->r(Z)V

    .line 270
    .line 271
    .line 272
    :goto_a
    invoke-virtual {v0}, Lp/xq00;->T()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v14

    .line 276
    if-ne v14, v5, :cond_d

    .line 277
    .line 278
    sget-object v14, Lp/ok20;->f:Lp/ok20;

    .line 279
    .line 280
    invoke-virtual {v0, v14}, Lp/xq00;->t0(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    :cond_d
    check-cast v14, Lp/gh00;

    .line 284
    .line 285
    const/4 v5, 0x0

    .line 286
    invoke-static {v11, v5, v14}, Lp/zoz0;->b(Lp/fxh0;ZLp/gh00;)Lp/fxh0;

    .line 287
    .line 288
    .line 289
    move-result-object v11

    .line 290
    sget-object v5, Lp/h4b1;->d:Lp/h4b1;

    .line 291
    .line 292
    if-ne v3, v5, :cond_e

    .line 293
    .line 294
    iget v5, v8, Lp/txu;->f:F

    .line 295
    .line 296
    const/16 v22, 0x0

    .line 297
    .line 298
    const/16 v23, 0xb

    .line 299
    .line 300
    const/16 v19, 0x0

    .line 301
    .line 302
    const/16 v20, 0x0

    .line 303
    .line 304
    move/from16 v21, v5

    .line 305
    .line 306
    invoke-static/range {v18 .. v23}, Lp/zsf1;->C(Lp/fxh0;FFFFI)Lp/fxh0;

    .line 307
    .line 308
    .line 309
    move-result-object v5

    .line 310
    goto :goto_b

    .line 311
    :cond_e
    iget v5, v8, Lp/txu;->e:F

    .line 312
    .line 313
    iget v8, v8, Lp/txu;->f:F

    .line 314
    .line 315
    const/16 v22, 0x0

    .line 316
    .line 317
    const/16 v23, 0xa

    .line 318
    .line 319
    const/16 v20, 0x0

    .line 320
    .line 321
    move/from16 v19, v5

    .line 322
    .line 323
    move/from16 v21, v8

    .line 324
    .line 325
    invoke-static/range {v18 .. v23}, Lp/zsf1;->C(Lp/fxh0;FFFFI)Lp/fxh0;

    .line 326
    .line 327
    .line 328
    move-result-object v5

    .line 329
    :goto_b
    invoke-interface {v11, v5}, Lp/fxh0;->F(Lp/fxh0;)Lp/fxh0;

    .line 330
    .line 331
    .line 332
    move-result-object v5

    .line 333
    sget-object v8, Lp/s850;->a:Lp/q630;

    .line 334
    .line 335
    sget-object v8, Lp/xef0;->a:Lp/xef0;

    .line 336
    .line 337
    invoke-interface {v5, v8}, Lp/fxh0;->F(Lp/fxh0;)Lp/fxh0;

    .line 338
    .line 339
    .line 340
    move-result-object v5

    .line 341
    const/high16 v8, 0x3f800000    # 1.0f

    .line 342
    .line 343
    float-to-double v1, v8

    .line 344
    const-wide/16 v16, 0x0

    .line 345
    .line 346
    cmpl-double v1, v1, v16

    .line 347
    .line 348
    if-lez v1, :cond_f

    .line 349
    .line 350
    :goto_c
    const/4 v14, 0x0

    .line 351
    goto :goto_d

    .line 352
    :cond_f
    const-string v1, "invalid weight; must be greater than zero"

    .line 353
    .line 354
    invoke-static {v1}, Lp/kt40;->a(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    goto :goto_c

    .line 358
    :goto_d
    invoke-static {v8, v5, v14}, Lp/f710;->h(FLp/fxh0;Z)Lp/fxh0;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    sget-object v2, Lp/d7f0;->e:Lp/wb9;

    .line 363
    .line 364
    invoke-static {v2, v14}, Lp/dha;->d(Lp/ob3;Z)Lp/m6d0;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    move-object/from16 p4, v4

    .line 369
    .line 370
    iget-wide v4, v0, Lp/xq00;->T:J

    .line 371
    .line 372
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 373
    .line 374
    .line 375
    move-result v4

    .line 376
    invoke-virtual {v0}, Lp/xq00;->m()Lp/wpn0;

    .line 377
    .line 378
    .line 379
    move-result-object v5

    .line 380
    invoke-static {v0, v1}, Lp/hqg1;->s(Lp/xq00;Lp/fxh0;)Lp/fxh0;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    invoke-virtual {v0}, Lp/xq00;->m0()V

    .line 385
    .line 386
    .line 387
    iget-boolean v8, v0, Lp/xq00;->S:Z

    .line 388
    .line 389
    if-eqz v8, :cond_10

    .line 390
    .line 391
    invoke-virtual {v0, v15}, Lp/xq00;->l(Lp/eh00;)V

    .line 392
    .line 393
    .line 394
    goto :goto_e

    .line 395
    :cond_10
    invoke-virtual {v0}, Lp/xq00;->w0()V

    .line 396
    .line 397
    .line 398
    :goto_e
    invoke-static {v2, v6, v0}, Lp/zsf1;->F(Ljava/lang/Object;Lp/th00;Lp/xq00;)V

    .line 399
    .line 400
    .line 401
    invoke-static {v5, v12, v0}, Lp/zsf1;->F(Ljava/lang/Object;Lp/th00;Lp/xq00;)V

    .line 402
    .line 403
    .line 404
    invoke-static {v4, v0, v10, v0, v9}, La;->s(ILp/xq00;Lp/yhh;Lp/xq00;Lp/vlh;)V

    .line 405
    .line 406
    .line 407
    invoke-static {v1, v13, v0}, Lp/zsf1;->F(Ljava/lang/Object;Lp/th00;Lp/xq00;)V

    .line 408
    .line 409
    .line 410
    and-int/lit16 v1, v7, 0x3fe

    .line 411
    .line 412
    move-object/from16 v2, p0

    .line 413
    .line 414
    move-object/from16 v4, p1

    .line 415
    .line 416
    invoke-static {v2, v4, v3, v0, v1}, Lp/aug1;->a(Ljava/lang/String;Ljava/lang/String;Lp/h4b1;Lp/xq00;I)V

    .line 417
    .line 418
    .line 419
    const/4 v1, 0x1

    .line 420
    invoke-virtual {v0, v1}, Lp/xq00;->r(Z)V

    .line 421
    .line 422
    .line 423
    const/4 v5, 0x6

    .line 424
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 425
    .line 426
    .line 427
    move-result-object v5

    .line 428
    move-object/from16 v6, p5

    .line 429
    .line 430
    invoke-virtual {v6, v0, v5}, Lp/fyf;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v0, v1}, Lp/xq00;->r(Z)V

    .line 434
    .line 435
    .line 436
    move-object/from16 v5, p4

    .line 437
    .line 438
    goto :goto_f

    .line 439
    :cond_11
    invoke-static {}, Lp/pmg1;->s()V

    .line 440
    .line 441
    .line 442
    throw v16

    .line 443
    :cond_12
    move-object/from16 v6, p5

    .line 444
    .line 445
    move-object v4, v2

    .line 446
    move-object v2, v1

    .line 447
    invoke-virtual {v0}, Lp/xq00;->b0()V

    .line 448
    .line 449
    .line 450
    move-object v5, v10

    .line 451
    :goto_f
    invoke-virtual {v0}, Lp/xq00;->v()Lp/pgv0;

    .line 452
    .line 453
    .line 454
    move-result-object v9

    .line 455
    if-eqz v9, :cond_13

    .line 456
    .line 457
    new-instance v0, Lp/cl;

    .line 458
    .line 459
    move/from16 v7, p7

    .line 460
    .line 461
    move/from16 v8, p8

    .line 462
    .line 463
    move-object v1, v2

    .line 464
    move-object v2, v4

    .line 465
    move-object/from16 v4, p3

    .line 466
    .line 467
    invoke-direct/range {v0 .. v8}, Lp/cl;-><init>(Ljava/lang/String;Ljava/lang/String;Lp/h4b1;Lp/fxh0;Lp/eh00;Lp/fyf;II)V

    .line 468
    .line 469
    .line 470
    iput-object v0, v9, Lp/pgv0;->d:Lp/th00;

    .line 471
    .line 472
    :cond_13
    return-void
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
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
.end method

.method public static final b(Lp/kl71;Lp/fxh0;Lp/xq00;I)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v14, p2

    .line 6
    .line 7
    const v2, 0x436e22d1

    .line 8
    .line 9
    .line 10
    invoke-virtual {v14, v2}, Lp/xq00;->k0(I)Lp/xq00;

    .line 11
    .line 12
    .line 13
    iget-object v2, v14, Lp/xq00;->a:Lp/ug5;

    .line 14
    .line 15
    and-int/lit8 v3, p3, 0x6

    .line 16
    .line 17
    const/4 v4, 0x2

    .line 18
    if-nez v3, :cond_1

    .line 19
    .line 20
    invoke-virtual {v14, v0}, Lp/xq00;->g(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    const/4 v3, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v3, v4

    .line 29
    :goto_0
    or-int v3, p3, v3

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move/from16 v3, p3

    .line 33
    .line 34
    :goto_1
    and-int/lit8 v5, p3, 0x30

    .line 35
    .line 36
    const/16 v6, 0x20

    .line 37
    .line 38
    if-nez v5, :cond_3

    .line 39
    .line 40
    invoke-virtual {v14, v1}, Lp/xq00;->i(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-eqz v5, :cond_2

    .line 45
    .line 46
    move v5, v6

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v5, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr v3, v5

    .line 51
    :cond_3
    and-int/lit8 v5, v3, 0x13

    .line 52
    .line 53
    const/16 v7, 0x12

    .line 54
    .line 55
    const/4 v8, 0x1

    .line 56
    const/4 v9, 0x0

    .line 57
    if-eq v5, v7, :cond_4

    .line 58
    .line 59
    move v5, v8

    .line 60
    goto :goto_3

    .line 61
    :cond_4
    move v5, v9

    .line 62
    :goto_3
    and-int/2addr v3, v8

    .line 63
    invoke-virtual {v14, v3, v5}, Lp/xq00;->Y(IZ)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_a

    .line 68
    .line 69
    invoke-static {v9, v9, v8, v14}, Lp/oyf1;->i0(IIILp/xq00;)Lp/qly0;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    const/16 v5, 0xe

    .line 74
    .line 75
    invoke-static {v1, v3, v9, v5}, Lp/oyf1;->v0(Lp/fxh0;Lp/qly0;ZI)Lp/fxh0;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    sget-object v5, Lp/cxd1;->x:Ljava/util/WeakHashMap;

    .line 80
    .line 81
    invoke-static {v14}, Lp/bxd1;->d(Lp/xq00;)Lp/cxd1;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    iget-object v5, v5, Lp/cxd1;->g:Lp/nv4;

    .line 86
    .line 87
    invoke-static {v5, v6, v3}, La;->r(Lp/nv4;ILp/fxh0;)Lp/fxh0;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-static {v14}, Lp/leu;->b(Lp/xq00;)Lp/jxu;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    iget-object v5, v5, Lp/jxu;->e:Lp/lxu;

    .line 96
    .line 97
    iget v5, v5, Lp/lxu;->c:F

    .line 98
    .line 99
    invoke-static {v5, v3}, Lp/zsf1;->y(FLp/fxh0;)Lp/fxh0;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    const/high16 v5, 0x3f800000    # 1.0f

    .line 104
    .line 105
    invoke-static {v5, v3}, Lp/mi21;->d(FLp/fxh0;)Lp/fxh0;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    sget-object v6, Lp/d7f0;->P0:Lp/ub9;

    .line 110
    .line 111
    sget-object v7, Lp/bj5;->c:Lp/zhi0;

    .line 112
    .line 113
    invoke-static {v7, v6, v14, v9}, Lp/w9f;->a(Lp/aj5;Lp/jb3;Lp/xq00;I)Lp/aaf;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    iget-wide v11, v14, Lp/xq00;->T:J

    .line 118
    .line 119
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 120
    .line 121
    .line 122
    move-result v11

    .line 123
    invoke-virtual {v14}, Lp/xq00;->m()Lp/wpn0;

    .line 124
    .line 125
    .line 126
    move-result-object v12

    .line 127
    invoke-static {v14, v3}, Lp/hqg1;->s(Lp/xq00;Lp/fxh0;)Lp/fxh0;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    sget-object v13, Lp/soh;->A:Lp/roh;

    .line 132
    .line 133
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    sget-object v13, Lp/roh;->b:Lp/le;

    .line 137
    .line 138
    const/4 v15, 0x0

    .line 139
    if-eqz v2, :cond_9

    .line 140
    .line 141
    invoke-virtual {v14}, Lp/xq00;->m0()V

    .line 142
    .line 143
    .line 144
    iget-boolean v2, v14, Lp/xq00;->S:Z

    .line 145
    .line 146
    if-eqz v2, :cond_5

    .line 147
    .line 148
    invoke-virtual {v14, v13}, Lp/xq00;->l(Lp/eh00;)V

    .line 149
    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_5
    invoke-virtual {v14}, Lp/xq00;->w0()V

    .line 153
    .line 154
    .line 155
    :goto_4
    sget-object v2, Lp/roh;->g:Lp/yhh;

    .line 156
    .line 157
    invoke-static {v10, v2, v14}, Lp/zsf1;->F(Ljava/lang/Object;Lp/th00;Lp/xq00;)V

    .line 158
    .line 159
    .line 160
    sget-object v10, Lp/roh;->f:Lp/yhh;

    .line 161
    .line 162
    invoke-static {v12, v10, v14}, Lp/zsf1;->F(Ljava/lang/Object;Lp/th00;Lp/xq00;)V

    .line 163
    .line 164
    .line 165
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 166
    .line 167
    .line 168
    move-result-object v11

    .line 169
    sget-object v12, Lp/roh;->j:Lp/yhh;

    .line 170
    .line 171
    invoke-static {v11, v12, v14}, Lp/zsf1;->F(Ljava/lang/Object;Lp/th00;Lp/xq00;)V

    .line 172
    .line 173
    .line 174
    sget-object v11, Lp/roh;->k:Lp/vlh;

    .line 175
    .line 176
    invoke-static {v11, v14}, Lp/zsf1;->D(Lp/gh00;Lp/xq00;)V

    .line 177
    .line 178
    .line 179
    sget-object v8, Lp/roh;->d:Lp/yhh;

    .line 180
    .line 181
    invoke-static {v3, v8, v14}, Lp/zsf1;->F(Ljava/lang/Object;Lp/th00;Lp/xq00;)V

    .line 182
    .line 183
    .line 184
    invoke-static {v15, v14, v9}, Lp/wze1;->j(Lp/fxh0;Lp/xq00;I)V

    .line 185
    .line 186
    .line 187
    invoke-static {v14}, Lp/leu;->b(Lp/xq00;)Lp/jxu;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    iget-object v3, v3, Lp/jxu;->b:Lp/txu;

    .line 192
    .line 193
    iget v3, v3, Lp/txu;->f:F

    .line 194
    .line 195
    sget-object v15, Lp/cxh0;->a:Lp/cxh0;

    .line 196
    .line 197
    invoke-static {v3, v15}, Lp/mi21;->h(FLp/fxh0;)Lp/fxh0;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    invoke-static {v14, v3}, Lp/riw0;->i(Lp/xq00;Lp/fxh0;)V

    .line 202
    .line 203
    .line 204
    iget-object v3, v0, Lp/kl71;->a:Ljava/lang/String;

    .line 205
    .line 206
    invoke-static {v14}, Lp/leu;->b(Lp/xq00;)Lp/jxu;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    iget-object v5, v5, Lp/jxu;->b:Lp/txu;

    .line 211
    .line 212
    iget v5, v5, Lp/txu;->f:F

    .line 213
    .line 214
    const/4 v1, 0x0

    .line 215
    invoke-static {v15, v5, v1, v4}, Lp/zsf1;->A(Lp/fxh0;FFI)Lp/fxh0;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    invoke-static {v9, v3, v14, v5}, Lp/axf1;->c(ILjava/lang/String;Lp/xq00;Lp/fxh0;)V

    .line 220
    .line 221
    .line 222
    invoke-static {v14}, Lp/leu;->b(Lp/xq00;)Lp/jxu;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    iget-object v3, v3, Lp/jxu;->b:Lp/txu;

    .line 227
    .line 228
    iget v3, v3, Lp/txu;->f:F

    .line 229
    .line 230
    const/high16 v5, 0x3f800000    # 1.0f

    .line 231
    .line 232
    invoke-static {v15, v3, v14, v15, v5}, Lp/ms2;->m(Lp/cxh0;FLp/xq00;Lp/cxh0;F)Lp/fxh0;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    invoke-virtual {v14}, Lp/xq00;->T()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    sget-object v1, Lp/t6x0;->t:Lp/ia7;

    .line 241
    .line 242
    if-ne v5, v1, :cond_6

    .line 243
    .line 244
    sget-object v5, Lp/b371;->b1:Lp/b371;

    .line 245
    .line 246
    invoke-virtual {v14, v5}, Lp/xq00;->t0(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    :cond_6
    check-cast v5, Lp/gh00;

    .line 250
    .line 251
    const/4 v4, 0x1

    .line 252
    invoke-static {v3, v4, v5}, Lp/zoz0;->b(Lp/fxh0;ZLp/gh00;)Lp/fxh0;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    invoke-static {v7, v6, v14, v9}, Lp/w9f;->a(Lp/aj5;Lp/jb3;Lp/xq00;I)Lp/aaf;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    iget-wide v6, v14, Lp/xq00;->T:J

    .line 261
    .line 262
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 263
    .line 264
    .line 265
    move-result v6

    .line 266
    invoke-virtual {v14}, Lp/xq00;->m()Lp/wpn0;

    .line 267
    .line 268
    .line 269
    move-result-object v7

    .line 270
    invoke-static {v14, v3}, Lp/hqg1;->s(Lp/xq00;Lp/fxh0;)Lp/fxh0;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    invoke-virtual {v14}, Lp/xq00;->m0()V

    .line 275
    .line 276
    .line 277
    iget-boolean v4, v14, Lp/xq00;->S:Z

    .line 278
    .line 279
    if-eqz v4, :cond_7

    .line 280
    .line 281
    invoke-virtual {v14, v13}, Lp/xq00;->l(Lp/eh00;)V

    .line 282
    .line 283
    .line 284
    goto :goto_5

    .line 285
    :cond_7
    invoke-virtual {v14}, Lp/xq00;->w0()V

    .line 286
    .line 287
    .line 288
    :goto_5
    invoke-static {v5, v2, v14}, Lp/zsf1;->F(Ljava/lang/Object;Lp/th00;Lp/xq00;)V

    .line 289
    .line 290
    .line 291
    invoke-static {v7, v10, v14}, Lp/zsf1;->F(Ljava/lang/Object;Lp/th00;Lp/xq00;)V

    .line 292
    .line 293
    .line 294
    invoke-static {v6, v14, v12, v14, v11}, La;->s(ILp/xq00;Lp/yhh;Lp/xq00;Lp/vlh;)V

    .line 295
    .line 296
    .line 297
    invoke-static {v3, v8, v14}, Lp/zsf1;->F(Ljava/lang/Object;Lp/th00;Lp/xq00;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v14}, Lp/xq00;->T()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    if-ne v2, v1, :cond_8

    .line 305
    .line 306
    sget-object v2, Lp/b371;->c1:Lp/b371;

    .line 307
    .line 308
    invoke-virtual {v14, v2}, Lp/xq00;->t0(Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    :cond_8
    check-cast v2, Lp/gh00;

    .line 312
    .line 313
    invoke-static {v15, v9, v2}, Lp/zoz0;->b(Lp/fxh0;ZLp/gh00;)Lp/fxh0;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    invoke-static {v14}, Lp/leu;->b(Lp/xq00;)Lp/jxu;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    iget-object v2, v2, Lp/jxu;->b:Lp/txu;

    .line 322
    .line 323
    iget v2, v2, Lp/txu;->f:F

    .line 324
    .line 325
    const/4 v3, 0x0

    .line 326
    const/4 v4, 0x2

    .line 327
    invoke-static {v1, v2, v3, v4}, Lp/zsf1;->A(Lp/fxh0;FFI)Lp/fxh0;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    invoke-static {v14}, Lp/leu;->d(Lp/xq00;)Lp/f1v;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    iget-object v2, v2, Lp/f1v;->e:Lp/if71;

    .line 336
    .line 337
    invoke-static {v14}, Lp/leu;->a(Lp/xq00;)Lp/jiu;

    .line 338
    .line 339
    .line 340
    move-result-object v3

    .line 341
    iget-object v3, v3, Lp/jiu;->b:Lp/m0v;

    .line 342
    .line 343
    iget-wide v5, v3, Lp/m0v;->a:J

    .line 344
    .line 345
    move/from16 v17, v4

    .line 346
    .line 347
    move-object v4, v2

    .line 348
    iget-object v2, v0, Lp/kl71;->b:Ljava/lang/String;

    .line 349
    .line 350
    new-instance v7, Lp/h171;

    .line 351
    .line 352
    const/4 v3, 0x3

    .line 353
    invoke-direct {v7, v3}, Lp/h171;-><init>(I)V

    .line 354
    .line 355
    .line 356
    const/4 v8, 0x1

    .line 357
    const/16 v16, 0x0

    .line 358
    .line 359
    move/from16 v9, v17

    .line 360
    .line 361
    const/16 v17, 0x7e0

    .line 362
    .line 363
    move v10, v8

    .line 364
    const/4 v8, 0x0

    .line 365
    move v11, v9

    .line 366
    const/4 v9, 0x0

    .line 367
    move v12, v10

    .line 368
    const/4 v10, 0x0

    .line 369
    move v13, v11

    .line 370
    const/4 v11, 0x0

    .line 371
    move/from16 v18, v12

    .line 372
    .line 373
    const/4 v12, 0x0

    .line 374
    move/from16 v19, v13

    .line 375
    .line 376
    const/4 v13, 0x0

    .line 377
    move-object/from16 v20, v15

    .line 378
    .line 379
    const/4 v15, 0x0

    .line 380
    move-object v3, v1

    .line 381
    move-object/from16 v1, v20

    .line 382
    .line 383
    invoke-static/range {v2 .. v17}, Lp/ahf1;->d(Ljava/lang/String;Lp/fxh0;Lp/if71;JLp/h171;Lp/gh00;IZLp/pl80;ILp/rx7;Lp/xq00;III)V

    .line 384
    .line 385
    .line 386
    invoke-static {v14}, Lp/leu;->b(Lp/xq00;)Lp/jxu;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    iget-object v2, v2, Lp/jxu;->b:Lp/txu;

    .line 391
    .line 392
    iget v2, v2, Lp/txu;->d:F

    .line 393
    .line 394
    invoke-static {v1, v2, v14, v14}, La;->p(Lp/cxh0;FLp/xq00;Lp/xq00;)Lp/jxu;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    iget-object v2, v2, Lp/jxu;->b:Lp/txu;

    .line 399
    .line 400
    iget v2, v2, Lp/txu;->f:F

    .line 401
    .line 402
    const/4 v3, 0x0

    .line 403
    const/4 v13, 0x2

    .line 404
    invoke-static {v1, v2, v3, v13}, Lp/zsf1;->A(Lp/fxh0;FFI)Lp/fxh0;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    invoke-static {v14}, Lp/leu;->d(Lp/xq00;)Lp/f1v;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    iget-object v4, v2, Lp/f1v;->j:Lp/if71;

    .line 413
    .line 414
    invoke-static {v14}, Lp/leu;->a(Lp/xq00;)Lp/jiu;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    iget-object v2, v2, Lp/jiu;->b:Lp/m0v;

    .line 419
    .line 420
    iget-wide v5, v2, Lp/m0v;->b:J

    .line 421
    .line 422
    iget-object v2, v0, Lp/kl71;->c:Ljava/lang/String;

    .line 423
    .line 424
    new-instance v7, Lp/h171;

    .line 425
    .line 426
    const/4 v8, 0x3

    .line 427
    invoke-direct {v7, v8}, Lp/h171;-><init>(I)V

    .line 428
    .line 429
    .line 430
    const/4 v8, 0x0

    .line 431
    const/4 v13, 0x0

    .line 432
    invoke-static/range {v2 .. v17}, Lp/ahf1;->d(Ljava/lang/String;Lp/fxh0;Lp/if71;JLp/h171;Lp/gh00;IZLp/pl80;ILp/rx7;Lp/xq00;III)V

    .line 433
    .line 434
    .line 435
    const/4 v12, 0x1

    .line 436
    invoke-virtual {v14, v12}, Lp/xq00;->r(Z)V

    .line 437
    .line 438
    .line 439
    invoke-static {v14}, Lp/leu;->b(Lp/xq00;)Lp/jxu;

    .line 440
    .line 441
    .line 442
    move-result-object v2

    .line 443
    iget-object v2, v2, Lp/jxu;->b:Lp/txu;

    .line 444
    .line 445
    iget v2, v2, Lp/txu;->h:F

    .line 446
    .line 447
    invoke-static {v2, v1}, Lp/mi21;->h(FLp/fxh0;)Lp/fxh0;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    invoke-static {v14, v1}, Lp/riw0;->i(Lp/xq00;Lp/fxh0;)V

    .line 452
    .line 453
    .line 454
    iget-object v3, v0, Lp/kl71;->d:Ljava/lang/String;

    .line 455
    .line 456
    iget-object v4, v0, Lp/kl71;->e:Lp/eh00;

    .line 457
    .line 458
    const/4 v7, 0x0

    .line 459
    const/4 v2, 0x0

    .line 460
    const/4 v6, 0x0

    .line 461
    move-object v5, v14

    .line 462
    invoke-static/range {v2 .. v7}, Lp/r3h1;->e(ILjava/lang/String;Lp/eh00;Lp/xq00;Lp/fxh0;Lp/fxh0;)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v14, v12}, Lp/xq00;->r(Z)V

    .line 466
    .line 467
    .line 468
    goto :goto_6

    .line 469
    :cond_9
    invoke-static {}, Lp/pmg1;->s()V

    .line 470
    .line 471
    .line 472
    throw v15

    .line 473
    :cond_a
    move v12, v8

    .line 474
    invoke-virtual {v14}, Lp/xq00;->b0()V

    .line 475
    .line 476
    .line 477
    :goto_6
    invoke-virtual {v14}, Lp/xq00;->v()Lp/pgv0;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    if-eqz v1, :cond_b

    .line 482
    .line 483
    new-instance v2, Lp/dl71;

    .line 484
    .line 485
    move-object/from16 v3, p1

    .line 486
    .line 487
    move/from16 v4, p3

    .line 488
    .line 489
    invoke-direct {v2, v0, v3, v4, v12}, Lp/dl71;-><init>(Lp/kl71;Lp/fxh0;II)V

    .line 490
    .line 491
    .line 492
    iput-object v2, v1, Lp/pgv0;->d:Lp/th00;

    .line 493
    .line 494
    :cond_b
    return-void
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
.end method

.method public static final varargs c(Lp/hoe1;[Lp/boe1;)Lspotify/your_library/esperanto/proto/YourLibraryRequest;
    .locals 5

    .line 1
    invoke-static {}, Lspotify/your_library/esperanto/proto/YourLibraryRequest;->q()Lp/jqe1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lspotify/your_library/esperanto/proto/YourLibraryRequestHeader;->G()Lp/kqe1;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-virtual {v1, v2}, Lp/kqe1;->q(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Lp/kqe1;->w()V

    .line 14
    .line 15
    .line 16
    const v2, 0x7fffffff

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Lp/kqe1;->C(I)V

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lspotify/your_library/proto/YourLibraryConfig$YourLibrarySortOrder;->o()Lp/goe1;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2, p0}, Lp/goe1;->m(Lp/hoe1;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Lcom/google/protobuf/g;->build()Lcom/google/protobuf/h;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Lspotify/your_library/proto/YourLibraryConfig$YourLibrarySortOrder;

    .line 34
    .line 35
    invoke-virtual {v1, p0}, Lp/kqe1;->H(Lspotify/your_library/proto/YourLibraryConfig$YourLibrarySortOrder;)V

    .line 36
    .line 37
    .line 38
    invoke-static {}, Lspotify/your_library/proto/YourLibraryConfig$YourLibraryFilters;->r()Lp/aoe1;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    sget-object v2, Lp/boe1;->d:Lp/boe1;

    .line 43
    .line 44
    invoke-virtual {p0, v2}, Lp/aoe1;->q(Lp/boe1;)V

    .line 45
    .line 46
    .line 47
    array-length v2, p1

    .line 48
    const/4 v3, 0x0

    .line 49
    :goto_0
    if-ge v3, v2, :cond_0

    .line 50
    .line 51
    aget-object v4, p1, v3

    .line 52
    .line 53
    invoke-virtual {p0, v4}, Lp/aoe1;->q(Lp/boe1;)V

    .line 54
    .line 55
    .line 56
    add-int/lit8 v3, v3, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/g;->build()Lcom/google/protobuf/h;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, Lspotify/your_library/proto/YourLibraryConfig$YourLibraryFilters;

    .line 64
    .line 65
    invoke-virtual {v1, p0}, Lp/kqe1;->u(Lspotify/your_library/proto/YourLibraryConfig$YourLibraryFilters;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1}, Lp/jqe1;->m(Lp/kqe1;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Lcom/google/protobuf/g;->build()Lcom/google/protobuf/h;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    check-cast p0, Lspotify/your_library/esperanto/proto/YourLibraryRequest;

    .line 76
    .line 77
    return-object p0
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
.end method

.method public static final d(Lp/xul0;)Lcom/spotify/player/model/AdBreakContext;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lp/xul0;->h()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/spotify/player/model/AdBreakContext;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/spotify/player/model/AdBreakContext;->totalAdsInBreakEstimate()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/spotify/player/model/AdBreakContext;->positionInCurrentAdBreak()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    invoke-virtual {p0}, Lcom/spotify/player/model/AdBreakContext;->totalAdsInBreakEstimate()J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    cmp-long v0, v0, v2

    .line 28
    .line 29
    if-gtz v0, :cond_0

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_0
    const/4 p0, 0x0

    .line 33
    return-object p0
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public static final e(Lcom/spotify/player/model/PlayerState;Landroid/content/res/Resources;)Lp/f12;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/spotify/player/model/PlayerState;->track()Lp/xul0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lp/xul0;->b()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/spotify/player/model/ContextTrack;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/spotify/player/model/ContextTrack;->metadata()Lp/xf40;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "advertiser"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lp/xf40;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/lang/String;

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    const-string v0, ""

    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0}, Lcom/spotify/player/model/PlayerState;->adBreakContext()Lp/xul0;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v1}, Lp/fzg1;->d(Lp/xul0;)Lcom/spotify/player/model/AdBreakContext;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p0}, Lcom/spotify/player/model/PlayerState;->restrictions()Lcom/spotify/player/model/Restrictions;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    invoke-virtual {v2}, Lcom/spotify/player/model/Restrictions;->disallowSkippingNextReasons()Lp/hg40;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const/4 v2, 0x1

    .line 53
    :goto_0
    invoke-virtual {p0}, Lcom/spotify/player/model/PlayerState;->track()Lp/xul0;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p0}, Lp/xul0;->b()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, Lcom/spotify/player/model/ContextTrack;

    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/spotify/player/model/ContextTrack;->metadata()Lp/xf40;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    const-string v3, "ad.skippable_ad_delay"

    .line 68
    .line 69
    invoke-virtual {p0, v3}, Lp/xf40;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    check-cast p0, Ljava/lang/String;

    .line 74
    .line 75
    if-eqz p0, :cond_2

    .line 76
    .line 77
    invoke-static {p0}, Lp/bm51;->r0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    goto :goto_1

    .line 82
    :cond_2
    const/4 p0, 0x0

    .line 83
    :goto_1
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-nez v3, :cond_3

    .line 88
    .line 89
    const v3, 0x7f13019c

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    goto :goto_2

    .line 97
    :cond_3
    move-object v3, v0

    .line 98
    :goto_2
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_4

    .line 103
    .line 104
    invoke-static {p1, v1, v2, p0}, Lp/fzg1;->r(Landroid/content/res/Resources;Lcom/spotify/player/model/AdBreakContext;ZLjava/lang/Integer;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    goto :goto_3

    .line 109
    :cond_4
    invoke-static {p1, v1, v2, p0}, Lp/fzg1;->f(Landroid/content/res/Resources;Lcom/spotify/player/model/AdBreakContext;ZLjava/lang/Integer;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    :goto_3
    new-instance p1, Lp/f12;

    .line 114
    .line 115
    invoke-direct {p1, v3, p0}, Lp/f12;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    return-object p1
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
.end method

.method public static final f(Landroid/content/res/Resources;Lcom/spotify/player/model/AdBreakContext;ZLjava/lang/Integer;)Ljava/lang/String;
    .locals 2

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const p1, 0x7f13019d

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :cond_0
    if-eqz p3, :cond_1

    .line 12
    .line 13
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    const p3, 0x7f110013

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p3, p1, p2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_1
    if-eqz p1, :cond_2

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/spotify/player/model/AdBreakContext;->positionInCurrentAdBreak()J

    .line 32
    .line 33
    .line 34
    move-result-wide p2

    .line 35
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {p1}, Lcom/spotify/player/model/AdBreakContext;->totalAdsInBreakEstimate()J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    filled-new-array {p2, p1}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const p2, 0x7f13019e

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p2, p1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :cond_2
    const p1, 0x7f13019c

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0
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
.end method

.method public static g(Ljava/lang/String;Lp/ok11;Ljava/util/List;Landroid/content/Context;Lp/o34;Lp/m680;)Lp/wwx;
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v9, p3

    .line 4
    .line 5
    move-object/from16 v1, p5

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 10
    .line 11
    .line 12
    move-result-object v6

    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    return-object v2

    .line 17
    :cond_0
    iget-object v3, v0, Lp/ok11;->g:Lp/mk11;

    .line 18
    .line 19
    iget-boolean v0, v0, Lp/ok11;->c:Z

    .line 20
    .line 21
    if-nez v0, :cond_4

    .line 22
    .line 23
    invoke-virtual/range {p4 .. p4}, Lp/o34;->a()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    move v1, v0

    .line 28
    new-instance v0, Lp/wwx;

    .line 29
    .line 30
    const-string v4, ""

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    const v5, 0x7f1303a6

    .line 35
    .line 36
    .line 37
    invoke-virtual {v9, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move-object v5, v4

    .line 43
    :goto_0
    invoke-static {v5}, Lp/wj50;->p(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    const v1, 0x7f1303a2

    .line 49
    .line 50
    .line 51
    invoke-virtual {v9, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    :cond_2
    const v1, 0x7f08099e

    .line 56
    .line 57
    .line 58
    invoke-static {v9, v1}, Lp/pvf1;->p(Landroid/content/Context;I)Landroid/net/Uri;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    if-eqz v3, :cond_3

    .line 63
    .line 64
    iget-object v2, v3, Lp/mk11;->a:Ljava/lang/String;

    .line 65
    .line 66
    :cond_3
    move-object v7, v2

    .line 67
    const/4 v8, 0x0

    .line 68
    move-object v3, v5

    .line 69
    move-object v5, v1

    .line 70
    const/4 v1, 0x1

    .line 71
    move-object/from16 v2, p0

    .line 72
    .line 73
    invoke-direct/range {v0 .. v8}, Lp/wwx;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/Double;Ljava/lang/String;Z)V

    .line 74
    .line 75
    .line 76
    return-object v0

    .line 77
    :cond_4
    move-object/from16 v7, p0

    .line 78
    .line 79
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const/4 v4, 0x1

    .line 84
    move v12, v4

    .line 85
    const-wide/16 p1, 0x0

    .line 86
    .line 87
    const/4 v8, 0x0

    .line 88
    const-wide/16 v10, 0x0

    .line 89
    .line 90
    const-wide/16 v13, 0x0

    .line 91
    .line 92
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v15

    .line 96
    if-eqz v15, :cond_d

    .line 97
    .line 98
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v15

    .line 102
    check-cast v15, Lp/pqm0;

    .line 103
    .line 104
    iget-object v15, v15, Lp/pqm0;->b:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v15, Lp/vu41;

    .line 107
    .line 108
    if-eqz v15, :cond_5

    .line 109
    .line 110
    iget-object v15, v15, Lp/vu41;->e:Lp/y6s0;

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_5
    move-object v15, v2

    .line 114
    :goto_2
    if-eqz v15, :cond_6

    .line 115
    .line 116
    invoke-interface {v15}, Lp/y6s0;->e()J

    .line 117
    .line 118
    .line 119
    move-result-wide v16

    .line 120
    goto :goto_3

    .line 121
    :cond_6
    move-wide/from16 v16, p1

    .line 122
    .line 123
    :goto_3
    add-long v10, v10, v16

    .line 124
    .line 125
    instance-of v2, v15, Lp/w6s0;

    .line 126
    .line 127
    if-eqz v2, :cond_8

    .line 128
    .line 129
    check-cast v15, Lp/w6s0;

    .line 130
    .line 131
    move-object/from16 p4, v6

    .line 132
    .line 133
    iget-wide v5, v15, Lp/w6s0;->c:J

    .line 134
    .line 135
    add-long/2addr v13, v5

    .line 136
    iget-boolean v5, v15, Lp/w6s0;->a:Z

    .line 137
    .line 138
    if-nez v5, :cond_7

    .line 139
    .line 140
    move-object/from16 v6, p4

    .line 141
    .line 142
    move v8, v4

    .line 143
    :goto_4
    const/4 v2, 0x0

    .line 144
    const/4 v12, 0x0

    .line 145
    goto :goto_1

    .line 146
    :cond_7
    :goto_5
    move-object/from16 v6, p4

    .line 147
    .line 148
    move v8, v4

    .line 149
    :goto_6
    const/4 v2, 0x0

    .line 150
    goto :goto_1

    .line 151
    :cond_8
    move-object/from16 p4, v6

    .line 152
    .line 153
    instance-of v5, v15, Lp/x6s0;

    .line 154
    .line 155
    if-eqz v5, :cond_b

    .line 156
    .line 157
    check-cast v15, Lp/x6s0;

    .line 158
    .line 159
    iget-boolean v5, v15, Lp/x6s0;->a:Z

    .line 160
    .line 161
    if-eqz v5, :cond_9

    .line 162
    .line 163
    add-long v13, v13, v16

    .line 164
    .line 165
    goto :goto_7

    .line 166
    :cond_9
    const/4 v12, 0x0

    .line 167
    :goto_7
    if-eqz v5, :cond_a

    .line 168
    .line 169
    goto :goto_5

    .line 170
    :cond_a
    move-object/from16 v6, p4

    .line 171
    .line 172
    goto :goto_6

    .line 173
    :cond_b
    if-nez v15, :cond_c

    .line 174
    .line 175
    move-object/from16 v6, p4

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_c
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 179
    .line 180
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 181
    .line 182
    .line 183
    throw v0

    .line 184
    :cond_d
    move-object/from16 p4, v6

    .line 185
    .line 186
    const/4 v0, 0x2

    .line 187
    if-nez v8, :cond_e

    .line 188
    .line 189
    move v2, v4

    .line 190
    goto :goto_8

    .line 191
    :cond_e
    if-eqz v12, :cond_f

    .line 192
    .line 193
    const/4 v2, 0x3

    .line 194
    goto :goto_8

    .line 195
    :cond_f
    move v2, v0

    .line 196
    :goto_8
    const v5, 0x7f08099f

    .line 197
    .line 198
    .line 199
    invoke-static {v9, v5}, Lp/pvf1;->p(Landroid/content/Context;I)Landroid/net/Uri;

    .line 200
    .line 201
    .line 202
    move-result-object v8

    .line 203
    if-eqz v3, :cond_10

    .line 204
    .line 205
    iget-object v3, v3, Lp/mk11;->a:Ljava/lang/String;

    .line 206
    .line 207
    move-object v12, v3

    .line 208
    goto :goto_9

    .line 209
    :cond_10
    const/4 v12, 0x0

    .line 210
    :goto_9
    invoke-static {v2}, Lp/edb;->C(I)I

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    if-eqz v2, :cond_16

    .line 215
    .line 216
    if-eq v2, v4, :cond_12

    .line 217
    .line 218
    if-ne v2, v0, :cond_11

    .line 219
    .line 220
    invoke-static {v8}, Lp/wj50;->p(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    invoke-static {v7, v8, v12, v9, v1}, Lp/fzg1;->h(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Landroid/content/Context;Lp/m680;)Lp/wwx;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    return-object v0

    .line 228
    :cond_11
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 229
    .line 230
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 231
    .line 232
    .line 233
    throw v0

    .line 234
    :cond_12
    invoke-static {v8}, Lp/wj50;->p(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    const/16 v0, 0x3e8

    .line 238
    .line 239
    int-to-long v2, v0

    .line 240
    move-wide v3, v2

    .line 241
    div-long v1, v10, v3

    .line 242
    .line 243
    div-long v3, v13, v3

    .line 244
    .line 245
    cmp-long v0, v1, p1

    .line 246
    .line 247
    if-eqz v0, :cond_13

    .line 248
    .line 249
    cmp-long v0, v3, v1

    .line 250
    .line 251
    if-ltz v0, :cond_14

    .line 252
    .line 253
    :cond_13
    move-object/from16 v10, p5

    .line 254
    .line 255
    move-object v2, v7

    .line 256
    move-object v5, v8

    .line 257
    move-object v7, v12

    .line 258
    goto :goto_a

    .line 259
    :cond_14
    new-instance v15, Lp/wwx;

    .line 260
    .line 261
    const v0, 0x7f1303a4

    .line 262
    .line 263
    .line 264
    invoke-virtual {v9, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v16

    .line 268
    sub-long v3, v1, v3

    .line 269
    .line 270
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    const/4 v5, 0x1

    .line 275
    const/16 v6, 0x8

    .line 276
    .line 277
    const/4 v4, 0x0

    .line 278
    move-object/from16 v0, p5

    .line 279
    .line 280
    invoke-static/range {v0 .. v6}, Lp/m680;->k(Lp/m680;JLjava/lang/Long;ZZI)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    long-to-double v0, v13

    .line 285
    long-to-double v2, v10

    .line 286
    div-double/2addr v0, v2

    .line 287
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 288
    .line 289
    .line 290
    move-result-object v6

    .line 291
    move-object v5, v8

    .line 292
    const/4 v8, 0x0

    .line 293
    const/4 v1, 0x0

    .line 294
    move-object/from16 v10, p5

    .line 295
    .line 296
    move-object v2, v7

    .line 297
    move-object v7, v12

    .line 298
    move-object v0, v15

    .line 299
    move-object/from16 v3, v16

    .line 300
    .line 301
    invoke-direct/range {v0 .. v8}, Lp/wwx;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/Double;Ljava/lang/String;Z)V

    .line 302
    .line 303
    .line 304
    goto :goto_b

    .line 305
    :goto_a
    const/4 v0, 0x0

    .line 306
    :goto_b
    if-nez v0, :cond_15

    .line 307
    .line 308
    invoke-static {v2, v5, v7, v9, v10}, Lp/fzg1;->h(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Landroid/content/Context;Lp/m680;)Lp/wwx;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    :cond_15
    return-object v0

    .line 313
    :cond_16
    move-object v2, v7

    .line 314
    move-object v5, v8

    .line 315
    move-object v7, v12

    .line 316
    invoke-static {v5}, Lp/wj50;->p(Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    new-instance v0, Lp/wwx;

    .line 320
    .line 321
    const v1, 0x7f1303a5

    .line 322
    .line 323
    .line 324
    invoke-virtual {v9, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v3

    .line 328
    const/4 v4, 0x0

    .line 329
    const/4 v8, 0x0

    .line 330
    const/4 v1, 0x0

    .line 331
    move-object/from16 v6, p4

    .line 332
    .line 333
    invoke-direct/range {v0 .. v8}, Lp/wwx;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/Double;Ljava/lang/String;Z)V

    .line 334
    .line 335
    .line 336
    return-object v0
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
.end method

.method public static h(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Landroid/content/Context;Lp/m680;)Lp/wwx;
    .locals 11

    .line 1
    new-instance v0, Lp/wwx;

    .line 2
    .line 3
    const v1, 0x7f1303a5

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    const/4 v9, 0x0

    .line 11
    const/16 v10, 0xb

    .line 12
    .line 13
    const-wide/16 v5, 0x0

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x1

    .line 17
    move-object v4, p4

    .line 18
    invoke-static/range {v4 .. v10}, Lp/m680;->k(Lp/m680;JLjava/lang/Long;ZZI)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    const-wide/high16 p3, 0x3ff0000000000000L    # 1.0

    .line 23
    .line 24
    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    const/4 v8, 0x0

    .line 29
    const/4 v1, 0x0

    .line 30
    move-object v2, p0

    .line 31
    move-object v5, p1

    .line 32
    move-object v7, p2

    .line 33
    invoke-direct/range {v0 .. v8}, Lp/wwx;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/Double;Ljava/lang/String;Z)V

    .line 34
    .line 35
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
.end method

.method public static final i(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getRecycledViewPool()Lp/ujv0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lp/zxv;->Z:Lp/zxv;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {v0, v1, p1}, Lp/ujv0;->b(II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getRecycledViewPool()Lp/ujv0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget-object v1, Lp/zxv;->N0:Lp/zxv;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {v0, v1, p1}, Lp/ujv0;->b(II)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getRecycledViewPool()Lp/ujv0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sget-object v1, Lp/zxv;->X:Lp/zxv;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {v0, v1, p1}, Lp/ujv0;->b(II)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getRecycledViewPool()Lp/ujv0;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    sget-object v0, Lp/zxv;->f:Lp/zxv;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-virtual {p1, v0, p2}, Lp/ujv0;->b(II)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getRecycledViewPool()Lp/ujv0;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    sget-object v0, Lp/zxv;->t:Lp/zxv;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-virtual {p1, v0, p2}, Lp/ujv0;->b(II)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getRecycledViewPool()Lp/ujv0;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    sget-object p1, Lp/zxv;->e:Lp/zxv;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    invoke-virtual {p0, p1, p2}, Lp/ujv0;->b(II)V

    .line 77
    .line 78
    .line 79
    return-void
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
.end method

.method public static final j(Lcom/spotify/esperanto/esperanto/Transport;)Lp/faw0;
    .locals 1

    .line 1
    new-instance v0, Lp/faw0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lp/faw0;-><init>(Lcom/spotify/esperanto/esperanto/Transport;)V

    .line 4
    .line 5
    .line 6
    return-object v0
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
    .line 36
    .line 37
    .line 38
.end method

.method public static k(Ljava/util/List;Ljava/util/Map;Lp/ok11;)Lp/jl11;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    iget-boolean p2, p2, Lp/ok11;->c:Z

    .line 6
    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v2, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_4

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Lp/nw80;

    .line 32
    .line 33
    new-instance v4, Lp/bzs0;

    .line 34
    .line 35
    iget-object v5, v3, Lp/nw80;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-direct {v4, v5}, Lp/bzs0;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    check-cast v4, Lp/vu41;

    .line 45
    .line 46
    if-nez v4, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    new-instance v5, Lp/pqm0;

    .line 50
    .line 51
    invoke-direct {v5, v3, v4}, Lp/pqm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    invoke-static {v3, v4}, Lp/fzg1;->p(Lp/nw80;Lp/vu41;)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-nez p2, :cond_3

    .line 62
    .line 63
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    goto :goto_1

    .line 68
    :cond_3
    move-object v5, v0

    .line 69
    :goto_1
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 70
    .line 71
    invoke-static {v5, v6}, Lp/wj50;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-nez v5, :cond_1

    .line 76
    .line 77
    new-instance v5, Lp/pqm0;

    .line 78
    .line 79
    invoke-direct {v5, v3, v4}, Lp/pqm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_4
    if-eqz p2, :cond_7

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    const/4 p1, 0x0

    .line 93
    move p2, p1

    .line 94
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_6

    .line 99
    .line 100
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, Lp/pqm0;

    .line 105
    .line 106
    iget-object v3, v0, Lp/pqm0;->a:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v3, Lp/nw80;

    .line 109
    .line 110
    iget-object v0, v0, Lp/pqm0;->b:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, Lp/vu41;

    .line 113
    .line 114
    invoke-static {v3, v0}, Lp/fzg1;->p(Lp/nw80;Lp/vu41;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_5

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_5
    add-int/lit8 p2, p2, 0x1

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_6
    const/4 p2, -0x1

    .line 125
    :goto_3
    if-lez p2, :cond_7

    .line 126
    .line 127
    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    check-cast p0, Lp/pqm0;

    .line 132
    .line 133
    invoke-virtual {v2, p1, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    :cond_7
    new-instance p0, Lp/jl11;

    .line 137
    .line 138
    invoke-direct {p0, v2, v1}, Lp/jl11;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 139
    .line 140
    .line 141
    return-object p0
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
.end method

.method public static final l(Lcom/spotify/browsita/v1/resolved/Section;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/h;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
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
    .line 36
    .line 37
    .line 38
.end method

.method public static final m(Landroid/content/res/Resources;Lp/jeo0;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p1, Lp/jeo0;->b:Lp/mgo0;

    .line 2
    .line 3
    instance-of v1, v0, Lp/bgo0;

    .line 4
    .line 5
    const v2, 0x7f131ddc

    .line 6
    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    move-object v1, v0

    .line 11
    check-cast v1, Lp/bgo0;

    .line 12
    .line 13
    iget-boolean v1, v1, Lp/bgo0;->a:Z

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    goto/16 :goto_1

    .line 18
    .line 19
    :cond_0
    instance-of v1, v0, Lp/cgo0;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    move-object v1, v0

    .line 24
    check-cast v1, Lp/cgo0;

    .line 25
    .line 26
    iget-boolean v1, v1, Lp/cgo0;->a:Z

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    instance-of v1, v0, Lp/ago0;

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    move-object v1, v0

    .line 36
    check-cast v1, Lp/ago0;

    .line 37
    .line 38
    iget-boolean v1, v1, Lp/ago0;->b:Z

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    instance-of v1, v0, Lp/ago0;

    .line 44
    .line 45
    const v3, 0x7f131ddb

    .line 46
    .line 47
    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    move-object v1, v0

    .line 51
    check-cast v1, Lp/ago0;

    .line 52
    .line 53
    iget-boolean v1, v1, Lp/ago0;->c:Z

    .line 54
    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    :goto_0
    move v2, v3

    .line 58
    goto :goto_1

    .line 59
    :cond_3
    iget-boolean p1, p1, Lp/jeo0;->a:Z

    .line 60
    .line 61
    if-eqz p1, :cond_4

    .line 62
    .line 63
    const v2, 0x7f131ddd

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_4
    instance-of p1, v0, Lp/ggo0;

    .line 68
    .line 69
    if-eqz p1, :cond_5

    .line 70
    .line 71
    move-object p1, v0

    .line 72
    check-cast p1, Lp/ggo0;

    .line 73
    .line 74
    iget-boolean p1, p1, Lp/ggo0;->a:Z

    .line 75
    .line 76
    if-eqz p1, :cond_5

    .line 77
    .line 78
    const v2, 0x7f131ddf

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_5
    instance-of p1, v0, Lp/xfo0;

    .line 83
    .line 84
    if-eqz p1, :cond_6

    .line 85
    .line 86
    move-object p1, v0

    .line 87
    check-cast p1, Lp/xfo0;

    .line 88
    .line 89
    iget-boolean p1, p1, Lp/xfo0;->b:Z

    .line 90
    .line 91
    if-eqz p1, :cond_6

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_6
    instance-of p1, v0, Lp/xfo0;

    .line 95
    .line 96
    if-eqz p1, :cond_7

    .line 97
    .line 98
    move-object p1, v0

    .line 99
    check-cast p1, Lp/xfo0;

    .line 100
    .line 101
    iget-boolean p1, p1, Lp/xfo0;->a:Z

    .line 102
    .line 103
    if-eqz p1, :cond_7

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_7
    instance-of p1, v0, Lp/yfo0;

    .line 107
    .line 108
    if-eqz p1, :cond_8

    .line 109
    .line 110
    check-cast v0, Lp/yfo0;

    .line 111
    .line 112
    iget-boolean p1, v0, Lp/yfo0;->a:Z

    .line 113
    .line 114
    if-eqz p1, :cond_8

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_8
    const v2, 0x7f131dde

    .line 118
    .line 119
    .line 120
    :goto_1
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {p0, v2, p1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    return-object p0
.end method

.method public static n()V
    .locals 1

    .line 1
    sget v0, Lp/zu70;->t:I

    .line 2
    .line 3
    return-void
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
    .line 26
    .line 27
.end method

.method public static o(Ljava/lang/String;Ljava/util/Map;)Lp/ok11;
    .locals 1

    .line 1
    new-instance v0, Lp/bzs0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lp/bzs0;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Lp/vu41;

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, Lp/vu41;->h:Lp/ok11;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return-object p0
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
.end method

.method public static p(Lp/nw80;Lp/vu41;)Z
    .locals 3

    .line 1
    iget-object p0, p0, Lp/nw80;->o:Lp/j7f0;

    .line 2
    .line 3
    instance-of v0, p0, Lp/f0w;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Lp/f0w;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v1

    .line 12
    :goto_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    iget-object v1, p0, Lp/f0w;->p:Lp/c0w;

    .line 15
    .line 16
    :cond_1
    sget-object p0, Lp/c0w;->a:Lp/c0w;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    const/4 v2, 0x1

    .line 20
    if-ne v1, p0, :cond_2

    .line 21
    .line 22
    move p0, v2

    .line 23
    goto :goto_1

    .line 24
    :cond_2
    move p0, v0

    .line 25
    :goto_1
    if-eqz p1, :cond_3

    .line 26
    .line 27
    iget-object p1, p1, Lp/vu41;->i:Lp/xaw;

    .line 28
    .line 29
    if-eqz p1, :cond_3

    .line 30
    .line 31
    iget p1, p1, Lp/xaw;->j:I

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_3
    move p1, v0

    .line 35
    :goto_2
    const/4 v1, 0x2

    .line 36
    if-ne p1, v1, :cond_4

    .line 37
    .line 38
    move p1, v2

    .line 39
    goto :goto_3

    .line 40
    :cond_4
    move p1, v0

    .line 41
    :goto_3
    if-nez p0, :cond_6

    .line 42
    .line 43
    if-eqz p1, :cond_5

    .line 44
    .line 45
    goto :goto_4

    .line 46
    :cond_5
    return v0

    .line 47
    :cond_6
    :goto_4
    return v2
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
.end method

.method public static final q(Lp/fz3;Lp/fyf;Lp/eh00;Lp/i5e0;Lp/i4t0;)Lp/cph;
    .locals 6

    .line 1
    new-instance v0, Lp/w5e0;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-object v2, p1

    .line 5
    move-object v3, p2

    .line 6
    move-object v4, p3

    .line 7
    move-object v5, p4

    .line 8
    invoke-direct/range {v0 .. v5}, Lp/w5e0;-><init>(Lp/fz3;Lp/fyf;Lp/eh00;Lp/i5e0;Lp/i4t0;)V

    .line 9
    .line 10
    .line 11
    new-instance p0, Lp/fyf;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    const p2, -0x7866ca84

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v0, p1, p2}, Lp/fyf;-><init>(Ljava/lang/Object;ZI)V

    .line 18
    .line 19
    .line 20
    sget-object p1, Lp/xwt;->a:Lp/wpi0;

    .line 21
    .line 22
    new-instance p1, Lp/cph;

    .line 23
    .line 24
    const/4 p2, 0x3

    .line 25
    invoke-direct {p1, p0, p2}, Lp/cph;-><init>(Ljava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    return-object p1
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
.end method

.method public static final r(Landroid/content/res/Resources;Lcom/spotify/player/model/AdBreakContext;ZLjava/lang/Integer;)Ljava/lang/String;
    .locals 2

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const p1, 0x7f130199

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :cond_0
    if-eqz p3, :cond_1

    .line 12
    .line 13
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    const p3, 0x7f110012

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p3, p1, p2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_1
    if-eqz p1, :cond_2

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/spotify/player/model/AdBreakContext;->positionInCurrentAdBreak()J

    .line 32
    .line 33
    .line 34
    move-result-wide p2

    .line 35
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {p1}, Lcom/spotify/player/model/AdBreakContext;->totalAdsInBreakEstimate()J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    filled-new-array {p2, p1}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const p2, 0x7f13019a

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p2, p1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :cond_2
    const-string p0, ""

    .line 60
    .line 61
    return-object p0
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
.end method

.method public static s(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;
    .locals 10

    .line 1
    invoke-static {p0}, Lp/g6f;->r1(Ljava/lang/Iterable;)Lp/co40;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lp/co40;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :cond_0
    :goto_0
    move-object v2, v0

    .line 15
    check-cast v2, Lp/do40;

    .line 16
    .line 17
    iget-object v3, v2, Lp/do40;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Ljava/util/Iterator;

    .line 20
    .line 21
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    invoke-virtual {v2}, Lp/do40;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    move-object v3, v2

    .line 32
    check-cast v3, Lp/bo40;

    .line 33
    .line 34
    iget-object v3, v3, Lp/bo40;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v3, Lp/nw80;

    .line 37
    .line 38
    new-instance v4, Lp/bzs0;

    .line 39
    .line 40
    iget-object v5, v3, Lp/nw80;->c:Ljava/lang/String;

    .line 41
    .line 42
    invoke-direct {v4, v5}, Lp/bzs0;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, Lp/vu41;

    .line 50
    .line 51
    invoke-static {v3, v4}, Lp/fzg1;->p(Lp/nw80;Lp/vu41;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_0

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-nez v1, :cond_2

    .line 70
    .line 71
    const/4 p1, 0x0

    .line 72
    goto :goto_4

    .line 73
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-nez v2, :cond_3

    .line 82
    .line 83
    :goto_1
    move-object p1, v1

    .line 84
    goto :goto_4

    .line 85
    :cond_3
    move-object v2, v1

    .line 86
    check-cast v2, Lp/bo40;

    .line 87
    .line 88
    iget-object v2, v2, Lp/bo40;->b:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v2, Lp/nw80;

    .line 91
    .line 92
    new-instance v3, Lp/bzs0;

    .line 93
    .line 94
    iget-object v2, v2, Lp/nw80;->c:Ljava/lang/String;

    .line 95
    .line 96
    invoke-direct {v3, v2}, Lp/bzs0;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    check-cast v2, Lp/vu41;

    .line 104
    .line 105
    const-wide/16 v3, 0x0

    .line 106
    .line 107
    if-eqz v2, :cond_4

    .line 108
    .line 109
    iget-object v2, v2, Lp/vu41;->g:Lp/y7t0;

    .line 110
    .line 111
    if-eqz v2, :cond_4

    .line 112
    .line 113
    iget-wide v5, v2, Lp/y7t0;->c:J

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_4
    move-wide v5, v3

    .line 117
    :cond_5
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    move-object v7, v2

    .line 122
    check-cast v7, Lp/bo40;

    .line 123
    .line 124
    iget-object v7, v7, Lp/bo40;->b:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v7, Lp/nw80;

    .line 127
    .line 128
    new-instance v8, Lp/bzs0;

    .line 129
    .line 130
    iget-object v7, v7, Lp/nw80;->c:Ljava/lang/String;

    .line 131
    .line 132
    invoke-direct {v8, v7}, Lp/bzs0;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-interface {p1, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    check-cast v7, Lp/vu41;

    .line 140
    .line 141
    if-eqz v7, :cond_6

    .line 142
    .line 143
    iget-object v7, v7, Lp/vu41;->g:Lp/y7t0;

    .line 144
    .line 145
    if-eqz v7, :cond_6

    .line 146
    .line 147
    iget-wide v7, v7, Lp/y7t0;->c:J

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_6
    move-wide v7, v3

    .line 151
    :goto_3
    cmp-long v9, v5, v7

    .line 152
    .line 153
    if-gez v9, :cond_7

    .line 154
    .line 155
    move-object v1, v2

    .line 156
    move-wide v5, v7

    .line 157
    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-nez v2, :cond_5

    .line 162
    .line 163
    goto :goto_1

    .line 164
    :goto_4
    check-cast p1, Lp/bo40;

    .line 165
    .line 166
    if-eqz p1, :cond_9

    .line 167
    .line 168
    iget p1, p1, Lp/bo40;->a:I

    .line 169
    .line 170
    if-nez p1, :cond_8

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_8
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    check-cast v0, Lp/nw80;

    .line 178
    .line 179
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    const/4 v1, 0x0

    .line 184
    invoke-interface {p0, v1, p1}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-static {v1, v0}, Lp/g6f;->N0(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    add-int/lit8 p1, p1, 0x1

    .line 193
    .line 194
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    invoke-interface {p0, p1, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    invoke-static {p0, v0}, Lp/g6f;->N0(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    :cond_9
    :goto_5
    return-object p0
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
.end method

.method public static final t(Landroid/text/Spannable;Ljava/util/List;Lp/yqq;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-interface/range {p1 .. p1}, Ljava/util/Collection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v3, 0x0

    .line 8
    :goto_0
    if-ge v3, v1, :cond_c

    .line 9
    .line 10
    move-object/from16 v4, p1

    .line 11
    .line 12
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    check-cast v5, Lp/i15;

    .line 17
    .line 18
    iget-object v6, v5, Lp/i15;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v6, Lp/g6o0;

    .line 21
    .line 22
    iget v7, v5, Lp/i15;->b:I

    .line 23
    .line 24
    iget v5, v5, Lp/i15;->c:I

    .line 25
    .line 26
    const-class v8, Lp/fp91;

    .line 27
    .line 28
    invoke-interface {v0, v7, v5, v8}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v8

    .line 32
    array-length v9, v8

    .line 33
    const/4 v10, 0x0

    .line 34
    :goto_1
    if-ge v10, v9, :cond_0

    .line 35
    .line 36
    aget-object v11, v8, v10

    .line 37
    .line 38
    check-cast v11, Lp/fp91;

    .line 39
    .line 40
    invoke-interface {v0, v11}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v10, v10, 0x1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    new-instance v11, Lp/c7o0;

    .line 47
    .line 48
    iget-wide v8, v6, Lp/g6o0;->a:J

    .line 49
    .line 50
    iget-wide v12, v6, Lp/g6o0;->b:J

    .line 51
    .line 52
    invoke-static {v8, v9}, Landroidx/compose/ui/unit/TextUnit;->c(J)F

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    iget-wide v9, v6, Lp/g6o0;->a:J

    .line 57
    .line 58
    invoke-static {v9, v10}, Landroidx/compose/ui/unit/TextUnit;->b(J)J

    .line 59
    .line 60
    .line 61
    move-result-wide v9

    .line 62
    const-wide v14, 0x100000000L

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    invoke-static {v9, v10, v14, v15}, Lp/tf71;->a(JJ)Z

    .line 68
    .line 69
    .line 70
    move-result v16

    .line 71
    move/from16 v18, v3

    .line 72
    .line 73
    const-wide v2, 0x200000000L

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    if-eqz v16, :cond_1

    .line 79
    .line 80
    move-wide v9, v12

    .line 81
    const/4 v13, 0x0

    .line 82
    goto :goto_2

    .line 83
    :cond_1
    invoke-static {v9, v10, v2, v3}, Lp/tf71;->a(JJ)Z

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    if-eqz v9, :cond_2

    .line 88
    .line 89
    move-wide v9, v12

    .line 90
    const/4 v13, 0x1

    .line 91
    goto :goto_2

    .line 92
    :cond_2
    move-wide v9, v12

    .line 93
    const/4 v13, 0x2

    .line 94
    :goto_2
    invoke-static {v9, v10}, Landroidx/compose/ui/unit/TextUnit;->c(J)F

    .line 95
    .line 96
    .line 97
    move-result v12

    .line 98
    invoke-static {v9, v10}, Landroidx/compose/ui/unit/TextUnit;->b(J)J

    .line 99
    .line 100
    .line 101
    move-result-wide v9

    .line 102
    const-wide v14, 0x100000000L

    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    invoke-static {v9, v10, v14, v15}, Lp/tf71;->a(JJ)Z

    .line 108
    .line 109
    .line 110
    move-result v14

    .line 111
    if-eqz v14, :cond_3

    .line 112
    .line 113
    const/4 v15, 0x0

    .line 114
    goto :goto_3

    .line 115
    :cond_3
    invoke-static {v9, v10, v2, v3}, Lp/tf71;->a(JJ)Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_4

    .line 120
    .line 121
    const/4 v15, 0x1

    .line 122
    goto :goto_3

    .line 123
    :cond_4
    const/4 v15, 0x2

    .line 124
    :goto_3
    iget v2, v6, Lp/g6o0;->c:I

    .line 125
    .line 126
    const/4 v3, 0x1

    .line 127
    if-ne v2, v3, :cond_5

    .line 128
    .line 129
    move-object/from16 v16, p2

    .line 130
    .line 131
    move v14, v12

    .line 132
    const/16 v17, 0x0

    .line 133
    .line 134
    :goto_4
    move v12, v8

    .line 135
    goto :goto_8

    .line 136
    :cond_5
    const/4 v6, 0x2

    .line 137
    if-ne v2, v6, :cond_6

    .line 138
    .line 139
    :goto_5
    move-object/from16 v16, p2

    .line 140
    .line 141
    move/from16 v17, v3

    .line 142
    .line 143
    :goto_6
    move v14, v12

    .line 144
    goto :goto_4

    .line 145
    :cond_6
    const/4 v3, 0x3

    .line 146
    if-ne v2, v3, :cond_7

    .line 147
    .line 148
    move-object/from16 v16, p2

    .line 149
    .line 150
    move/from16 v17, v6

    .line 151
    .line 152
    goto :goto_6

    .line 153
    :cond_7
    const/4 v14, 0x4

    .line 154
    if-ne v2, v14, :cond_8

    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_8
    const/4 v3, 0x5

    .line 158
    if-ne v2, v3, :cond_9

    .line 159
    .line 160
    :goto_7
    move-object/from16 v16, p2

    .line 161
    .line 162
    move/from16 v17, v14

    .line 163
    .line 164
    goto :goto_6

    .line 165
    :cond_9
    const/4 v14, 0x6

    .line 166
    if-ne v2, v14, :cond_a

    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_a
    const/4 v3, 0x7

    .line 170
    if-ne v2, v3, :cond_b

    .line 171
    .line 172
    goto :goto_7

    .line 173
    :goto_8
    invoke-direct/range {v11 .. v17}, Lp/c7o0;-><init>(FIFILp/yqq;I)V

    .line 174
    .line 175
    .line 176
    const/16 v2, 0x21

    .line 177
    .line 178
    invoke-interface {v0, v11, v7, v5, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 179
    .line 180
    .line 181
    add-int/lit8 v3, v18, 0x1

    .line 182
    .line 183
    goto/16 :goto_0

    .line 184
    .line 185
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 186
    .line 187
    const-string v1, "Invalid PlaceholderVerticalAlign"

    .line 188
    .line 189
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    throw v0

    .line 193
    :cond_c
    return-void
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
.end method

.method public static final u(Lcom/spotify/contentagnostic/v2/RgbaColor;)J
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/spotify/contentagnostic/v2/RgbaColor;->s()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lcom/spotify/contentagnostic/v2/RgbaColor;->r()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Lcom/spotify/contentagnostic/v2/RgbaColor;->p()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {p0}, Lcom/spotify/contentagnostic/v2/RgbaColor;->o()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-static {v0, v1, v2, p0}, Lp/rfg1;->c(IIII)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    return-wide v0
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
.end method

.method public static final v(Lcom/spotify/contentagnostic/v2/ColorSet;)Lp/jiu;
    .locals 12

    .line 1
    sget v0, Lp/oku;->f:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/spotify/contentagnostic/v2/ColorSet;->u()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/spotify/contentagnostic/v2/ColorSet;->o()Lcom/spotify/contentagnostic/v2/RgbaColor;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lp/fzg1;->u(Lcom/spotify/contentagnostic/v2/RgbaColor;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    :goto_0
    move-wide v2, v0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    sget-wide v0, Lp/n6f;->d:J

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :goto_1
    invoke-virtual {p0}, Lcom/spotify/contentagnostic/v2/ColorSet;->v()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/spotify/contentagnostic/v2/ColorSet;->p()Lcom/spotify/contentagnostic/v2/RgbaColor;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Lp/fzg1;->u(Lcom/spotify/contentagnostic/v2/RgbaColor;)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    :goto_2
    move-wide v4, v0

    .line 37
    goto :goto_3

    .line 38
    :cond_1
    sget-wide v0, Lp/n6f;->d:J

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :goto_3
    invoke-virtual {p0}, Lcom/spotify/contentagnostic/v2/ColorSet;->w()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/spotify/contentagnostic/v2/ColorSet;->r()Lcom/spotify/contentagnostic/v2/RgbaColor;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0}, Lp/fzg1;->u(Lcom/spotify/contentagnostic/v2/RgbaColor;)J

    .line 52
    .line 53
    .line 54
    move-result-wide v0

    .line 55
    :goto_4
    move-wide v6, v0

    .line 56
    goto :goto_5

    .line 57
    :cond_2
    sget-wide v0, Lp/n6f;->d:J

    .line 58
    .line 59
    goto :goto_4

    .line 60
    :goto_5
    invoke-virtual {p0}, Lcom/spotify/contentagnostic/v2/ColorSet;->y()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/spotify/contentagnostic/v2/ColorSet;->t()Lcom/spotify/contentagnostic/v2/RgbaColor;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0}, Lp/fzg1;->u(Lcom/spotify/contentagnostic/v2/RgbaColor;)J

    .line 71
    .line 72
    .line 73
    move-result-wide v0

    .line 74
    :goto_6
    move-wide v8, v0

    .line 75
    goto :goto_7

    .line 76
    :cond_3
    sget-wide v0, Lp/n6f;->d:J

    .line 77
    .line 78
    goto :goto_6

    .line 79
    :goto_7
    invoke-virtual {p0}, Lcom/spotify/contentagnostic/v2/ColorSet;->x()Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/spotify/contentagnostic/v2/ColorSet;->s()Lcom/spotify/contentagnostic/v2/RgbaColor;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-static {p0}, Lp/fzg1;->u(Lcom/spotify/contentagnostic/v2/RgbaColor;)J

    .line 90
    .line 91
    .line 92
    move-result-wide v0

    .line 93
    :goto_8
    move-wide v10, v0

    .line 94
    goto :goto_9

    .line 95
    :cond_4
    sget-wide v0, Lp/n6f;->d:J

    .line 96
    .line 97
    goto :goto_8

    .line 98
    :goto_9
    invoke-static/range {v2 .. v11}, Lp/oku;->d(JJJJJ)Lp/jiu;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0
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
