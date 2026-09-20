# Skip Ad Signal -> Esperanto/native trace

Established Android path:
SignalCommand("skip-ad") -> b8p0 -> zqw -> EsSignalRequest -> ContextPlayer/Signal

## xcw SignalCommand -> EsSignalRequest builder
- path: /tmp/skipadsig/apk/smali_classes6/p/xcw.smali
~~~smali
.class public final Lp/xcw;
.super Lp/qe70;
.source "SourceFile"

# interfaces
.implements Lp/eh00;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lp/xcw;->a:I

    iput-object p2, p0, Lp/xcw;->b:Ljava/lang/Object;

    iput-object p3, p0, Lp/xcw;->c:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lp/qe70;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lp/xcw;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x3

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    sget-object v5, Lp/w2a1;->a:Lp/w2a1;

    .line 8
    .line 9
    iget-object v6, p0, Lp/xcw;->c:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v7, p0, Lp/xcw;->b:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v7, Lp/gh00;

    .line 17
    .line 18
    check-cast v6, Lp/ryz;

    .line 19
    .line 20
    invoke-interface {v7, v6}, Lp/gh00;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    return-object v5

    .line 24
    :pswitch_0
    check-cast v7, Lp/twz0;

    .line 25
    .line 26
    iget-object v0, v7, Lp/twz0;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lp/m500;

    .line 29
    .line 30
    invoke-static {v0}, Lp/n5h1;->m(Lp/hc80;)Lp/ub80;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v1, Lp/dmx;

    .line 35
    .line 36
    check-cast v6, Ljava/lang/String;

    .line 37
    .line 38
    const/16 v8, 0xf

    .line 39
    .line 40
    invoke-direct {v1, v7, v6, v3, v8}, Lp/dmx;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lp/fbk;I)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0, v3, v4, v1, v2}, Lp/x0h1;->u(Lp/xuk;Lp/juk;ILp/th00;I)Lp/di41;

    .line 44
    .line 45
    .line 46
    return-object v5

    .line 47
    :pswitch_1
    check-cast v7, Lp/rlv0;

    .line 48
    .line 49
    check-cast v6, Lp/pqz;

    .line 50
    .line 51
    invoke-virtual {v6}, Lp/pqz;->J1()Lp/upz;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, v7, Lp/rlv0;->a:Ljava/lang/Object;

    .line 56
    .line 57
    return-object v5

    .line 58
    :pswitch_2
    check-cast v7, Lp/rlv0;

    .line 59
    .line 60
    check-cast v6, Lp/nqz;

    .line 61
    .line 62
    sget-object v0, Lp/j3o0;->a:Lp/bns;

    .line 63
    .line 64
    invoke-static {v6, v0}, Lp/oqg1;->h(Lp/osh;Lp/v3t0;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, v7, Lp/rlv0;->a:Ljava/lang/Object;

    .line 69
    .line 70
    return-object v5

    .line 71
    :pswitch_3
    check-cast v7, Lp/xiz;

    .line 72
    .line 73
    iget-object v0, v7, Lp/xiz;->a:Lp/gh00;

    .line 74
    .line 75
    invoke-interface {v0, v6}, Lp/gh00;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Lp/fiz;

    .line 80
    .line 81
    return-object v0

    .line 82
    :pswitch_4
    check-cast v7, Lp/xiz;

    .line 83
    .line 84
    iget-object v0, v7, Lp/xiz;->a:Lp/gh00;

    .line 85
    .line 86
    check-cast v6, Lp/vxx;

    .line 87
    .line 88
    iget-object v1, v6, Lp/vxx;->g:Ljava/lang/Object;

    .line 89
    .line 90
    invoke-interface {v0, v1}, Lp/gh00;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Lp/fiz;

    .line 95
    .line 96
    return-object v0

    .line 97
    :pswitch_5
    check-cast v7, Landroid/content/Context;

    .line 98
    .line 99
    check-cast v6, Lp/o4a;

    .line 100
    .line 101
    invoke-virtual {v7, v6}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 102
    .line 103
    .line 104
    return-object v5

    .line 105
    :pswitch_6
    check-cast v6, Lp/kqi0;

    .line 106
    .line 107
    sget v0, Lp/x3z;->a:F

    .line 108
    .line 109
    invoke-interface {v6}, Lp/rv41;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, Ljava/lang/String;

    .line 114
    .line 115
    check-cast v7, Lp/klw0;

    .line 116
    .line 117
    iget-object v1, v7, Lp/klw0;->a:Ljava/lang/String;

    .line 118
    .line 119
    invoke-static {v0, v1}, Lp/wj50;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    return-object v0

    .line 128
    :pswitch_7
    check-cast v7, Lp/fgu;

    .line 129
    .line 130
    invoke-virtual {v7}, Lp/fgu;->a()V

    .line 131
    .line 132
    .line 133
    check-cast v6, Lp/eh00;

    .line 134
    .line 135
    invoke-interface {v6}, Lp/eh00;->invoke()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    return-object v5

    .line 139
    :pswitch_8
    check-cast v7, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 140
    .line 141
    invoke-virtual {v7, v4, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_0

    .line 146
    .line 147
    sput-boolean v1, Lp/p8y;->u:Z

    .line 148
    .line 149
    check-cast v6, Lp/e8x;

    .line 150
    .line 151
    invoke-virtual {v6}, Lp/e8x;->invoke()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    :cond_0
    return-object v5

    .line 155
    :pswitch_9
    check-cast v7, Lp/y800;

    .line 156
    .line 157
    invoke-virtual {v7}, Lp/y800;->getLifecycle()Lp/gb80;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-static {v0}, Lp/l5h1;->p(Lp/gb80;)Lp/ub80;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    new-instance v1, Lp/dmx;

    .line 166
    .line 167
    check-cast v6, Lp/i8y;

    .line 168
    .line 169
    invoke-direct {v1, v7, v6, v3, v2}, Lp/dmx;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lp/fbk;I)V

    .line 170
    .line 171
    .line 172
    invoke-static {v0, v3, v4, v1, v2}, Lp/x0h1;->u(Lp/xuk;Lp/juk;ILp/th00;I)Lp/di41;

    .line 173
    .line 174
    .line 175
    return-object v5

    .line 176
    :pswitch_a
    check-cast v7, Lp/gh00;

    .line 177
    .line 178
    new-instance v0, Lp/hrx;

    .line 179
    .line 180
    check-cast v6, Lp/fsx;

    .line 181
    .line 182
    check-cast v6, Lp/dsx;

    .line 183
    .line 184
    iget-object v1, v6, Lp/dsx;->b:Ljava/lang/String;

    .line 185
    .line 186
    invoke-direct {v0, v1}, Lp/hrx;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-interface {v7, v0}, Lp/gh00;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    return-object v5

    .line 193
    :pswitch_b
    check-cast v7, Lp/snb1;

    .line 194
    .line 195
    invoke-interface {v7}, Lp/snb1;->a()Lp/ilb1;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    iget-object v0, v0, Lp/ilb1;->d:Lp/hlb1;

    .line 200
    .line 201
    iget-object v0, v0, Lp/hlb1;->b:Lp/gh0;

    .line 202
    .line 203
    invoke-interface {v0}, Lp/gh0;->g()Z

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    if-eqz v0, :cond_1

    .line 208
    .line 209
    check-cast v6, Lp/gh00;

    .line 210
    .line 211
    sget-object v0, Lp/kg20;->a:Lp/kg20;

    .line 212
    .line 213
    invoke-interface {v6, v0}, Lp/gh00;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    :cond_1
    return-object v5

    .line 217
    :pswitch_c
    check-cast v6, Lp/kqi0;

    .line 218
    .line 219
    invoke-static {v6}, Lp/rkx;->d(Lp/kqi0;)Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-eqz v0, :cond_2

    .line 224
    .line 225
    check-cast v7, Lp/qkx;

    .line 226
    .line 227
    iget-object v0, v7, Lp/qkx;->d:Ljava/lang/String;

    .line 228
    .line 229
    if-eqz v0, :cond_2

    .line 230
    .line 231
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-lez v0, :cond_2

    .line 236
    .line 237
    goto :goto_0

    .line 238
    :cond_2
    move v1, v4

    .line 239
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    return-object v0

    .line 244
    :pswitch_d
    check-cast v7, Lp/ufx;

    .line 245
    .line 246
    check-cast v6, Lp/sp80;

    .line 247
    .line 248
    invoke-static {v6}, Lp/wj50;->p(Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    iget-object v0, v7, Lp/ufx;->b1:Lp/eph;

    .line 252
    .line 253
    iget-object v2, v7, Lp/ufx;->g:Lp/q530;

    .line 254
    .line 255
    iget-object v8, v7, Lp/ufx;->R0:Landroidx/recyclerview/widget/RecyclerView;

    .line 256
    .line 257
    iget-object v9, v7, Lp/ufx;->c:Lp/jex;

    .line 258
    .line 259
    iget-object v10, v9, Lp/jex;->N0:Lp/xoi0;

    .line 260
    .line 261
    invoke-virtual {v10}, Lp/ck90;->e()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v10

    .line 265
    instance-of v11, v10, Lcom/spotify/home/evopage/mobius/State$Content;

    .line 266
    .line 267
    if-eqz v11, :cond_3

    .line 268
    .line 269
    check-cast v10, Lcom/spotify/home/evopage/mobius/State$Content;

    .line 270
    .line 271
    goto :goto_1

    .line 272
    :cond_3
    move-object v10, v3

    .line 273
    :goto_1
    if-eqz v10, :cond_4

    .line 274
    .line 275
    invoke-virtual {v10}, Lcom/spotify/home/evopage/mobius/State$Content;->getModel()Lp/ovh0;

    .line 276
    .line 277
    .line 278
    move-result-object v10

    .line 279
    if-eqz v10, :cond_4

    .line 280
    .line 281
    iget-object v10, v10, Lp/ovh0;->f:Ljava/lang/String;

    .line 282
    .line 283
    goto :goto_2

    .line 284
    :cond_4
    move-object v10, v3

    .line 285
    :goto_2
    if-eqz v10, :cond_5
~~~
~~~smali
    .line 315
    .line 316
    move-result v3

    .line 317
    :try_start_0
    iget-object v4, v7, Lp/ufx;->U0:Lp/v290;

    .line 318
    .line 319
    invoke-virtual {v4, v6}, Lp/v290;->c(Lp/sp80;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 320
    .line 321
    .line 322
    if-eqz v3, :cond_8

    .line 323
    .line 324
    invoke-interface {v2, v1}, Lp/q530;->a(Lp/a630;)V

    .line 325
    .line 326
    .line 327
    :cond_8
    invoke-virtual {v8}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Lp/mjv0;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    if-nez v1, :cond_9

    .line 332
    .line 333
    const-wide/16 v1, 0x1f4

    .line 334
    .line 335
    invoke-virtual {v8, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 336
    .line 337
    .line 338
    :cond_9
    sget-object v0, Lp/tdv;->U0:Lp/tdv;

    .line 339
    .line 340
    new-instance v1, Lp/pfx;

    .line 341
    .line 342
    const/4 v2, 0x2

    .line 343
    invoke-direct {v1, v7, v2}, Lp/pfx;-><init>(Lp/ufx;I)V

    .line 344
    .line 345
    .line 346
    invoke-static {v8, v0, v1}, Lp/izg1;->p(Landroidx/recyclerview/widget/RecyclerView;Lp/eh00;Lp/eh00;)V

    .line 347
    .line 348
    .line 349
    return-object v5

    .line 350
    :catchall_0
    move-exception v0

    .line 351
    if-eqz v3, :cond_a

    .line 352
    .line 353
    invoke-interface {v2, v1}, Lp/q530;->a(Lp/a630;)V

    .line 354
    .line 355
    .line 356
    :cond_a
    throw v0

    .line 357
    :pswitch_e
    check-cast v7, Lp/ufx;

    .line 358
    .line 359
    check-cast v6, Landroid/os/Bundle;

    .line 360
    .line 361
    if-eqz v6, :cond_b

    .line 362
    .line 363
    const-string v0, "view_state"

    .line 364
    .line 365
    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    if-eqz v0, :cond_b

    .line 370
    .line 371
    iget-object v1, v7, Lp/ufx;->R0:Landroidx/recyclerview/widget/RecyclerView;

    .line 372
    .line 373
    invoke-virtual {v1, v0}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    .line 374
    .line 375
    .line 376
    :cond_b
    iget-object v0, v7, Lp/ufx;->O0:Lp/lqi0;

    .line 377
    .line 378
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 379
    .line 380
    check-cast v0, Lp/zv41;

    .line 381
    .line 382
    invoke-virtual {v0, v3, v1}, Lp/zv41;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    return-object v5

    .line 386
    :pswitch_f
    check-cast v7, Lp/l5p;

    .line 387
    .line 388
    check-cast v6, Lp/mmb;

    .line 389
    .line 390
    iget-object v0, v6, Lp/mmb;->i:Ljava/lang/Object;

    .line 391
    .line 392
    check-cast v0, Lp/dcm0;

    .line 393
    .line 394
    invoke-static {v0}, Lp/bga;->z(Lp/dcm0;)Lp/ago;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    invoke-virtual {v7, v0}, Lp/l5p;->a(Lp/pgo;)Lp/rfi;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    return-object v0

    .line 403
    :pswitch_10
    check-cast v7, Lp/y4p;

    .line 404
    .line 405
    check-cast v6, Lp/mmb;

    .line 406
    .line 407
    iget-object v0, v6, Lp/mmb;->i:Ljava/lang/Object;

    .line 408
    .line 409
    check-cast v0, Lp/dcm0;

    .line 410
    .line 411
    invoke-static {v0}, Lp/bga;->z(Lp/dcm0;)Lp/ago;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    iget-object v1, v7, Lp/y4p;->a:Lp/twy;

    .line 416
    .line 417
    new-instance v2, Lp/vpj;

    .line 418
    .line 419
    invoke-direct {v2, v1}, Lp/vpj;-><init>(Lp/twy;)V

    .line 420
    .line 421
    .line 422
    iget-object v1, v2, Lp/vpj;->c:Ljava/lang/Object;

    .line 423
    .line 424
    check-cast v1, Lp/h4t0;

    .line 425
    .line 426
    invoke-interface {v1}, Lp/i4t0;->get()Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    check-cast v1, Lp/qqm;

    .line 431
    .line 432
    invoke-virtual {v1, v0}, Lp/qqm;->a(Lp/pgo;)Lp/w2i;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    return-object v0

    .line 437
    :pswitch_11
    check-cast v7, Lp/x4p;

    .line 438
    .line 439
    check-cast v6, Lp/mmb;

    .line 440
    .line 441
    iget-object v0, v6, Lp/mmb;->i:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v0, Lp/dcm0;

    .line 444
    .line 445
    invoke-static {v0}, Lp/bga;->z(Lp/dcm0;)Lp/ago;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    invoke-virtual {v7, v0}, Lp/x4p;->a(Lp/pgo;)Lp/o1i;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    return-object v0

    .line 454
    :pswitch_12
    check-cast v7, Lp/mmb;

    .line 455
    .line 456
    iget-object v0, v7, Lp/mmb;->i:Ljava/lang/Object;

    .line 457
    .line 458
    check-cast v0, Lp/dcm0;

    .line 459
    .line 460
    invoke-static {v0}, Lp/bga;->z(Lp/dcm0;)Lp/ago;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    iget-object v1, v7, Lp/mmb;->t:Ljava/lang/Object;

    .line 465
    .line 466
    check-cast v1, Lp/n8p0;

    .line 467
    .line 468
    check-cast v6, Lp/axm;

    .line 469
    .line 470
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 471
    .line 472
    .line 473
    new-instance v2, Lp/ix2;

    .line 474
    .line 475
    iget-object v3, v6, Lp/axm;->a:Lp/yum;

    .line 476
    .line 477
    iget-object v3, v3, Lp/yum;->c:Ljava/lang/Object;

    .line 478
    .line 479
    check-cast v3, Lp/u12;

    .line 480
    .line 481
    iget-object v3, v3, Lp/u12;->d:Ljava/lang/Object;

    .line 482
    .line 483
    check-cast v3, Lp/pcx;

    .line 484
    .line 485
    invoke-virtual {v3}, Lp/pcx;->c()Lp/z9j0;

    .line 486
    .line 487
    .line 488
    move-result-object v3

    .line 489
    invoke-static {v3}, Lp/jg31;->i(Ljava/lang/Object;)V

    .line 490
    .line 491
    .line 492
    invoke-direct {v2, v3, v1, v0}, Lp/ix2;-><init>(Lp/z9j0;Lp/n8p0;Lp/pgo;)V

    .line 493
    .line 494
    .line 495
    return-object v2

    .line 496
    :pswitch_13
    check-cast v7, Lp/gb80;

    .line 497
    .line 498
    check-cast v6, Lp/g8x;

    .line 499
    .line 500
    invoke-virtual {v7, v6}, Lp/gb80;->a(Lp/gc80;)V

    .line 501
    .line 502
    .line 503
    return-object v5

    .line 504
    :pswitch_14
    invoke-static {}, Lcom/spotify/player/esperanto/proto/EsStop$StopRequest;->p()Lp/yow;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    check-cast v7, Lp/hrw;

    .line 509
    .line 510
    check-cast v6, Lcom/spotify/player/model/command/StopCommand;

    .line 511
    .line 512
    iget-object v1, v7, Lp/hrw;->b:Lp/msa0;

    .line 513
    .line 514
    invoke-virtual {v6}, Lcom/spotify/player/model/command/StopCommand;->loggingParams()Lp/xul0;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    invoke-virtual {v1, v2}, Lp/msa0;->a(Lp/xul0;)Lcom/spotify/player/model/command/options/LoggingParams;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    invoke-static {v1}, Lp/wvf1;->u(Lcom/spotify/player/model/command/options/LoggingParams;)Lcom/spotify/player/esperanto/proto/EsLoggingParams$LoggingParams;

    .line 523
    .line 524
    .line 525
    move-result-object v1

    .line 526
    invoke-virtual {v0, v1}, Lp/yow;->m(Lcom/spotify/player/esperanto/proto/EsLoggingParams$LoggingParams;)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v0}, Lcom/google/protobuf/g;->build()Lcom/google/protobuf/h;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    check-cast v0, Lcom/spotify/player/esperanto/proto/EsStop$StopRequest;

    .line 534
    .line 535
    return-object v0

    .line 536
    :pswitch_15
    invoke-static {}, Lcom/spotify/player/esperanto/proto/EsSkipPrev$SkipPrevRequest;->r()Lp/wow;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    check-cast v7, Lcom/spotify/player/model/command/SkipToPrevTrackCommand;

    .line 541
    .line 542
    check-cast v6, Lp/hrw;

    .line 543
    .line 544
    invoke-virtual {v7}, Lcom/spotify/player/model/command/SkipToPrevTrackCommand;->options()Lp/xul0;

    .line 545
    .line 546
    .line 547
    move-result-object v1

    .line 548
    invoke-virtual {v1}, Lp/xul0;->c()Z

    .line 549
    .line 550
    .line 551
    move-result v1

    .line 552
    if-eqz v1, :cond_d

    .line 553
    .line 554
    invoke-virtual {v7}, Lcom/spotify/player/model/command/SkipToPrevTrackCommand;->options()Lp/xul0;

    .line 555
    .line 556
    .line 557
    move-result-object v1

    .line 558
    invoke-virtual {v1}, Lp/xul0;->b()Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v1

    .line 562
    check-cast v1, Lcom/spotify/player/model/command/options/SkipToPrevTrackOptions;

    .line 563
    .line 564
    invoke-virtual {v1}, Lcom/spotify/player/model/command/options/SkipToPrevTrackOptions;->commandOptions()Lcom/spotify/player/model/command/options/CommandOptions;

    .line 565
    .line 566
    .line 567
    move-result-object v1

    .line 568
    if-eqz v1, :cond_c

    .line 569
    .line 570
    invoke-virtual {v7}, Lcom/spotify/player/model/command/SkipToPrevTrackCommand;->options()Lp/xul0;

    .line 571
    .line 572
    .line 573
    move-result-object v1

    .line 574
    invoke-virtual {v1}, Lp/xul0;->b()Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object v1

    .line 578
    check-cast v1, Lcom/spotify/player/model/command/options/SkipToPrevTrackOptions;

    .line 579
    .line 580
    invoke-virtual {v1}, Lcom/spotify/player/model/command/options/SkipToPrevTrackOptions;->commandOptions()Lcom/spotify/player/model/command/options/CommandOptions;

~~~
~~~smali
    invoke-virtual {v1, v2}, Lp/msa0;->a(Lp/xul0;)Lcom/spotify/player/model/command/options/LoggingParams;

    .line 645
    .line 646
    .line 647
    move-result-object v1

    .line 648
    invoke-static {v1}, Lp/wvf1;->u(Lcom/spotify/player/model/command/options/LoggingParams;)Lcom/spotify/player/esperanto/proto/EsLoggingParams$LoggingParams;

    .line 649
    .line 650
    .line 651
    move-result-object v1

    .line 652
    invoke-virtual {v0, v1}, Lp/wow;->q(Lcom/spotify/player/esperanto/proto/EsLoggingParams$LoggingParams;)V

    .line 653
    .line 654
    .line 655
    invoke-virtual {v7}, Lcom/spotify/player/model/command/SkipToPrevTrackCommand;->track()Lp/xul0;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    invoke-virtual {v1}, Lp/xul0;->c()Z

    .line 660
    .line 661
    .line 662
    move-result v1

    .line 663
    if-eqz v1, :cond_e

    .line 664
    .line 665
    invoke-virtual {v7}, Lcom/spotify/player/model/command/SkipToPrevTrackCommand;->track()Lp/xul0;

    .line 666
    .line 667
    .line 668
    move-result-object v1

    .line 669
    invoke-virtual {v1}, Lp/xul0;->b()Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object v1

    .line 673
    check-cast v1, Lcom/spotify/player/model/ContextTrack;

    .line 674
    .line 675
    invoke-static {v1}, Lp/n9k;->b(Lcom/spotify/player/model/ContextTrack;)Lcom/spotify/player/esperanto/proto/EsContextTrack$ContextTrack;

    .line 676
    .line 677
    .line 678
    move-result-object v1

    .line 679
    invoke-virtual {v0, v1}, Lp/wow;->s(Lcom/spotify/player/esperanto/proto/EsContextTrack$ContextTrack;)V

    .line 680
    .line 681
    .line 682
    :cond_e
    invoke-virtual {v0}, Lcom/google/protobuf/g;->build()Lcom/google/protobuf/h;

    .line 683
    .line 684
    .line 685
    move-result-object v0

    .line 686
    check-cast v0, Lcom/spotify/player/esperanto/proto/EsSkipPrev$SkipPrevRequest;

    .line 687
    .line 688
    return-object v0

    .line 689
    :pswitch_16
    invoke-static {}, Lcom/spotify/player/esperanto/proto/EsSkipNext$SkipNextRequest;->r()Lp/vow;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    check-cast v7, Lcom/spotify/player/model/command/SkipToNextTrackCommand;

    .line 694
    .line 695
    check-cast v6, Lp/hrw;

    .line 696
    .line 697
    invoke-virtual {v7}, Lcom/spotify/player/model/command/SkipToNextTrackCommand;->options()Lp/xul0;

    .line 698
    .line 699
    .line 700
    move-result-object v1

    .line 701
    invoke-virtual {v1}, Lp/xul0;->c()Z

    .line 702
    .line 703
    .line 704
    move-result v1

    .line 705
    if-eqz v1, :cond_f

    .line 706
    .line 707
    invoke-virtual {v7}, Lcom/spotify/player/model/command/SkipToNextTrackCommand;->options()Lp/xul0;

    .line 708
    .line 709
    .line 710
    move-result-object v1

    .line 711
    invoke-virtual {v1}, Lp/xul0;->b()Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v1

    .line 715
    check-cast v1, Lcom/spotify/player/model/command/options/CommandOptions;

    .line 716
    .line 717
    invoke-static {v1}, Lp/lhg1;->m(Lcom/spotify/player/model/command/options/CommandOptions;)Lcom/spotify/player/esperanto/proto/EsCommandOptions$CommandOptions;

    .line 718
    .line 719
    .line 720
    move-result-object v1

    .line 721
    invoke-virtual {v0, v1}, Lp/vow;->q(Lcom/spotify/player/esperanto/proto/EsCommandOptions$CommandOptions;)V

    .line 722
    .line 723
    .line 724
    :cond_f
    iget-object v1, v6, Lp/hrw;->b:Lp/msa0;

    .line 725
    .line 726
    invoke-virtual {v7}, Lcom/spotify/player/model/command/SkipToNextTrackCommand;->loggingParams()Lp/xul0;

    .line 727
    .line 728
    .line 729
    move-result-object v2

    .line 730
    invoke-virtual {v1, v2}, Lp/msa0;->a(Lp/xul0;)Lcom/spotify/player/model/command/options/LoggingParams;

    .line 731
    .line 732
    .line 733
    move-result-object v1

    .line 734
    invoke-static {v1}, Lp/wvf1;->u(Lcom/spotify/player/model/command/options/LoggingParams;)Lcom/spotify/player/esperanto/proto/EsLoggingParams$LoggingParams;

    .line 735
    .line 736
    .line 737
    move-result-object v1

    .line 738
    invoke-virtual {v0, v1}, Lp/vow;->m(Lcom/spotify/player/esperanto/proto/EsLoggingParams$LoggingParams;)V

    .line 739
    .line 740
    .line 741
    invoke-virtual {v7}, Lcom/spotify/player/model/command/SkipToNextTrackCommand;->track()Lp/xul0;

    .line 742
    .line 743
    .line 744
    move-result-object v1

    .line 745
    invoke-virtual {v1}, Lp/xul0;->c()Z

    .line 746
    .line 747
    .line 748
    move-result v1

    .line 749
    if-eqz v1, :cond_10

    .line 750
    .line 751
    invoke-virtual {v7}, Lcom/spotify/player/model/command/SkipToNextTrackCommand;->track()Lp/xul0;

    .line 752
    .line 753
    .line 754
    move-result-object v1

    .line 755
    invoke-virtual {v1}, Lp/xul0;->b()Ljava/lang/Object;

    .line 756
    .line 757
    .line 758
    move-result-object v1

    .line 759
    check-cast v1, Lcom/spotify/player/model/ContextTrack;

    .line 760
    .line 761
    invoke-static {v1}, Lp/n9k;->b(Lcom/spotify/player/model/ContextTrack;)Lcom/spotify/player/esperanto/proto/EsContextTrack$ContextTrack;

    .line 762
    .line 763
    .line 764
    move-result-object v1

    .line 765
    invoke-virtual {v0, v1}, Lp/vow;->r(Lcom/spotify/player/esperanto/proto/EsContextTrack$ContextTrack;)V

    .line 766
    .line 767
    .line 768
    :cond_10
    invoke-virtual {v0}, Lcom/google/protobuf/g;->build()Lcom/google/protobuf/h;

    .line 769
    .line 770
    .line 771
    move-result-object v0

    .line 772
    check-cast v0, Lcom/spotify/player/esperanto/proto/EsSkipNext$SkipNextRequest;

    .line 773
    .line 774
    return-object v0

    .line 775
    :pswitch_17
    invoke-static {}, Lcom/spotify/player/esperanto/proto/EsSignalRequest$SignalRequest;->q()Lp/tow;

    .line 776
    .line 777
    .line 778
    move-result-object v0

    .line 779
    check-cast v7, Lcom/spotify/player/model/command/SignalCommand;

    .line 780
    .line 781
    check-cast v6, Lp/hrw;

    .line 782
    .line 783
    invoke-virtual {v7}, Lcom/spotify/player/model/command/SignalCommand;->signalId()Ljava/lang/String;

    .line 784
    .line 785
    .line 786
    move-result-object v1

    .line 787
    invoke-virtual {v0, v1}, Lp/tow;->r(Ljava/lang/String;)V

    .line 788
    .line 789
    .line 790
    iget-object v1, v6, Lp/hrw;->b:Lp/msa0;

    .line 791
    .line 792
    invoke-virtual {v7}, Lcom/spotify/player/model/command/SignalCommand;->loggingParams()Lp/xul0;

    .line 793
    .line 794
    .line 795
    move-result-object v2

    .line 796
    invoke-virtual {v1, v2}, Lp/msa0;->a(Lp/xul0;)Lcom/spotify/player/model/command/options/LoggingParams;

    .line 797
    .line 798
    .line 799
    move-result-object v1

    .line 800
    invoke-static {v1}, Lp/wvf1;->u(Lcom/spotify/player/model/command/options/LoggingParams;)Lcom/spotify/player/esperanto/proto/EsLoggingParams$LoggingParams;

    .line 801
    .line 802
    .line 803
    move-result-object v1

    .line 804
    invoke-virtual {v0, v1}, Lp/tow;->m(Lcom/spotify/player/esperanto/proto/EsLoggingParams$LoggingParams;)V

    .line 805
    .line 806
    .line 807
    invoke-virtual {v7}, Lcom/spotify/player/model/command/SignalCommand;->parameters()Lp/xul0;

    .line 808
    .line 809
    .line 810
    move-result-object v1

    .line 811
    invoke-virtual {v1}, Lp/xul0;->h()Ljava/lang/Object;

    .line 812
    .line 813
    .line 814
    move-result-object v1

    .line 815
    check-cast v1, Ljava/lang/String;

    .line 816
    .line 817
    if-eqz v1, :cond_11

    .line 818
    .line 819
    invoke-virtual {v0, v1}, Lp/tow;->q(Ljava/lang/String;)V

    .line 820
    .line 821
    .line 822
    :cond_11
    invoke-virtual {v0}, Lcom/google/protobuf/g;->build()Lcom/google/protobuf/h;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    check-cast v0, Lcom/spotify/player/esperanto/proto/EsSignalRequest$SignalRequest;

    .line 827
    .line 828
    return-object v0

    .line 829
    :pswitch_18
    invoke-static {}, Lcom/spotify/player/esperanto/proto/EsResume$ResumeRequest;->q()Lp/how;

    .line 830
    .line 831
    .line 832
    move-result-object v0

    .line 833
    check-cast v7, Lcom/spotify/player/model/command/ResumeCommand;

    .line 834
    .line 835
    check-cast v6, Lp/hrw;

    .line 836
    .line 837
    invoke-virtual {v7}, Lcom/spotify/player/model/command/ResumeCommand;->options()Lp/xul0;

    .line 838
    .line 839
    .line 840
    move-result-object v1

    .line 841
    invoke-virtual {v1}, Lp/xul0;->c()Z

    .line 842
    .line 843
    .line 844
    move-result v1

    .line 845
    if-eqz v1, :cond_12

    .line 846
    .line 847
    invoke-virtual {v7}, Lcom/spotify/player/model/command/ResumeCommand;->options()Lp/xul0;

    .line 848
    .line 849
    .line 850
    move-result-object v1

    .line 851
    invoke-virtual {v1}, Lp/xul0;->b()Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v1

    .line 855
    check-cast v1, Lcom/spotify/player/model/command/options/CommandOptions;

    .line 856
    .line 857
    invoke-static {v1}, Lp/lhg1;->m(Lcom/spotify/player/model/command/options/CommandOptions;)Lcom/spotify/player/esperanto/proto/EsCommandOptions$CommandOptions;

    .line 858
    .line 859
    .line 860
    move-result-object v1

    .line 861
    invoke-virtual {v0, v1}, Lp/how;->q(Lcom/spotify/player/esperanto/proto/EsCommandOptions$CommandOptions;)V

    .line 862
    .line 863
    .line 864
    :cond_12
    iget-object v1, v6, Lp/hrw;->b:Lp/msa0;

    .line 865
    .line 866
    invoke-virtual {v7}, Lcom/spotify/player/model/command/ResumeCommand;->loggingParams()Lp/xul0;

    .line 867
    .line 868
    .line 869
    move-result-object v2

    .line 870
    invoke-virtual {v1, v2}, Lp/msa0;->a(Lp/xul0;)Lcom/spotify/player/model/command/options/LoggingParams;

    .line 871
    .line 872
    .line 873
    move-result-object v1

    .line 874
~~~
~~~smali
    .line 884
    move-result-object v1

    .line 885
    invoke-virtual {v1}, Lp/xul0;->c()Z

    .line 886
    .line 887
    .line 888
    move-result v1

    .line 889
    if-eqz v1, :cond_13

    .line 890
    .line 891
    invoke-virtual {v7}, Lcom/spotify/player/model/command/ResumeCommand;->resumeOrigin()Lp/xul0;

    .line 892
    .line 893
    .line 894
    move-result-object v1

    .line 895
    invoke-virtual {v1}, Lp/xul0;->b()Ljava/lang/Object;

    .line 896
    .line 897
    .line 898
    move-result-object v1

    .line 899
    check-cast v1, Lcom/spotify/player/model/PauseResumeOrigin;

    .line 900
    .line 901
    invoke-static {}, Lcom/spotify/player/esperanto/proto/EsPauseresumeOrigin$PauseResumeOrigin;->o()Lp/wmw;

    .line 902
    .line 903
    .line 904
    move-result-object v2

    .line 905
    invoke-virtual {v1}, Lcom/spotify/player/model/PauseResumeOrigin;->featureIdentifier()Ljava/lang/String;

    .line 906
    .line 907
    .line 908
    move-result-object v1

    .line 909
    invoke-virtual {v2, v1}, Lp/wmw;->m(Ljava/lang/String;)V

    .line 910
    .line 911
    .line 912
    invoke-virtual {v2}, Lcom/google/protobuf/g;->build()Lcom/google/protobuf/h;

    .line 913
    .line 914
    .line 915
    move-result-object v1

    .line 916
    check-cast v1, Lcom/spotify/player/esperanto/proto/EsPauseresumeOrigin$PauseResumeOrigin;

    .line 917
    .line 918
    invoke-virtual {v0, v1}, Lp/how;->r(Lcom/spotify/player/esperanto/proto/EsPauseresumeOrigin$PauseResumeOrigin;)V

    .line 919
    .line 920
    .line 921
    :cond_13
    invoke-virtual {v0}, Lcom/google/protobuf/g;->build()Lcom/google/protobuf/h;

    .line 922
    .line 923
    .line 924
    move-result-object v0

    .line 925
    check-cast v0, Lcom/spotify/player/esperanto/proto/EsResume$ResumeRequest;

    .line 926
    .line 927
    return-object v0

    .line 928
    :pswitch_19
    invoke-static {}, Lcom/spotify/player/esperanto/proto/EsPlayAsNextInQueueRequest$PlayAsNextInQueueRequest;->q()Lp/zmw;

    .line 929
    .line 930
    .line 931
    move-result-object v0

    .line 932
    check-cast v7, Lcom/spotify/player/model/command/PlayAsNextInQueueCommand;

    .line 933
    .line 934
    check-cast v6, Lp/hrw;

    .line 935
    .line 936
    invoke-virtual {v7}, Lcom/spotify/player/model/command/PlayAsNextInQueueCommand;->options()Lp/xul0;

    .line 937
    .line 938
    .line 939
    move-result-object v1

    .line 940
    invoke-virtual {v1}, Lp/xul0;->c()Z

    .line 941
    .line 942
    .line 943
    move-result v1

    .line 944
    if-eqz v1, :cond_14

    .line 945
    .line 946
    invoke-virtual {v7}, Lcom/spotify/player/model/command/PlayAsNextInQueueCommand;->options()Lp/xul0;

    .line 947
    .line 948
    .line 949
    move-result-object v1

    .line 950
    invoke-virtual {v1}, Lp/xul0;->b()Ljava/lang/Object;

    .line 951
    .line 952
    .line 953
    move-result-object v1

    .line 954
    check-cast v1, Lcom/spotify/player/model/command/options/CommandOptions;

    .line 955
    .line 956
    invoke-static {v1}, Lp/lhg1;->m(Lcom/spotify/player/model/command/options/CommandOptions;)Lcom/spotify/player/esperanto/proto/EsCommandOptions$CommandOptions;

    .line 957
    .line 958
    .line 959
    move-result-object v1

    .line 960
    invoke-virtual {v0, v1}, Lp/zmw;->r(Lcom/spotify/player/esperanto/proto/EsCommandOptions$CommandOptions;)V

    .line 961
    .line 962
    .line 963
    :cond_14
    iget-object v1, v6, Lp/hrw;->b:Lp/msa0;

    .line 964
    .line 965
    invoke-virtual {v7}, Lcom/spotify/player/model/command/PlayAsNextInQueueCommand;->loggingParams()Lp/xul0;

    .line 966
    .line 967
    .line 968
    move-result-object v2

    .line 969
    invoke-virtual {v1, v2}, Lp/msa0;->a(Lp/xul0;)Lcom/spotify/player/model/command/options/LoggingParams;

    .line 970
    .line 971
    .line 972
    move-result-object v1

    .line 973
~~~
~~~smali

    .line 985
    .line 986
    const/16 v3, 0xa

    .line 987
    .line 988
    invoke-static {v1, v3}, Lp/i6f;->T(Ljava/lang/Iterable;I)I

    .line 989
    .line 990
    .line 991
    move-result v3

    .line 992
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 993
    .line 994
    .line 995
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 996
    .line 997
    .line 998
    move-result-object v1

    .line 999
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1000
    .line 1001
    .line 1002
    move-result v3

    .line 1003
    if-eqz v3, :cond_15

    .line 1004
    .line 1005
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v3

    .line 1009
    check-cast v3, Lcom/spotify/player/model/ContextTrack;

    .line 1010
    .line 1011
    invoke-static {v3}, Lp/n9k;->b(Lcom/spotify/player/model/ContextTrack;)Lcom/spotify/player/esperanto/proto/EsContextTrack$ContextTrack;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v3

    .line 1015
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1016
    .line 1017
    .line 1018
    goto :goto_4

    .line 1019
    :cond_15
    invoke-virtual {v0, v2}, Lp/zmw;->m(Ljava/util/ArrayList;)V

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v0}, Lcom/google/protobuf/g;->build()Lcom/google/protobuf/h;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v0

    .line 1026
    check-cast v0, Lcom/spotify/player/esperanto/proto/EsPlayAsNextInQueueRequest$PlayAsNextInQueueRequest;

    .line 1027
    .line 1028
    return-object v0

    .line 1029
    :pswitch_1a
    invoke-static {}, Lcom/spotify/player/esperanto/proto/EsPause$PauseRequest;->q()Lp/vmw;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v0

    .line 1033
    check-cast v7, Lcom/spotify/player/model/command/PauseCommand;

    .line 1034
    .line 1035
    check-cast v6, Lp/hrw;

    .line 1036
    .line 1037
    invoke-virtual {v7}, Lcom/spotify/player/model/command/PauseCommand;->options()Lp/xul0;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v1

    .line 1041
    invoke-virtual {v1}, Lp/xul0;->c()Z

    .line 1042
    .line 1043
    .line 1044
    move-result v1

    .line 1045
    if-eqz v1, :cond_16

    .line 1046
    .line 1047
    invoke-virtual {v7}, Lcom/spotify/player/model/command/PauseCommand;->options()Lp/xul0;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v1

    .line 1051
    invoke-virtual {v1}, Lp/xul0;->b()Ljava/lang/Object;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v1

    .line 1055
    check-cast v1, Lcom/spotify/player/model/command/options/CommandOptions;

    .line 1056
    .line 1057
    invoke-static {v1}, Lp/lhg1;->m(Lcom/spotify/player/model/command/options/CommandOptions;)Lcom/spotify/player/esperanto/proto/EsCommandOptions$CommandOptions;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v1

    .line 1061
    invoke-virtual {v0, v1}, Lp/vmw;->q(Lcom/spotify/player/esperanto/proto/EsCommandOptions$CommandOptions;)V

    .line 1062
    .line 1063
    .line 1064
    :cond_16
    iget-object v1, v6, Lp/hrw;->b:Lp/msa0;

    .line 1065
    .line 1066
    invoke-virtual {v7}, Lcom/spotify/player/model/command/PauseCommand;->loggingParams()Lp/xul0;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v2

    .line 1070
    invoke-virtual {v1, v2}, Lp/msa0;->a(Lp/xul0;)Lcom/spotify/player/model/command/options/LoggingParams;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v1

    .line 1074
~~~
~~~smali
    .line 1084
    move-result-object v1

    .line 1085
    invoke-virtual {v1}, Lp/xul0;->c()Z

    .line 1086
    .line 1087
    .line 1088
    move-result v1

    .line 1089
    if-eqz v1, :cond_17

    .line 1090
    .line 1091
    invoke-virtual {v7}, Lcom/spotify/player/model/command/PauseCommand;->pauseOrigin()Lp/xul0;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v1

    .line 1095
    invoke-virtual {v1}, Lp/xul0;->b()Ljava/lang/Object;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v1

    .line 1099
    check-cast v1, Lcom/spotify/player/model/PauseResumeOrigin;

    .line 1100
    .line 1101
    invoke-static {}, Lcom/spotify/player/esperanto/proto/EsPauseresumeOrigin$PauseResumeOrigin;->o()Lp/wmw;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v2

    .line 1105
    invoke-virtual {v1}, Lcom/spotify/player/model/PauseResumeOrigin;->featureIdentifier()Ljava/lang/String;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v1

    .line 1109
    invoke-virtual {v2, v1}, Lp/wmw;->m(Ljava/lang/String;)V

    .line 1110
    .line 1111
    .line 1112
    invoke-virtual {v2}, Lcom/google/protobuf/g;->build()Lcom/google/protobuf/h;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v1

    .line 1116
    check-cast v1, Lcom/spotify/player/esperanto/proto/EsPauseresumeOrigin$PauseResumeOrigin;

    .line 1117
    .line 1118
    invoke-virtual {v0, v1}, Lp/vmw;->r(Lcom/spotify/player/esperanto/proto/EsPauseresumeOrigin$PauseResumeOrigin;)V

    .line 1119
    .line 1120
    .line 1121
    :cond_17
    invoke-virtual {v0}, Lcom/google/protobuf/g;->build()Lcom/google/protobuf/h;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v0

    .line 1125
    check-cast v0, Lcom/spotify/player/esperanto/proto/EsPause$PauseRequest;

    .line 1126
    .line 1127
    return-object v0

    .line 1128
    :pswitch_1b
    invoke-static {}, Lcom/spotify/player/esperanto/proto/EsPlay$PlayRequest;->q()Lp/ymw;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v0

    .line 1132
    check-cast v7, Lcom/spotify/player/model/command/PlayCommand;

    .line 1133
    .line 1134
    check-cast v6, Lp/uqw;

    .line 1135
    .line 1136
    invoke-static {}, Lcom/spotify/player/esperanto/proto/EsPreparePlay$PreparePlayRequest;->q()Lp/mnw;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v1

    .line 1140
    invoke-virtual {v7}, Lcom/spotify/player/model/command/PlayCommand;->context()Lcom/spotify/player/model/Context;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v2

    .line 1144
    invoke-static {v2}, Lp/n5h1;->j(Lcom/spotify/player/model/Context;)Lcom/spotify/player/esperanto/proto/EsContext$Context;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v2

    .line 1148
    invoke-virtual {v1, v2}, Lp/mnw;->m(Lcom/spotify/player/esperanto/proto/EsContext$Context;)V

    .line 1149
    .line 1150
    .line 1151
    invoke-virtual {v7}, Lcom/spotify/player/model/command/PlayCommand;->playOrigin()Lcom/spotify/player/model/PlayOrigin;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v2

    .line 1155
    invoke-static {v2}, Lp/soo0;->a(Lcom/spotify/player/model/PlayOrigin;)Lcom/spotify/player/esperanto/proto/EsPlayOrigin$PlayOrigin;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v2

    .line 1159
    invoke-virtual {v1, v2}, Lp/mnw;->r(Lcom/spotify/player/esperanto/proto/EsPlayOrigin$PlayOrigin;)V

    .line 1160
    .line 1161
    .line 1162
    invoke-virtual {v7}, Lcom/spotify/player/model/command/PlayCommand;->options()Lp/xul0;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v2

    .line 1166
    invoke-virtual {v2}, Lp/xul0;->c()Z

    .line 1167
    .line 1168
    .line 1169
    move-result v2

    .line 1170
    if-eqz v2, :cond_18

    .line 1171
    .line 1172
    invoke-virtual {v7}, Lcom/spotify/player/model/command/PlayCommand;->options()Lp/xul0;

    .line 1173
    .line 1174
~~~
~~~smali
    .line 1205
    move-result v1

    .line 1206
    if-eqz v1, :cond_19

    .line 1207
    .line 1208
    invoke-virtual {v7}, Lcom/spotify/player/model/command/PlayCommand;->playOptions()Lp/xul0;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v1

    .line 1212
    invoke-virtual {v1}, Lp/xul0;->b()Ljava/lang/Object;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v1

    .line 1216
    check-cast v1, Lcom/spotify/player/model/command/options/PlayOptions;

    .line 1217
    .line 1218
    invoke-static {v1}, Lp/k3h1;->y(Lcom/spotify/player/model/command/options/PlayOptions;)Lcom/spotify/player/esperanto/proto/EsPlayOptions$PlayOptions;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v1

    .line 1222
    invoke-virtual {v0, v1}, Lp/ymw;->q(Lcom/spotify/player/esperanto/proto/EsPlayOptions$PlayOptions;)V

    .line 1223
    .line 1224
    .line 1225
    :cond_19
    iget-object v1, v6, Lp/uqw;->b:Lp/msa0;

    .line 1226
    .line 1227
    invoke-virtual {v7}, Lcom/spotify/player/model/command/PlayCommand;->loggingParams()Lp/xul0;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v2

    .line 1231
    invoke-virtual {v1, v2}, Lp/msa0;->a(Lp/xul0;)Lcom/spotify/player/model/command/options/LoggingParams;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v1

    .line 1235
    invoke-static {v1}, Lp/wvf1;->u(Lcom/spotify/player/model/command/options/LoggingParams;)Lcom/spotify/player/esperanto/proto/EsLoggingParams$LoggingParams;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v1

    .line 1239
    invoke-virtual {v0, v1}, Lp/ymw;->m(Lcom/spotify/player/esperanto/proto/EsLoggingParams$LoggingParams;)V

    .line 1240
    .line 1241
    .line 1242
    invoke-virtual {v0}, Lcom/google/protobuf/g;->build()Lcom/google/protobuf/h;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v0

    .line 1246
    check-cast v0, Lcom/spotify/player/esperanto/proto/EsPlay$PlayRequest;

    .line 1247
    .line 1248
    return-object v0

    .line 1249
    :pswitch_1c
    new-instance v0, Lp/gn8;

    .line 1250
    .line 1251
    check-cast v7, Landroid/content/Context;

    .line 1252
    .line 1253
    invoke-direct {v0, v7}, Lp/gn8;-><init>(Landroid/content/Context;)V

    .line 1254
    .line 1255
    .line 1256
    check-cast v6, Lcom/spotify/equalizer/uiusecases/equalizerpicker/EqualizerView;

    .line 1257
    .line 1258
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 1259
    .line 1260
    .line 1261
    move-result v1

    .line 1262
    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 1263
    .line 1264
    .line 1265
    invoke-virtual {v6, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1266
    .line 1267
    .line 1268
    return-object v0

    .line 1269
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
~~~

## zqw Signal RPC dispatch
- path: /tmp/skipadsig/apk/smali_classes9/p/zqw.smali
~~~smali
.class public final Lp/zqw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp/wh00;
.implements Lio/reactivex/rxjava3/functions/Function;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lp/hrw;


# direct methods
.method public synthetic constructor <init>(Lp/hrw;I)V
    .locals 0

    .line 1
    iput p2, p0, Lp/zqw;->a:I

    iput-object p1, p0, Lp/zqw;->b:Lp/hrw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lp/zqw;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lcom/spotify/player/esperanto/proto/EsSignalRequest$SignalRequest;

    .line 7
    .line 8
    iget-object v0, p0, Lp/zqw;->b:Lp/hrw;

    .line 9
    .line 10
    iget-object v0, v0, Lp/hrw;->a:Lp/r7k;

    .line 11
    .line 12
    invoke-static {p1}, Lp/wj50;->p(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "spotify.player.esperanto.proto.ContextPlayer"

    .line 16
    .line 17
    const-string v2, "Signal"

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2, p1}, Lcom/spotify/esperanto/esperanto/ClientBase;->callSingle(Ljava/lang/String;Ljava/lang/String;Lp/pre0;)Lio/reactivex/rxjava3/core/Single;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    sget-object v0, Lp/njy0;->Q0:Lp/njy0;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lio/reactivex/rxjava3/core/Single;->map(Lio/reactivex/rxjava3/functions/Function;)Lio/reactivex/rxjava3/core/Single;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    sget-object v0, Lp/mc40;->X0:Lp/mc40;

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lio/reactivex/rxjava3/core/Single;->map(Lio/reactivex/rxjava3/functions/Function;)Lio/reactivex/rxjava3/core/Single;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :pswitch_0
    check-cast p1, Lp/b8p0;

    .line 37
    .line 38
    iget-object p1, p1, Lp/b8p0;->a:Lcom/spotify/player/model/command/SignalCommand;

    .line 39
    .line 40
    new-instance v0, Lp/xcw;

    .line 41
    .line 42
    const/4 v1, 0x5

    .line 43
    iget-object v2, p0, Lp/zqw;->b:Lp/hrw;

    .line 44
    .line 45
    invoke-direct {v0, v1, p1, v2}, Lp/xcw;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v0}, Lp/hrw;->b(Lp/eh00;)Lio/reactivex/rxjava3/core/Single;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    new-instance v0, Lp/zqw;

    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    invoke-direct {v0, v2, v1}, Lp/zqw;-><init>(Lp/hrw;I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v0}, Lio/reactivex/rxjava3/core/Single;->flatMap(Lio/reactivex/rxjava3/functions/Function;)Lio/reactivex/rxjava3/core/Single;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
~~~

## Signal model / request schema
### b8p0
- path: /tmp/skipadsig/apk/smali_classes9/p/b8p0.smali
~~~smali
.class public final Lp/b8p0;
.super Lp/h8p0;
.source "SourceFile"


# instance fields
.field public final a:Lcom/spotify/player/model/command/SignalCommand;


# direct methods
.method public constructor <init>(Lcom/spotify/player/model/command/SignalCommand;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lp/b8p0;->a:Lcom/spotify/player/model/command/SignalCommand;

    .line 8
    .line 9
    return-void
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
.end method


# virtual methods
.method public final a(Lp/brw;Lp/crw;Lp/h7u;Lp/b5p;Lp/k9u;Lp/i2v;Lp/d9p;Lp/drw;Lp/erw;Lp/xqw;Lp/yqw;Lp/zqw;Lp/arw;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p12, p0}, Lp/zqw;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
~~~
~~~smali
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
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Lp/b8p0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    check-cast p1, Lp/b8p0;

    .line 12
    .line 13
    iget-object p1, p1, Lp/b8p0;->a:Lcom/spotify/player/model/command/SignalCommand;

    .line 14
    .line 15
    iget-object v0, p0, Lp/b8p0;->a:Lcom/spotify/player/model/command/SignalCommand;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
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
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lp/b8p0;->a:Lcom/spotify/player/model/command/SignalCommand;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "SignalWithCommand{command="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lp/b8p0;->a:Lcom/spotify/player/model/command/SignalCommand;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x7d

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
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
~~~

### h8p0
- path: /tmp/skipadsig/apk/smali_classes9/p/h8p0.smali
~~~smali
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
.end method

.method public static h(Lcom/spotify/player/model/command/SeekToCommand;)Lp/a8p0;
    .locals 1

    .line 1
    new-instance v0, Lp/a8p0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lp/a8p0;-><init>(Lcom/spotify/player/model/command/SeekToCommand;)V

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
.end method

.method public static i(Lcom/spotify/player/model/command/SignalCommand;)Lp/b8p0;
    .locals 1

    .line 1
    new-instance v0, Lp/b8p0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lp/b8p0;-><init>(Lcom/spotify/player/model/command/SignalCommand;)V

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
.end method

.method public static j()Lp/c8p0;
    .locals 1

    .line 1
    new-instance v0, Lp/c8p0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

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
~~~

### tow
- path: /tmp/skipadsig/apk/smali_classes9/p/tow.smali
~~~smali
    check-cast p1, Lcom/google/protobuf/h;

    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/google/protobuf/g;->internalMergeFrom(Lcom/google/protobuf/h;)Lcom/google/protobuf/g;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
.end method

.method public final m(Lcom/spotify/player/esperanto/proto/EsLoggingParams$LoggingParams;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/g;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/g;->instance:Lcom/google/protobuf/h;

    .line 5
    .line 6
    check-cast v0, Lcom/spotify/player/esperanto/proto/EsSignalRequest$SignalRequest;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/spotify/player/esperanto/proto/EsSignalRequest$SignalRequest;->n(Lcom/spotify/player/esperanto/proto/EsSignalRequest$SignalRequest;Lcom/spotify/player/esperanto/proto/EsLoggingParams$LoggingParams;)V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method

.method public final bridge synthetic mergeFrom(Lp/owe;Lp/aux;)Lp/l8;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/g;->mergeFrom(Lp/owe;Lp/aux;)Lcom/google/protobuf/g;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic mergeFrom([BII)Lp/l8;
    .locals 0

    .line 2
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/g;->mergeFrom([BII)Lcom/google/protobuf/g;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic mergeFrom([BIILp/aux;)Lp/l8;
    .locals 0

~~~
~~~smali

    .line 11
    invoke-super {p0, p1}, Lp/l8;->mergeFrom([B)Lp/l8;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic mergeFrom([BII)Lp/ore0;
    .locals 0

    .line 12
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/g;->mergeFrom([BII)Lcom/google/protobuf/g;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic mergeFrom([BIILp/aux;)Lp/ore0;
    .locals 0

    .line 13
    invoke-super {p0, p1, p2, p3, p4}, Lcom/google/protobuf/g;->mergeFrom([BIILp/aux;)Lcom/google/protobuf/g;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic mergeFrom([BLp/aux;)Lp/ore0;
    .locals 0

    .line 14
    invoke-super {p0, p1, p2}, Lp/l8;->mergeFrom([BLp/aux;)Lp/l8;

    move-result-object p1

    return-object p1
.end method

.method public final q(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/g;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/g;->instance:Lcom/google/protobuf/h;

    .line 5
    .line 6
    check-cast v0, Lcom/spotify/player/esperanto/proto/EsSignalRequest$SignalRequest;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/spotify/player/esperanto/proto/EsSignalRequest$SignalRequest;->o(Lcom/spotify/player/esperanto/proto/EsSignalRequest$SignalRequest;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method

.method public final r(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/g;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/g;->instance:Lcom/google/protobuf/h;

    .line 5
    .line 6
    check-cast v0, Lcom/spotify/player/esperanto/proto/EsSignalRequest$SignalRequest;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/spotify/player/esperanto/proto/EsSignalRequest$SignalRequest;->p(Lcom/spotify/player/esperanto/proto/EsSignalRequest$SignalRequest;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method
~~~

## Whole-APK exact skip-ad literals
### /tmp/skipadsig/apk/smali_classes10/p/g511.smali
~~~smali
    check-cast v0, Lp/kk21;

    .line 842
    .line 843
    move-object/from16 v2, p2

    .line 844
    .line 845
    check-cast v2, Lp/ik21;

    .line 846
    .line 847
    iget-object v3, v2, Lp/ik21;->a:Lcom/spotify/player/model/PlayerState;

    .line 848
    .line 849
    invoke-virtual {v3}, Lcom/spotify/player/model/PlayerState;->track()Lp/xul0;

    .line 850
    .line 851
    .line 852
    move-result-object v4

    .line 853
    invoke-virtual {v4}, Lp/xul0;->b()Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    move-result-object v4

    .line 857
    check-cast v4, Lcom/spotify/player/model/ContextTrack;

    .line 858
    .line 859
    invoke-static {v4, v6}, Lp/hc1;->n(Lcom/spotify/player/model/ContextTrack;Z)Z

    .line 860
    .line 861
    .line 862
    move-result v4

    .line 863
    new-instance v9, Lp/jk21;

    .line 864
    .line 865
    check-cast v8, Lp/jo20;

    .line 866
    .line 867
    invoke-virtual {v3}, Lcom/spotify/player/model/PlayerState;->signals()Lp/pf40;

    .line 868
    .line 869
    .line 870
    move-result-object v3

    .line 871
    const-string v5, "skip-ad"

    .line 872
    .line 873
    invoke-virtual {v3, v5}, Lp/pf40;->contains(Ljava/lang/Object;)Z

    .line 874
    .line 875
    .line 876
    move-result v13

    .line 877
    iget v3, v0, Lp/kk21;->b:I

    .line 878
    .line 879
    invoke-static {v8, v3, v4}, Lp/jo20;->g(Lp/jo20;IZ)I

    .line 880
    .line 881
    .line 882
    move-result v10

    .line 883
    iget-boolean v14, v0, Lp/kk21;->c:Z

    .line 884
    .line 885
    iget-object v0, v2, Lp/ik21;->b:Lp/am81;

    .line 886
    .line 887
    iget-wide v11, v0, Lp/am81;->a:J

    .line 888
    .line 889
    invoke-direct/range {v9 .. v14}, Lp/jk21;-><init>(IJZZ)V

    .line 890
    .line 891
    .line 892
    return-object v9

    .line 893
    :pswitch_d
    move-object/from16 v0, p1

    .line 894
    .line 895
    check-cast v0, Lp/xq00;

    .line 896
    .line 897
    move-object/from16 v2, p2

    .line 898
    .line 899
    check-cast v2, Ljava/lang/Number;

    .line 900
    .line 901
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 902
    .line 903
    .line 904
    move-result v2

    .line 905
    check-cast v8, Lp/lbl0;

    .line 906
    .line 907
    and-int/lit8 v3, v2, 0x3

    .line 908
    .line 909
    if-eq v3, v4, :cond_11

    .line 910
    .line 911
    move v6, v7

    .line 912
    :cond_11
    and-int/2addr v2, v7

    .line 913
    invoke-virtual {v0, v2, v6}, Lp/xq00;->Y(IZ)Z

    .line 914
    .line 915
    .line 916
    move-result v2

    .line 917
    if-eqz v2, :cond_13

    .line 918
    .line 919
~~~
### /tmp/skipadsig/apk/smali_classes4/p/fr0.smali
~~~smali
    :cond_1
    const-string v0, "UNDERAGE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p0, 0x3

    return p0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No enum constant com.spotify.agesignal.agesignalverifier.AgeVerificationResult.BlockReason."

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "Name is null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final a(I)Ljava/lang/String;
    .locals 0

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0

    .line 6
    :pswitch_0
    const-string p0, "ad_timeout"

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :pswitch_1
    const-string p0, "ad_skipped"

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :pswitch_2
    const-string p0, "ad_ended"

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :pswitch_3
    const-string p0, "buffer_failed"

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :pswitch_4
    const-string p0, "realtime_metadata_failed"

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :pswitch_5
    const-string p0, "core_metadata_failed"

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :pswitch_6
    const-string p0, "eligibility_check_failed"

    .line 25
    .line 26
    :goto_0
    return-object p0

    .line 27
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public static final b(I)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_4

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p0, v0, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    if-eq p0, v0, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    if-eq p0, v0, :cond_1
~~~
### /tmp/skipadsig/apk/smali_classes7/p/la01.smali
~~~smali
    move-object/from16 v1, p1

    .line 1163
    .line 1164
    check-cast v1, Lp/kk21;

    .line 1165
    .line 1166
    move-object/from16 v2, p2

    .line 1167
    .line 1168
    check-cast v2, Lp/jk21;

    .line 1169
    .line 1170
    move-object/from16 v3, p3

    .line 1171
    .line 1172
    check-cast v3, Lp/hk21;

    .line 1173
    .line 1174
    move-object/from16 v4, p4

    .line 1175
    .line 1176
    check-cast v4, Lp/cvt;

    .line 1177
    .line 1178
    sget-object v4, Lp/fk21;->a:Lp/fk21;

    .line 1179
    .line 1180
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1181
    .line 1182
    .line 1183
    move-result v4

    .line 1184
    if-eqz v4, :cond_1f

    .line 1185
    .line 1186
    check-cast v10, Lp/jo20;

    .line 1187
    .line 1188
    iget-object v1, v10, Lp/jo20;->c:Ljava/lang/Object;

    .line 1189
    .line 1190
    check-cast v1, Lp/p8p0;

    .line 1191
    .line 1192
    const-string v2, "skip-ad"

    .line 1193
    .line 1194
    invoke-static {v2}, Lcom/spotify/player/model/command/SignalCommand;->create(Ljava/lang/String;)Lcom/spotify/player/model/command/SignalCommand;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v2

    .line 1198
    new-instance v3, Lp/b8p0;

    .line 1199
    .line 1200
    invoke-direct {v3, v2}, Lp/b8p0;-><init>(Lcom/spotify/player/model/command/SignalCommand;)V

    .line 1201
    .line 1202
    .line 1203
    invoke-interface {v1, v3}, Lp/p8p0;->a(Lp/h8p0;)Lio/reactivex/rxjava3/core/Single;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v1

    .line 1207
    invoke-virtual {v1}, Lio/reactivex/rxjava3/core/Single;->ignoreElement()Lio/reactivex/rxjava3/core/Completable;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v1

    .line 1211
    goto :goto_f

    .line 1212
    :cond_1f
    sget-object v4, Lp/gk21;->a:Lp/gk21;

    .line 1213
    .line 1214
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1215
    .line 1216
    .line 1217
    move-result v3

    .line 1218
    if-eqz v3, :cond_20

    .line 1219
    .line 1220
    new-instance v3, Lp/jn10;

    .line 1221
    .line 1222
    const/16 v4, 0x1a

    .line 1223
    .line 1224
    invoke-direct {v3, v4, v1, v2}, Lp/jn10;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1225
    .line 1226
    .line 1227
    new-instance v1, Lio/reactivex/rxjava3/internal/operators/completable/CompletableFromAction;

    .line 1228
    .line 1229
    invoke-direct {v1, v3}, Lio/reactivex/rxjava3/internal/operators/completable/CompletableFromAction;-><init>(Lio/reactivex/rxjava3/functions/Action;)V

    .line 1230
    .line 1231
    .line 1232
    :goto_f
    return-object v1

    .line 1233
    :cond_20
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 1234
    .line 1235
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 1236
    .line 1237
    .line 1238
    throw v1

    .line 1239
    :pswitch_10
    move-object/from16 v1, p1

    .line 1240
~~~

## Native semantic strings and direct xrefs
### skip-ad
- file+0x34708a / VA 0x34708a: b'skip-ad'
  direct code refs: 3
  - 0xfd3857; FDE=(16594970, 16595158)
        fd3814:	e9 db ff ff ff       	jmp    fd37f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ac0a>
        fd3819:	cc                   	int3
        fd381a:	41 56                	push   r14
        fd381c:	53                   	push   rbx
        fd381d:	48 83 ec 28          	sub    rsp,0x28
        fd3821:	49 89 f6             	mov    r14,rsi
        fd3824:	48 89 fb             	mov    rbx,rdi
        fd3827:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
        fd382e:	00 00 
        fd3830:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
        fd3835:	48 8b 76 20          	mov    rsi,QWORD PTR [rsi+0x20]
        fd3839:	48 8b 06             	mov    rax,QWORD PTR [rsi]
        fd383c:	ff 50 70             	call   QWORD PTR [rax+0x70]
        fd383f:	41 80 7e 68 00       	cmp    BYTE PTR [r14+0x68],0x0
        fd3844:	74 3c                	je     fd3882 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ac98>
        fd3846:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
        fd384a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
        fd384d:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
        fd3853:	85 c0                	test   eax,eax
        fd3855:	75 2b                	jne    fd3882 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ac98>
        fd3857:	48 8d 35 2c 38 37 ff 	lea    rsi,[rip+0xffffffffff37382c]        # 34708a <_ZTSSt12bad_any_cast@@Base-0x4913e>
        fd385e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
        fd3863:	6a 07                	push   0x7
        fd3865:	5a                   	pop    rdx
        fd3866:	e8 af 91 ac ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
        fd386b:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
        fd3870:	48 89 df             	mov    rdi,rbx
        fd3873:	e8 b4 01 d5 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
        fd3878:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
        fd387d:	e8 0e a6 81 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
        fd3882:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
        fd3889:	00 00 
        fd388b:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
        fd3890:	75 3f                	jne    fd38d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ace7>
        fd3892:	48 89 d8             	mov    rax,rbx
        fd3895:	48 83 c4 28          	add    rsp,0x28
        fd3899:	5b                   	pop    rbx
        fd389a:	41 5e                	pop    r14
        fd389c:	c3                   	ret
        fd389d:	49 89 c6             	mov    r14,rax
        fd38a0:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
        fd38a5:	e8 e6 a5 81 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
        fd38aa:	eb 05                	jmp    fd38b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19acc7>
        fd38ac:	eb 00                	jmp    fd38ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19acc4>
        fd38ae:	49 89 c6             	mov    r14,rax
        fd38b1:	48 89 df             	mov    rdi,rbx
        fd38b4:	e8 ad ed b0 ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
        fd38b9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
        fd38c0:	00 00 
        fd38c2:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
        fd38c7:	75 08                	jne    fd38d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ace7>
        fd38c9:	4c 89 f7             	mov    rdi,r14
        fd38cc:	e8 ff c3 a9 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
        fd38d1:	e8 da c1 81 00       	call   17efab0 <__stack_chk_fail@plt>
        fd38d6:	41 57                	push   r15
        fd38d8:	41 56                	push   r14
  - 0xfd3908; FDE=(16595158, 16595387)
        fd38c7:	75 08                	jne    fd38d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ace7>
        fd38c9:	4c 89 f7             	mov    rdi,r14
        fd38cc:	e8 ff c3 a9 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
        fd38d1:	e8 da c1 81 00       	call   17efab0 <__stack_chk_fail@plt>
        fd38d6:	41 57                	push   r15
        fd38d8:	41 56                	push   r14
        fd38da:	41 55                	push   r13
        fd38dc:	41 54                	push   r12
        fd38de:	53                   	push   rbx
        fd38df:	48 83 ec 20          	sub    rsp,0x20
        fd38e3:	49 89 ce             	mov    r14,rcx
        fd38e6:	49 89 d7             	mov    r15,rdx
        fd38e9:	49 89 f4             	mov    r12,rsi
        fd38ec:	48 89 fb             	mov    rbx,rdi
        fd38ef:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
        fd38f6:	00 00 
        fd38f8:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
        fd38fd:	48 89 d7             	mov    rdi,rdx
        fd3900:	e8 31 7f aa ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
        fd3905:	48 89 d1             	mov    rcx,rdx
        fd3908:	48 8d 3d 7b 37 37 ff 	lea    rdi,[rip+0xffffffffff37377b]        # 34708a <_ZTSSt12bad_any_cast@@Base-0x4913e>
        fd390f:	6a 07                	push   0x7
        fd3911:	5e                   	pop    rsi
        fd3912:	48 89 c2             	mov    rdx,rax
        fd3915:	e8 66 7f aa ff       	call   a7b880 <JNI_OnUnload@@Base+0x314d>
        fd391a:	84 c0                	test   al,al
        fd391c:	74 12                	je     fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
        fd391e:	49 8b 7c 24 40       	mov    rdi,QWORD PTR [r12+0x40]
        fd3923:	48 8b 07             	mov    rax,QWORD PTR [rdi]
        fd3926:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
        fd392c:	85 c0                	test   eax,eax
        fd392e:	74 4f                	je     fd397f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad95>
        fd3930:	49 83 c4 08          	add    r12,0x8
        fd3934:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
        fd3939:	4c 89 ef             	mov    rdi,r13
        fd393c:	4c 89 e6             	mov    rsi,r12
        fd393f:	4c 89 fa             	mov    rdx,r15
        fd3942:	4c 89 f1             	mov    rcx,r14
        fd3945:	e8 8a 30 00 00       	call   fd69d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ddea>
        fd394a:	48 89 df             	mov    rdi,rbx
        fd394d:	4c 89 ee             	mov    rsi,r13
        fd3950:	e8 7f 2c 00 00       	call   fd65d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d9ea>
        fd3955:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
        fd3959:	e8 28 ab ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
        fd395e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
        fd3965:	00 00 
        fd3967:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
        fd396c:	75 48                	jne    fd39b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19adcc>
        fd396e:	48 89 d8             	mov    rax,rbx
        fd3971:	48 83 c4 20          	add    rsp,0x20
        fd3975:	5b                   	pop    rbx
        fd3976:	41 5c                	pop    r12
        fd3978:	41 5d                	pop    r13
        fd397a:	41 5e                	pop    r14
        fd397c:	41 5f                	pop    r15
        fd397e:	c3                   	ret
  - 0x12044d8; FDE=(18891288, 18894558)
       1204481:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
       1204485:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
       1204489:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
       120448e:	4c 89 ee             	mov    rsi,r13
       1204491:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
       1204496:	ff 50 10             	call   QWORD PTR [rax+0x10]
       1204499:	49 81 c6 f0 11 00 00 	add    r14,0x11f0
       12044a0:	48 8d 5c 24 40       	lea    rbx,[rsp+0x40]
       12044a5:	4c 89 f7             	mov    rdi,r14
       12044a8:	48 89 de             	mov    rsi,rbx
       12044ab:	e8 6c 53 8b ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
       12044b0:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
       12044b4:	e8 cd 9f 89 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
       12044b9:	48 8d bc 24 50 09 00 	lea    rdi,[rsp+0x950]
       12044c0:	00 
       12044c1:	e8 3a 5e ff ff       	call   11fa300 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f884>
       12044c6:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
       12044cd:	00 
       12044ce:	e8 75 23 00 00       	call   1206848 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4bdcc>
       12044d3:	e9 be fe ff ff       	jmp    1204396 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4991a>
       12044d8:	48 8d 35 ab 2b 14 ff 	lea    rsi,[rip+0xffffffffff142bab]        # 34708a <_ZTSSt12bad_any_cast@@Base-0x4913e>
       12044df:	48 89 df             	mov    rdi,rbx
       12044e2:	e8 68 73 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
       12044e7:	84 c0                	test   al,al
       12044e9:	74 4b                	je     1204536 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49aba>
       12044eb:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
       12044ef:	48 8b 07             	mov    rax,QWORD PTR [rdi]
       12044f2:	ff 50 68             	call   QWORD PTR [rax+0x68]
       12044f5:	e8 cd 63 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
       12044fa:	48 8d 84 24 f8 04 00 	lea    rax,[rsp+0x4f8]
       1204501:	00 
       1204502:	83 60 e8 00          	and    DWORD PTR [rax-0x18],0x0
       1204506:	48 8d 0d 43 e9 77 00 	lea    rcx,[rip+0x77e943]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
       120450d:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
       1204511:	0f 57 c0             	xorps  xmm0,xmm0
       1204514:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
       1204517:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
       120451b:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
       1204520:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
       1204524:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
       120452b:	00 
       120452c:	e8 5f 98 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
       1204531:	e9 53 fe ff ff       	jmp    1204389 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4990d>
       1204536:	48 8d 35 01 84 13 ff 	lea    rsi,[rip+0xffffffffff138401]        # 33c93e <_ZTSSt12bad_any_cast@@Base-0x5388a>
       120453d:	48 89 df             	mov    rdi,rbx
       1204540:	e8 0a 73 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
       1204545:	84 c0                	test   al,al
       1204547:	74 7e                	je     12045c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49b4b>
       1204549:	49 89 de             	mov    r14,rbx
       120454c:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
       1204550:	e8 e1 72 87 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
       1204555:	48 8d 9c 24 c0 04 00 	lea    rbx,[rsp+0x4c0]
       120455c:	00 
       120455d:	48 89 df             	mov    rdi,rbx
       1204560:	48 89 c6             	mov    rsi,rax
       1204563:	e8 fd 22 00 00       	call   1206865 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4bde9>

### ad_skipped
- not present

### ad-skipped
- not present

### skip_ad
- file+0x3d40ad / VA 0x3d40ad: b'skip_ad_detection'
  direct code refs: 0

### ad_skip
- file+0x3506df / VA 0x3506df: b'ad_skip'
  direct code refs: 2
  - 0x139ba3e; FDE=(20560346, 20561320)
       139b9e4:	48 81 ec c8 06 00 00 	sub    rsp,0x6c8
       139b9eb:	49 89 f7             	mov    r15,rsi
       139b9ee:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
       139b9f5:	00 00 
       139b9f7:	48 89 84 24 c0 06 00 	mov    QWORD PTR [rsp+0x6c0],rax
       139b9fe:	00 
       139b9ff:	48 8b 07             	mov    rax,QWORD PTR [rdi]
       139ba02:	48 8b 18             	mov    rbx,QWORD PTR [rax]
       139ba05:	48 8d bb 28 0c 00 00 	lea    rdi,[rbx+0xc28]
       139ba0c:	0f 10 86 60 01 00 00 	movups xmm0,XMMWORD PTR [rsi+0x160]
       139ba13:	e8 1e 31 74 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
       139ba18:	48 83 64 24 50 00    	and    QWORD PTR [rsp+0x50],0x0
       139ba1e:	0f 57 c0             	xorps  xmm0,xmm0
       139ba21:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
       139ba26:	49 8b bf 60 01 00 00 	mov    rdi,QWORD PTR [r15+0x160]
       139ba2d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
       139ba30:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
       139ba36:	49 89 c6             	mov    r14,rax
       139ba39:	48 85 c0             	test   rax,rax
       139ba3c:	7e 4e                	jle    139ba8c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1010>
       139ba3e:	48 8d 35 9a 4c fb fe 	lea    rsi,[rip+0xfffffffffefb4c9a]        # 3506df <_ZTSSt12bad_any_cast@@Base-0x3fae9>
       139ba45:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
       139ba4c:	00 
       139ba4d:	e8 2c e0 6d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
       139ba52:	48 8d b4 24 b0 03 00 	lea    rsi,[rsp+0x3b0]
       139ba59:	00 
       139ba5a:	83 66 18 00          	and    DWORD PTR [rsi+0x18],0x0
       139ba5e:	49 69 c6 e8 03 00 00 	imul   rax,r14,0x3e8
       139ba65:	48 89 46 20          	mov    QWORD PTR [rsi+0x20],rax
       139ba69:	31 c0                	xor    eax,eax
       139ba6b:	88 46 28             	mov    BYTE PTR [rsi+0x28],al
       139ba6e:	88 46 30             	mov    BYTE PTR [rsi+0x30],al
       139ba71:	c6 46 38 06          	mov    BYTE PTR [rsi+0x38],0x6
       139ba75:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
       139ba7a:	e8 1b 06 00 00       	call   139c09a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e161e>
       139ba7f:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
       139ba86:	00 
       139ba87:	e8 04 24 45 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
       139ba8c:	31 c0                	xor    eax,eax
       139ba8e:	4c 8d b4 24 c8 00 00 	lea    r14,[rsp+0xc8]
       139ba95:	00 
       139ba96:	41 88 46 f8          	mov    BYTE PTR [r14-0x8],al
       139ba9a:	0f 57 c0             	xorps  xmm0,xmm0
       139ba9d:	41 0f 29 46 d8       	movaps XMMWORD PTR [r14-0x28],xmm0
       139baa2:	41 88 46 e8          	mov    BYTE PTR [r14-0x18],al
       139baa6:	4c 89 f7             	mov    rdi,r14
       139baa9:	4c 89 fe             	mov    rsi,r15
       139baac:	e8 8f ea 9c ff       	call   d6a540 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375c6>
       139bab1:	4c 8d a4 24 c0 01 00 	lea    r12,[rsp+0x1c0]
       139bab8:	00 
       139bab9:	49 81 c7 f8 00 00 00 	add    r15,0xf8
       139bac0:	4c 89 e7             	mov    rdi,r12
       139bac3:	4c 89 fe             	mov    rsi,r15
       139bac6:	e8 59 a3 ff ff       	call   1395e24 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1db3a8>
       139bacb:	0f 10 83 08 01 00 00 	movups xmm0,XMMWORD PTR [rbx+0x108]
       139bad2:	0f 11 84 24 28 02 00 	movups XMMWORD PTR [rsp+0x228],xmm0
  - 0x139be05; FDE=(20561320, 20562040)
       139bdb0:	48 81 ec 70 04 00 00 	sub    rsp,0x470
       139bdb7:	49 89 f6             	mov    r14,rsi
       139bdba:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
       139bdc1:	00 00 
       139bdc3:	48 89 84 24 68 04 00 	mov    QWORD PTR [rsp+0x468],rax
       139bdca:	00 
       139bdcb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
       139bdce:	48 8b 58 08          	mov    rbx,QWORD PTR [rax+0x8]
       139bdd2:	48 8d bb 28 0c 00 00 	lea    rdi,[rbx+0xc28]
       139bdd9:	0f 10 46 20          	movups xmm0,XMMWORD PTR [rsi+0x20]
       139bddd:	e8 54 2d 74 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
       139bde2:	48 83 64 24 60 00    	and    QWORD PTR [rsp+0x60],0x0
       139bde8:	0f 57 c0             	xorps  xmm0,xmm0
       139bdeb:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
       139bdf0:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
       139bdf4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
       139bdf7:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
       139bdfd:	49 89 c7             	mov    r15,rax
       139be00:	48 85 c0             	test   rax,rax
       139be03:	7e 4e                	jle    139be53 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e13d7>
       139be05:	48 8d 35 d3 48 fb fe 	lea    rsi,[rip+0xfffffffffefb48d3]        # 3506df <_ZTSSt12bad_any_cast@@Base-0x3fae9>
       139be0c:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
       139be13:	00 
       139be14:	e8 65 dc 6d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
       139be19:	48 8d b4 24 58 01 00 	lea    rsi,[rsp+0x158]
       139be20:	00 
       139be21:	83 66 18 00          	and    DWORD PTR [rsi+0x18],0x0
       139be25:	49 69 c7 e8 03 00 00 	imul   rax,r15,0x3e8
       139be2c:	48 89 46 20          	mov    QWORD PTR [rsi+0x20],rax
       139be30:	31 c0                	xor    eax,eax
       139be32:	88 46 28             	mov    BYTE PTR [rsi+0x28],al
       139be35:	88 46 30             	mov    BYTE PTR [rsi+0x30],al
       139be38:	c6 46 38 06          	mov    BYTE PTR [rsi+0x38],0x6
       139be3c:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
       139be41:	e8 54 02 00 00       	call   139c09a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e161e>
       139be46:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
       139be4d:	00 
       139be4e:	e8 3d 20 45 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
       139be53:	40 8a ab b0 0b 00 00 	mov    bpl,BYTE PTR [rbx+0xbb0]
       139be5a:	f3 0f 10 83 d0 0b 00 	movss  xmm0,DWORD PTR [rbx+0xbd0]
       139be61:	00 
       139be62:	f3 0f 11 44 24 4c    	movss  DWORD PTR [rsp+0x4c],xmm0
       139be68:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
       139be6f:	00 
       139be70:	4c 89 f6             	mov    rsi,r14
       139be73:	e8 36 9f fe ff       	call   1385dae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cb332>
       139be78:	40 84 ed             	test   bpl,bpl
       139be7b:	74 08                	je     139be85 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1409>
       139be7d:	f3 0f 10 4c 24 4c    	movss  xmm1,DWORD PTR [rsp+0x4c]
       139be83:	eb 08                	jmp    139be8d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1411>
       139be85:	f3 0f 10 0d fb 27 ff 	movss  xmm1,DWORD PTR [rip+0xfffffffffeff27fb]        # 38e688 <_ZTSSt12bad_any_cast@@Base-0x1b40>
       139be8c:	fe 
       139be8d:	4c 8d b4 24 d0 00 00 	lea    r14,[rsp+0xd0]
       139be94:	00 
       139be95:	49 83 26 00          	and    QWORD PTR [r14],0x0
       139be99:	0f 10 83 08 01 00 00 	movups xmm0,XMMWORD PTR [rbx+0x108]
- file+0x3810b9 / VA 0x3810b9: b'ad_skip_allowed'
  direct code refs: 0

## Native ContextPlayer/Signal neighborhood
### spotify.player.esperanto.proto.ContextPlayer
- file+0x37a9b0/VA 0x37a9b0, refs=1
  - 0x127b24e; FDE=(19378762, 19378798)
       127b232:	48 89 c7             	mov    rdi,rax
       127b235:	4c 89 f6             	mov    rsi,r14
       127b238:	48 89 da             	mov    rdx,rbx
       127b23b:	e8 82 49 29 00       	call   150fbc2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x355146>
       127b240:	4c 89 f8             	mov    rax,r15
       127b243:	5b                   	pop    rbx
       127b244:	41 5e                	pop    r14
       127b246:	41 5f                	pop    r15
       127b248:	c3                   	ret
       127b249:	cc                   	int3
       127b24a:	53                   	push   rbx
       127b24b:	48 89 fb             	mov    rbx,rdi
       127b24e:	48 8d 35 5b f7 0f ff 	lea    rsi,[rip+0xffffffffff0ff75b]        # 37a9b0 <_ZTSSt12bad_any_cast@@Base-0x15818>
       127b255:	e8 76 89 36 00       	call   15e3bd0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x429154>
       127b25a:	48 8d 05 47 50 5e 00 	lea    rax,[rip+0x5e5047]        # 18602a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1c990>
       127b261:	48 89 03             	mov    QWORD PTR [rbx],rax
       127b264:	5b                   	pop    rbx
       127b265:	c3                   	ret
       127b266:	48 89 c7             	mov    rdi,rax
       127b269:	e8 37 e8 7f ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
       127b26e:	55                   	push   rbp
       127b26f:	41 57                	push   r15
       127b271:	41 56                	push   r14
       127b273:	41 55                	push   r13
       127b275:	41 54                	push   r12
       127b277:	53                   	push   rbx
       127b278:	48 81 ec c8 07 00 00 	sub    rsp,0x7c8
       127b27f:	49 89 cf             	mov    r15,rcx
       127b282:	49 89 d4             	mov    r12,rdx
       127b285:	49 89 f6             	mov    r14,rsi
       127b288:	48 89 fb             	mov    rbx,rdi
       127b28b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
       127b292:	00 00 
       127b294:	48 89 84 24 c0 07 00 	mov    QWORD PTR [rsp+0x7c0],rax
       127b29b:	00 
       127b29c:	48 83 c6 08          	add    rsi,0x8

### Signal
- file+0x328209/VA 0x328209, refs=1
  - 0x1055f34; FDE=(17129068, 17129395)
       1055f06:	31 f6                	xor    esi,esi
       1055f08:	4c 89 f2             	mov    rdx,r14
       1055f0b:	e8 44 fb ff ff       	call   1055a54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21ce6a>
       1055f10:	eb 48                	jmp    1055f5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d370>
       1055f12:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
       1055f19:	e8 86 bc c5 ff       	call   cb1ba4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1feb44>
       1055f1e:	80 7b 78 00          	cmp    BYTE PTR [rbx+0x78],0x0
       1055f22:	74 0c                	je     1055f30 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d346>
       1055f24:	4c 89 ff             	mov    rdi,r15
       1055f27:	e8 94 fe ff ff       	call   1055dc0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d1d6>
       1055f2c:	c6 43 78 00          	mov    BYTE PTR [rbx+0x78],0x0
       1055f30:	48 83 eb 80          	sub    rbx,0xffffffffffffff80
       1055f34:	48 8d 35 ce 22 2d ff 	lea    rsi,[rip+0xffffffffff2d22ce]        # 328209 <_ZTSSt12bad_any_cast@@Base-0x67fbf>
       1055f3b:	49 89 e6             	mov    r14,rsp
       1055f3e:	4c 89 f7             	mov    rdi,r14
       1055f41:	e8 38 3b a2 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
       1055f46:	41 c6 46 18 01       	mov    BYTE PTR [r14+0x18],0x1
       1055f4b:	40 0f b6 f5          	movzx  esi,bpl
       1055f4f:	48 89 df             	mov    rdi,rbx
       1055f52:	4c 89 f2             	mov    rdx,r14
       1055f55:	e8 fa fa ff ff       	call   1055a54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21ce6a>
       1055f5a:	4c 89 f7             	mov    rdi,r14
       1055f5d:	e8 ce 0d a5 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
       1055f62:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
       1055f69:	00 00 
       1055f6b:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
       1055f70:	75 3c                	jne    1055fae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d3c4>
       1055f72:	48 83 c4 48          	add    rsp,0x48
       1055f76:	5b                   	pop    rbx
       1055f77:	41 5c                	pop    r12
       1055f79:	41 5d                	pop    r13
       1055f7b:	41 5e                	pop    r14
       1055f7d:	41 5f                	pop    r15
       1055f7f:	5d                   	pop    rbp
       1055f80:	c3                   	ret
       1055f81:	48 89 c3             	mov    rbx,rax
- file+0x37df26/VA 0x37df26, refs=1
  - 0x12dc445; FDE=(19775254, 19776821)
       12dc415:	41 5c                	pop    r12
       12dc417:	41 5d                	pop    r13
       12dc419:	41 5e                	pop    r14
       12dc41b:	41 5f                	pop    r15
       12dc41d:	5d                   	pop    rbp
       12dc41e:	e9 81 57 9d ff       	jmp    cb1ba4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1feb44>
       12dc423:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
       12dc428:	48 8d bb 20 01 00 00 	lea    rdi,[rbx+0x120]
       12dc42f:	e8 70 57 9d ff       	call   cb1ba4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1feb44>
       12dc434:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
       12dc439:	e8 4a 99 d7 ff       	call   1055d88 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d19e>
       12dc43e:	48 8b 9b 18 01 00 00 	mov    rbx,QWORD PTR [rbx+0x118]
       12dc445:	48 8d 35 da 1a 0a ff 	lea    rsi,[rip+0xffffffffff0a1ada]        # 37df26 <_ZTSSt12bad_any_cast@@Base-0x122a2>
       12dc44c:	4c 8d 7c 24 68       	lea    r15,[rsp+0x68]
       12dc451:	4c 89 ff             	mov    rdi,r15
       12dc454:	4c 89 f2             	mov    rdx,r14
       12dc457:	e8 14 21 51 00       	call   17ee570 <_ZNSt6__ndk1plIcNS_11char_traitsIcEENS_9allocatorIcEEEENS_12basic_stringIT_T0_T1_EEPKS6_RKS9_@plt>
       12dc45c:	48 8b 03             	mov    rax,QWORD PTR [rbx]
       12dc45f:	48 89 df             	mov    rdi,rbx
       12dc462:	be 90 01 00 00       	mov    esi,0x190
       12dc467:	4c 89 fa             	mov    rdx,r15
       12dc46a:	ff 50 18             	call   QWORD PTR [rax+0x18]
       12dc46d:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
       12dc472:	e8 19 1a 51 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
       12dc477:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
       12dc47e:	00 00 
       12dc480:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
       12dc487:	00 
       12dc488:	0f 85 a2 00 00 00    	jne    12dc530 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x121ab4>
       12dc48e:	48 81 c4 88 00 00 00 	add    rsp,0x88
       12dc495:	5b                   	pop    rbx
       12dc496:	41 5c                	pop    r12
       12dc498:	41 5d                	pop    r13
       12dc49a:	41 5e                	pop    r14
       12dc49c:	41 5f                	pop    r15
       12dc49e:	5d                   	pop    rbp

