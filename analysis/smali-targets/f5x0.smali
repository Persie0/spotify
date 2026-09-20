.class public abstract Lp/f5x0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;)Lcom/spotify/player/model/Restrictions;
    .locals 6

    .line 1
    invoke-static {}, Lcom/spotify/player/model/Restrictions;->builder()Lcom/spotify/player/model/Restrictions$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->f0()Lp/ae50;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowPausingReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->r0()Lp/ae50;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowResumingReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->s0()Lp/ae50;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowSeekingReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->h0()Lp/ae50;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowPeekingPrevReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->g0()Lp/ae50;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowPeekingNextReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->y0()Lp/ae50;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowSkippingPrevReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->x0()Lp/ae50;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowSkippingNextReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->D0()Lp/ae50;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowSwipePrevReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->C0()Lp/ae50;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowSwipeNextReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->F0()Lp/ae50;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowTogglingRepeatContextReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->G0()Lp/ae50;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowTogglingRepeatTrackReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->H0()Lp/ae50;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowTogglingShuffleReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->t0()Lp/ae50;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowSetQueueReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->a0()Lp/ae50;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowAddToQueueReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->b0()Lp/ae50;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowAddToQueueTrackReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->e0()Lp/ae50;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowInterruptingPlaybackReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->I0()Lp/ae50;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowTransferringPlaybackReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->i0()Lp/ae50;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowRemoteControlReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->d0()Lp/ae50;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowInsertingIntoNextTracksReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->c0()Lp/ae50;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowInsertingIntoContextTracksReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->p0()Lp/ae50;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowReorderingInNextTracksReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->o0()Lp/ae50;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowReorderingInContextTracksReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->k0()Lp/ae50;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowRemovingFromNextTracksReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->j0()Lp/ae50;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowRemovingFromContextTracksReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->J0()Lp/ae50;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowUpdatingContextReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->v0()Lp/ae50;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowSettingPlaybackSpeedReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->w0()Ljava/util/Map;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 296
    .line 297
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    invoke-static {v3}, Lp/c95;->L(I)I

    .line 302
    .line 303
    .line 304
    move-result v3

    .line 305
    invoke-direct {v2, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 306
    .line 307
    .line 308
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    check-cast v1, Ljava/lang/Iterable;

    .line 313
    .line 314
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 319
    .line 320
    .line 321
    move-result v3

    .line 322
    if-eqz v3, :cond_0

    .line 323
    .line 324
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v3

    .line 328
    check-cast v3, Ljava/util/Map$Entry;

    .line 329
    .line 330
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v4

    .line 334
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    check-cast v3, Lcom/spotify/player/esperanto/proto/EsRestrictions$RestrictionReasons;

    .line 339
    .line 340
    invoke-static {}, Lcom/spotify/player/model/Restrictions$RestrictionReasons;->builder()Lcom/spotify/player/model/Restrictions$RestrictionReasons$Builder;

    .line 341
    .line 342
    .line 343
    move-result-object v5

    .line 344
    invoke-virtual {v3}, Lcom/spotify/player/esperanto/proto/EsRestrictions$RestrictionReasons;->q()Ljava/util/List;

    .line 345
    .line 346
    .line 347
    move-result-object v3

    .line 348
    invoke-static {v3}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    invoke-virtual {v5, v3}, Lcom/spotify/player/model/Restrictions$RestrictionReasons$Builder;->reasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$RestrictionReasons$Builder;

    .line 353
    .line 354
    .line 355
    move-result-object v3

    .line 356
    invoke-virtual {v3}, Lcom/spotify/player/model/Restrictions$RestrictionReasons$Builder;->build()Lcom/spotify/player/model/Restrictions$RestrictionReasons;

    .line 357
    .line 358
    .line 359
    move-result-object v3

    .line 360
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    goto :goto_0

    .line 364
    :cond_0
    invoke-virtual {v0, v2}, Lcom/spotify/player/model/Restrictions$Builder;->disallowSignals(Ljava/util/Map;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->z0()Lp/ae50;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowSleepTimerClearReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->A0()Lp/ae50;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowSleepTimerDurationReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->B0()Lp/ae50;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowSleepTimerEndOfTrackReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->E0()Lp/ae50;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowTapToPlayTrackInNextTracksReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->q0()Lp/ae50;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowReorderingTrackInNextTracksReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 420
    .line 421
    .line 422
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->n0()Lp/ae50;

    .line 423
    .line 424
    .line 425
    move-result-object v1

    .line 426
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowReorderingEpisodeInNextTracksReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->m0()Lp/ae50;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowReorderingEnqueuedTrackInNextTracksReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 442
    .line 443
    .line 444
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->l0()Lp/ae50;

    .line 445
    .line 446
    .line 447
    move-result-object v1

    .line 448
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowReorderingEnqueuedEpisodeInNextTracksReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->L0()Lp/ae50;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    invoke-static {v1}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 460
    .line 461
    .line 462
    move-result-object v1

    .line 463
    invoke-virtual {v0, v1}, Lcom/spotify/player/model/Restrictions$Builder;->disallowViewingQueueReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {p0}, Lcom/spotify/player/esperanto/proto/EsRestrictions$Restrictions;->K0()Lp/ae50;

    .line 467
    .line 468
    .line 469
    move-result-object p0

    .line 470
    invoke-static {p0}, Lp/g6f;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 471
    .line 472
    .line 473
    move-result-object p0

    .line 474
    invoke-virtual {v0, p0}, Lcom/spotify/player/model/Restrictions$Builder;->disallowViewingOrderedTracksInNextTracksReasons(Ljava/util/Set;)Lcom/spotify/player/model/Restrictions$Builder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v0}, Lcom/spotify/player/model/Restrictions$Builder;->build()Lcom/spotify/player/model/Restrictions;

    .line 478
    .line 479
    .line 480
    move-result-object p0

    .line 481
    return-object p0
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
.end method
