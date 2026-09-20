# Skip Ad UI -> command bytecode xrefs

Recovered APK resource IDs:
- skip_ad_button_stub: 0x7f0b0eb1
- skip_ad_title: 0x7f13273a
- ads_skip_delay_content_description: 0x7f110011
- advertisement_subtext_skippable_delay: 0x7f110012

## Smali references: skip_ad_button_stub (0x7f0b0eb1)
/tmp/spotify-full/smali_classes9/p/ro61.smali-2713-    .line 940
/tmp/spotify-full/smali_classes9/p/ro61.smali-2714-    iput-object v4, v0, Lp/ro61;->H1:Lp/okj0;
/tmp/spotify-full/smali_classes9/p/ro61.smali-2715-
/tmp/spotify-full/smali_classes9/p/ro61.smali-2716-    .line 941
/tmp/spotify-full/smali_classes9/p/ro61.smali-2717-    .line 942
/tmp/spotify-full/smali_classes9/p/ro61.smali-2718-    iget-object v4, v0, Lp/ro61;->w1:Lcom/spotify/nowplaying/uiusecases/overlay/OverlayHidingGradientBackgroundView;
/tmp/spotify-full/smali_classes9/p/ro61.smali-2719-
/tmp/spotify-full/smali_classes9/p/ro61.smali-2720-    .line 943
/tmp/spotify-full/smali_classes9/p/ro61.smali-2721-    .line 944
/tmp/spotify-full/smali_classes9/p/ro61.smali-2722-    const-string v6, "modeRootView"
/tmp/spotify-full/smali_classes9/p/ro61.smali-2723-
/tmp/spotify-full/smali_classes9/p/ro61.smali-2724-    .line 945
/tmp/spotify-full/smali_classes9/p/ro61.smali-2725-    .line 946
/tmp/spotify-full/smali_classes9/p/ro61.smali-2726-    if-eqz v4, :cond_d
/tmp/spotify-full/smali_classes9/p/ro61.smali-2727-
/tmp/spotify-full/smali_classes9/p/ro61.smali-2728-    .line 947
/tmp/spotify-full/smali_classes9/p/ro61.smali-2729-    .line 948
/tmp/spotify-full/smali_classes9/p/ro61.smali-2730-    const v9, 0x7f0b1115
/tmp/spotify-full/smali_classes9/p/ro61.smali-2731-
/tmp/spotify-full/smali_classes9/p/ro61.smali-2732-    .line 949
/tmp/spotify-full/smali_classes9/p/ro61.smali-2733-    .line 950
/tmp/spotify-full/smali_classes9/p/ro61.smali-2734-    .line 951
/tmp/spotify-full/smali_classes9/p/ro61.smali-2735-    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/tmp/spotify-full/smali_classes9/p/ro61.smali-2736-
/tmp/spotify-full/smali_classes9/p/ro61.smali-2737-    .line 952
/tmp/spotify-full/smali_classes9/p/ro61.smali-2738-    .line 953
/tmp/spotify-full/smali_classes9/p/ro61.smali-2739-    .line 954
/tmp/spotify-full/smali_classes9/p/ro61.smali-2740-    move-result-object v9
/tmp/spotify-full/smali_classes9/p/ro61.smali-2741-
/tmp/spotify-full/smali_classes9/p/ro61.smali-2742-    .line 955
/tmp/spotify-full/smali_classes9/p/ro61.smali-2743-    invoke-virtual {v4, v9}, Lcom/spotify/nowplaying/uiusecases/overlay/OverlayHidingFrameLayout;->setOverlayView(Landroid/view/View;)V
/tmp/spotify-full/smali_classes9/p/ro61.smali-2744-
/tmp/spotify-full/smali_classes9/p/ro61.smali-2745-    .line 956
/tmp/spotify-full/smali_classes9/p/ro61.smali-2746-    .line 957
/tmp/spotify-full/smali_classes9/p/ro61.smali-2747-    .line 958
/tmp/spotify-full/smali_classes9/p/ro61.smali:2748:    const v4, 0x7f0b0eb1
/tmp/spotify-full/smali_classes9/p/ro61.smali-2749-
/tmp/spotify-full/smali_classes9/p/ro61.smali-2750-    .line 959
/tmp/spotify-full/smali_classes9/p/ro61.smali-2751-    .line 960
/tmp/spotify-full/smali_classes9/p/ro61.smali-2752-    .line 961
/tmp/spotify-full/smali_classes9/p/ro61.smali-2753-    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/tmp/spotify-full/smali_classes9/p/ro61.smali-2754-
/tmp/spotify-full/smali_classes9/p/ro61.smali-2755-    .line 962
/tmp/spotify-full/smali_classes9/p/ro61.smali-2756-    .line 963
/tmp/spotify-full/smali_classes9/p/ro61.smali-2757-    .line 964
/tmp/spotify-full/smali_classes9/p/ro61.smali-2758-    move-result-object v4
/tmp/spotify-full/smali_classes9/p/ro61.smali-2759-
/tmp/spotify-full/smali_classes9/p/ro61.smali-2760-    .line 965
/tmp/spotify-full/smali_classes9/p/ro61.smali-2761-    if-eqz v4, :cond_5
/tmp/spotify-full/smali_classes9/p/ro61.smali-2762-
/tmp/spotify-full/smali_classes9/p/ro61.smali-2763-    .line 966
/tmp/spotify-full/smali_classes9/p/ro61.smali-2764-    .line 967
/tmp/spotify-full/smali_classes9/p/ro61.smali-2765-    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/tmp/spotify-full/smali_classes9/p/ro61.smali-2766-
/tmp/spotify-full/smali_classes9/p/ro61.smali-2767-    .line 968
/tmp/spotify-full/smali_classes9/p/ro61.smali-2768-    .line 969
/tmp/spotify-full/smali_classes9/p/ro61.smali-2769-    .line 970
/tmp/spotify-full/smali_classes9/p/ro61.smali-2770-    move-result-object v9
/tmp/spotify-full/smali_classes9/p/ro61.smali-2771-
/tmp/spotify-full/smali_classes9/p/ro61.smali-2772-    .line 971
/tmp/spotify-full/smali_classes9/p/ro61.smali-2773-    check-cast v9, Landroid/view/ViewGroup;
/tmp/spotify-full/smali_classes9/p/ro61.smali-2774-
/tmp/spotify-full/smali_classes9/p/ro61.smali-2775-    .line 972
/tmp/spotify-full/smali_classes9/p/ro61.smali-2776-    .line 973
/tmp/spotify-full/smali_classes9/p/ro61.smali-2777-    new-instance v10, Lp/kk21;
/tmp/spotify-full/smali_classes9/p/ro61.smali-2778-
/tmp/spotify-full/smali_classes9/p/ro61.smali-2779-    .line 974
/tmp/spotify-full/smali_classes9/p/ro61.smali-2780-    .line 975
/tmp/spotify-full/smali_classes9/p/ro61.smali-2781-    const/4 v12, 0x5
/tmp/spotify-full/smali_classes9/p/ro61.smali-2782-
/tmp/spotify-full/smali_classes9/p/ro61.smali-2783-    .line 976
/tmp/spotify-full/smali_classes9/p/ro61.smali-2784-    const/4 v13, 0x0
/tmp/spotify-full/smali_classes9/p/ro61.smali-2785-
/tmp/spotify-full/smali_classes9/p/ro61.smali-2786-    .line 977
/tmp/spotify-full/smali_classes9/p/ro61.smali-2787-    invoke-direct {v10, v12, v13}, Lp/kk21;-><init>(ILp/gh00;)V
/tmp/spotify-full/smali_classes9/p/ro61.smali-2788-
/tmp/spotify-full/smali_classes9/p/ro61.smali-2789-    .line 978
/tmp/spotify-full/smali_classes9/p/ro61.smali-2790-    .line 979
/tmp/spotify-full/smali_classes9/p/ro61.smali-2791-    .line 980
/tmp/spotify-full/smali_classes9/p/ro61.smali-2792-    const/4 v14, 0x3
/tmp/spotify-full/smali_classes9/p/ro61.smali-2793-
/tmp/spotify-full/smali_classes9/p/ro61.smali-2794-    .line 981
/tmp/spotify-full/smali_classes9/p/ro61.smali-2795-    invoke-static {v5, v13, v13, v14}, Lp/w9h1;->y(Lp/ry8;Landroid/view/ViewGroup$LayoutParams;Lcom/spotify/nowplaying/scroll/ScrollCardType;I)Lp/rxt;
/tmp/spotify-full/smali_classes9/p/ro61.smali-2796-
/tmp/spotify-full/smali_classes9/p/ro61.smali-2797-    .line 982
/tmp/spotify-full/smali_classes9/p/ro61.smali-2798-    .line 983
/tmp/spotify-full/smali_classes9/p/ro61.smali-2799-    .line 984
/tmp/spotify-full/smali_classes9/p/ro61.smali-2800-    move-result-object v5
/tmp/spotify-full/smali_classes9/p/ro61.smali-2801-
/tmp/spotify-full/smali_classes9/p/ro61.smali-2802-    .line 985
/tmp/spotify-full/smali_classes9/p/ro61.smali-2803-    invoke-static {v5, v9, v10}, Lp/ro61;->c(Lp/cut;Landroid/view/ViewGroup;Ljava/lang/Object;)Lp/hxt;
/tmp/spotify-full/smali_classes9/p/ro61.smali-2804-
/tmp/spotify-full/smali_classes9/p/ro61.smali-2805-    .line 986
/tmp/spotify-full/smali_classes9/p/ro61.smali-2806-    .line 987
/tmp/spotify-full/smali_classes9/p/ro61.smali-2807-    .line 988
/tmp/spotify-full/smali_classes9/p/ro61.smali-2808-    move-result-object v5
/tmp/spotify-full/smali_classes9/p/ro61.smali-2809-
/tmp/spotify-full/smali_classes9/p/ro61.smali-2810-    .line 989
/tmp/spotify-full/smali_classes9/p/ro61.smali-2811-    iget-object v5, v5, Lp/hxt;->t:Landroid/view/View;
/tmp/spotify-full/smali_classes9/p/ro61.smali-2812-
/tmp/spotify-full/smali_classes9/p/ro61.smali-2813-    .line 990
/tmp/spotify-full/smali_classes9/p/ro61.smali-2814-    .line 991
/tmp/spotify-full/smali_classes9/p/ro61.smali-2815-    invoke-static {v4, v5}, Lp/psg1;->H(Landroid/view/View;Landroid/view/View;)V
/tmp/spotify-full/smali_classes9/p/ro61.smali-2816-
/tmp/spotify-full/smali_classes9/p/ro61.smali-2817-    .line 992
/tmp/spotify-full/smali_classes9/p/ro61.smali-2818-    .line 993
--
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2841-
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2842-    .line 487
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2843-    .line 488
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2844-    .line 489
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2845-    move-result v4
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2846-
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2847-    .line 490
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2848-    if-eqz v4, :cond_3
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2849-
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2850-    .line 491
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2851-    .line 492
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2852-    invoke-virtual {v3}, Lp/qo80;->next()Ljava/lang/Object;
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2853-
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2854-    .line 493
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2855-    .line 494
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2856-    .line 495
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2857-    move-result-object v3
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2858-
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2859-    .line 496
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2860-    check-cast v3, Landroid/view/View;
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2861-
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2862-    .line 497
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2863-    .line 498
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2864-    const/4 v4, 0x1
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2865-
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2866-    .line 499
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2867-    invoke-virtual {v3, v4}, Landroid/view/View;->setClickable(Z)V
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2868-
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2869-    .line 500
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2870-    .line 501
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2871-    .line 502
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2872-    goto :goto_2
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2873-
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2874-    .line 503
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2875-    :cond_3
/tmp/spotify-full/smali_classes9/p/qwb1.smali:2876:    const v2, 0x7f0b0eb1
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2877-
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2878-    .line 504
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2879-    .line 505
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2880-    .line 506
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2881-    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2882-
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2883-    .line 507
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2884-    .line 508
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2885-    .line 509
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2886-    move-result-object v2
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2887-
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2888-    .line 510
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2889-    if-eqz v2, :cond_4
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2890-
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2891-    .line 511
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2892-    .line 512
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2893-    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2894-
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2895-    .line 513
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2896-    .line 514
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2897-    .line 515
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2898-    move-result-object v3
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2899-
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2900-    .line 516
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2901-    check-cast v3, Landroid/view/ViewGroup;
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2902-
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2903-    .line 517
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2904-    .line 518
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2905-    new-instance v4, Lp/kk21;
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2906-
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2907-    .line 519
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2908-    .line 520
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2909-    const/4 v7, 0x0
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2910-
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2911-    .line 521
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2912-    const/4 v10, 0x5
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2913-
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2914-    .line 522
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2915-    invoke-direct {v4, v10, v7}, Lp/kk21;-><init>(ILp/gh00;)V
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2916-
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2917-    .line 523
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2918-    .line 524
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2919-    .line 525
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2920-    const/4 v12, 0x3
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2921-
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2922-    .line 526
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2923-    invoke-static {v11, v7, v7, v12}, Lp/w9h1;->y(Lp/ry8;Landroid/view/ViewGroup$LayoutParams;Lcom/spotify/nowplaying/scroll/ScrollCardType;I)Lp/rxt;
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2924-
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2925-    .line 527
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2926-    .line 528
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2927-    .line 529
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2928-    move-result-object v5
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2929-
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2930-    .line 530
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2931-    invoke-static {v5, v3, v4}, Lp/qwb1;->e(Lp/cut;Landroid/view/ViewGroup;Ljava/lang/Object;)Lp/hxt;
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2932-
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2933-    .line 531
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2934-    .line 532
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2935-    .line 533
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2936-    move-result-object v3
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2937-
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2938-    .line 534
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2939-    iget-object v3, v3, Lp/hxt;->t:Landroid/view/View;
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2940-
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2941-    .line 535
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2942-    .line 536
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2943-    invoke-static {v2, v3}, Lp/psg1;->H(Landroid/view/View;Landroid/view/View;)V
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2944-
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2945-    .line 537
/tmp/spotify-full/smali_classes9/p/qwb1.smali-2946-    .line 538

## Smali references: skip_ad_title (0x7f13273a)
/tmp/spotify-full/smali_classes2/p/jo20.smali-1127-    .line 53
/tmp/spotify-full/smali_classes2/p/jo20.smali-1128-    .line 54
/tmp/spotify-full/smali_classes2/p/jo20.smali-1129-    const/4 v6, 0x1
/tmp/spotify-full/smali_classes2/p/jo20.smali-1130-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1131-    .line 55
/tmp/spotify-full/smali_classes2/p/jo20.smali-1132-    if-eq v4, v5, :cond_4
/tmp/spotify-full/smali_classes2/p/jo20.smali-1133-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1134-    .line 56
/tmp/spotify-full/smali_classes2/p/jo20.smali-1135-    .line 57
/tmp/spotify-full/smali_classes2/p/jo20.smali-1136-    move v4, v6
/tmp/spotify-full/smali_classes2/p/jo20.smali-1137-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1138-    .line 58
/tmp/spotify-full/smali_classes2/p/jo20.smali-1139-    goto :goto_3
/tmp/spotify-full/smali_classes2/p/jo20.smali-1140-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1141-    .line 59
/tmp/spotify-full/smali_classes2/p/jo20.smali-1142-    :cond_4
/tmp/spotify-full/smali_classes2/p/jo20.smali-1143-    const/4 v4, 0x0
/tmp/spotify-full/smali_classes2/p/jo20.smali-1144-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1145-    .line 60
/tmp/spotify-full/smali_classes2/p/jo20.smali-1146-    :goto_3
/tmp/spotify-full/smali_classes2/p/jo20.smali-1147-    and-int/2addr v1, v6
/tmp/spotify-full/smali_classes2/p/jo20.smali-1148-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1149-    .line 61
/tmp/spotify-full/smali_classes2/p/jo20.smali-1150-    invoke-virtual {v0, v1, v4}, Lp/xq00;->Y(IZ)Z
/tmp/spotify-full/smali_classes2/p/jo20.smali-1151-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1152-    .line 62
/tmp/spotify-full/smali_classes2/p/jo20.smali-1153-    .line 63
/tmp/spotify-full/smali_classes2/p/jo20.smali-1154-    .line 64
/tmp/spotify-full/smali_classes2/p/jo20.smali-1155-    move-result v1
/tmp/spotify-full/smali_classes2/p/jo20.smali-1156-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1157-    .line 65
/tmp/spotify-full/smali_classes2/p/jo20.smali-1158-    if-eqz v1, :cond_7
/tmp/spotify-full/smali_classes2/p/jo20.smali-1159-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1160-    .line 66
/tmp/spotify-full/smali_classes2/p/jo20.smali-1161-    .line 67
/tmp/spotify-full/smali_classes2/p/jo20.smali:1162:    const v1, 0x7f13273a
/tmp/spotify-full/smali_classes2/p/jo20.smali-1163-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1164-    .line 68
/tmp/spotify-full/smali_classes2/p/jo20.smali-1165-    .line 69
/tmp/spotify-full/smali_classes2/p/jo20.smali-1166-    .line 70
/tmp/spotify-full/smali_classes2/p/jo20.smali-1167-    invoke-static {v1, v0}, Lp/k0e1;->L(ILp/xq00;)Ljava/lang/String;
/tmp/spotify-full/smali_classes2/p/jo20.smali-1168-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1169-    .line 71
/tmp/spotify-full/smali_classes2/p/jo20.smali-1170-    .line 72
/tmp/spotify-full/smali_classes2/p/jo20.smali-1171-    .line 73
/tmp/spotify-full/smali_classes2/p/jo20.smali-1172-    move-result-object v8
/tmp/spotify-full/smali_classes2/p/jo20.smali-1173-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1174-    .line 74
/tmp/spotify-full/smali_classes2/p/jo20.smali-1175-    new-instance v1, Lp/peu;
/tmp/spotify-full/smali_classes2/p/jo20.smali-1176-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1177-    .line 75
/tmp/spotify-full/smali_classes2/p/jo20.smali-1178-    .line 76
/tmp/spotify-full/smali_classes2/p/jo20.smali-1179-    const v4, 0x7f132739
/tmp/spotify-full/smali_classes2/p/jo20.smali-1180-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1181-    .line 77
/tmp/spotify-full/smali_classes2/p/jo20.smali-1182-    .line 78
/tmp/spotify-full/smali_classes2/p/jo20.smali-1183-    .line 79
/tmp/spotify-full/smali_classes2/p/jo20.smali-1184-    invoke-static {v4, v0}, Lp/k0e1;->L(ILp/xq00;)Ljava/lang/String;
/tmp/spotify-full/smali_classes2/p/jo20.smali-1185-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1186-    .line 80
/tmp/spotify-full/smali_classes2/p/jo20.smali-1187-    .line 81
/tmp/spotify-full/smali_classes2/p/jo20.smali-1188-    .line 82
/tmp/spotify-full/smali_classes2/p/jo20.smali-1189-    move-result-object v4
/tmp/spotify-full/smali_classes2/p/jo20.smali-1190-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1191-    .line 83
/tmp/spotify-full/smali_classes2/p/jo20.smali-1192-    invoke-static {v4}, Lp/wl51;->J0(Ljava/lang/CharSequence;)Z
/tmp/spotify-full/smali_classes2/p/jo20.smali-1193-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1194-    .line 84
/tmp/spotify-full/smali_classes2/p/jo20.smali-1195-    .line 85
/tmp/spotify-full/smali_classes2/p/jo20.smali-1196-    .line 86
/tmp/spotify-full/smali_classes2/p/jo20.smali-1197-    move-result v7
/tmp/spotify-full/smali_classes2/p/jo20.smali-1198-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1199-    .line 87
/tmp/spotify-full/smali_classes2/p/jo20.smali-1200-    if-nez v7, :cond_6
/tmp/spotify-full/smali_classes2/p/jo20.smali-1201-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1202-    .line 88
/tmp/spotify-full/smali_classes2/p/jo20.smali-1203-    .line 89
/tmp/spotify-full/smali_classes2/p/jo20.smali-1204-    new-instance v7, Lp/t40;
/tmp/spotify-full/smali_classes2/p/jo20.smali-1205-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1206-    .line 90
/tmp/spotify-full/smali_classes2/p/jo20.smali-1207-    .line 91
/tmp/spotify-full/smali_classes2/p/jo20.smali-1208-    invoke-direct {v7, v4}, Lp/t40;-><init>(Ljava/lang/String;)V
/tmp/spotify-full/smali_classes2/p/jo20.smali-1209-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1210-    .line 92
/tmp/spotify-full/smali_classes2/p/jo20.smali-1211-    .line 93
/tmp/spotify-full/smali_classes2/p/jo20.smali-1212-    .line 94
/tmp/spotify-full/smali_classes2/p/jo20.smali-1213-    invoke-direct {v1, v7, v2}, Lp/peu;-><init>(Lp/mqg1;Lp/eh00;)V
/tmp/spotify-full/smali_classes2/p/jo20.smali-1214-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1215-    .line 95
/tmp/spotify-full/smali_classes2/p/jo20.smali-1216-    .line 96
/tmp/spotify-full/smali_classes2/p/jo20.smali-1217-    .line 97
/tmp/spotify-full/smali_classes2/p/jo20.smali-1218-    sget-object v4, Lp/mk21;->a:[I
/tmp/spotify-full/smali_classes2/p/jo20.smali-1219-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1220-    .line 98
/tmp/spotify-full/smali_classes2/p/jo20.smali-1221-    .line 99
/tmp/spotify-full/smali_classes2/p/jo20.smali-1222-    invoke-static/range {p2 .. p2}, Lp/edb;->C(I)I
/tmp/spotify-full/smali_classes2/p/jo20.smali-1223-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1224-    .line 100
/tmp/spotify-full/smali_classes2/p/jo20.smali-1225-    .line 101
/tmp/spotify-full/smali_classes2/p/jo20.smali-1226-    .line 102
/tmp/spotify-full/smali_classes2/p/jo20.smali-1227-    move-result v7
/tmp/spotify-full/smali_classes2/p/jo20.smali-1228-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1229-    .line 103
/tmp/spotify-full/smali_classes2/p/jo20.smali-1230-    aget v4, v4, v7
/tmp/spotify-full/smali_classes2/p/jo20.smali-1231-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1232-    .line 104
--
/tmp/spotify-full/smali_classes7/p/b9h.smali-4636-    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I
/tmp/spotify-full/smali_classes7/p/b9h.smali-4637-
/tmp/spotify-full/smali_classes7/p/b9h.smali-4638-    .line 1730
/tmp/spotify-full/smali_classes7/p/b9h.smali-4639-    .line 1731
/tmp/spotify-full/smali_classes7/p/b9h.smali-4640-    .line 1732
/tmp/spotify-full/smali_classes7/p/b9h.smali-4641-    move-result v2
/tmp/spotify-full/smali_classes7/p/b9h.smali-4642-
/tmp/spotify-full/smali_classes7/p/b9h.smali-4643-    .line 1733
/tmp/spotify-full/smali_classes7/p/b9h.smali-4644-    and-int/lit8 v3, v2, 0x3
/tmp/spotify-full/smali_classes7/p/b9h.smali-4645-
/tmp/spotify-full/smali_classes7/p/b9h.smali-4646-    .line 1734
/tmp/spotify-full/smali_classes7/p/b9h.smali-4647-    .line 1735
/tmp/spotify-full/smali_classes7/p/b9h.smali-4648-    if-eq v3, v7, :cond_38
/tmp/spotify-full/smali_classes7/p/b9h.smali-4649-
/tmp/spotify-full/smali_classes7/p/b9h.smali-4650-    .line 1736
/tmp/spotify-full/smali_classes7/p/b9h.smali-4651-    .line 1737
/tmp/spotify-full/smali_classes7/p/b9h.smali-4652-    move v10, v9
/tmp/spotify-full/smali_classes7/p/b9h.smali-4653-
/tmp/spotify-full/smali_classes7/p/b9h.smali-4654-    .line 1738
/tmp/spotify-full/smali_classes7/p/b9h.smali-4655-    :cond_38
/tmp/spotify-full/smali_classes7/p/b9h.smali-4656-    and-int/2addr v2, v9
/tmp/spotify-full/smali_classes7/p/b9h.smali-4657-
/tmp/spotify-full/smali_classes7/p/b9h.smali-4658-    .line 1739
/tmp/spotify-full/smali_classes7/p/b9h.smali-4659-    invoke-virtual {v1, v2, v10}, Lp/xq00;->Y(IZ)Z
/tmp/spotify-full/smali_classes7/p/b9h.smali-4660-
/tmp/spotify-full/smali_classes7/p/b9h.smali-4661-    .line 1740
/tmp/spotify-full/smali_classes7/p/b9h.smali-4662-    .line 1741
/tmp/spotify-full/smali_classes7/p/b9h.smali-4663-    .line 1742
/tmp/spotify-full/smali_classes7/p/b9h.smali-4664-    move-result v2
/tmp/spotify-full/smali_classes7/p/b9h.smali-4665-
/tmp/spotify-full/smali_classes7/p/b9h.smali-4666-    .line 1743
/tmp/spotify-full/smali_classes7/p/b9h.smali-4667-    if-eqz v2, :cond_39
/tmp/spotify-full/smali_classes7/p/b9h.smali-4668-
/tmp/spotify-full/smali_classes7/p/b9h.smali-4669-    .line 1744
/tmp/spotify-full/smali_classes7/p/b9h.smali-4670-    .line 1745
/tmp/spotify-full/smali_classes7/p/b9h.smali:4671:    const v2, 0x7f13273a
/tmp/spotify-full/smali_classes7/p/b9h.smali-4672-
/tmp/spotify-full/smali_classes7/p/b9h.smali-4673-    .line 1746
/tmp/spotify-full/smali_classes7/p/b9h.smali-4674-    .line 1747
/tmp/spotify-full/smali_classes7/p/b9h.smali-4675-    .line 1748
/tmp/spotify-full/smali_classes7/p/b9h.smali-4676-    invoke-static {v2, v1}, Lp/k0e1;->L(ILp/xq00;)Ljava/lang/String;
/tmp/spotify-full/smali_classes7/p/b9h.smali-4677-
/tmp/spotify-full/smali_classes7/p/b9h.smali-4678-    .line 1749
/tmp/spotify-full/smali_classes7/p/b9h.smali-4679-    .line 1750
/tmp/spotify-full/smali_classes7/p/b9h.smali-4680-    .line 1751
/tmp/spotify-full/smali_classes7/p/b9h.smali-4681-    move-result-object v20
/tmp/spotify-full/smali_classes7/p/b9h.smali-4682-
/tmp/spotify-full/smali_classes7/p/b9h.smali-4683-    .line 1752
/tmp/spotify-full/smali_classes7/p/b9h.smali-4684-    const/16 v34, 0x0
/tmp/spotify-full/smali_classes7/p/b9h.smali-4685-
/tmp/spotify-full/smali_classes7/p/b9h.smali-4686-    .line 1753
/tmp/spotify-full/smali_classes7/p/b9h.smali-4687-    .line 1754
/tmp/spotify-full/smali_classes7/p/b9h.smali-4688-    const/16 v35, 0x7fe
/tmp/spotify-full/smali_classes7/p/b9h.smali-4689-
/tmp/spotify-full/smali_classes7/p/b9h.smali-4690-    .line 1755
/tmp/spotify-full/smali_classes7/p/b9h.smali-4691-    .line 1756
/tmp/spotify-full/smali_classes7/p/b9h.smali-4692-    const/16 v21, 0x0
/tmp/spotify-full/smali_classes7/p/b9h.smali-4693-
/tmp/spotify-full/smali_classes7/p/b9h.smali-4694-    .line 1757
/tmp/spotify-full/smali_classes7/p/b9h.smali-4695-    .line 1758
/tmp/spotify-full/smali_classes7/p/b9h.smali-4696-    const/16 v22, 0x0
/tmp/spotify-full/smali_classes7/p/b9h.smali-4697-
/tmp/spotify-full/smali_classes7/p/b9h.smali-4698-    .line 1759
/tmp/spotify-full/smali_classes7/p/b9h.smali-4699-    .line 1760
/tmp/spotify-full/smali_classes7/p/b9h.smali-4700-    const-wide/16 v23, 0x0
/tmp/spotify-full/smali_classes7/p/b9h.smali-4701-
/tmp/spotify-full/smali_classes7/p/b9h.smali-4702-    .line 1761
/tmp/spotify-full/smali_classes7/p/b9h.smali-4703-    .line 1762
/tmp/spotify-full/smali_classes7/p/b9h.smali-4704-    const/16 v25, 0x0
/tmp/spotify-full/smali_classes7/p/b9h.smali-4705-
/tmp/spotify-full/smali_classes7/p/b9h.smali-4706-    .line 1763
/tmp/spotify-full/smali_classes7/p/b9h.smali-4707-    .line 1764
/tmp/spotify-full/smali_classes7/p/b9h.smali-4708-    const/16 v26, 0x0
/tmp/spotify-full/smali_classes7/p/b9h.smali-4709-
/tmp/spotify-full/smali_classes7/p/b9h.smali-4710-    .line 1765
/tmp/spotify-full/smali_classes7/p/b9h.smali-4711-    .line 1766
/tmp/spotify-full/smali_classes7/p/b9h.smali-4712-    const/16 v27, 0x0
/tmp/spotify-full/smali_classes7/p/b9h.smali-4713-
/tmp/spotify-full/smali_classes7/p/b9h.smali-4714-    .line 1767
/tmp/spotify-full/smali_classes7/p/b9h.smali-4715-    .line 1768
/tmp/spotify-full/smali_classes7/p/b9h.smali-4716-    const/16 v28, 0x0
/tmp/spotify-full/smali_classes7/p/b9h.smali-4717-
/tmp/spotify-full/smali_classes7/p/b9h.smali-4718-    .line 1769
/tmp/spotify-full/smali_classes7/p/b9h.smali-4719-    .line 1770
/tmp/spotify-full/smali_classes7/p/b9h.smali-4720-    const/16 v29, 0x0
/tmp/spotify-full/smali_classes7/p/b9h.smali-4721-
/tmp/spotify-full/smali_classes7/p/b9h.smali-4722-    .line 1771
/tmp/spotify-full/smali_classes7/p/b9h.smali-4723-    .line 1772
/tmp/spotify-full/smali_classes7/p/b9h.smali-4724-    const/16 v30, 0x0
/tmp/spotify-full/smali_classes7/p/b9h.smali-4725-
/tmp/spotify-full/smali_classes7/p/b9h.smali-4726-    .line 1773
/tmp/spotify-full/smali_classes7/p/b9h.smali-4727-    .line 1774
/tmp/spotify-full/smali_classes7/p/b9h.smali-4728-    const/16 v31, 0x0
/tmp/spotify-full/smali_classes7/p/b9h.smali-4729-
/tmp/spotify-full/smali_classes7/p/b9h.smali-4730-    .line 1775
/tmp/spotify-full/smali_classes7/p/b9h.smali-4731-    .line 1776
/tmp/spotify-full/smali_classes7/p/b9h.smali-4732-    const/16 v33, 0x0
/tmp/spotify-full/smali_classes7/p/b9h.smali-4733-
/tmp/spotify-full/smali_classes7/p/b9h.smali-4734-    .line 1777
/tmp/spotify-full/smali_classes7/p/b9h.smali-4735-    .line 1778
/tmp/spotify-full/smali_classes7/p/b9h.smali-4736-    move-object/from16 v32, v1
/tmp/spotify-full/smali_classes7/p/b9h.smali-4737-
/tmp/spotify-full/smali_classes7/p/b9h.smali-4738-    .line 1779
/tmp/spotify-full/smali_classes7/p/b9h.smali-4739-    .line 1780
/tmp/spotify-full/smali_classes7/p/b9h.smali-4740-    invoke-static/range {v20 .. v35}, Lp/ahf1;->d(Ljava/lang/String;Lp/fxh0;Lp/if71;JLp/h171;Lp/gh00;IZLp/pl80;ILp/rx7;Lp/xq00;III)V
/tmp/spotify-full/smali_classes7/p/b9h.smali-4741-

## Smali references: ads_skip_delay_content_description (0x7f110011)
/tmp/spotify-full/smali_classes4/p/co21.smali-634-
/tmp/spotify-full/smali_classes4/p/co21.smali-635-    .line 102
/tmp/spotify-full/smali_classes4/p/co21.smali-636-    float-to-double v4, v4
/tmp/spotify-full/smali_classes4/p/co21.smali-637-
/tmp/spotify-full/smali_classes4/p/co21.smali-638-    .line 103
/tmp/spotify-full/smali_classes4/p/co21.smali-639-    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D
/tmp/spotify-full/smali_classes4/p/co21.smali-640-
/tmp/spotify-full/smali_classes4/p/co21.smali-641-    .line 104
/tmp/spotify-full/smali_classes4/p/co21.smali-642-    .line 105
/tmp/spotify-full/smali_classes4/p/co21.smali-643-    .line 106
/tmp/spotify-full/smali_classes4/p/co21.smali-644-    move-result-wide v4
/tmp/spotify-full/smali_classes4/p/co21.smali-645-
/tmp/spotify-full/smali_classes4/p/co21.smali-646-    .line 107
/tmp/spotify-full/smali_classes4/p/co21.smali-647-    double-to-float v4, v4
/tmp/spotify-full/smali_classes4/p/co21.smali-648-
/tmp/spotify-full/smali_classes4/p/co21.smali-649-    .line 108
/tmp/spotify-full/smali_classes4/p/co21.smali-650-    float-to-int v4, v4
/tmp/spotify-full/smali_classes4/p/co21.smali-651-
/tmp/spotify-full/smali_classes4/p/co21.smali-652-    .line 109
/tmp/spotify-full/smali_classes4/p/co21.smali-653-    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
/tmp/spotify-full/smali_classes4/p/co21.smali-654-
/tmp/spotify-full/smali_classes4/p/co21.smali-655-    .line 110
/tmp/spotify-full/smali_classes4/p/co21.smali-656-    .line 111
/tmp/spotify-full/smali_classes4/p/co21.smali-657-    .line 112
/tmp/spotify-full/smali_classes4/p/co21.smali-658-    move-result-object v5
/tmp/spotify-full/smali_classes4/p/co21.smali-659-
/tmp/spotify-full/smali_classes4/p/co21.smali-660-    .line 113
/tmp/spotify-full/smali_classes4/p/co21.smali-661-    filled-new-array {v5}, [Ljava/lang/Object;
/tmp/spotify-full/smali_classes4/p/co21.smali-662-
/tmp/spotify-full/smali_classes4/p/co21.smali-663-    .line 114
/tmp/spotify-full/smali_classes4/p/co21.smali-664-    .line 115
/tmp/spotify-full/smali_classes4/p/co21.smali-665-    .line 116
/tmp/spotify-full/smali_classes4/p/co21.smali-666-    move-result-object v5
/tmp/spotify-full/smali_classes4/p/co21.smali-667-
/tmp/spotify-full/smali_classes4/p/co21.smali-668-    .line 117
/tmp/spotify-full/smali_classes4/p/co21.smali:669:    const v6, 0x7f110011
/tmp/spotify-full/smali_classes4/p/co21.smali-670-
/tmp/spotify-full/smali_classes4/p/co21.smali-671-    .line 118
/tmp/spotify-full/smali_classes4/p/co21.smali-672-    .line 119
/tmp/spotify-full/smali_classes4/p/co21.smali-673-    .line 120
/tmp/spotify-full/smali_classes4/p/co21.smali-674-    invoke-static {v6, v4, v5, v0}, Lp/k0e1;->F(II[Ljava/lang/Object;Lp/xq00;)Ljava/lang/String;
/tmp/spotify-full/smali_classes4/p/co21.smali-675-
/tmp/spotify-full/smali_classes4/p/co21.smali-676-    .line 121
/tmp/spotify-full/smali_classes4/p/co21.smali-677-    .line 122
/tmp/spotify-full/smali_classes4/p/co21.smali-678-    .line 123
/tmp/spotify-full/smali_classes4/p/co21.smali-679-    move-result-object v5
/tmp/spotify-full/smali_classes4/p/co21.smali-680-
/tmp/spotify-full/smali_classes4/p/co21.smali-681-    .line 124
/tmp/spotify-full/smali_classes4/p/co21.smali-682-    sget-object v6, Lp/cxh0;->a:Lp/cxh0;
/tmp/spotify-full/smali_classes4/p/co21.smali-683-
/tmp/spotify-full/smali_classes4/p/co21.smali-684-    .line 125
/tmp/spotify-full/smali_classes4/p/co21.smali-685-    .line 126
/tmp/spotify-full/smali_classes4/p/co21.smali-686-    const/4 v7, 0x3
/tmp/spotify-full/smali_classes4/p/co21.smali-687-
/tmp/spotify-full/smali_classes4/p/co21.smali-688-    .line 127
/tmp/spotify-full/smali_classes4/p/co21.smali-689-    const/4 v8, 0x0
/tmp/spotify-full/smali_classes4/p/co21.smali-690-
/tmp/spotify-full/smali_classes4/p/co21.smali-691-    .line 128
/tmp/spotify-full/smali_classes4/p/co21.smali-692-    invoke-static {v6, v8, v7}, Lp/mi21;->B(Lp/fxh0;Lp/wb9;I)Lp/fxh0;
/tmp/spotify-full/smali_classes4/p/co21.smali-693-
/tmp/spotify-full/smali_classes4/p/co21.smali-694-    .line 129
/tmp/spotify-full/smali_classes4/p/co21.smali-695-    .line 130
/tmp/spotify-full/smali_classes4/p/co21.smali-696-    .line 131
/tmp/spotify-full/smali_classes4/p/co21.smali-697-    move-result-object v6
/tmp/spotify-full/smali_classes4/p/co21.smali-698-
/tmp/spotify-full/smali_classes4/p/co21.smali-699-    .line 132
/tmp/spotify-full/smali_classes4/p/co21.smali-700-    sget-object v7, Lp/m071;->a:Ljava/lang/String;
/tmp/spotify-full/smali_classes4/p/co21.smali-701-
/tmp/spotify-full/smali_classes4/p/co21.smali-702-    .line 133
/tmp/spotify-full/smali_classes4/p/co21.smali-703-    .line 134
/tmp/spotify-full/smali_classes4/p/co21.smali-704-    invoke-static {v7, v6}, Lp/epv0;->I(Ljava/lang/String;Lp/fxh0;)Lp/fxh0;
/tmp/spotify-full/smali_classes4/p/co21.smali-705-
/tmp/spotify-full/smali_classes4/p/co21.smali-706-    .line 135
/tmp/spotify-full/smali_classes4/p/co21.smali-707-    .line 136
/tmp/spotify-full/smali_classes4/p/co21.smali-708-    .line 137
/tmp/spotify-full/smali_classes4/p/co21.smali-709-    move-result-object v6
/tmp/spotify-full/smali_classes4/p/co21.smali-710-
/tmp/spotify-full/smali_classes4/p/co21.smali-711-    .line 138
/tmp/spotify-full/smali_classes4/p/co21.smali-712-    invoke-virtual {v0, v5}, Lp/xq00;->g(Ljava/lang/Object;)Z
/tmp/spotify-full/smali_classes4/p/co21.smali-713-
/tmp/spotify-full/smali_classes4/p/co21.smali-714-    .line 139
/tmp/spotify-full/smali_classes4/p/co21.smali-715-    .line 140
/tmp/spotify-full/smali_classes4/p/co21.smali-716-    .line 141
/tmp/spotify-full/smali_classes4/p/co21.smali-717-    move-result v7
/tmp/spotify-full/smali_classes4/p/co21.smali-718-
/tmp/spotify-full/smali_classes4/p/co21.smali-719-    .line 142
/tmp/spotify-full/smali_classes4/p/co21.smali-720-    invoke-virtual {v0}, Lp/xq00;->T()Ljava/lang/Object;
/tmp/spotify-full/smali_classes4/p/co21.smali-721-
/tmp/spotify-full/smali_classes4/p/co21.smali-722-    .line 143
/tmp/spotify-full/smali_classes4/p/co21.smali-723-    .line 144
/tmp/spotify-full/smali_classes4/p/co21.smali-724-    .line 145
/tmp/spotify-full/smali_classes4/p/co21.smali-725-    move-result-object v8
/tmp/spotify-full/smali_classes4/p/co21.smali-726-
/tmp/spotify-full/smali_classes4/p/co21.smali-727-    .line 146
/tmp/spotify-full/smali_classes4/p/co21.smali-728-    if-nez v7, :cond_7
/tmp/spotify-full/smali_classes4/p/co21.smali-729-
/tmp/spotify-full/smali_classes4/p/co21.smali-730-    .line 147
/tmp/spotify-full/smali_classes4/p/co21.smali-731-    .line 148
/tmp/spotify-full/smali_classes4/p/co21.smali-732-    sget-object v7, Lp/t6x0;->t:Lp/ia7;
/tmp/spotify-full/smali_classes4/p/co21.smali-733-
/tmp/spotify-full/smali_classes4/p/co21.smali-734-    .line 149
/tmp/spotify-full/smali_classes4/p/co21.smali-735-    .line 150
/tmp/spotify-full/smali_classes4/p/co21.smali-736-    if-ne v8, v7, :cond_8
/tmp/spotify-full/smali_classes4/p/co21.smali-737-
/tmp/spotify-full/smali_classes4/p/co21.smali-738-    .line 151
/tmp/spotify-full/smali_classes4/p/co21.smali-739-    .line 152

## Smali references: advertisement_subtext_skippable_delay (0x7f110012)
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7128-    .line 4
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7129-    .line 5
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7130-    .line 6
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7131-    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7132-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7133-    .line 7
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7134-    .line 8
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7135-    .line 9
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7136-    move-result-object p0
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7137-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7138-    .line 10
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7139-    return-object p0
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7140-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7141-    .line 11
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7142-    :cond_0
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7143-    if-eqz p3, :cond_1
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7144-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7145-    .line 12
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7146-    .line 13
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7147-    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7148-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7149-    .line 14
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7150-    .line 15
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7151-    .line 16
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7152-    move-result p1
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7153-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7154-    .line 17
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7155-    filled-new-array {p3}, [Ljava/lang/Object;
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7156-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7157-    .line 18
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7158-    .line 19
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7159-    .line 20
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7160-    move-result-object p2
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7161-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7162-    .line 21
/tmp/spotify-full/smali_classes4/p/fzg1.smali:7163:    const p3, 0x7f110012
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7164-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7165-    .line 22
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7166-    .line 23
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7167-    .line 24
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7168-    invoke-virtual {p0, p3, p1, p2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7169-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7170-    .line 25
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7171-    .line 26
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7172-    .line 27
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7173-    move-result-object p0
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7174-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7175-    .line 28
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7176-    return-object p0
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7177-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7178-    .line 29
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7179-    :cond_1
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7180-    if-eqz p1, :cond_2
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7181-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7182-    .line 30
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7183-    .line 31
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7184-    invoke-virtual {p1}, Lcom/spotify/player/model/AdBreakContext;->positionInCurrentAdBreak()J
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7185-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7186-    .line 32
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7187-    .line 33
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7188-    .line 34
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7189-    move-result-wide p2
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7190-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7191-    .line 35
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7192-    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7193-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7194-    .line 36
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7195-    .line 37
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7196-    .line 38
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7197-    move-result-object p2
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7198-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7199-    .line 39
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7200-    invoke-virtual {p1}, Lcom/spotify/player/model/AdBreakContext;->totalAdsInBreakEstimate()J
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7201-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7202-    .line 40
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7203-    .line 41
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7204-    .line 42
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7205-    move-result-wide v0
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7206-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7207-    .line 43
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7208-    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7209-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7210-    .line 44
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7211-    .line 45
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7212-    .line 46
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7213-    move-result-object p1
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7214-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7215-    .line 47
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7216-    filled-new-array {p2, p1}, [Ljava/lang/Object;
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7217-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7218-    .line 48
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7219-    .line 49
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7220-    .line 50
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7221-    move-result-object p1
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7222-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7223-    .line 51
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7224-    const p2, 0x7f13019a
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7225-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7226-    .line 52
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7227-    .line 53
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7228-    .line 54
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7229-    invoke-virtual {p0, p2, p1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7230-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7231-    .line 55
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7232-    .line 56
/tmp/spotify-full/smali_classes4/p/fzg1.smali-7233-    .line 57

## Symbolic/string Skip Ad references
/tmp/spotify-full/smali_classes10/p/dz1.smali-1443-
/tmp/spotify-full/smali_classes10/p/dz1.smali-1444-    .line 672
/tmp/spotify-full/smali_classes10/p/dz1.smali-1445-    .line 673
/tmp/spotify-full/smali_classes10/p/dz1.smali-1446-    invoke-interface {v1, v5, v3}, Lp/uys0;->c(Ljava/lang/String;Z)Z
/tmp/spotify-full/smali_classes10/p/dz1.smali-1447-
/tmp/spotify-full/smali_classes10/p/dz1.smali-1448-    .line 674
/tmp/spotify-full/smali_classes10/p/dz1.smali-1449-    .line 675
/tmp/spotify-full/smali_classes10/p/dz1.smali-1450-    .line 676
/tmp/spotify-full/smali_classes10/p/dz1.smali-1451-    move-result v12
/tmp/spotify-full/smali_classes10/p/dz1.smali-1452-
/tmp/spotify-full/smali_classes10/p/dz1.smali-1453-    .line 677
/tmp/spotify-full/smali_classes10/p/dz1.smali-1454-    const-string v5, "android-ad-on-app-open:page_injection_during_startup_enabled"
/tmp/spotify-full/smali_classes10/p/dz1.smali-1455-
/tmp/spotify-full/smali_classes10/p/dz1.smali-1456-    .line 678
/tmp/spotify-full/smali_classes10/p/dz1.smali-1457-    .line 679
/tmp/spotify-full/smali_classes10/p/dz1.smali-1458-    invoke-interface {v1, v5, v3}, Lp/uys0;->c(Ljava/lang/String;Z)Z
/tmp/spotify-full/smali_classes10/p/dz1.smali-1459-
/tmp/spotify-full/smali_classes10/p/dz1.smali-1460-    .line 680
/tmp/spotify-full/smali_classes10/p/dz1.smali-1461-    .line 681
/tmp/spotify-full/smali_classes10/p/dz1.smali-1462-    .line 682
/tmp/spotify-full/smali_classes10/p/dz1.smali-1463-    move-result v13
/tmp/spotify-full/smali_classes10/p/dz1.smali-1464-
/tmp/spotify-full/smali_classes10/p/dz1.smali-1465-    .line 683
/tmp/spotify-full/smali_classes10/p/dz1.smali-1466-    const-string v5, "android-ad-on-app-open:skip_button_enabled"
/tmp/spotify-full/smali_classes10/p/dz1.smali-1467-
/tmp/spotify-full/smali_classes10/p/dz1.smali-1468-    .line 684
/tmp/spotify-full/smali_classes10/p/dz1.smali-1469-    .line 685
/tmp/spotify-full/smali_classes10/p/dz1.smali-1470-    invoke-interface {v1, v5, v6}, Lp/uys0;->c(Ljava/lang/String;Z)Z
/tmp/spotify-full/smali_classes10/p/dz1.smali-1471-
/tmp/spotify-full/smali_classes10/p/dz1.smali-1472-    .line 686
/tmp/spotify-full/smali_classes10/p/dz1.smali-1473-    .line 687
/tmp/spotify-full/smali_classes10/p/dz1.smali-1474-    .line 688
/tmp/spotify-full/smali_classes10/p/dz1.smali-1475-    move-result v14
/tmp/spotify-full/smali_classes10/p/dz1.smali-1476-
/tmp/spotify-full/smali_classes10/p/dz1.smali-1477-    .line 689
/tmp/spotify-full/smali_classes10/p/dz1.smali:1478:    const-string v5, "android-ad-on-app-open:skippable_ad_delay_ms"
/tmp/spotify-full/smali_classes10/p/dz1.smali-1479-
/tmp/spotify-full/smali_classes10/p/dz1.smali-1480-    .line 690
/tmp/spotify-full/smali_classes10/p/dz1.smali-1481-    .line 691
/tmp/spotify-full/smali_classes10/p/dz1.smali-1482-    const/16 v15, 0xbb8
/tmp/spotify-full/smali_classes10/p/dz1.smali-1483-
/tmp/spotify-full/smali_classes10/p/dz1.smali-1484-    .line 692
/tmp/spotify-full/smali_classes10/p/dz1.smali-1485-    .line 693
/tmp/spotify-full/smali_classes10/p/dz1.smali-1486-    invoke-interface {v1, v3, v4, v15, v5}, Lp/uys0;->b(IIILjava/lang/String;)I
/tmp/spotify-full/smali_classes10/p/dz1.smali-1487-
/tmp/spotify-full/smali_classes10/p/dz1.smali-1488-    .line 694
/tmp/spotify-full/smali_classes10/p/dz1.smali-1489-    .line 695
/tmp/spotify-full/smali_classes10/p/dz1.smali-1490-    .line 696
/tmp/spotify-full/smali_classes10/p/dz1.smali-1491-    move-result v15
/tmp/spotify-full/smali_classes10/p/dz1.smali-1492-
/tmp/spotify-full/smali_classes10/p/dz1.smali-1493-    .line 697
/tmp/spotify-full/smali_classes10/p/dz1.smali-1494-    const-string v5, "android-ad-on-app-open:testing_dismiss_ad_when_video_finishes"
/tmp/spotify-full/smali_classes10/p/dz1.smali-1495-
/tmp/spotify-full/smali_classes10/p/dz1.smali-1496-    .line 698
/tmp/spotify-full/smali_classes10/p/dz1.smali-1497-    .line 699
/tmp/spotify-full/smali_classes10/p/dz1.smali-1498-    invoke-interface {v1, v5, v6}, Lp/uys0;->c(Ljava/lang/String;Z)Z
/tmp/spotify-full/smali_classes10/p/dz1.smali-1499-
/tmp/spotify-full/smali_classes10/p/dz1.smali-1500-    .line 700
/tmp/spotify-full/smali_classes10/p/dz1.smali-1501-    .line 701
/tmp/spotify-full/smali_classes10/p/dz1.smali-1502-    .line 702
/tmp/spotify-full/smali_classes10/p/dz1.smali-1503-    move-result v16
/tmp/spotify-full/smali_classes10/p/dz1.smali-1504-
/tmp/spotify-full/smali_classes10/p/dz1.smali-1505-    .line 703
/tmp/spotify-full/smali_classes10/p/dz1.smali-1506-    const-string v5, "android-ad-on-app-open:testing_frequency_capping_enabled"
/tmp/spotify-full/smali_classes10/p/dz1.smali-1507-
/tmp/spotify-full/smali_classes10/p/dz1.smali-1508-    .line 704
/tmp/spotify-full/smali_classes10/p/dz1.smali-1509-    .line 705
/tmp/spotify-full/smali_classes10/p/dz1.smali-1510-    invoke-interface {v1, v5, v6}, Lp/uys0;->c(Ljava/lang/String;Z)Z
/tmp/spotify-full/smali_classes10/p/dz1.smali-1511-
/tmp/spotify-full/smali_classes10/p/dz1.smali-1512-    .line 706
/tmp/spotify-full/smali_classes10/p/dz1.smali-1513-    .line 707
/tmp/spotify-full/smali_classes10/p/dz1.smali-1514-    .line 708
/tmp/spotify-full/smali_classes10/p/dz1.smali-1515-    move-result v17
/tmp/spotify-full/smali_classes10/p/dz1.smali-1516-
/tmp/spotify-full/smali_classes10/p/dz1.smali-1517-    .line 709
/tmp/spotify-full/smali_classes10/p/dz1.smali-1518-    const-string v5, "android-ad-on-app-open:video_loading_timeout_ms"
/tmp/spotify-full/smali_classes10/p/dz1.smali-1519-
/tmp/spotify-full/smali_classes10/p/dz1.smali-1520-    .line 710
/tmp/spotify-full/smali_classes10/p/dz1.smali-1521-    .line 711
/tmp/spotify-full/smali_classes10/p/dz1.smali-1522-    invoke-interface {v1, v3, v4, v2, v5}, Lp/uys0;->b(IIILjava/lang/String;)I
/tmp/spotify-full/smali_classes10/p/dz1.smali-1523-
/tmp/spotify-full/smali_classes10/p/dz1.smali-1524-    .line 712
/tmp/spotify-full/smali_classes10/p/dz1.smali-1525-    .line 713
/tmp/spotify-full/smali_classes10/p/dz1.smali-1526-    .line 714
/tmp/spotify-full/smali_classes10/p/dz1.smali-1527-    move-result v18
/tmp/spotify-full/smali_classes10/p/dz1.smali-1528-
/tmp/spotify-full/smali_classes10/p/dz1.smali-1529-    .line 715
/tmp/spotify-full/smali_classes10/p/dz1.smali-1530-    new-instance v6, Lp/yt3;
/tmp/spotify-full/smali_classes10/p/dz1.smali-1531-
/tmp/spotify-full/smali_classes10/p/dz1.smali-1532-    .line 716
/tmp/spotify-full/smali_classes10/p/dz1.smali-1533-    .line 717
/tmp/spotify-full/smali_classes10/p/dz1.smali-1534-    const/16 v19, 0x0
/tmp/spotify-full/smali_classes10/p/dz1.smali-1535-
/tmp/spotify-full/smali_classes10/p/dz1.smali-1536-    .line 718
/tmp/spotify-full/smali_classes10/p/dz1.smali-1537-    .line 719
/tmp/spotify-full/smali_classes10/p/dz1.smali-1538-    invoke-direct/range {v6 .. v19}, Lp/yt3;-><init>(IZIZZZZZIZZILp/bji;)V
/tmp/spotify-full/smali_classes10/p/dz1.smali-1539-
/tmp/spotify-full/smali_classes10/p/dz1.smali-1540-    .line 720
/tmp/spotify-full/smali_classes10/p/dz1.smali-1541-    .line 721
/tmp/spotify-full/smali_classes10/p/dz1.smali-1542-    .line 722
/tmp/spotify-full/smali_classes10/p/dz1.smali-1543-    return-object v6
/tmp/spotify-full/smali_classes10/p/dz1.smali-1544-
/tmp/spotify-full/smali_classes10/p/dz1.smali-1545-    .line 723
/tmp/spotify-full/smali_classes10/p/dz1.smali-1546-    :pswitch_16
/tmp/spotify-full/smali_classes10/p/dz1.smali-1547-    const-string v2, "android-accountswitching:enable_account_switching"
/tmp/spotify-full/smali_classes10/p/dz1.smali-1548-
--
/tmp/spotify-full/smali_classes2/p/yt3.smali-1604-    .line 99
/tmp/spotify-full/smali_classes2/p/yt3.smali-1605-    .line 100
/tmp/spotify-full/smali_classes2/p/yt3.smali-1606-    invoke-virtual/range {p0 .. p0}, Lp/yt3;->i()Z
/tmp/spotify-full/smali_classes2/p/yt3.smali-1607-
/tmp/spotify-full/smali_classes2/p/yt3.smali-1608-    .line 101
/tmp/spotify-full/smali_classes2/p/yt3.smali-1609-    .line 102
/tmp/spotify-full/smali_classes2/p/yt3.smali-1610-    .line 103
/tmp/spotify-full/smali_classes2/p/yt3.smali-1611-    move-result v10
/tmp/spotify-full/smali_classes2/p/yt3.smali-1612-
/tmp/spotify-full/smali_classes2/p/yt3.smali-1613-    .line 104
/tmp/spotify-full/smali_classes2/p/yt3.smali-1614-    invoke-direct {v7, v9, v4, v10}, Lp/k8a;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V
/tmp/spotify-full/smali_classes2/p/yt3.smali-1615-
/tmp/spotify-full/smali_classes2/p/yt3.smali-1616-    .line 105
/tmp/spotify-full/smali_classes2/p/yt3.smali-1617-    .line 106
/tmp/spotify-full/smali_classes2/p/yt3.smali-1618-    .line 107
/tmp/spotify-full/smali_classes2/p/yt3.smali-1619-    new-instance v11, Lp/k8a;
/tmp/spotify-full/smali_classes2/p/yt3.smali-1620-
/tmp/spotify-full/smali_classes2/p/yt3.smali-1621-    .line 108
/tmp/spotify-full/smali_classes2/p/yt3.smali-1622-    .line 109
/tmp/spotify-full/smali_classes2/p/yt3.smali-1623-    invoke-virtual/range {p0 .. p0}, Lp/yt3;->j()I
/tmp/spotify-full/smali_classes2/p/yt3.smali-1624-
/tmp/spotify-full/smali_classes2/p/yt3.smali-1625-    .line 110
/tmp/spotify-full/smali_classes2/p/yt3.smali-1626-    .line 111
/tmp/spotify-full/smali_classes2/p/yt3.smali-1627-    .line 112
/tmp/spotify-full/smali_classes2/p/yt3.smali-1628-    move-result v14
/tmp/spotify-full/smali_classes2/p/yt3.smali-1629-
/tmp/spotify-full/smali_classes2/p/yt3.smali-1630-    .line 113
/tmp/spotify-full/smali_classes2/p/yt3.smali-1631-    const/4 v15, 0x0
/tmp/spotify-full/smali_classes2/p/yt3.smali-1632-
/tmp/spotify-full/smali_classes2/p/yt3.smali-1633-    .line 114
/tmp/spotify-full/smali_classes2/p/yt3.smali-1634-    const v16, 0x7fffffff
/tmp/spotify-full/smali_classes2/p/yt3.smali-1635-
/tmp/spotify-full/smali_classes2/p/yt3.smali-1636-    .line 115
/tmp/spotify-full/smali_classes2/p/yt3.smali-1637-    .line 116
/tmp/spotify-full/smali_classes2/p/yt3.smali-1638-    .line 117
/tmp/spotify-full/smali_classes2/p/yt3.smali:1639:    const-string v12, "skippable_ad_delay_ms"
/tmp/spotify-full/smali_classes2/p/yt3.smali-1640-
/tmp/spotify-full/smali_classes2/p/yt3.smali-1641-    .line 118
/tmp/spotify-full/smali_classes2/p/yt3.smali-1642-    .line 119
/tmp/spotify-full/smali_classes2/p/yt3.smali-1643-    const-string v13, "android-ad-on-app-open"
/tmp/spotify-full/smali_classes2/p/yt3.smali-1644-
/tmp/spotify-full/smali_classes2/p/yt3.smali-1645-    .line 120
/tmp/spotify-full/smali_classes2/p/yt3.smali-1646-    .line 121
/tmp/spotify-full/smali_classes2/p/yt3.smali-1647-    invoke-direct/range {v11 .. v16}, Lp/k8a;-><init>(Ljava/lang/String;Ljava/lang/String;III)V
/tmp/spotify-full/smali_classes2/p/yt3.smali-1648-
/tmp/spotify-full/smali_classes2/p/yt3.smali-1649-    .line 122
/tmp/spotify-full/smali_classes2/p/yt3.smali-1650-    .line 123
/tmp/spotify-full/smali_classes2/p/yt3.smali-1651-    .line 124
/tmp/spotify-full/smali_classes2/p/yt3.smali-1652-    new-instance v9, Lp/k8a;
/tmp/spotify-full/smali_classes2/p/yt3.smali-1653-
/tmp/spotify-full/smali_classes2/p/yt3.smali-1654-    .line 125
/tmp/spotify-full/smali_classes2/p/yt3.smali-1655-    .line 126
/tmp/spotify-full/smali_classes2/p/yt3.smali-1656-    const-string v10, "testing_dismiss_ad_when_video_finishes"
/tmp/spotify-full/smali_classes2/p/yt3.smali-1657-
/tmp/spotify-full/smali_classes2/p/yt3.smali-1658-    .line 127
/tmp/spotify-full/smali_classes2/p/yt3.smali-1659-    .line 128
/tmp/spotify-full/smali_classes2/p/yt3.smali-1660-    invoke-virtual/range {p0 .. p0}, Lp/yt3;->k()Z
/tmp/spotify-full/smali_classes2/p/yt3.smali-1661-
/tmp/spotify-full/smali_classes2/p/yt3.smali-1662-    .line 129
/tmp/spotify-full/smali_classes2/p/yt3.smali-1663-    .line 130
/tmp/spotify-full/smali_classes2/p/yt3.smali-1664-    .line 131
/tmp/spotify-full/smali_classes2/p/yt3.smali-1665-    move-result v12
/tmp/spotify-full/smali_classes2/p/yt3.smali-1666-
/tmp/spotify-full/smali_classes2/p/yt3.smali-1667-    .line 132
/tmp/spotify-full/smali_classes2/p/yt3.smali-1668-    invoke-direct {v9, v10, v4, v12}, Lp/k8a;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V
/tmp/spotify-full/smali_classes2/p/yt3.smali-1669-
/tmp/spotify-full/smali_classes2/p/yt3.smali-1670-    .line 133
/tmp/spotify-full/smali_classes2/p/yt3.smali-1671-    .line 134
/tmp/spotify-full/smali_classes2/p/yt3.smali-1672-    .line 135
/tmp/spotify-full/smali_classes2/p/yt3.smali-1673-    new-instance v10, Lp/k8a;
/tmp/spotify-full/smali_classes2/p/yt3.smali-1674-
/tmp/spotify-full/smali_classes2/p/yt3.smali-1675-    .line 136
/tmp/spotify-full/smali_classes2/p/yt3.smali-1676-    .line 137
/tmp/spotify-full/smali_classes2/p/yt3.smali-1677-    const-string v12, "testing_frequency_capping_enabled"
/tmp/spotify-full/smali_classes2/p/yt3.smali-1678-
/tmp/spotify-full/smali_classes2/p/yt3.smali-1679-    .line 138
/tmp/spotify-full/smali_classes2/p/yt3.smali-1680-    .line 139
/tmp/spotify-full/smali_classes2/p/yt3.smali-1681-    invoke-virtual/range {p0 .. p0}, Lp/yt3;->l()Z
/tmp/spotify-full/smali_classes2/p/yt3.smali-1682-
/tmp/spotify-full/smali_classes2/p/yt3.smali-1683-    .line 140
/tmp/spotify-full/smali_classes2/p/yt3.smali-1684-    .line 141
/tmp/spotify-full/smali_classes2/p/yt3.smali-1685-    .line 142
/tmp/spotify-full/smali_classes2/p/yt3.smali-1686-    move-result v13
/tmp/spotify-full/smali_classes2/p/yt3.smali-1687-
/tmp/spotify-full/smali_classes2/p/yt3.smali-1688-    .line 143
/tmp/spotify-full/smali_classes2/p/yt3.smali-1689-    invoke-direct {v10, v12, v4, v13}, Lp/k8a;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V
/tmp/spotify-full/smali_classes2/p/yt3.smali-1690-
/tmp/spotify-full/smali_classes2/p/yt3.smali-1691-    .line 144
/tmp/spotify-full/smali_classes2/p/yt3.smali-1692-    .line 145
/tmp/spotify-full/smali_classes2/p/yt3.smali-1693-    .line 146
/tmp/spotify-full/smali_classes2/p/yt3.smali-1694-    new-instance v14, Lp/k8a;
/tmp/spotify-full/smali_classes2/p/yt3.smali-1695-
/tmp/spotify-full/smali_classes2/p/yt3.smali-1696-    .line 147
/tmp/spotify-full/smali_classes2/p/yt3.smali-1697-    .line 148
/tmp/spotify-full/smali_classes2/p/yt3.smali-1698-    invoke-virtual/range {p0 .. p0}, Lp/yt3;->m()I
/tmp/spotify-full/smali_classes2/p/yt3.smali-1699-
/tmp/spotify-full/smali_classes2/p/yt3.smali-1700-    .line 149
/tmp/spotify-full/smali_classes2/p/yt3.smali-1701-    .line 150
/tmp/spotify-full/smali_classes2/p/yt3.smali-1702-    .line 151
/tmp/spotify-full/smali_classes2/p/yt3.smali-1703-    move-result v17
/tmp/spotify-full/smali_classes2/p/yt3.smali-1704-
/tmp/spotify-full/smali_classes2/p/yt3.smali-1705-    .line 152
/tmp/spotify-full/smali_classes2/p/yt3.smali-1706-    const/16 v18, 0x0
/tmp/spotify-full/smali_classes2/p/yt3.smali-1707-
/tmp/spotify-full/smali_classes2/p/yt3.smali-1708-    .line 153
/tmp/spotify-full/smali_classes2/p/yt3.smali-1709-    .line 154
--
/tmp/spotify-full/smali_classes2/p/jo20.smali-609-    invoke-direct {v4, v3}, Lp/t40;-><init>(Ljava/lang/String;)V
/tmp/spotify-full/smali_classes2/p/jo20.smali-610-
/tmp/spotify-full/smali_classes2/p/jo20.smali-611-    .line 113
/tmp/spotify-full/smali_classes2/p/jo20.smali-612-    .line 114
/tmp/spotify-full/smali_classes2/p/jo20.smali-613-    .line 115
/tmp/spotify-full/smali_classes2/p/jo20.smali-614-    invoke-direct {v1, v4, v0}, Lp/peu;-><init>(Lp/mqg1;Lp/eh00;)V
/tmp/spotify-full/smali_classes2/p/jo20.smali-615-
/tmp/spotify-full/smali_classes2/p/jo20.smali-616-    .line 116
/tmp/spotify-full/smali_classes2/p/jo20.smali-617-    .line 117
/tmp/spotify-full/smali_classes2/p/jo20.smali-618-    .line 118
/tmp/spotify-full/smali_classes2/p/jo20.smali-619-    new-instance v4, Lp/tgu;
/tmp/spotify-full/smali_classes2/p/jo20.smali-620-
/tmp/spotify-full/smali_classes2/p/jo20.smali-621-    .line 119
/tmp/spotify-full/smali_classes2/p/jo20.smali-622-    .line 120
/tmp/spotify-full/smali_classes2/p/jo20.smali-623-    move/from16 v0, p2
/tmp/spotify-full/smali_classes2/p/jo20.smali-624-
/tmp/spotify-full/smali_classes2/p/jo20.smali-625-    .line 121
/tmp/spotify-full/smali_classes2/p/jo20.smali-626-    .line 122
/tmp/spotify-full/smali_classes2/p/jo20.smali-627-    invoke-direct {v4, v0}, Lp/tgu;-><init>(I)V
/tmp/spotify-full/smali_classes2/p/jo20.smali-628-
/tmp/spotify-full/smali_classes2/p/jo20.smali-629-    .line 123
/tmp/spotify-full/smali_classes2/p/jo20.smali-630-    .line 124
/tmp/spotify-full/smali_classes2/p/jo20.smali-631-    .line 125
/tmp/spotify-full/smali_classes2/p/jo20.smali-632-    invoke-static {v14}, Lp/vvx;->r(Lp/xq00;)Lp/rgu;
/tmp/spotify-full/smali_classes2/p/jo20.smali-633-
/tmp/spotify-full/smali_classes2/p/jo20.smali-634-    .line 126
/tmp/spotify-full/smali_classes2/p/jo20.smali-635-    .line 127
/tmp/spotify-full/smali_classes2/p/jo20.smali-636-    .line 128
/tmp/spotify-full/smali_classes2/p/jo20.smali-637-    move-result-object v7
/tmp/spotify-full/smali_classes2/p/jo20.smali-638-
/tmp/spotify-full/smali_classes2/p/jo20.smali-639-    .line 129
/tmp/spotify-full/smali_classes2/p/jo20.smali-640-    sget-object v3, Lp/cxh0;->a:Lp/cxh0;
/tmp/spotify-full/smali_classes2/p/jo20.smali-641-
/tmp/spotify-full/smali_classes2/p/jo20.smali-642-    .line 130
/tmp/spotify-full/smali_classes2/p/jo20.smali-643-    .line 131
/tmp/spotify-full/smali_classes2/p/jo20.smali:644:    const-string v5, "skip_ad_element_button"
/tmp/spotify-full/smali_classes2/p/jo20.smali-645-
/tmp/spotify-full/smali_classes2/p/jo20.smali-646-    .line 132
/tmp/spotify-full/smali_classes2/p/jo20.smali-647-    .line 133
/tmp/spotify-full/smali_classes2/p/jo20.smali-648-    invoke-static {v5, v3}, Lp/epv0;->I(Ljava/lang/String;Lp/fxh0;)Lp/fxh0;
/tmp/spotify-full/smali_classes2/p/jo20.smali-649-
/tmp/spotify-full/smali_classes2/p/jo20.smali-650-    .line 134
/tmp/spotify-full/smali_classes2/p/jo20.smali-651-    .line 135
/tmp/spotify-full/smali_classes2/p/jo20.smali-652-    .line 136
/tmp/spotify-full/smali_classes2/p/jo20.smali-653-    move-result-object v5
/tmp/spotify-full/smali_classes2/p/jo20.smali-654-
/tmp/spotify-full/smali_classes2/p/jo20.smali-655-    .line 137
/tmp/spotify-full/smali_classes2/p/jo20.smali-656-    sget-object v11, Lp/h9h;->a:Lp/fyf;
/tmp/spotify-full/smali_classes2/p/jo20.smali-657-
/tmp/spotify-full/smali_classes2/p/jo20.smali-658-    .line 138
/tmp/spotify-full/smali_classes2/p/jo20.smali-659-    .line 139
/tmp/spotify-full/smali_classes2/p/jo20.smali-660-    sget-object v13, Lp/h9h;->b:Lp/fyf;
/tmp/spotify-full/smali_classes2/p/jo20.smali-661-
/tmp/spotify-full/smali_classes2/p/jo20.smali-662-    .line 140
/tmp/spotify-full/smali_classes2/p/jo20.smali-663-    .line 141
/tmp/spotify-full/smali_classes2/p/jo20.smali-664-    const/16 v16, 0x30
/tmp/spotify-full/smali_classes2/p/jo20.smali-665-
/tmp/spotify-full/smali_classes2/p/jo20.smali-666-    .line 142
/tmp/spotify-full/smali_classes2/p/jo20.smali-667-    .line 143
/tmp/spotify-full/smali_classes2/p/jo20.smali-668-    const/16 v17, 0x5d8
/tmp/spotify-full/smali_classes2/p/jo20.smali-669-
/tmp/spotify-full/smali_classes2/p/jo20.smali-670-    .line 144
/tmp/spotify-full/smali_classes2/p/jo20.smali-671-    .line 145
/tmp/spotify-full/smali_classes2/p/jo20.smali-672-    const/4 v6, 0x0
/tmp/spotify-full/smali_classes2/p/jo20.smali-673-
/tmp/spotify-full/smali_classes2/p/jo20.smali-674-    .line 146
/tmp/spotify-full/smali_classes2/p/jo20.smali-675-    const/4 v8, 0x0
/tmp/spotify-full/smali_classes2/p/jo20.smali-676-
/tmp/spotify-full/smali_classes2/p/jo20.smali-677-    .line 147
/tmp/spotify-full/smali_classes2/p/jo20.smali-678-    const/4 v9, 0x0
/tmp/spotify-full/smali_classes2/p/jo20.smali-679-
/tmp/spotify-full/smali_classes2/p/jo20.smali-680-    .line 148
/tmp/spotify-full/smali_classes2/p/jo20.smali-681-    const/4 v10, 0x0
/tmp/spotify-full/smali_classes2/p/jo20.smali-682-
/tmp/spotify-full/smali_classes2/p/jo20.smali-683-    .line 149
/tmp/spotify-full/smali_classes2/p/jo20.smali-684-    const/4 v12, 0x0
/tmp/spotify-full/smali_classes2/p/jo20.smali-685-
/tmp/spotify-full/smali_classes2/p/jo20.smali-686-    .line 150
/tmp/spotify-full/smali_classes2/p/jo20.smali-687-    const/high16 v15, 0x30000000
/tmp/spotify-full/smali_classes2/p/jo20.smali-688-
/tmp/spotify-full/smali_classes2/p/jo20.smali-689-    .line 151
/tmp/spotify-full/smali_classes2/p/jo20.smali-690-    .line 152
/tmp/spotify-full/smali_classes2/p/jo20.smali-691-    move-object v3, v1
/tmp/spotify-full/smali_classes2/p/jo20.smali-692-
/tmp/spotify-full/smali_classes2/p/jo20.smali-693-    .line 153
/tmp/spotify-full/smali_classes2/p/jo20.smali-694-    invoke-static/range {v3 .. v17}, Lp/dyu;->c(Lp/peu;Lp/gf;Lp/fxh0;Lp/udu;Lp/rgu;Lp/f4m0;Lp/voi0;Lp/ho40;Lp/th00;Lp/th00;Lp/th00;Lp/xq00;III)V
/tmp/spotify-full/smali_classes2/p/jo20.smali-695-
/tmp/spotify-full/smali_classes2/p/jo20.smali-696-    .line 154
/tmp/spotify-full/smali_classes2/p/jo20.smali-697-    .line 155
/tmp/spotify-full/smali_classes2/p/jo20.smali-698-    .line 156
/tmp/spotify-full/smali_classes2/p/jo20.smali-699-    goto :goto_4
/tmp/spotify-full/smali_classes2/p/jo20.smali-700-
/tmp/spotify-full/smali_classes2/p/jo20.smali-701-    .line 157
/tmp/spotify-full/smali_classes2/p/jo20.smali-702-    :cond_8
/tmp/spotify-full/smali_classes2/p/jo20.smali-703-    new-instance v0, Ljava/lang/IllegalArgumentException;
/tmp/spotify-full/smali_classes2/p/jo20.smali-704-
/tmp/spotify-full/smali_classes2/p/jo20.smali-705-    .line 158
/tmp/spotify-full/smali_classes2/p/jo20.smali-706-    .line 159
/tmp/spotify-full/smali_classes2/p/jo20.smali-707-    const-string v1, "Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions."
/tmp/spotify-full/smali_classes2/p/jo20.smali-708-
/tmp/spotify-full/smali_classes2/p/jo20.smali-709-    .line 160
/tmp/spotify-full/smali_classes2/p/jo20.smali-710-    .line 161
/tmp/spotify-full/smali_classes2/p/jo20.smali-711-    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
/tmp/spotify-full/smali_classes2/p/jo20.smali-712-
/tmp/spotify-full/smali_classes2/p/jo20.smali-713-    .line 162
/tmp/spotify-full/smali_classes2/p/jo20.smali-714-    .line 163
--
/tmp/spotify-full/smali_classes2/p/jo20.smali-1260-    .line 118
/tmp/spotify-full/smali_classes2/p/jo20.smali-1261-    move-result-object v5
/tmp/spotify-full/smali_classes2/p/jo20.smali-1262-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1263-    .line 119
/tmp/spotify-full/smali_classes2/p/jo20.smali-1264-    invoke-static {v0}, Lp/leu;->b(Lp/xq00;)Lp/jxu;
/tmp/spotify-full/smali_classes2/p/jo20.smali-1265-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1266-    .line 120
/tmp/spotify-full/smali_classes2/p/jo20.smali-1267-    .line 121
/tmp/spotify-full/smali_classes2/p/jo20.smali-1268-    .line 122
/tmp/spotify-full/smali_classes2/p/jo20.smali-1269-    move-result-object v6
/tmp/spotify-full/smali_classes2/p/jo20.smali-1270-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1271-    .line 123
/tmp/spotify-full/smali_classes2/p/jo20.smali-1272-    iget-object v6, v6, Lp/jxu;->b:Lp/txu;
/tmp/spotify-full/smali_classes2/p/jo20.smali-1273-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1274-    .line 124
/tmp/spotify-full/smali_classes2/p/jo20.smali-1275-    .line 125
/tmp/spotify-full/smali_classes2/p/jo20.smali-1276-    iget v6, v6, Lp/txu;->e:F
/tmp/spotify-full/smali_classes2/p/jo20.smali-1277-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1278-    .line 126
/tmp/spotify-full/smali_classes2/p/jo20.smali-1279-    .line 127
/tmp/spotify-full/smali_classes2/p/jo20.smali-1280-    const/4 v7, 0x0
/tmp/spotify-full/smali_classes2/p/jo20.smali-1281-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1282-    .line 128
/tmp/spotify-full/smali_classes2/p/jo20.smali-1283-    invoke-static {v6, v7, v3}, Lp/zsf1;->h(FFI)Lp/j4m0;
/tmp/spotify-full/smali_classes2/p/jo20.smali-1284-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1285-    .line 129
/tmp/spotify-full/smali_classes2/p/jo20.smali-1286-    .line 130
/tmp/spotify-full/smali_classes2/p/jo20.smali-1287-    .line 131
/tmp/spotify-full/smali_classes2/p/jo20.smali-1288-    move-result-object v15
/tmp/spotify-full/smali_classes2/p/jo20.smali-1289-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1290-    .line 132
/tmp/spotify-full/smali_classes2/p/jo20.smali-1291-    sget-object v3, Lp/cxh0;->a:Lp/cxh0;
/tmp/spotify-full/smali_classes2/p/jo20.smali-1292-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1293-    .line 133
/tmp/spotify-full/smali_classes2/p/jo20.smali-1294-    .line 134
/tmp/spotify-full/smali_classes2/p/jo20.smali:1295:    const-string v6, "skip_ad_element_button"
/tmp/spotify-full/smali_classes2/p/jo20.smali-1296-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1297-    .line 135
/tmp/spotify-full/smali_classes2/p/jo20.smali-1298-    .line 136
/tmp/spotify-full/smali_classes2/p/jo20.smali-1299-    invoke-static {v6, v3}, Lp/epv0;->I(Ljava/lang/String;Lp/fxh0;)Lp/fxh0;
/tmp/spotify-full/smali_classes2/p/jo20.smali-1300-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1301-    .line 137
/tmp/spotify-full/smali_classes2/p/jo20.smali-1302-    .line 138
/tmp/spotify-full/smali_classes2/p/jo20.smali-1303-    .line 139
/tmp/spotify-full/smali_classes2/p/jo20.smali-1304-    move-result-object v6
/tmp/spotify-full/smali_classes2/p/jo20.smali-1305-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1306-    .line 140
/tmp/spotify-full/smali_classes2/p/jo20.smali-1307-    sget-object v10, Lp/h9h;->c:Lp/fyf;
/tmp/spotify-full/smali_classes2/p/jo20.smali-1308-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1309-    .line 141
/tmp/spotify-full/smali_classes2/p/jo20.smali-1310-    .line 142
/tmp/spotify-full/smali_classes2/p/jo20.smali-1311-    new-instance v3, Lp/od21;
/tmp/spotify-full/smali_classes2/p/jo20.smali-1312-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1313-    .line 143
/tmp/spotify-full/smali_classes2/p/jo20.smali-1314-    .line 144
/tmp/spotify-full/smali_classes2/p/jo20.smali-1315-    const/4 v7, 0x1
/tmp/spotify-full/smali_classes2/p/jo20.smali-1316-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1317-    .line 145
/tmp/spotify-full/smali_classes2/p/jo20.smali-1318-    invoke-direct {v3, v8, v7}, Lp/od21;-><init>(Ljava/lang/String;I)V
/tmp/spotify-full/smali_classes2/p/jo20.smali-1319-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1320-    .line 146
/tmp/spotify-full/smali_classes2/p/jo20.smali-1321-    .line 147
/tmp/spotify-full/smali_classes2/p/jo20.smali-1322-    .line 148
/tmp/spotify-full/smali_classes2/p/jo20.smali-1323-    const v7, -0x4bdb176b
/tmp/spotify-full/smali_classes2/p/jo20.smali-1324-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1325-    .line 149
/tmp/spotify-full/smali_classes2/p/jo20.smali-1326-    .line 150
/tmp/spotify-full/smali_classes2/p/jo20.smali-1327-    .line 151
/tmp/spotify-full/smali_classes2/p/jo20.smali-1328-    invoke-static {v7, v3, v0}, Lp/rkk;->x(ILp/ai00;Lp/xq00;)Lp/fyf;
/tmp/spotify-full/smali_classes2/p/jo20.smali-1329-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1330-    .line 152
/tmp/spotify-full/smali_classes2/p/jo20.smali-1331-    .line 153
/tmp/spotify-full/smali_classes2/p/jo20.smali-1332-    .line 154
/tmp/spotify-full/smali_classes2/p/jo20.smali-1333-    move-result-object v16
/tmp/spotify-full/smali_classes2/p/jo20.smali-1334-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1335-    .line 155
/tmp/spotify-full/smali_classes2/p/jo20.smali-1336-    const/16 v20, 0xf50
/tmp/spotify-full/smali_classes2/p/jo20.smali-1337-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1338-    .line 156
/tmp/spotify-full/smali_classes2/p/jo20.smali-1339-    .line 157
/tmp/spotify-full/smali_classes2/p/jo20.smali-1340-    const/4 v7, 0x0
/tmp/spotify-full/smali_classes2/p/jo20.smali-1341-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1342-    .line 158
/tmp/spotify-full/smali_classes2/p/jo20.smali-1343-    const/4 v9, 0x0
/tmp/spotify-full/smali_classes2/p/jo20.smali-1344-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1345-    .line 159
/tmp/spotify-full/smali_classes2/p/jo20.smali-1346-    const/4 v11, 0x0
/tmp/spotify-full/smali_classes2/p/jo20.smali-1347-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1348-    .line 160
/tmp/spotify-full/smali_classes2/p/jo20.smali-1349-    const/4 v12, 0x0
/tmp/spotify-full/smali_classes2/p/jo20.smali-1350-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1351-    .line 161
/tmp/spotify-full/smali_classes2/p/jo20.smali-1352-    const/4 v13, 0x0
/tmp/spotify-full/smali_classes2/p/jo20.smali-1353-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1354-    .line 162
/tmp/spotify-full/smali_classes2/p/jo20.smali-1355-    const/4 v14, 0x0
/tmp/spotify-full/smali_classes2/p/jo20.smali-1356-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1357-    .line 163
/tmp/spotify-full/smali_classes2/p/jo20.smali-1358-    const/high16 v18, 0xc00000
/tmp/spotify-full/smali_classes2/p/jo20.smali-1359-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1360-    .line 164
/tmp/spotify-full/smali_classes2/p/jo20.smali-1361-    .line 165
/tmp/spotify-full/smali_classes2/p/jo20.smali-1362-    const/16 v19, 0xc00
/tmp/spotify-full/smali_classes2/p/jo20.smali-1363-
/tmp/spotify-full/smali_classes2/p/jo20.smali-1364-    .line 166
/tmp/spotify-full/smali_classes2/p/jo20.smali-1365-    .line 167
--
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-32-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-33-.field public static final ACTION_ARGUMENT_QUERY:Ljava/lang/String; = "android.support.v4.media.session.action.ARGUMENT_QUERY"
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-34-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-35-.field public static final ACTION_ARGUMENT_RATING:Ljava/lang/String; = "android.support.v4.media.session.action.ARGUMENT_RATING"
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-36-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-37-.field public static final ACTION_ARGUMENT_REPEAT_MODE:Ljava/lang/String; = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-38-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-39-.field public static final ACTION_ARGUMENT_SHUFFLE_MODE:Ljava/lang/String; = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-40-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-41-.field public static final ACTION_ARGUMENT_URI:Ljava/lang/String; = "android.support.v4.media.session.action.ARGUMENT_URI"
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-42-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-43-.field public static final ACTION_FLAG_AS_INAPPROPRIATE:Ljava/lang/String; = "android.support.v4.media.session.action.FLAG_AS_INAPPROPRIATE"
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-44-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-45-.field public static final ACTION_FOLLOW:Ljava/lang/String; = "android.support.v4.media.session.action.FOLLOW"
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-46-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-47-.field public static final ACTION_PLAY_FROM_URI:Ljava/lang/String; = "android.support.v4.media.session.action.PLAY_FROM_URI"
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-48-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-49-.field public static final ACTION_PREPARE:Ljava/lang/String; = "android.support.v4.media.session.action.PREPARE"
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-50-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-51-.field public static final ACTION_PREPARE_FROM_MEDIA_ID:Ljava/lang/String; = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID"
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-52-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-53-.field public static final ACTION_PREPARE_FROM_SEARCH:Ljava/lang/String; = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH"
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-54-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-55-.field public static final ACTION_PREPARE_FROM_URI:Ljava/lang/String; = "android.support.v4.media.session.action.PREPARE_FROM_URI"
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-56-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-57-.field public static final ACTION_SET_CAPTIONING_ENABLED:Ljava/lang/String; = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED"
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-58-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-59-.field public static final ACTION_SET_PLAYBACK_SPEED:Ljava/lang/String; = "android.support.v4.media.session.action.SET_PLAYBACK_SPEED"
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-60-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-61-.field public static final ACTION_SET_RATING:Ljava/lang/String; = "android.support.v4.media.session.action.SET_RATING"
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-62-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-63-.field public static final ACTION_SET_REPEAT_MODE:Ljava/lang/String; = "android.support.v4.media.session.action.SET_REPEAT_MODE"
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-64-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-65-.field public static final ACTION_SET_SHUFFLE_MODE:Ljava/lang/String; = "android.support.v4.media.session.action.SET_SHUFFLE_MODE"
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-66-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali:67:.field public static final ACTION_SKIP_AD:Ljava/lang/String; = "android.support.v4.media.session.action.SKIP_AD"
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-68-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-69-.field public static final ACTION_UNFOLLOW:Ljava/lang/String; = "android.support.v4.media.session.action.UNFOLLOW"
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-70-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-71-.field public static final ARGUMENT_MEDIA_ATTRIBUTE:Ljava/lang/String; = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE"
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-72-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-73-.field public static final ARGUMENT_MEDIA_ATTRIBUTE_VALUE:Ljava/lang/String; = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE_VALUE"
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-74-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-75-.field public static final FLAG_HANDLES_MEDIA_BUTTONS:I = 0x1
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-76-    .annotation build Landroid/annotation/SuppressLint;
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-77-        value = {
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-78-            "WrongConstant"
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-79-        }
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-80-    .end annotation
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-81-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-82-    .annotation runtime Ljava/lang/Deprecated;
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-83-    .end annotation
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-84-.end field
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-85-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-86-.field public static final FLAG_HANDLES_QUEUE_COMMANDS:I = 0x4
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-87-    .annotation build Landroid/annotation/SuppressLint;
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-88-        value = {
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-89-            "WrongConstant"
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-90-        }
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-91-    .end annotation
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-92-.end field
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-93-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-94-.field public static final FLAG_HANDLES_TRANSPORT_CONTROLS:I = 0x2
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-95-    .annotation build Landroid/annotation/SuppressLint;
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-96-        value = {
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-97-            "WrongConstant"
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-98-        }
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-99-    .end annotation
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-100-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-101-    .annotation runtime Ljava/lang/Deprecated;
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-102-    .end annotation
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-103-.end field
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-104-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-105-.field public static final KEY_EXTRA_BINDER:Ljava/lang/String; = "android.support.v4.media.session.EXTRA_BINDER"
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-106-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-107-.field public static final KEY_SESSION2_TOKEN:Ljava/lang/String; = "android.support.v4.media.session.SESSION_TOKEN2"
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-108-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-109-.field public static final KEY_TOKEN:Ljava/lang/String; = "android.support.v4.media.session.TOKEN"
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-110-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-111-.field static final TAG:Ljava/lang/String; = "MediaSessionCompat"
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-112-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-113-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-114-# instance fields
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-115-.field private final controller:Landroidx/media3/session/legacy/MediaControllerCompat;
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-116-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-117-.field private final impl:Landroidx/media3/session/legacy/MediaSessionCompat$MediaSessionImpl;
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-118-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-119-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-120-# direct methods
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-121-.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/content/ComponentName;Landroid/app/PendingIntent;Landroid/os/Bundle;Ljava/lang/String;)V
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-122-    .locals 2
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-123-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-124-    .line 1
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-125-    invoke-direct {p0}, Ljava/lang/Object;-><init>()V
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-126-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-127-    .line 2
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-128-    .line 3
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-129-    .line 4
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-130-    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-131-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-132-    .line 5
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-133-    .line 6
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-134-    .line 7
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-135-    move-result v0
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-136-
/tmp/spotify-full/smali_classes3/androidx/media3/session/legacy/MediaSessionCompat.smali-137-    .line 8
--
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3479-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3480-    .line 52
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3481-    :cond_1
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3482-    const/4 v2, 0x1
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3483-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3484-    .line 53
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3485-    :goto_0
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3486-    invoke-virtual {p0}, Lcom/spotify/player/model/PlayerState;->track()Lp/xul0;
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3487-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3488-    .line 54
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3489-    .line 55
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3490-    .line 56
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3491-    move-result-object p0
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3492-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3493-    .line 57
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3494-    invoke-virtual {p0}, Lp/xul0;->b()Ljava/lang/Object;
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3495-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3496-    .line 58
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3497-    .line 59
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3498-    .line 60
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3499-    move-result-object p0
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3500-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3501-    .line 61
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3502-    check-cast p0, Lcom/spotify/player/model/ContextTrack;
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3503-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3504-    .line 62
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3505-    .line 63
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3506-    invoke-virtual {p0}, Lcom/spotify/player/model/ContextTrack;->metadata()Lp/xf40;
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3507-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3508-    .line 64
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3509-    .line 65
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3510-    .line 66
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3511-    move-result-object p0
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3512-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3513-    .line 67
/tmp/spotify-full/smali_classes4/p/fzg1.smali:3514:    const-string v3, "ad.skippable_ad_delay"
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3515-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3516-    .line 68
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3517-    .line 69
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3518-    invoke-virtual {p0, v3}, Lp/xf40;->get(Ljava/lang/Object;)Ljava/lang/Object;
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3519-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3520-    .line 70
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3521-    .line 71
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3522-    .line 72
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3523-    move-result-object p0
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3524-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3525-    .line 73
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3526-    check-cast p0, Ljava/lang/String;
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3527-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3528-    .line 74
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3529-    .line 75
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3530-    if-eqz p0, :cond_2
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3531-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3532-    .line 76
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3533-    .line 77
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3534-    invoke-static {p0}, Lp/bm51;->r0(Ljava/lang/String;)Ljava/lang/Integer;
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3535-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3536-    .line 78
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3537-    .line 79
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3538-    .line 80
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3539-    move-result-object p0
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3540-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3541-    .line 81
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3542-    goto :goto_1
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3543-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3544-    .line 82
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3545-    :cond_2
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3546-    const/4 p0, 0x0
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3547-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3548-    .line 83
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3549-    :goto_1
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3550-    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3551-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3552-    .line 84
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3553-    .line 85
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3554-    .line 86
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3555-    move-result v3
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3556-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3557-    .line 87
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3558-    if-nez v3, :cond_3
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3559-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3560-    .line 88
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3561-    .line 89
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3562-    const v3, 0x7f13019c
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3563-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3564-    .line 90
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3565-    .line 91
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3566-    .line 92
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3567-    invoke-virtual {p1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3568-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3569-    .line 93
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3570-    .line 94
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3571-    .line 95
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3572-    move-result-object v3
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3573-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3574-    .line 96
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3575-    goto :goto_2
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3576-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3577-    .line 97
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3578-    :cond_3
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3579-    move-object v3, v0
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3580-
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3581-    .line 98
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3582-    :goto_2
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3583-    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I
/tmp/spotify-full/smali_classes4/p/fzg1.smali-3584-
--
/tmp/spotify-full/smali_classes4/p/j121.smali-2298-    .line 566
/tmp/spotify-full/smali_classes4/p/j121.smali-2299-    .line 567
/tmp/spotify-full/smali_classes4/p/j121.smali-2300-    check-cast v3, Lp/w2a1;
/tmp/spotify-full/smali_classes4/p/j121.smali-2301-
/tmp/spotify-full/smali_classes4/p/j121.smali-2302-    .line 568
/tmp/spotify-full/smali_classes4/p/j121.smali-2303-    .line 569
/tmp/spotify-full/smali_classes4/p/j121.smali-2304-    instance-of v3, v2, Lp/xn21;
/tmp/spotify-full/smali_classes4/p/j121.smali-2305-
/tmp/spotify-full/smali_classes4/p/j121.smali-2306-    .line 570
/tmp/spotify-full/smali_classes4/p/j121.smali-2307-    .line 571
/tmp/spotify-full/smali_classes4/p/j121.smali-2308-    if-nez v3, :cond_6
/tmp/spotify-full/smali_classes4/p/j121.smali-2309-
/tmp/spotify-full/smali_classes4/p/j121.smali-2310-    .line 572
/tmp/spotify-full/smali_classes4/p/j121.smali-2311-    .line 573
/tmp/spotify-full/smali_classes4/p/j121.smali-2312-    goto/16 :goto_3
/tmp/spotify-full/smali_classes4/p/j121.smali-2313-
/tmp/spotify-full/smali_classes4/p/j121.smali-2314-    .line 574
/tmp/spotify-full/smali_classes4/p/j121.smali-2315-    .line 575
/tmp/spotify-full/smali_classes4/p/j121.smali-2316-    :cond_6
/tmp/spotify-full/smali_classes4/p/j121.smali-2317-    iget-object v3, v1, Lp/k9g0;->b:Lp/zt91;
/tmp/spotify-full/smali_classes4/p/j121.smali-2318-
/tmp/spotify-full/smali_classes4/p/j121.smali-2319-    .line 576
/tmp/spotify-full/smali_classes4/p/j121.smali-2320-    .line 577
/tmp/spotify-full/smali_classes4/p/j121.smali-2321-    invoke-virtual {v3}, Lp/zt91;->c()Lp/yt91;
/tmp/spotify-full/smali_classes4/p/j121.smali-2322-
/tmp/spotify-full/smali_classes4/p/j121.smali-2323-    .line 578
/tmp/spotify-full/smali_classes4/p/j121.smali-2324-    .line 579
/tmp/spotify-full/smali_classes4/p/j121.smali-2325-    .line 580
/tmp/spotify-full/smali_classes4/p/j121.smali-2326-    move-result-object v3
/tmp/spotify-full/smali_classes4/p/j121.smali-2327-
/tmp/spotify-full/smali_classes4/p/j121.smali-2328-    .line 581
/tmp/spotify-full/smali_classes4/p/j121.smali-2329-    new-instance v12, Lp/bu91;
/tmp/spotify-full/smali_classes4/p/j121.smali-2330-
/tmp/spotify-full/smali_classes4/p/j121.smali-2331-    .line 582
/tmp/spotify-full/smali_classes4/p/j121.smali-2332-    .line 583
/tmp/spotify-full/smali_classes4/p/j121.smali:2333:    const-string v13, "skip_ad_button"
/tmp/spotify-full/smali_classes4/p/j121.smali-2334-
/tmp/spotify-full/smali_classes4/p/j121.smali-2335-    .line 584
/tmp/spotify-full/smali_classes4/p/j121.smali-2336-    .line 585
/tmp/spotify-full/smali_classes4/p/j121.smali-2337-    const/4 v14, 0x0
/tmp/spotify-full/smali_classes4/p/j121.smali-2338-
/tmp/spotify-full/smali_classes4/p/j121.smali-2339-    .line 586
/tmp/spotify-full/smali_classes4/p/j121.smali-2340-    const/4 v15, 0x0
/tmp/spotify-full/smali_classes4/p/j121.smali-2341-
/tmp/spotify-full/smali_classes4/p/j121.smali-2342-    .line 587
/tmp/spotify-full/smali_classes4/p/j121.smali-2343-    const/16 v16, 0x0
/tmp/spotify-full/smali_classes4/p/j121.smali-2344-
/tmp/spotify-full/smali_classes4/p/j121.smali-2345-    .line 588
/tmp/spotify-full/smali_classes4/p/j121.smali-2346-    .line 589
/tmp/spotify-full/smali_classes4/p/j121.smali-2347-    const/16 v17, 0x0
/tmp/spotify-full/smali_classes4/p/j121.smali-2348-
/tmp/spotify-full/smali_classes4/p/j121.smali-2349-    .line 590
/tmp/spotify-full/smali_classes4/p/j121.smali-2350-    .line 591
/tmp/spotify-full/smali_classes4/p/j121.smali-2351-    invoke-direct/range {v12 .. v17}, Lp/bu91;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V
/tmp/spotify-full/smali_classes4/p/j121.smali-2352-
/tmp/spotify-full/smali_classes4/p/j121.smali-2353-    .line 592
/tmp/spotify-full/smali_classes4/p/j121.smali-2354-    .line 593
/tmp/spotify-full/smali_classes4/p/j121.smali-2355-    .line 594
/tmp/spotify-full/smali_classes4/p/j121.smali-2356-    iget-object v6, v3, Lp/yt91;->i:Ljava/util/ArrayList;
/tmp/spotify-full/smali_classes4/p/j121.smali-2357-
/tmp/spotify-full/smali_classes4/p/j121.smali-2358-    .line 595
/tmp/spotify-full/smali_classes4/p/j121.smali-2359-    .line 596
/tmp/spotify-full/smali_classes4/p/j121.smali-2360-    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/tmp/spotify-full/smali_classes4/p/j121.smali-2361-
/tmp/spotify-full/smali_classes4/p/j121.smali-2362-    .line 597
/tmp/spotify-full/smali_classes4/p/j121.smali-2363-    .line 598
/tmp/spotify-full/smali_classes4/p/j121.smali-2364-    .line 599
/tmp/spotify-full/smali_classes4/p/j121.smali-2365-    iput-boolean v5, v3, Lp/yt91;->j:Z
/tmp/spotify-full/smali_classes4/p/j121.smali-2366-
/tmp/spotify-full/smali_classes4/p/j121.smali-2367-    .line 600
/tmp/spotify-full/smali_classes4/p/j121.smali-2368-    .line 601
/tmp/spotify-full/smali_classes4/p/j121.smali-2369-    invoke-virtual {v3}, Lp/yt91;->a()Lp/zt91;
/tmp/spotify-full/smali_classes4/p/j121.smali-2370-
/tmp/spotify-full/smali_classes4/p/j121.smali-2371-    .line 602
/tmp/spotify-full/smali_classes4/p/j121.smali-2372-    .line 603
/tmp/spotify-full/smali_classes4/p/j121.smali-2373-    .line 604
/tmp/spotify-full/smali_classes4/p/j121.smali-2374-    move-result-object v18
/tmp/spotify-full/smali_classes4/p/j121.smali-2375-
/tmp/spotify-full/smali_classes4/p/j121.smali-2376-    .line 605
/tmp/spotify-full/smali_classes4/p/j121.smali-2377-    check-cast v2, Lp/xn21;
/tmp/spotify-full/smali_classes4/p/j121.smali-2378-
/tmp/spotify-full/smali_classes4/p/j121.smali-2379-    .line 606
/tmp/spotify-full/smali_classes4/p/j121.smali-2380-    .line 607
/tmp/spotify-full/smali_classes4/p/j121.smali-2381-    iget-object v3, v2, Lp/xn21;->a:Ljava/lang/String;
/tmp/spotify-full/smali_classes4/p/j121.smali-2382-
/tmp/spotify-full/smali_classes4/p/j121.smali-2383-    .line 608
/tmp/spotify-full/smali_classes4/p/j121.smali-2384-    .line 609
/tmp/spotify-full/smali_classes4/p/j121.smali-2385-    iget-wide v5, v2, Lp/xn21;->b:J
/tmp/spotify-full/smali_classes4/p/j121.smali-2386-
/tmp/spotify-full/smali_classes4/p/j121.smali-2387-    .line 610
/tmp/spotify-full/smali_classes4/p/j121.smali-2388-    .line 611
/tmp/spotify-full/smali_classes4/p/j121.smali-2389-    long-to-int v5, v5
/tmp/spotify-full/smali_classes4/p/j121.smali-2390-
/tmp/spotify-full/smali_classes4/p/j121.smali-2391-    .line 612
/tmp/spotify-full/smali_classes4/p/j121.smali-2392-    iget-wide v12, v2, Lp/xn21;->c:J
/tmp/spotify-full/smali_classes4/p/j121.smali-2393-
/tmp/spotify-full/smali_classes4/p/j121.smali-2394-    .line 613
/tmp/spotify-full/smali_classes4/p/j121.smali-2395-    .line 614
/tmp/spotify-full/smali_classes4/p/j121.smali-2396-    long-to-int v2, v12
/tmp/spotify-full/smali_classes4/p/j121.smali-2397-
/tmp/spotify-full/smali_classes4/p/j121.smali-2398-    .line 615
/tmp/spotify-full/smali_classes4/p/j121.smali-2399-    new-instance v13, Lp/av91;
/tmp/spotify-full/smali_classes4/p/j121.smali-2400-
/tmp/spotify-full/smali_classes4/p/j121.smali-2401-    .line 616
/tmp/spotify-full/smali_classes4/p/j121.smali-2402-    .line 617
/tmp/spotify-full/smali_classes4/p/j121.smali-2403-    new-instance v6, Lp/dv91;
--
/tmp/spotify-full/smali_classes4/p/j121.smali-4031-    .line 1406
/tmp/spotify-full/smali_classes4/p/j121.smali-4032-    .line 1407
/tmp/spotify-full/smali_classes4/p/j121.smali-4033-    .line 1408
/tmp/spotify-full/smali_classes4/p/j121.smali-4034-    new-instance v3, Lp/bv91;
/tmp/spotify-full/smali_classes4/p/j121.smali-4035-
/tmp/spotify-full/smali_classes4/p/j121.smali-4036-    .line 1409
/tmp/spotify-full/smali_classes4/p/j121.smali-4037-    .line 1410
/tmp/spotify-full/smali_classes4/p/j121.smali-4038-    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
/tmp/spotify-full/smali_classes4/p/j121.smali-4039-
/tmp/spotify-full/smali_classes4/p/j121.smali-4040-    .line 1411
/tmp/spotify-full/smali_classes4/p/j121.smali-4041-    .line 1412
/tmp/spotify-full/smali_classes4/p/j121.smali-4042-    .line 1413
/tmp/spotify-full/smali_classes4/p/j121.smali-4043-    move-result-object v2
/tmp/spotify-full/smali_classes4/p/j121.smali-4044-
/tmp/spotify-full/smali_classes4/p/j121.smali-4045-    .line 1414
/tmp/spotify-full/smali_classes4/p/j121.smali-4046-    if-nez v2, :cond_1a
/tmp/spotify-full/smali_classes4/p/j121.smali-4047-
/tmp/spotify-full/smali_classes4/p/j121.smali-4048-    .line 1415
/tmp/spotify-full/smali_classes4/p/j121.smali-4049-    .line 1416
/tmp/spotify-full/smali_classes4/p/j121.smali-4050-    goto :goto_c
/tmp/spotify-full/smali_classes4/p/j121.smali-4051-
/tmp/spotify-full/smali_classes4/p/j121.smali-4052-    .line 1417
/tmp/spotify-full/smali_classes4/p/j121.smali-4053-    :cond_1a
/tmp/spotify-full/smali_classes4/p/j121.smali-4054-    move-object v8, v2
/tmp/spotify-full/smali_classes4/p/j121.smali-4055-
/tmp/spotify-full/smali_classes4/p/j121.smali-4056-    .line 1418
/tmp/spotify-full/smali_classes4/p/j121.smali-4057-    :goto_c
/tmp/spotify-full/smali_classes4/p/j121.smali-4058-    invoke-static {v4, v8}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;
/tmp/spotify-full/smali_classes4/p/j121.smali-4059-
/tmp/spotify-full/smali_classes4/p/j121.smali-4060-    .line 1419
/tmp/spotify-full/smali_classes4/p/j121.smali-4061-    .line 1420
/tmp/spotify-full/smali_classes4/p/j121.smali-4062-    .line 1421
/tmp/spotify-full/smali_classes4/p/j121.smali-4063-    move-result-object v2
/tmp/spotify-full/smali_classes4/p/j121.smali-4064-
/tmp/spotify-full/smali_classes4/p/j121.smali-4065-    .line 1422
/tmp/spotify-full/smali_classes4/p/j121.smali:4066:    const-string v4, "skip_ads"
/tmp/spotify-full/smali_classes4/p/j121.smali-4067-
/tmp/spotify-full/smali_classes4/p/j121.smali-4068-    .line 1423
/tmp/spotify-full/smali_classes4/p/j121.smali-4069-    .line 1424
/tmp/spotify-full/smali_classes4/p/j121.smali-4070-    invoke-direct {v3, v4, v7, v2}, Lp/bv91;-><init>(Ljava/lang/String;ILjava/util/Map;)V
/tmp/spotify-full/smali_classes4/p/j121.smali-4071-
/tmp/spotify-full/smali_classes4/p/j121.smali-4072-    .line 1425
/tmp/spotify-full/smali_classes4/p/j121.smali-4073-    .line 1426
/tmp/spotify-full/smali_classes4/p/j121.smali-4074-    .line 1427
/tmp/spotify-full/smali_classes4/p/j121.smali-4075-    iget-object v2, v1, Lp/ayg0;->b:Lp/zt91;
/tmp/spotify-full/smali_classes4/p/j121.smali-4076-
/tmp/spotify-full/smali_classes4/p/j121.smali-4077-    .line 1428
/tmp/spotify-full/smali_classes4/p/j121.smali-4078-    .line 1429
/tmp/spotify-full/smali_classes4/p/j121.smali-4079-    iget-object v1, v1, Lp/ayg0;->a:Lp/st91;
/tmp/spotify-full/smali_classes4/p/j121.smali-4080-
/tmp/spotify-full/smali_classes4/p/j121.smali-4081-    .line 1430
/tmp/spotify-full/smali_classes4/p/j121.smali-4082-    .line 1431
/tmp/spotify-full/smali_classes4/p/j121.smali-4083-    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
/tmp/spotify-full/smali_classes4/p/j121.smali-4084-
/tmp/spotify-full/smali_classes4/p/j121.smali-4085-    .line 1432
/tmp/spotify-full/smali_classes4/p/j121.smali-4086-    .line 1433
/tmp/spotify-full/smali_classes4/p/j121.smali-4087-    .line 1434
/tmp/spotify-full/smali_classes4/p/j121.smali-4088-    move-result-wide v19
/tmp/spotify-full/smali_classes4/p/j121.smali-4089-
/tmp/spotify-full/smali_classes4/p/j121.smali-4090-    .line 1435
/tmp/spotify-full/smali_classes4/p/j121.smali-4091-    const-string v13, ""
/tmp/spotify-full/smali_classes4/p/j121.smali-4092-
/tmp/spotify-full/smali_classes4/p/j121.smali-4093-    .line 1436
/tmp/spotify-full/smali_classes4/p/j121.smali-4094-    .line 1437
/tmp/spotify-full/smali_classes4/p/j121.smali-4095-    const-string v14, ""
/tmp/spotify-full/smali_classes4/p/j121.smali-4096-
/tmp/spotify-full/smali_classes4/p/j121.smali-4097-    .line 1438
/tmp/spotify-full/smali_classes4/p/j121.smali-4098-    .line 1439
/tmp/spotify-full/smali_classes4/p/j121.smali-4099-    move-object/from16 v18, v1
/tmp/spotify-full/smali_classes4/p/j121.smali-4100-
/tmp/spotify-full/smali_classes4/p/j121.smali-4101-    .line 1440
/tmp/spotify-full/smali_classes4/p/j121.smali-4102-    .line 1441
/tmp/spotify-full/smali_classes4/p/j121.smali-4103-    move-object/from16 v17, v2
/tmp/spotify-full/smali_classes4/p/j121.smali-4104-
/tmp/spotify-full/smali_classes4/p/j121.smali-4105-    .line 1442
/tmp/spotify-full/smali_classes4/p/j121.smali-4106-    .line 1443
/tmp/spotify-full/smali_classes4/p/j121.smali-4107-    move-object/from16 v16, v3
/tmp/spotify-full/smali_classes4/p/j121.smali-4108-
/tmp/spotify-full/smali_classes4/p/j121.smali-4109-    .line 1444
/tmp/spotify-full/smali_classes4/p/j121.smali-4110-    .line 1445
/tmp/spotify-full/smali_classes4/p/j121.smali-4111-    invoke-direct/range {v12 .. v20}, Lp/av91;-><init>(Ljava/lang/String;Ljava/lang/String;Lp/dv91;Lp/bv91;Lp/zt91;Lp/st91;J)V
/tmp/spotify-full/smali_classes4/p/j121.smali-4112-
/tmp/spotify-full/smali_classes4/p/j121.smali-4113-    .line 1446
/tmp/spotify-full/smali_classes4/p/j121.smali-4114-    .line 1447
/tmp/spotify-full/smali_classes4/p/j121.smali-4115-    .line 1448
/tmp/spotify-full/smali_classes4/p/j121.smali-4116-    move-object v10, v12
/tmp/spotify-full/smali_classes4/p/j121.smali-4117-
/tmp/spotify-full/smali_classes4/p/j121.smali-4118-    .line 1449
/tmp/spotify-full/smali_classes4/p/j121.smali-4119-    goto :goto_d
/tmp/spotify-full/smali_classes4/p/j121.smali-4120-
/tmp/spotify-full/smali_classes4/p/j121.smali-4121-    .line 1450
/tmp/spotify-full/smali_classes4/p/j121.smali-4122-    :cond_1b
/tmp/spotify-full/smali_classes4/p/j121.smali-4123-    instance-of v1, v3, Lp/gk21;
/tmp/spotify-full/smali_classes4/p/j121.smali-4124-
/tmp/spotify-full/smali_classes4/p/j121.smali-4125-    .line 1451
/tmp/spotify-full/smali_classes4/p/j121.smali-4126-    .line 1452
/tmp/spotify-full/smali_classes4/p/j121.smali-4127-    if-eqz v1, :cond_1c
/tmp/spotify-full/smali_classes4/p/j121.smali-4128-
/tmp/spotify-full/smali_classes4/p/j121.smali-4129-    .line 1453
/tmp/spotify-full/smali_classes4/p/j121.smali-4130-    .line 1454
/tmp/spotify-full/smali_classes4/p/j121.smali-4131-    :goto_d
/tmp/spotify-full/smali_classes4/p/j121.smali-4132-    return-object v10
/tmp/spotify-full/smali_classes4/p/j121.smali-4133-
/tmp/spotify-full/smali_classes4/p/j121.smali-4134-    .line 1455
/tmp/spotify-full/smali_classes4/p/j121.smali-4135-    :cond_1c
/tmp/spotify-full/smali_classes4/p/j121.smali-4136-    new-instance v1, Lkotlin/NoWhenBranchMatchedException;
--
/tmp/spotify-full/smali_classes4/p/fr0.smali-394-
/tmp/spotify-full/smali_classes4/p/fr0.smali-395-    :cond_3
/tmp/spotify-full/smali_classes4/p/fr0.smali-396-    new-instance p0, Ljava/lang/NullPointerException;
/tmp/spotify-full/smali_classes4/p/fr0.smali-397-
/tmp/spotify-full/smali_classes4/p/fr0.smali-398-    const-string v0, "Name is null"
/tmp/spotify-full/smali_classes4/p/fr0.smali-399-
/tmp/spotify-full/smali_classes4/p/fr0.smali-400-    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V
/tmp/spotify-full/smali_classes4/p/fr0.smali-401-
/tmp/spotify-full/smali_classes4/p/fr0.smali-402-    throw p0
/tmp/spotify-full/smali_classes4/p/fr0.smali-403-.end method
/tmp/spotify-full/smali_classes4/p/fr0.smali-404-
/tmp/spotify-full/smali_classes4/p/fr0.smali-405-.method public static final a(I)Ljava/lang/String;
/tmp/spotify-full/smali_classes4/p/fr0.smali-406-    .locals 0
/tmp/spotify-full/smali_classes4/p/fr0.smali-407-
/tmp/spotify-full/smali_classes4/p/fr0.smali-408-    .line 1
/tmp/spotify-full/smali_classes4/p/fr0.smali-409-    packed-switch p0, :pswitch_data_0
/tmp/spotify-full/smali_classes4/p/fr0.smali-410-
/tmp/spotify-full/smali_classes4/p/fr0.smali-411-    .line 2
/tmp/spotify-full/smali_classes4/p/fr0.smali-412-    .line 3
/tmp/spotify-full/smali_classes4/p/fr0.smali-413-    .line 4
/tmp/spotify-full/smali_classes4/p/fr0.smali-414-    const/4 p0, 0x0
/tmp/spotify-full/smali_classes4/p/fr0.smali-415-
/tmp/spotify-full/smali_classes4/p/fr0.smali-416-    .line 5
/tmp/spotify-full/smali_classes4/p/fr0.smali-417-    throw p0
/tmp/spotify-full/smali_classes4/p/fr0.smali-418-
/tmp/spotify-full/smali_classes4/p/fr0.smali-419-    .line 6
/tmp/spotify-full/smali_classes4/p/fr0.smali-420-    :pswitch_0
/tmp/spotify-full/smali_classes4/p/fr0.smali-421-    const-string p0, "ad_timeout"
/tmp/spotify-full/smali_classes4/p/fr0.smali-422-
/tmp/spotify-full/smali_classes4/p/fr0.smali-423-    .line 7
/tmp/spotify-full/smali_classes4/p/fr0.smali-424-    .line 8
/tmp/spotify-full/smali_classes4/p/fr0.smali-425-    goto :goto_0
/tmp/spotify-full/smali_classes4/p/fr0.smali-426-
/tmp/spotify-full/smali_classes4/p/fr0.smali-427-    .line 9
/tmp/spotify-full/smali_classes4/p/fr0.smali-428-    :pswitch_1
/tmp/spotify-full/smali_classes4/p/fr0.smali:429:    const-string p0, "ad_skipped"
/tmp/spotify-full/smali_classes4/p/fr0.smali-430-
/tmp/spotify-full/smali_classes4/p/fr0.smali-431-    .line 10
/tmp/spotify-full/smali_classes4/p/fr0.smali-432-    .line 11
/tmp/spotify-full/smali_classes4/p/fr0.smali-433-    goto :goto_0
/tmp/spotify-full/smali_classes4/p/fr0.smali-434-
/tmp/spotify-full/smali_classes4/p/fr0.smali-435-    .line 12
/tmp/spotify-full/smali_classes4/p/fr0.smali-436-    :pswitch_2
/tmp/spotify-full/smali_classes4/p/fr0.smali-437-    const-string p0, "ad_ended"
/tmp/spotify-full/smali_classes4/p/fr0.smali-438-
/tmp/spotify-full/smali_classes4/p/fr0.smali-439-    .line 13
/tmp/spotify-full/smali_classes4/p/fr0.smali-440-    .line 14
/tmp/spotify-full/smali_classes4/p/fr0.smali-441-    goto :goto_0
/tmp/spotify-full/smali_classes4/p/fr0.smali-442-
/tmp/spotify-full/smali_classes4/p/fr0.smali-443-    .line 15
/tmp/spotify-full/smali_classes4/p/fr0.smali-444-    :pswitch_3
/tmp/spotify-full/smali_classes4/p/fr0.smali-445-    const-string p0, "buffer_failed"
/tmp/spotify-full/smali_classes4/p/fr0.smali-446-
/tmp/spotify-full/smali_classes4/p/fr0.smali-447-    .line 16
/tmp/spotify-full/smali_classes4/p/fr0.smali-448-    .line 17
/tmp/spotify-full/smali_classes4/p/fr0.smali-449-    goto :goto_0
/tmp/spotify-full/smali_classes4/p/fr0.smali-450-
/tmp/spotify-full/smali_classes4/p/fr0.smali-451-    .line 18
/tmp/spotify-full/smali_classes4/p/fr0.smali-452-    :pswitch_4
/tmp/spotify-full/smali_classes4/p/fr0.smali-453-    const-string p0, "realtime_metadata_failed"
/tmp/spotify-full/smali_classes4/p/fr0.smali-454-
/tmp/spotify-full/smali_classes4/p/fr0.smali-455-    .line 19
/tmp/spotify-full/smali_classes4/p/fr0.smali-456-    .line 20
/tmp/spotify-full/smali_classes4/p/fr0.smali-457-    goto :goto_0
/tmp/spotify-full/smali_classes4/p/fr0.smali-458-
/tmp/spotify-full/smali_classes4/p/fr0.smali-459-    .line 21
/tmp/spotify-full/smali_classes4/p/fr0.smali-460-    :pswitch_5
/tmp/spotify-full/smali_classes4/p/fr0.smali-461-    const-string p0, "core_metadata_failed"
/tmp/spotify-full/smali_classes4/p/fr0.smali-462-
/tmp/spotify-full/smali_classes4/p/fr0.smali-463-    .line 22
/tmp/spotify-full/smali_classes4/p/fr0.smali-464-    .line 23
/tmp/spotify-full/smali_classes4/p/fr0.smali-465-    goto :goto_0
/tmp/spotify-full/smali_classes4/p/fr0.smali-466-
/tmp/spotify-full/smali_classes4/p/fr0.smali-467-    .line 24
/tmp/spotify-full/smali_classes4/p/fr0.smali-468-    :pswitch_6
/tmp/spotify-full/smali_classes4/p/fr0.smali-469-    const-string p0, "eligibility_check_failed"
/tmp/spotify-full/smali_classes4/p/fr0.smali-470-
/tmp/spotify-full/smali_classes4/p/fr0.smali-471-    .line 25
/tmp/spotify-full/smali_classes4/p/fr0.smali-472-    .line 26
/tmp/spotify-full/smali_classes4/p/fr0.smali-473-    :goto_0
/tmp/spotify-full/smali_classes4/p/fr0.smali-474-    return-object p0
/tmp/spotify-full/smali_classes4/p/fr0.smali-475-
/tmp/spotify-full/smali_classes4/p/fr0.smali-476-    .line 27
/tmp/spotify-full/smali_classes4/p/fr0.smali-477-    :pswitch_data_0
/tmp/spotify-full/smali_classes4/p/fr0.smali-478-    .packed-switch 0x1
/tmp/spotify-full/smali_classes4/p/fr0.smali-479-        :pswitch_6
/tmp/spotify-full/smali_classes4/p/fr0.smali-480-        :pswitch_5
/tmp/spotify-full/smali_classes4/p/fr0.smali-481-        :pswitch_4
/tmp/spotify-full/smali_classes4/p/fr0.smali-482-        :pswitch_3
/tmp/spotify-full/smali_classes4/p/fr0.smali-483-        :pswitch_2
/tmp/spotify-full/smali_classes4/p/fr0.smali-484-        :pswitch_1
/tmp/spotify-full/smali_classes4/p/fr0.smali-485-        :pswitch_0
/tmp/spotify-full/smali_classes4/p/fr0.smali-486-    .end packed-switch
/tmp/spotify-full/smali_classes4/p/fr0.smali-487-    .line 28
/tmp/spotify-full/smali_classes4/p/fr0.smali-488-    .line 29
/tmp/spotify-full/smali_classes4/p/fr0.smali-489-    .line 30
/tmp/spotify-full/smali_classes4/p/fr0.smali-490-    .line 31
/tmp/spotify-full/smali_classes4/p/fr0.smali-491-    .line 32
/tmp/spotify-full/smali_classes4/p/fr0.smali-492-    .line 33
/tmp/spotify-full/smali_classes4/p/fr0.smali-493-    .line 34
/tmp/spotify-full/smali_classes4/p/fr0.smali-494-    .line 35
/tmp/spotify-full/smali_classes4/p/fr0.smali-495-    .line 36
/tmp/spotify-full/smali_classes4/p/fr0.smali-496-    .line 37
/tmp/spotify-full/smali_classes4/p/fr0.smali-497-    .line 38
/tmp/spotify-full/smali_classes4/p/fr0.smali-498-.end method
/tmp/spotify-full/smali_classes4/p/fr0.smali-499-
--
/tmp/spotify-full/smali_classes6/p/sc11.smali-467-    :cond_a
/tmp/spotify-full/smali_classes6/p/sc11.smali-468-    new-instance p1, Ljava/lang/IllegalStateException;
/tmp/spotify-full/smali_classes6/p/sc11.smali-469-
/tmp/spotify-full/smali_classes6/p/sc11.smali-470-    .line 195
/tmp/spotify-full/smali_classes6/p/sc11.smali-471-    .line 196
/tmp/spotify-full/smali_classes6/p/sc11.smali-472-    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"
/tmp/spotify-full/smali_classes6/p/sc11.smali-473-
/tmp/spotify-full/smali_classes6/p/sc11.smali-474-    .line 197
/tmp/spotify-full/smali_classes6/p/sc11.smali-475-    .line 198
/tmp/spotify-full/smali_classes6/p/sc11.smali-476-    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
/tmp/spotify-full/smali_classes6/p/sc11.smali-477-
/tmp/spotify-full/smali_classes6/p/sc11.smali-478-    .line 199
/tmp/spotify-full/smali_classes6/p/sc11.smali-479-    .line 200
/tmp/spotify-full/smali_classes6/p/sc11.smali-480-    .line 201
/tmp/spotify-full/smali_classes6/p/sc11.smali-481-    throw p1
/tmp/spotify-full/smali_classes6/p/sc11.smali-482-
/tmp/spotify-full/smali_classes6/p/sc11.smali-483-    .line 202
/tmp/spotify-full/smali_classes6/p/sc11.smali-484-    :cond_b
/tmp/spotify-full/smali_classes6/p/sc11.smali-485-    invoke-static {p2}, Lp/bga;->P(Ljava/lang/Object;)V
/tmp/spotify-full/smali_classes6/p/sc11.smali-486-
/tmp/spotify-full/smali_classes6/p/sc11.smali-487-    .line 203
/tmp/spotify-full/smali_classes6/p/sc11.smali-488-    .line 204
/tmp/spotify-full/smali_classes6/p/sc11.smali-489-    .line 205
/tmp/spotify-full/smali_classes6/p/sc11.smali-490-    check-cast p1, Lcom/spotify/player/model/ContextTrack;
/tmp/spotify-full/smali_classes6/p/sc11.smali-491-
/tmp/spotify-full/smali_classes6/p/sc11.smali-492-    .line 206
/tmp/spotify-full/smali_classes6/p/sc11.smali-493-    .line 207
/tmp/spotify-full/smali_classes6/p/sc11.smali-494-    invoke-virtual {p1}, Lcom/spotify/player/model/ContextTrack;->metadata()Lp/xf40;
/tmp/spotify-full/smali_classes6/p/sc11.smali-495-
/tmp/spotify-full/smali_classes6/p/sc11.smali-496-    .line 208
/tmp/spotify-full/smali_classes6/p/sc11.smali-497-    .line 209
/tmp/spotify-full/smali_classes6/p/sc11.smali-498-    .line 210
/tmp/spotify-full/smali_classes6/p/sc11.smali-499-    move-result-object p1
/tmp/spotify-full/smali_classes6/p/sc11.smali-500-
/tmp/spotify-full/smali_classes6/p/sc11.smali-501-    .line 211
/tmp/spotify-full/smali_classes6/p/sc11.smali:502:    const-string p2, "ad.skippable_ad_delay"
/tmp/spotify-full/smali_classes6/p/sc11.smali-503-
/tmp/spotify-full/smali_classes6/p/sc11.smali-504-    .line 212
/tmp/spotify-full/smali_classes6/p/sc11.smali-505-    .line 213
/tmp/spotify-full/smali_classes6/p/sc11.smali-506-    invoke-virtual {p1, p2}, Lp/xf40;->get(Ljava/lang/Object;)Ljava/lang/Object;
/tmp/spotify-full/smali_classes6/p/sc11.smali-507-
/tmp/spotify-full/smali_classes6/p/sc11.smali-508-    .line 214
/tmp/spotify-full/smali_classes6/p/sc11.smali-509-    .line 215
/tmp/spotify-full/smali_classes6/p/sc11.smali-510-    .line 216
/tmp/spotify-full/smali_classes6/p/sc11.smali-511-    move-result-object p1
/tmp/spotify-full/smali_classes6/p/sc11.smali-512-
/tmp/spotify-full/smali_classes6/p/sc11.smali-513-    .line 217
/tmp/spotify-full/smali_classes6/p/sc11.smali-514-    check-cast p1, Ljava/lang/String;
/tmp/spotify-full/smali_classes6/p/sc11.smali-515-
/tmp/spotify-full/smali_classes6/p/sc11.smali-516-    .line 218
/tmp/spotify-full/smali_classes6/p/sc11.smali-517-    .line 219
/tmp/spotify-full/smali_classes6/p/sc11.smali-518-    const/4 p2, 0x0
/tmp/spotify-full/smali_classes6/p/sc11.smali-519-
/tmp/spotify-full/smali_classes6/p/sc11.smali-520-    .line 220
/tmp/spotify-full/smali_classes6/p/sc11.smali-521-    if-eqz p1, :cond_c
/tmp/spotify-full/smali_classes6/p/sc11.smali-522-
/tmp/spotify-full/smali_classes6/p/sc11.smali-523-    .line 221
/tmp/spotify-full/smali_classes6/p/sc11.smali-524-    .line 222
/tmp/spotify-full/smali_classes6/p/sc11.smali-525-    const/16 v1, 0xa
/tmp/spotify-full/smali_classes6/p/sc11.smali-526-
/tmp/spotify-full/smali_classes6/p/sc11.smali-527-    .line 223
/tmp/spotify-full/smali_classes6/p/sc11.smali-528-    .line 224
/tmp/spotify-full/smali_classes6/p/sc11.smali-529-    invoke-static {v1, p1}, Lp/bm51;->s0(ILjava/lang/String;)Ljava/lang/Long;
/tmp/spotify-full/smali_classes6/p/sc11.smali-530-
/tmp/spotify-full/smali_classes6/p/sc11.smali-531-    .line 225
/tmp/spotify-full/smali_classes6/p/sc11.smali-532-    .line 226
/tmp/spotify-full/smali_classes6/p/sc11.smali-533-    .line 227
/tmp/spotify-full/smali_classes6/p/sc11.smali-534-    move-result-object p1
/tmp/spotify-full/smali_classes6/p/sc11.smali-535-
/tmp/spotify-full/smali_classes6/p/sc11.smali-536-    .line 228
/tmp/spotify-full/smali_classes6/p/sc11.smali-537-    goto :goto_8
/tmp/spotify-full/smali_classes6/p/sc11.smali-538-
/tmp/spotify-full/smali_classes6/p/sc11.smali-539-    .line 229
/tmp/spotify-full/smali_classes6/p/sc11.smali-540-    :cond_c
/tmp/spotify-full/smali_classes6/p/sc11.smali-541-    move-object p1, p2
/tmp/spotify-full/smali_classes6/p/sc11.smali-542-
/tmp/spotify-full/smali_classes6/p/sc11.smali-543-    .line 230
/tmp/spotify-full/smali_classes6/p/sc11.smali-544-    :goto_8
/tmp/spotify-full/smali_classes6/p/sc11.smali-545-    if-eqz p1, :cond_d
/tmp/spotify-full/smali_classes6/p/sc11.smali-546-
/tmp/spotify-full/smali_classes6/p/sc11.smali-547-    .line 231
/tmp/spotify-full/smali_classes6/p/sc11.smali-548-    .line 232
/tmp/spotify-full/smali_classes6/p/sc11.smali-549-    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J
/tmp/spotify-full/smali_classes6/p/sc11.smali-550-
/tmp/spotify-full/smali_classes6/p/sc11.smali-551-    .line 233
/tmp/spotify-full/smali_classes6/p/sc11.smali-552-    .line 234
/tmp/spotify-full/smali_classes6/p/sc11.smali-553-    .line 235
/tmp/spotify-full/smali_classes6/p/sc11.smali-554-    move-result-wide p1
/tmp/spotify-full/smali_classes6/p/sc11.smali-555-
/tmp/spotify-full/smali_classes6/p/sc11.smali-556-    .line 236
/tmp/spotify-full/smali_classes6/p/sc11.smali-557-    const/16 v1, 0x3e8
/tmp/spotify-full/smali_classes6/p/sc11.smali-558-
/tmp/spotify-full/smali_classes6/p/sc11.smali-559-    .line 237
/tmp/spotify-full/smali_classes6/p/sc11.smali-560-    .line 238
/tmp/spotify-full/smali_classes6/p/sc11.smali-561-    int-to-long v3, v1
/tmp/spotify-full/smali_classes6/p/sc11.smali-562-
/tmp/spotify-full/smali_classes6/p/sc11.smali-563-    .line 239
/tmp/spotify-full/smali_classes6/p/sc11.smali-564-    mul-long/2addr p1, v3
/tmp/spotify-full/smali_classes6/p/sc11.smali-565-
/tmp/spotify-full/smali_classes6/p/sc11.smali-566-    .line 240
/tmp/spotify-full/smali_classes6/p/sc11.smali-567-    new-instance v1, Ljava/lang/Long;
/tmp/spotify-full/smali_classes6/p/sc11.smali-568-
/tmp/spotify-full/smali_classes6/p/sc11.smali-569-    .line 241
/tmp/spotify-full/smali_classes6/p/sc11.smali-570-    .line 242
/tmp/spotify-full/smali_classes6/p/sc11.smali-571-    invoke-direct {v1, p1, p2}, Ljava/lang/Long;-><init>(J)V
/tmp/spotify-full/smali_classes6/p/sc11.smali-572-
--
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-231-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-232-.field public static final KEY_PLAYBACK_SPEED:Ljava/lang/String; = "playback_speed"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-233-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-234-.field public static final KEY_POINTER_URI:Ljava/lang/String; = "pointer.uri"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-235-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-236-.field public static final KEY_POPULARITY:Ljava/lang/String; = "popularity"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-237-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-238-.field public static final KEY_PREVIOUS_ACCUMULATIVE_MS:Ljava/lang/String; = "previous_accumulative_ms"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-239-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-240-.field public static final KEY_PROMOTION_TYPE:Ljava/lang/String; = "promotion_type"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-241-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-242-.field public static final KEY_PROVIDER:Ljava/lang/String; = "provider"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-243-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-244-.field public static final KEY_REPEATING_TRACK_COUNT:Ljava/lang/String; = "repeating_track.count"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-245-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-246-.field public static final KEY_REPEATING_TRACK_MAX:Ljava/lang/String; = "repeating_track.max"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-247-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-248-.field public static final KEY_REPEATING_TRACK_MIN:Ljava/lang/String; = "repeating_track.min"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-249-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-250-.field public static final KEY_SAVE_TRACK_URI:Ljava/lang/String; = "save_track.uri"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-251-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-252-.field public static final KEY_SEGMENT_INDEX:Ljava/lang/String; = "segment.index"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-253-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-254-.field public static final KEY_SEGMENT_NAME:Ljava/lang/String; = "segment_name"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-255-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-256-.field public static final KEY_SEGMENT_URI:Ljava/lang/String; = "segment.uri"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-257-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-258-.field public static final KEY_SHOW_COVER_IMAGE_URI:Ljava/lang/String; = "show.cover_image.uri"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-259-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-260-.field public static final KEY_SHOW_HTML_DESCRIPTION:Ljava/lang/String; = "show.html_description"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-261-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-262-.field public static final KEY_SHOW_PUBLISHER:Ljava/lang/String; = "show.publisher"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-263-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-264-.field public static final KEY_SHUFFLE_AVERAGE_POSITION:Ljava/lang/String; = "shuffle.average_position"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-265-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali:266:.field public static final KEY_SKIPPABLE_AD_DELAY:Ljava/lang/String; = "ad.skippable_ad_delay"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-267-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-268-.field public static final KEY_STATION_SUBTITLE:Ljava/lang/String; = "station_subtitle"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-269-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-270-.field public static final KEY_STATION_TITLE:Ljava/lang/String; = "station_title"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-271-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-272-.field public static final KEY_STATION_URI:Ljava/lang/String; = "station_uri"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-273-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-274-.field public static final KEY_SUBTITLE:Ljava/lang/String; = "subtitle"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-275-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-276-.field public static final KEY_THUMBNAIL_IMAGE_URL:Ljava/lang/String; = "thumbnail_image_url"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-277-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-278-.field public static final KEY_TITLE:Ljava/lang/String; = "title"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-279-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-280-.field public static final KEY_TRACK_PLAYER:Ljava/lang/String; = "track_player"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-281-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-282-.field public static final KEY_TRACK_RADIO_THUMB_STATE:Ljava/lang/String; = "radio.thumb"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-283-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-284-.field public static final KEY_VIDEO_ASSOCIATION:Ljava/lang/String; = "video_association"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-285-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-286-.field public static final KEY_VIDEO_RENDERING_ENABLED:Ljava/lang/String; = "video_rendering_enabled"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-287-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-288-.field public static final KEY_VIDEO_SECONDS_BEFORE_TRACK_STUCK:Ljava/lang/String; = "video.seconds_before_track_stuck"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-289-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-290-.field public static final KEY_VISUALIZATION_PLAYBACK_SPEED:Ljava/lang/String; = "visualization.playback_speed"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-291-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-292-.field public static final KEY_VISUALIZATION_POSITION_AS_OF_TIMESTAMP:Ljava/lang/String; = "visualization.position_as_of_timestamp"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-293-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-294-.field public static final REPEAT_PLAY_INTERRUPTION:Ljava/lang/String; = "sas_repeat"
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-295-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-296-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-297-# direct methods
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-298-.method public constructor <init>()V
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-299-    .locals 0
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-300-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-301-    .line 1
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-302-    invoke-direct {p0}, Ljava/lang/Object;-><init>()V
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-303-
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-304-    .line 2
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-305-    .line 3
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-306-    .line 4
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-307-    return-void
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-308-    .line 5
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-309-    .line 6
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-310-    .line 7
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-311-    .line 8
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-312-    .line 9
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-313-    .line 10
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-314-    .line 11
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-315-    .line 12
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-316-    .line 13
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-317-    .line 14
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-318-    .line 15
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-319-    .line 16
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-320-    .line 17
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-321-    .line 18
/tmp/spotify-full/smali_classes9/com/spotify/player/model/ContextTrack$Metadata.smali-322-.end method

## Click/listener neighborhoods around button-ID matches
### /tmp/spotify-full/smali_classes9/p/ro61.smali
2628-    .line 897
2629-    iget-object v6, v0, Lp/ro61;->u1:Lp/s1e1;
2630-
2631-    .line 898
2632-    .line 899
2633-    iget-object v9, v6, Lp/s1e1;->b:Ljava/lang/Object;
2634-
2635-    .line 900
2636-    .line 901
2637-    check-cast v9, Lp/lq0;
2638-
2639-    .line 902
2640-    .line 903
2641-    invoke-static {v9, v4}, Lp/ro61;->b(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
2642-
2643-    .line 904
2644-    .line 905
2645-    .line 906
2646-    move-result-object v9
2647-
2648-    .line 907
2649-    iget-object v9, v9, Lp/hxt;->t:Landroid/view/View;
2650-
2651-    .line 908
2652-    .line 909
2653-    iget-object v10, v6, Lp/s1e1;->c:Ljava/lang/Object;
2654-
2655-    .line 910
2656-    .line 911
2657-    check-cast v10, Lp/izh;
2658-
2659-    .line 912
2660-    .line 913
2661-    invoke-static {v10, v4}, Lp/ro61;->b(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
2662-
2663-    .line 914
2664-    .line 915
2665-    .line 916
2666-    move-result-object v10
2667-
2668-    .line 917
2669-    iget-object v10, v10, Lp/hxt;->t:Landroid/view/View;
2670-
2671-    .line 918
2672-    .line 919
2673-    iget-object v6, v6, Lp/s1e1;->d:Ljava/lang/Object;
2674-
2675-    .line 920
2676-    .line 921
2677-    check-cast v6, Lp/rxt;
2678-
2679-    .line 922
2680-    .line 923
2681-    invoke-static {v6, v4}, Lp/ro61;->b(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
2682-
2683-    .line 924
2684-    .line 925
2685-    .line 926
2686-    move-result-object v6
2687-
2688-    .line 927
2689-    iget-object v6, v6, Lp/hxt;->t:Landroid/view/View;
2690-
2691-    .line 928
2692-    .line 929
2693-    invoke-static {v9, v10, v6, v4}, Lp/jq60;->G(Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroidx/constraintlayout/widget/ConstraintLayout;)V
2694-
2695-    .line 930
2696-    .line 931
2697-    .line 932
2698-    iget-object v4, v0, Lp/ro61;->S0:Lp/oge0;
2699-
2700-    .line 933
2701-    .line 934
2702-    iget-object v6, v0, Lp/ro61;->m1:Lio/reactivex/rxjava3/internal/operators/flowable/FlowableDistinctUntilChanged;
2703-
2704-    .line 935
2705-    .line 936
2706-    invoke-static {v4, v6}, Lp/oge0;->j(Lp/oge0;Lio/reactivex/rxjava3/internal/operators/flowable/FlowableDistinctUntilChanged;)Lp/okj0;
2707-
2708-    .line 937
2709-    .line 938
2710-    .line 939
2711-    move-result-object v4
2712-
2713-    .line 940
2714-    iput-object v4, v0, Lp/ro61;->H1:Lp/okj0;
2715-
2716-    .line 941
2717-    .line 942
2718-    iget-object v4, v0, Lp/ro61;->w1:Lcom/spotify/nowplaying/uiusecases/overlay/OverlayHidingGradientBackgroundView;
2719-
2720-    .line 943
2721-    .line 944
2722-    const-string v6, "modeRootView"
2723-
2724-    .line 945
2725-    .line 946
2726-    if-eqz v4, :cond_d
2727-
2728-    .line 947
2729-    .line 948
2730-    const v9, 0x7f0b1115
2731-
2732-    .line 949
2733-    .line 950
2734-    .line 951
2735-    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;
2736-
2737-    .line 952
2738-    .line 953
2739-    .line 954
2740-    move-result-object v9
2741-
2742-    .line 955
2743-    invoke-virtual {v4, v9}, Lcom/spotify/nowplaying/uiusecases/overlay/OverlayHidingFrameLayout;->setOverlayView(Landroid/view/View;)V
2744-
2745-    .line 956
2746-    .line 957
2747-    .line 958
2748:    const v4, 0x7f0b0eb1
2749-
2750-    .line 959
2751-    .line 960
2752-    .line 961
2753-    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;
2754-
2755-    .line 962
2756-    .line 963
2757-    .line 964
2758-    move-result-object v4
2759-
2760-    .line 965
2761-    if-eqz v4, :cond_5
2762-
2763-    .line 966
2764-    .line 967
2765-    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
2766-
2767-    .line 968
2768-    .line 969
2769-    .line 970
2770-    move-result-object v9
2771-
2772-    .line 971
2773-    check-cast v9, Landroid/view/ViewGroup;
2774-
2775-    .line 972
2776-    .line 973
2777-    new-instance v10, Lp/kk21;
2778-
2779-    .line 974
2780-    .line 975
2781-    const/4 v12, 0x5
2782-
2783-    .line 976
2784-    const/4 v13, 0x0
2785-
2786-    .line 977
2787-    invoke-direct {v10, v12, v13}, Lp/kk21;-><init>(ILp/gh00;)V
2788-
2789-    .line 978
2790-    .line 979
2791-    .line 980
2792-    const/4 v14, 0x3
2793-
2794-    .line 981
2795-    invoke-static {v5, v13, v13, v14}, Lp/w9h1;->y(Lp/ry8;Landroid/view/ViewGroup$LayoutParams;Lcom/spotify/nowplaying/scroll/ScrollCardType;I)Lp/rxt;
2796-
2797-    .line 982
2798-    .line 983
2799-    .line 984
2800-    move-result-object v5
2801-
2802-    .line 985
2803-    invoke-static {v5, v9, v10}, Lp/ro61;->c(Lp/cut;Landroid/view/ViewGroup;Ljava/lang/Object;)Lp/hxt;
2804-
2805-    .line 986
2806-    .line 987
2807-    .line 988
2808-    move-result-object v5
2809-
2810-    .line 989
2811-    iget-object v5, v5, Lp/hxt;->t:Landroid/view/View;
2812-
2813-    .line 990
2814-    .line 991
2815-    invoke-static {v4, v5}, Lp/psg1;->H(Landroid/view/View;Landroid/view/View;)V
2816-
2817-    .line 992
2818-    .line 993
2819-    .line 994
2820-    :cond_5
2821-    iget-object v4, v0, Lp/ro61;->w1:Lcom/spotify/nowplaying/uiusecases/overlay/OverlayHidingGradientBackgroundView;
2822-
2823-    .line 995
2824-    .line 996
2825-    if-eqz v4, :cond_c
2826-
2827-    .line 997
2828-    .line 998
2829-    iget-object v5, v0, Lp/ro61;->x1:Landroidx/constraintlayout/widget/ConstraintLayout;
2830-
2831-    .line 999
2832-    .line 1000
2833-    if-eqz v5, :cond_b
2834-
2835-    .line 1001
2836-    .line 1002
2837-    iget-object v6, v0, Lp/ro61;->G1:Landroidx/constraintlayout/widget/ConstraintLayout;
2838-
2839-    .line 1003
2840-    .line 1004
2841-    if-eqz v6, :cond_a
2842-
2843-    .line 1005
2844-    .line 1006
2845-    new-instance v7, Lp/gvp;
2846-
2847-    .line 1007
2848-    .line 1008
2849-    const/4 v14, 0x3
2850-
2851-    .line 1009
2852-    invoke-direct {v7, v1, v14}, Lp/gvp;-><init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;I)V
2853-
2854-    .line 1010
2855-    .line 1011
2856-    .line 1012
2857-    new-instance v9, Lp/oo61;
2858-
2859-    .line 1013
2860-    .line 1014
2861-    const/4 v10, 0x0
2862-
2863-    .line 1015
2864-    invoke-direct {v9, v0, v7, v10}, Lp/oo61;-><init>(Lp/ro61;Lp/gvp;I)V
2865-
2866-    .line 1016
2867-    .line 1017
2868-    .line 1018
2869-    invoke-static {v4, v9}, Lp/nsg1;->s(Landroid/view/View;Lp/eh00;)V
2870-
2871-    .line 1019
2872-    .line 1020
2873-    .line 1021
2874-    new-instance v4, Lp/oo61;
2875-
2876-    .line 1022
2877-    .line 1023
2878-    const/4 v9, 0x1
2879-
2880-    .line 1024
2881-    invoke-direct {v4, v0, v7, v9}, Lp/oo61;-><init>(Lp/ro61;Lp/gvp;I)V
2882-
2883-    .line 1025
2884-    .line 1026
2885-    .line 1027
2886-    invoke-static {v5, v4}, Lp/nsg1;->s(Landroid/view/View;Lp/eh00;)V
2887-
2888-    .line 1028
2889-    .line 1029
2890-    .line 1030
2891-    new-instance v4, Lp/oo61;
2892-
2893-    .line 1031
2894-    .line 1032
2895-    const/4 v5, 0x2
2896-
2897-    .line 1033
2898-    invoke-direct {v4, v0, v7, v5}, Lp/oo61;-><init>(Lp/ro61;Lp/gvp;I)V
2899-
2900-    .line 1034
2901-    .line 1035
2902-    .line 1036
2903-    invoke-static {v3, v4}, Lp/nsg1;->s(Landroid/view/View;Lp/eh00;)V
2904-
2905-    .line 1037
2906-    .line 1038
2907-    .line 1039
2908-    new-instance v3, Lp/oo61;
2909-
2910-    .line 1040
2911-    .line 1041
2912-    invoke-direct {v3, v0, v7, v14}, Lp/oo61;-><init>(Lp/ro61;Lp/gvp;I)V
2913-
2914-    .line 1042
2915-    .line 1043
2916-    .line 1044
2917-    invoke-static {v8, v3}, Lp/nsg1;->s(Landroid/view/View;Lp/eh00;)V
2918-
2919-    .line 1045
2920-    .line 1046
2921-    .line 1047
2922-    new-instance v3, Lp/oo61;
2923-
2924-    .line 1048
2925-    .line 1049
2926-    const/4 v4, 0x4
2927-
2928-    .line 1050

#### method declarations
147:.method public constructor <init>(Lp/eju;Lp/li0;Lp/hm;Lp/cxb;Lp/cxb;Lp/oge0;Lp/zs0;Lio/reactivex/rxjava3/internal/operators/flowable/FlowableMap;Lp/d2n;Lp/o7a;Lp/hc81;Lp/hc81;Lp/wb4;Lp/c06;Lp/gzk;Lp/og81;Lp/a3k;Lp/l6p;Lp/yf00;Lp/nh61;Lp/tey;Lp/l3d0;Lp/oge0;Lp/z9p;Lp/hzj;Lp/kv91;Lp/lt91;Lp/qu91;Lp/sef0;Lp/vbz0;Lp/oo11;Lp/lq0;Lp/lq0;Lp/bwt0;Lp/vyr0;Lp/vvv0;Lp/iv0;Lp/okj0;Lp/b7v0;Lp/jo20;Lp/ood0;Lp/b9k;Lp/w9r0;Lp/du;Lp/zaz0;Lio/reactivex/rxjava3/internal/operators/flowable/FlowableObserveOn;Lio/reactivex/rxjava3/internal/operators/flowable/FlowableJust;Lio/reactivex/rxjava3/internal/operators/flowable/FlowableDistinctUntilChanged;Lp/x4j0;ILp/gj4;Lp/lc4;Lp/luk;Lp/xul0;)V
563:.method public static b(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
671:.method public static c(Lp/cut;Landroid/view/ViewGroup;Ljava/lang/Object;)Lp/hxt;
851:.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
4596:.method public final destroy()V
4626:.method public final getLifecycle()Lp/gb80;
4652:.method public final start()V
5421:.method public final stop()V

#### listener/click/player calls
396-    iget-object p4, p2, Lp/tgq;->b:Ljava/lang/Object;
397-
398-    check-cast p4, Landroid/content/Context;
399-
400-    const/4 p5, 0x0
401-
402-    .line 59
403-    invoke-direct {p3, p4, p5}, Lp/awo;-><init>(Landroid/content/Context;I)V
404-
405-    move-object/from16 p4, p41
406-
407-    .line 60
408:    invoke-virtual {p4, p3}, Lp/ood0;->h(Lp/ovf;)Lp/b7v0;
409-
410-    move-result-object p3
411-
412-    sget-object p4, Lp/el61;->i:Lp/el61;
413-
414-    .line 61
415-    new-instance p5, Lp/bjc0;
416-
417-    invoke-direct {p5, p3, p4}, Lp/bjc0;-><init>(Lp/qy8;Lp/gh00;)V
418-
419-    .line 62
420-    iput-object p5, p0, Lp/ro61;->t1:Lp/bjc0;
421-
422-    .line 63
423-    new-instance p3, Lp/s1e1;
424-
425-    .line 64
426-    invoke-static {p1}, Lp/emk;->s(Lp/eju;)Lp/ovf;
427-
428-    move-result-object p1
429-
430-    move-object/from16 p4, p43
431-
432:    invoke-virtual {p4, p1}, Lp/w9r0;->B(Lp/ovf;)Lp/lq0;
433-
434-    move-result-object p1
435-
436-    .line 65
437-    new-instance p4, Lp/f6q;
438-
439-    .line 66
440-    iget-object p2, p2, Lp/tgq;->b:Ljava/lang/Object;
441-
442-    check-cast p2, Landroid/content/Context;
443-
444-    const/4 p5, 0x0
445-
446-    .line 67
447-    invoke-direct {p4, p2, p5}, Lp/f6q;-><init>(Landroid/content/Context;I)V
448-
449-    move-object/from16 p2, p42
450-
451-    .line 68
452-    invoke-static {p2, p4}, Lp/b9k;->f(Lp/b9k;Lp/ovf;)Lp/izh;
453-
454-    move-result-object p2
455-
456-    const/4 p4, 0x3
457-
458-    const/4 p5, 0x0
459-
460-    move-object/from16 p6, p44
461-
462-    .line 69
--
559-
560-    return-void
561-.end method
562-
563-.method public static b(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
564-    .locals 7
565-
566-    .line 1
567-    sget-object v0, Lp/hxt;->w:Lp/up60;
568-
569-    .line 2
570-    .line 3
571:    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;
572-
573-    .line 4
574-    .line 5
575-    .line 6
576-    move-result-object v1
577-
578-    .line 7
579-    const/4 v5, 0x0
580-
581-    .line 8
582-    const/16 v6, 0x70
583-
584-    .line 9
585-    .line 10
586-    sget-object v4, Lp/w2a1;->a:Lp/w2a1;
587-
588-    .line 11
589-    .line 12
590-    move-object v3, p0
591-
592-    .line 13
593-    move-object v2, p1
594-
595-    .line 14
596-    invoke-static/range {v1 .. v6}, Lp/ia7;->m(Landroid/content/Context;Landroid/view/ViewGroup;Lp/qy8;Ljava/lang/Object;Lp/gw41;I)Lp/hxt;
597-
598-    .line 15
599-    .line 16
600-    .line 17
601-    move-result-object p0
--
667-    .line 81
668-    .line 82
669-.end method
670-
671-.method public static c(Lp/cut;Landroid/view/ViewGroup;Ljava/lang/Object;)Lp/hxt;
672-    .locals 7
673-
674-    .line 1
675-    sget-object v0, Lp/hxt;->w:Lp/up60;
676-
677-    .line 2
678-    .line 3
679:    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;
680-
681-    .line 4
682-    .line 5
683-    .line 6
684-    move-result-object v1
685-
686-    .line 7
687-    const/4 v5, 0x0
688-
689-    .line 8
690-    const/16 v6, 0x70
691-
692-    .line 9
693-    .line 10
694-    move-object v3, p0
695-
696-    .line 11
697-    move-object v2, p1
698-
699-    .line 12
700-    move-object v4, p2
701-
702-    .line 13
703-    invoke-static/range {v1 .. v6}, Lp/ia7;->m(Landroid/content/Context;Landroid/view/ViewGroup;Lp/qy8;Ljava/lang/Object;Lp/gw41;I)Lp/hxt;
704-
705-    .line 14
706-    .line 15
707-    .line 16
708-    move-result-object p0
709-
--
863-    .line 6
864-    const/4 v2, 0x0
865-
866-    .line 7
867-    move-object/from16 v3, p1
868-
869-    .line 8
870-    .line 9
871-    move-object/from16 v4, p2
872-
873-    .line 10
874-    .line 11
875:    invoke-virtual {v3, v1, v4, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
876-
877-    .line 12
878-    .line 13
879-    .line 14
880-    move-result-object v1
881-
882-    .line 15
883-    check-cast v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;
884-
885-    .line 16
886-    .line 17
887-    const v3, 0x7f0b0bbf
888-
889-    .line 18
890-    .line 19
891-    .line 20
892:    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
893-
894-    .line 21
895-    .line 22
896-    .line 23
897-    move-result-object v3
898-
899-    .line 24
900-    check-cast v3, Lcom/spotify/nowplaying/uiusecases/overlay/OverlayHidingGradientBackgroundView;
901-
902-    .line 25
903-    .line 26
904-    iput-object v3, v0, Lp/ro61;->w1:Lcom/spotify/nowplaying/uiusecases/overlay/OverlayHidingGradientBackgroundView;
905-
906-    .line 27
907-    .line 28
908-    const v3, 0x7f0b0c67
909-
910-    .line 29
911-    .line 30
912-    .line 31
913:    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
914-
915-    .line 32
916-    .line 33
917-    .line 34
918-    move-result-object v3
919-
920-    .line 35
921-    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;
922-
923-    .line 36
924-    .line 37
925-    iput-object v3, v0, Lp/ro61;->x1:Landroidx/constraintlayout/widget/ConstraintLayout;
926-
927-    .line 38
928-    .line 39
929-    const v3, 0x7f0b0936
930-
931-    .line 40
932-    .line 41
933-    .line 42
934:    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
935-
936-    .line 43
937-    .line 44
938-    .line 45
939-    move-result-object v3
940-
941-    .line 46
942-    iput-object v3, v0, Lp/ro61;->y1:Landroid/view/View;
943-
944-    .line 47
945-    .line 48
946-    iget-object v3, v0, Lp/ro61;->k1:Lp/zaz0;
947-
948-    .line 49
949-    .line 50
950-    const/4 v4, 0x0
951-
952-    .line 51
953-    const/4 v5, 0x3
954-
955-    .line 52
956-    invoke-static {v3, v4, v4, v5}, Lp/w9h1;->y(Lp/ry8;Landroid/view/ViewGroup$LayoutParams;Lcom/spotify/nowplaying/scroll/ScrollCardType;I)Lp/rxt;
957-
958-    .line 53
959-    .line 54
960-    .line 55
961-    move-result-object v3
962-
963-    .line 56
964-    iget-object v6, v0, Lp/ro61;->x1:Landroidx/constraintlayout/widget/ConstraintLayout;
--
1024-    invoke-static {v9, v10}, Lp/ro61;->b(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
1025-
1026-    .line 87
1027-    .line 88
1028-    .line 89
1029-    move-result-object v9
1030-
1031-    .line 90
1032-    iget-object v9, v9, Lp/hxt;->t:Landroid/view/View;
1033-
1034-    .line 91
1035-    .line 92
1036:    invoke-virtual {v8, v9}, Lp/ro80;->add(Ljava/lang/Object;)Z
1037-
1038-    .line 93
1039-    .line 94
1040-    .line 95
1041-    iget-object v9, v0, Lp/ro61;->b:Lp/li0;
1042-
1043-    .line 96
1044-    .line 97
1045-    invoke-static {v9, v4, v4, v5}, Lp/w9h1;->y(Lp/ry8;Landroid/view/ViewGroup$LayoutParams;Lcom/spotify/nowplaying/scroll/ScrollCardType;I)Lp/rxt;
1046-
1047-    .line 98
1048-    .line 99
1049-    .line 100
1050-    move-result-object v9
1051-
1052-    .line 101
1053-    iget-object v10, v0, Lp/ro61;->x1:Landroidx/constraintlayout/widget/ConstraintLayout;
1054-
1055-    .line 102
1056-    .line 103
1057-    if-eqz v10, :cond_16
1058-
1059-    .line 104
1060-    .line 105
1061-    invoke-static {v9, v10}, Lp/ro61;->b(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
1062-
1063-    .line 106
1064-    .line 107
1065-    .line 108
1066-    move-result-object v9
1067-
1068-    .line 109
1069-    iget-object v9, v9, Lp/hxt;->t:Landroid/view/View;
1070-
1071-    .line 110
1072-    .line 111
1073:    invoke-virtual {v8, v9}, Lp/ro80;->add(Ljava/lang/Object;)Z
1074-
1075-    .line 112
1076-    .line 113
1077-    .line 114
1078-    invoke-static {v8}, Lp/geg1;->m(Ljava/util/List;)Lp/ro80;
1079-
1080-    .line 115
1081-    .line 116
1082-    .line 117
1083-    move-result-object v8
1084-
1085-    .line 118
1086-    iget-object v9, v0, Lp/ro61;->a:Lp/eju;
1087-
1088-    .line 119
1089-    .line 120
1090-    iget-object v10, v9, Lp/eju;->d:Lp/t7q;
1091-
1092-    .line 121
1093-    .line 122
1094-    new-instance v11, Lp/s8p;
1095-
1096-    .line 123
1097-    .line 124
1098-    iget-object v10, v10, Lp/t7q;->b:Ljava/lang/Object;
1099-
1100-    .line 125
1101-    .line 126
1102-    check-cast v10, Landroid/content/Context;
1103-
1104-    .line 127
1105-    .line 128
1106-    invoke-direct {v11, v10}, Lp/s8p;-><init>(Landroid/content/Context;)V
1107-
1108-    .line 129
1109-    .line 130
1110-    .line 131
1111-    iget-object v10, v0, Lp/ro61;->d:Lp/cxb;
1112-
1113-    .line 132
1114-    .line 133
1115:    invoke-virtual {v10, v11}, Lp/cxb;->m(Lp/ovf;)Lp/e23;
1116-
1117-    .line 134
1118-    .line 135
1119-    .line 136
1120-    move-result-object v10
1121-
1122-    .line 137
1123-    iget-object v11, v0, Lp/ro61;->x1:Landroidx/constraintlayout/widget/ConstraintLayout;
1124-
1125-    .line 138
1126-    .line 139
1127-    if-eqz v11, :cond_15
1128-
1129-    .line 140
1130-    .line 141
1131-    invoke-static {v10, v11}, Lp/ro61;->b(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
1132-
1133-    .line 142
1134-    .line 143
1135-    .line 144
1136-    move-result-object v10
1137-
1138-    .line 145
1139-    iget-object v10, v10, Lp/hxt;->t:Landroid/view/View;
1140-
1141-    .line 146
1142-    .line 147
1143-    invoke-static {}, Lp/geg1;->o()Lp/ro80;
1144-
1145-    .line 148
1146-    .line 149
1147-    .line 150
1148-    move-result-object v11
1149-
1150-    .line 151
1151:    invoke-virtual {v11, v3}, Lp/ro80;->add(Ljava/lang/Object;)Z
1152-
1153-    .line 152
1154-    .line 153
1155-    .line 154
1156-    iget-object v3, v9, Lp/eju;->a:Lp/tgq;
1157-
1158-    .line 155
1159-    .line 156
1160-    new-instance v12, Lp/v8p;
1161-
1162-    .line 157
1163-    .line 158
1164-    iget-object v3, v3, Lp/tgq;->b:Ljava/lang/Object;
1165-
1166-    .line 159
1167-    .line 160
1168-    check-cast v3, Landroid/content/Context;
1169-
1170-    .line 161
1171-    .line 162
1172-    invoke-direct {v12, v3}, Lp/v8p;-><init>(Landroid/content/Context;)V
1173-
1174-    .line 163
1175-    .line 164
1176-    .line 165
1177-    iget-object v3, v0, Lp/ro61;->e:Lp/cxb;
1178-
1179-    .line 166
1180-    .line 167
1181-    iget-object v13, v0, Lp/ro61;->l1:Lio/reactivex/rxjava3/internal/operators/flowable/FlowableObserveOn;
1182-
1183-    .line 168
1184-    .line 169
1185-    iget-object v14, v0, Lp/ro61;->U0:Lp/hzj;
1186-
1187-    .line 170
1188-    .line 171
1189:    invoke-virtual {v3, v13, v14, v12}, Lp/cxb;->n(Lio/reactivex/rxjava3/core/Flowable;Lp/gh00;Lp/ovf;)Lp/a3k;
1190-
1191-    .line 172
1192-    .line 173
1193-    .line 174
1194-    move-result-object v3
1195-
1196-    .line 175
1197-    iget-object v12, v0, Lp/ro61;->x1:Landroidx/constraintlayout/widget/ConstraintLayout;
1198-
1199-    .line 176
1200-    .line 177
1201-    if-eqz v12, :cond_14
1202-
1203-    .line 178
1204-    .line 179
1205-    invoke-static {v3, v12}, Lp/ro61;->b(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
1206-
1207-    .line 180
1208-    .line 181
1209-    .line 182
1210-    move-result-object v3
1211-
1212-    .line 183
1213-    iget-object v3, v3, Lp/hxt;->t:Landroid/view/View;
1214-
1215-    .line 184
1216-    .line 185
1217:    invoke-virtual {v11, v3}, Lp/ro80;->add(Ljava/lang/Object;)Z
1218-
1219-    .line 186
1220-    .line 187
1221-    .line 188
1222-    invoke-static {v11}, Lp/geg1;->m(Ljava/util/List;)Lp/ro80;
1223-
1224-    .line 189
1225-    .line 190
1226-    .line 191
1227-    move-result-object v3
1228-
1229-    .line 192
1230-    invoke-static {v6, v8, v10, v3}, Lp/jq60;->H(Landroidx/constraintlayout/widget/ConstraintLayout;Ljava/util/List;Landroid/view/View;Ljava/util/List;)V
1231-
1232-    .line 193
1233-    .line 194
1234-    .line 195
1235-    iget-object v3, v9, Lp/eju;->c:Lp/dju;
1236-
1237-    .line 196
1238-    .line 197
1239-    new-instance v6, Lp/qcq;
1240-
1241-    .line 198
1242-    .line 199
1243-    iget-object v3, v3, Lp/dju;->b:Landroid/content/Context;
1244-
1245-    .line 200
1246-    .line 201
1247-    invoke-direct {v6, v3}, Lp/qcq;-><init>(Landroid/content/Context;)V
1248-
1249-    .line 202
1250-    .line 203
1251-    .line 204
1252-    iget-object v3, v0, Lp/ro61;->J1:Lp/wg61;
1253-
1254-    .line 205
1255-    .line 206
1256:    invoke-virtual {v3}, Lp/wg61;->getValue()Ljava/lang/Object;
1257-
1258-    .line 207
1259-    .line 208
1260-    .line 209
1261-    move-result-object v3
1262-
1263-    .line 210
1264-    check-cast v3, Lp/sdk0;
1265-
1266-    .line 211
1267-    .line 212
1268-    iget-object v3, v3, Lp/sdk0;->g:Lp/g6m0;
1269-
1270-    .line 213
1271-    .line 214
1272-    new-instance v8, Lp/tf41;
1273-
1274-    .line 215
1275-    .line 216
1276-    const/4 v15, 0x0
1277-
1278-    .line 217
1279-    const/16 v16, 0x4
1280-
1281-    .line 218
1282-    .line 219
1283-    const/4 v9, 0x1
1284-
1285-    .line 220
1286-    iget-object v10, v0, Lp/ro61;->I1:Lio/reactivex/rxjava3/processors/ReplayProcessor;
--
1306-
1307-    .line 230
1308-    .line 231
1309-    .line 232
1310-    iget-object v9, v0, Lp/ro61;->f:Lp/oge0;
1311-
1312-    .line 233
1313-    .line 234
1314-    iget-object v10, v0, Lp/ro61;->v1:Ljava/util/List;
1315-
1316-    .line 235
1317-    .line 236
1318:    invoke-virtual {v9, v10, v3, v8}, Lp/oge0;->i(Ljava/util/List;Lp/t9p0;Lp/gh00;)Lp/hbk0;
1319-
1320-    .line 237
1321-    .line 238
1322-    .line 239
1323-    move-result-object v3
1324-
1325-    .line 240
1326:    invoke-virtual {v6, v3}, Lp/qcq;->A(Lp/wt81;)V
1327-
1328-    .line 241
1329-    .line 242
1330-    .line 243
1331-    iget-object v3, v0, Lp/ro61;->Z:Lp/wb4;
1332-
1333-    .line 244
1334-    .line 245
1335:    invoke-virtual {v3}, Lp/wb4;->b()Z
1336-
1337-    .line 246
1338-    .line 247
1339-    .line 248
1340-    move-result v3
1341-
1342-    .line 249
1343-    if-eqz v3, :cond_0
1344-
1345-    .line 250
1346-    .line 251
1347-    iget-object v3, v0, Lp/ro61;->Y:Lp/hc81;
1348-
1349-    .line 252
1350-    .line 253
1351-    invoke-static {v3, v6}, Lp/hc81;->a(Lp/hc81;Lp/qcq;)Lp/wk0;
1352-
1353-    .line 254
1354-    .line 255
1355-    .line 256
1356-    move-result-object v3
1357-
1358-    .line 257
1359-    invoke-static {v3, v1}, Lp/ro61;->b(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
1360-
1361-    .line 258
1362-    .line 259
1363-    .line 260
1364-    move-result-object v3
1365-
--
1398-    .line 276
1399-    .line 277
1400-    iget-object v3, v6, Lp/qcq;->a:Lp/rc81;
1401-
1402-    .line 278
1403-    .line 279
1404-    :goto_0
1405-    const v6, 0x7f0b1116
1406-
1407-    .line 280
1408-    .line 281
1409-    .line 282
1410:    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;
1411-
1412-    .line 283
1413-    .line 284
1414-    .line 285
1415-    move-result-object v6
1416-
1417-    .line 286
1418-    invoke-static {v6, v3}, Lp/psg1;->H(Landroid/view/View;Landroid/view/View;)V
1419-
1420-    .line 287
1421-    .line 288
1422-    .line 289
1423-    const v6, 0x7f0b109f
1424-
1425-    .line 290
1426-    .line 291
1427-    .line 292
1428:    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;
1429-
1430-    .line 293
1431-    .line 294
1432-    .line 295
1433-    move-result-object v6
1434-
1435-    .line 296
1436-    move-object v8, v6
1437-
1438-    .line 297
1439-    check-cast v8, Landroidx/constraintlayout/widget/ConstraintLayout;
1440-
1441-    .line 298
1442-    .line 299
1443-    const v6, 0x7f0b0615
1444-
1445-    .line 300
1446-    .line 301
1447-    .line 302
1448:    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;
1449-
1450-    .line 303
1451-    .line 304
1452-    .line 305
1453-    move-result-object v6
1454-
1455-    .line 306
1456-    move-object v12, v6
1457-
1458-    .line 307
1459-    check-cast v12, Landroid/widget/LinearLayout;
1460-
1461-    .line 308
1462-    .line 309
1463-    iget-object v6, v0, Lp/ro61;->o1:Lp/gj4;
1464-
1465-    .line 310
1466-    .line 311
1467:    invoke-virtual {v6}, Lp/gj4;->a()Z
1468-
1469-    .line 312
1470-    .line 313
1471-    .line 314
1472-    move-result v9
1473-
1474-    .line 315
1475-    const/4 v15, 0x6
1476-
1477-    .line 316
1478-    const/4 v10, 0x1
1479-
1480-    .line 317
1481-    iget-object v11, v0, Lp/ro61;->j1:Lp/jo20;
1482-
1483-    .line 318
1484-    .line 319
1485-    if-eqz v9, :cond_1
1486-
1487-    .line 320
1488-    .line 321
1489-    move-object v9, v4
1490-
1491-    .line 322
1492-    goto :goto_1
1493-
1494-    .line 323
1495-    :cond_1
1496-    invoke-static {v8}, Lp/wj50;->p(Ljava/lang/Object;)V
1497-
--
1537-    .line 345
1538-    .line 346
1539-    :goto_1
1540-    invoke-static {v8}, Lp/wj50;->p(Ljava/lang/Object;)V
1541-
1542-    .line 347
1543-    .line 348
1544-    .line 349
1545-    sget-object v13, Lp/hxt;->w:Lp/up60;
1546-
1547-    .line 350
1548-    .line 351
1549:    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;
1550-
1551-    .line 352
1552-    .line 353
1553-    .line 354
1554-    move-result-object v13
1555-
1556-    .line 355
1557-    iget-object v14, v0, Lp/ro61;->N0:Lp/og81;
1558-
1559-    .line 356
1560-    .line 357
1561-    const/16 v15, 0x18
1562-
1563-    .line 358
1564-    .line 359
1565-    invoke-static {v13, v8, v14, v4, v15}, Lp/ia7;->n(Landroid/content/Context;Landroid/view/ViewGroup;Lp/qy8;Lp/gw41;I)Lp/hxt;
1566-
1567-    .line 360
1568-    .line 361
1569-    .line 362
1570-    move-result-object v13
1571-
1572-    .line 363
1573-    iget-object v14, v13, Lp/hxt;->t:Landroid/view/View;
1574-
1575-    .line 364
1576-    .line 365
1577-    iput-object v14, v0, Lp/ro61;->z1:Landroid/view/View;
1578-
1579-    .line 366
--
1581-    iput-object v13, v0, Lp/ro61;->A1:Lp/hxt;
1582-
1583-    .line 368
1584-    .line 369
1585-    iget-object v13, v0, Lp/ro61;->I1:Lio/reactivex/rxjava3/processors/ReplayProcessor;
1586-
1587-    .line 370
1588-    .line 371
1589-    iget-object v14, v0, Lp/ro61;->M0:Lp/gzk;
1590-
1591-    .line 372
1592-    .line 373
1593:    invoke-virtual {v13, v14}, Lio/reactivex/rxjava3/core/Flowable;->j(Lio/reactivex/rxjava3/core/FlowableTransformer;)Lio/reactivex/rxjava3/core/Flowable;
1594-
1595-    .line 374
1596-    .line 375
1597-    .line 376
1598-    move-result-object v13
1599-
1600-    .line 377
1601-    sget-object v14, Lp/dlr0;->R0:Lp/dlr0;
1602-
1603-    .line 378
1604-    .line 379
1605:    invoke-virtual {v13, v14}, Lio/reactivex/rxjava3/core/Flowable;->J(Lio/reactivex/rxjava3/functions/Function;)Lio/reactivex/rxjava3/internal/operators/flowable/FlowableMap;
1606-
1607-    .line 380
1608-    .line 381
1609-    .line 382
1610-    move-result-object v13
1611-
1612-    .line 383
1613-    iget-object v14, v0, Lp/ro61;->L0:Lp/c06;
1614-
1615-    .line 384
1616-    .line 385
1617:    invoke-virtual {v14, v13}, Lp/c06;->p(Lio/reactivex/rxjava3/core/Flowable;)Lp/a96;
1618-
1619-    .line 386
1620-    .line 387
1621-    .line 388
1622-    move-result-object v13
1623-
1624-    .line 389
1625:    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;
1626-
1627-    .line 390
1628-    .line 391
1629-    .line 392
1630-    move-result-object v14
1631-
1632-    .line 393
1633-    invoke-static {v14, v8, v13, v4, v15}, Lp/ia7;->n(Landroid/content/Context;Landroid/view/ViewGroup;Lp/qy8;Lp/gw41;I)Lp/hxt;
1634-
1635-    .line 394
1636-    .line 395
1637-    .line 396
1638-    move-result-object v13
1639-
1640-    .line 397
1641-    iput-object v13, v0, Lp/ro61;->E1:Lp/hxt;
1642-
1643-    .line 398
1644-    .line 399
1645-    iget-object v13, v13, Lp/hxt;->t:Landroid/view/View;
1646-
1647-    .line 400
1648-    .line 401
1649-    move v14, v10
1650-
1651-    .line 402
1652-    iget-object v10, v0, Lp/ro61;->z1:Landroid/view/View;
1653-
1654-    .line 403
1655-    .line 404
--
1702-
1703-    .line 426
1704-    invoke-static/range {v8 .. v14}, Lp/jq60;->K(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/widget/LinearLayout;Landroid/view/View;Landroid/view/View;)V
1705-
1706-    .line 427
1707-    .line 428
1708-    .line 429
1709-    const v9, 0x7f0b0e53
1710-
1711-    .line 430
1712-    .line 431
1713-    .line 432
1714:    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;
1715-
1716-    .line 433
1717-    .line 434
1718-    .line 435
1719-    move-result-object v9
1720-
1721-    .line 436
1722-    invoke-static {v9}, Lp/wj50;->p(Ljava/lang/Object;)V
1723-
1724-    .line 437
1725-    .line 438
1726-    .line 439
1727:    invoke-virtual {v9}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
1728-
1729-    .line 440
1730-    .line 441
1731-    .line 442
1732-    move-result-object v10
1733-
1734-    .line 443
1735-    new-instance v11, Lp/no61;
1736-
1737-    .line 444
1738-    .line 445
1739-    invoke-direct {v11, v0, v2}, Lp/no61;-><init>(Lp/ro61;I)V
1740-
1741-    .line 446
1742-    .line 447
1743-    .line 448
1744-    new-instance v12, Lp/no61;
1745-
1746-    .line 449
1747-    .line 450
1748-    invoke-direct {v12, v0, v5}, Lp/no61;-><init>(Lp/ro61;I)V
1749-
1750-    .line 451
1751-    .line 452
1752-    .line 453
1753-    iget-object v13, v0, Lp/ro61;->Y0:Lp/sef0;
1754-
1755-    .line 454
1756-    .line 455
1757:    invoke-virtual {v13, v11, v12}, Lp/sef0;->n(Lp/eh00;Lp/eh00;)Lp/cut;
1758-
1759-    .line 456
1760-    .line 457
1761-    .line 458
1762-    move-result-object v11
1763-
1764-    .line 459
1765-    check-cast v10, Landroid/view/ViewGroup;
1766-
1767-    .line 460
1768-    .line 461
1769-    invoke-static {v11, v10}, Lp/ro61;->b(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
1770-
1771-    .line 462
1772-    .line 463
1773-    .line 464
1774-    move-result-object v10
1775-
1776-    .line 465
1777-    iget-object v10, v10, Lp/hxt;->t:Landroid/view/View;
1778-
1779-    .line 466
1780-    .line 467
1781-    invoke-static {v9, v10}, Lp/psg1;->H(Landroid/view/View;Landroid/view/View;)V
1782-
1783-    .line 468
1784-    .line 469
1785-    .line 470
1786-    const v9, 0x7f0b073d
1787-
1788-    .line 471
1789-    .line 472
1790-    .line 473
1791:    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;
1792-
1793-    .line 474
1794-    .line 475
1795-    .line 476
1796-    move-result-object v9
1797-
1798-    .line 477
1799-    check-cast v9, Landroidx/constraintlayout/widget/ConstraintLayout;
1800-
1801-    .line 478
1802-    .line 479
1803-    invoke-static {v9}, Lp/wj50;->p(Ljava/lang/Object;)V
1804-
1805-    .line 480
1806-    .line 481
1807-    .line 482
1808-    invoke-static {}, Lp/geg1;->o()Lp/ro80;
1809-
1810-    .line 483
1811-    .line 484
1812-    .line 485
1813-    move-result-object v10
1814-
1815-    .line 486
1816:    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;
1817-
1818-    .line 487
1819-    .line 488
1820-    .line 489
1821-    move-result-object v11
1822-
1823-    .line 490
1824-    iget-object v12, v0, Lp/ro61;->g:Lp/zs0;
1825-
1826-    .line 491
1827-    .line 492
1828:    invoke-virtual {v12}, Lp/zs0;->m()Lp/g87;
1829-
1830-    .line 493
1831-    .line 494
1832-    .line 495
1833-    move-result-object v12
1834-
1835-    .line 496
1836-    invoke-static {v11, v9, v12, v4, v15}, Lp/ia7;->n(Landroid/content/Context;Landroid/view/ViewGroup;Lp/qy8;Lp/gw41;I)Lp/hxt;
1837-
1838-    .line 497
1839-    .line 498
1840-    .line 499
1841-    move-result-object v11
1842-
1843-    .line 500
1844-    iput-object v11, v0, Lp/ro61;->C1:Lp/hxt;
1845-
1846-    .line 501
1847-    .line 502
1848-    iget-object v11, v11, Lp/hxt;->t:Landroid/view/View;
1849-
1850-    .line 503
1851-    .line 504
1852:    invoke-virtual {v10, v11}, Lp/ro80;->add(Ljava/lang/Object;)Z
1853-
1854-    .line 505
1855-    .line 506
1856-    .line 507
1857-    new-instance v18, Lp/ntv;
1858-
1859-    .line 508
1860-    .line 509
1861-    iget-object v11, v0, Lp/ro61;->i:Lp/d2n;
1862-
1863-    .line 510
1864-    .line 511
1865-    iget-object v12, v11, Lp/d2n;->e:Ljava/lang/Object;
1866-
1867-    .line 512
1868-    .line 513
1869-    move-object/from16 v19, v12
1870-
1871-    .line 514
1872-    .line 515
1873-    check-cast v19, Lio/reactivex/rxjava3/core/Flowable;
1874-
1875-    .line 516
1876-    .line 517
1877-    iget-object v12, v11, Lp/d2n;->b:Ljava/lang/Object;
1878-
1879-    .line 518
1880-    .line 519
1881-    move-object/from16 v20, v12
1882-
--
1962-    invoke-static {v11, v9, v5}, Lp/ro61;->c(Lp/cut;Landroid/view/ViewGroup;Ljava/lang/Object;)Lp/hxt;
1963-
1964-    .line 561
1965-    .line 562
1966-    .line 563
1967-    move-result-object v5
1968-
1969-    .line 564
1970-    iget-object v5, v5, Lp/hxt;->t:Landroid/view/View;
1971-
1972-    .line 565
1973-    .line 566
1974:    invoke-virtual {v10, v5}, Lp/ro80;->add(Ljava/lang/Object;)Z
1975-
1976-    .line 567
1977-    .line 568
1978-    .line 569
1979-    iget-object v5, v0, Lp/ro61;->t:Lp/o7a;
1980-
1981-    .line 570
1982-    .line 571
1983-    invoke-static {v5, v4, v4, v14}, Lp/opo;->G(Lp/dfo;Landroid/view/ViewGroup$LayoutParams;Lcom/spotify/nowplaying/scroll/ScrollCardType;I)Lp/kks;
1984-
1985-    .line 572
1986-    .line 573
1987-    .line 574
1988-    move-result-object v5
1989-
1990-    .line 575
1991:    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;
1992-
1993-    .line 576
1994-    .line 577
1995-    .line 578
1996-    move-result-object v11
1997-
1998-    .line 579
1999-    invoke-static {v11, v9, v5, v4, v15}, Lp/ia7;->n(Landroid/content/Context;Landroid/view/ViewGroup;Lp/qy8;Lp/gw41;I)Lp/hxt;
2000-
2001-    .line 580
2002-    .line 581
2003-    .line 582
2004-    move-result-object v5
2005-
2006-    .line 583
2007-    iput-object v5, v0, Lp/ro61;->D1:Lp/hxt;
2008-
2009-    .line 584
2010-    .line 585
2011-    iget-object v5, v5, Lp/hxt;->t:Landroid/view/View;
2012-
2013-    .line 586
2014-    .line 587
2015:    invoke-virtual {v10, v5}, Lp/ro80;->add(Ljava/lang/Object;)Z
2016-
2017-    .line 588
2018-    .line 589
2019-    .line 590
2020-    move-object/from16 v5, v17
2021-
2022-    .line 591
2023-    .line 592
2024-    invoke-static {v5, v4, v4, v14}, Lp/w9h1;->y(Lp/ry8;Landroid/view/ViewGroup$LayoutParams;Lcom/spotify/nowplaying/scroll/ScrollCardType;I)Lp/rxt;
2025-
2026-    .line 593
2027-    .line 594
2028-    .line 595
2029-    move-result-object v11
2030-
2031-    .line 596
2032:    invoke-virtual {v6}, Lp/gj4;->a()Z
2033-
2034-    .line 597
2035-    .line 598
2036-    .line 599
2037-    move-result v6
2038-
2039-    .line 600
2040-    if-eqz v6, :cond_2
2041-
2042-    .line 601
2043-    .line 602
2044-    goto :goto_2
2045-
2046-    .line 603
2047-    :cond_2
2048-    move-object v11, v4
2049-
2050-    .line 604
2051-    :goto_2
2052-    if-eqz v11, :cond_3
2053-
2054-    .line 605
2055-    .line 606
2056-    new-instance v6, Lp/kk21;
2057-
2058-    .line 607
2059-    .line 608
2060-    invoke-direct {v6, v14, v4}, Lp/kk21;-><init>(ILp/gh00;)V
2061-
2062-    .line 609
--
2069-    .line 614
2070-    move-result-object v6
2071-
2072-    .line 615
2073-    iget-object v6, v6, Lp/hxt;->t:Landroid/view/View;
2074-
2075-    .line 616
2076-    .line 617
2077-    if-eqz v6, :cond_3
2078-
2079-    .line 618
2080-    .line 619
2081:    invoke-virtual {v10, v6}, Lp/ro80;->add(Ljava/lang/Object;)Z
2082-
2083-    .line 620
2084-    .line 621
2085-    .line 622
2086-    :cond_3
2087-    invoke-static {v10}, Lp/geg1;->m(Ljava/util/List;)Lp/ro80;
2088-
2089-    .line 623
2090-    .line 624
2091-    .line 625
2092-    move-result-object v6
2093-
2094-    .line 626
2095-    invoke-static {v9, v6}, Lp/jq60;->I(Landroidx/constraintlayout/widget/ConstraintLayout;Ljava/util/AbstractList;)V
2096-
2097-    .line 627
2098-    .line 628
2099-    .line 629
2100-    const v6, 0x7f0b0c63
2101-
2102-    .line 630
2103-    .line 631
2104-    .line 632
2105:    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;
2106-
2107-    .line 633
2108-    .line 634
2109-    .line 635
2110-    move-result-object v6
2111-
2112-    .line 636
2113-    check-cast v6, Landroidx/constraintlayout/widget/ConstraintLayout;
2114-
2115-    .line 637
2116-    .line 638
2117-    iput-object v6, v0, Lp/ro61;->G1:Landroidx/constraintlayout/widget/ConstraintLayout;
2118-
2119-    .line 639
2120-    .line 640
2121-    new-instance v9, Lp/no61;
2122-
2123-    .line 641
2124-    .line 642
2125-    const/16 v10, 0x8
2126-
2127-    .line 643
2128-    .line 644
2129-    invoke-direct {v9, v0, v10}, Lp/no61;-><init>(Lp/ro61;I)V
2130-
2131-    .line 645
2132-    .line 646
2133-    .line 647
2134-    new-instance v10, Lp/no61;
2135-
2136-    .line 648
2137-    .line 649
2138-    const/16 v11, 0x9
2139-
2140-    .line 650
2141-    .line 651
2142-    invoke-direct {v10, v0, v11}, Lp/no61;-><init>(Lp/ro61;I)V
2143-
2144-    .line 652
2145-    .line 653
2146-    .line 654
2147:    invoke-virtual {v13, v9, v10}, Lp/sef0;->n(Lp/eh00;Lp/eh00;)Lp/cut;
2148-
2149-    .line 655
2150-    .line 656
2151-    .line 657
2152-    move-result-object v9
2153-
2154-    .line 658
2155-    iget-object v10, v0, Lp/ro61;->G1:Landroidx/constraintlayout/widget/ConstraintLayout;
2156-
2157-    .line 659
2158-    .line 660
2159-    const-string v11, "playbackControlsContainer"
2160-
2161-    .line 661
2162-    .line 662
2163-    if-eqz v10, :cond_12
2164-
2165-    .line 663
2166-    .line 664
2167-    invoke-static {v9, v10}, Lp/ro61;->b(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
2168-
2169-    .line 665
2170-    .line 666
2171-    .line 667
2172-    move-result-object v9
2173-
2174-    .line 668
2175-    iget-object v9, v9, Lp/hxt;->t:Landroid/view/View;
2176-
2177-    .line 669
--
2191-    new-instance v15, Lp/no61;
2192-
2193-    .line 677
2194-    .line 678
2195-    const/4 v14, 0x3
2196-
2197-    .line 679
2198-    invoke-direct {v15, v0, v14}, Lp/no61;-><init>(Lp/ro61;I)V
2199-
2200-    .line 680
2201-    .line 681
2202-    .line 682
2203:    invoke-virtual {v13, v10, v15}, Lp/sef0;->n(Lp/eh00;Lp/eh00;)Lp/cut;
2204-
2205-    .line 683
2206-    .line 684
2207-    .line 685
2208-    move-result-object v10
2209-
2210-    .line 686
2211-    iget-object v14, v0, Lp/ro61;->G1:Landroidx/constraintlayout/widget/ConstraintLayout;
2212-
2213-    .line 687
2214-    .line 688
2215-    if-eqz v14, :cond_11
2216-
2217-    .line 689
2218-    .line 690
2219-    invoke-static {v10, v14}, Lp/ro61;->b(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
2220-
2221-    .line 691
2222-    .line 692
2223-    .line 693
2224-    move-result-object v10
2225-
2226-    .line 694
2227-    iget-object v10, v10, Lp/hxt;->t:Landroid/view/View;
2228-
2229-    .line 695
2230-    .line 696
2231-    iget-object v14, v0, Lp/ro61;->G1:Landroidx/constraintlayout/widget/ConstraintLayout;
2232-
2233-    .line 697
--
2276-    new-instance v15, Lp/no61;
2277-
2278-    .line 720
2279-    .line 721
2280-    const/4 v4, 0x5
2281-
2282-    .line 722
2283-    invoke-direct {v15, v0, v4}, Lp/no61;-><init>(Lp/ro61;I)V
2284-
2285-    .line 723
2286-    .line 724
2287-    .line 725
2288:    invoke-virtual {v13, v14, v15}, Lp/sef0;->n(Lp/eh00;Lp/eh00;)Lp/cut;
2289-
2290-    .line 726
2291-    .line 727
2292-    .line 728
2293-    move-result-object v14
2294-
2295-    .line 729
2296-    iget-object v15, v0, Lp/ro61;->G1:Landroidx/constraintlayout/widget/ConstraintLayout;
2297-
2298-    .line 730
2299-    .line 731
2300-    if-eqz v15, :cond_f
2301-
2302-    .line 732
2303-    .line 733
2304-    invoke-static {v14, v15}, Lp/ro61;->b(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
2305-
2306-    .line 734
2307-    .line 735
2308-    .line 736
2309-    move-result-object v14
2310-
2311-    .line 737
2312-    iget-object v14, v14, Lp/hxt;->t:Landroid/view/View;
2313-
2314-    .line 738
2315-    .line 739
2316-    new-instance v15, Lp/no61;
2317-
2318-    .line 740
--
2328-    new-instance v4, Lp/no61;
2329-
2330-    .line 746
2331-    .line 747
2332-    const/4 v2, 0x7
2333-
2334-    .line 748
2335-    invoke-direct {v4, v0, v2}, Lp/no61;-><init>(Lp/ro61;I)V
2336-
2337-    .line 749
2338-    .line 750
2339-    .line 751
2340:    invoke-virtual {v13, v15, v4}, Lp/sef0;->n(Lp/eh00;Lp/eh00;)Lp/cut;
2341-
2342-    .line 752
2343-    .line 753
2344-    .line 754
2345-    move-result-object v2
2346-
2347-    .line 755
2348-    iget-object v4, v0, Lp/ro61;->G1:Landroidx/constraintlayout/widget/ConstraintLayout;
2349-
2350-    .line 756
2351-    .line 757
2352-    if-eqz v4, :cond_e
2353-
2354-    .line 758
2355-    .line 759
2356-    invoke-static {v2, v4}, Lp/ro61;->b(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
2357-
2358-    .line 760
2359-    .line 761
2360-    .line 762
2361-    move-result-object v2
2362-
2363-    .line 763
2364-    iget-object v2, v2, Lp/hxt;->t:Landroid/view/View;
2365-
2366-    .line 764
2367-    .line 765
2368-    move-object/from16 v22, v2
2369-
2370-    .line 766
--
2390-    .line 776
2391-    .line 777
2392-    invoke-static/range {v17 .. v22}, Lp/jq60;->J(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V
2393-
2394-    .line 778
2395-    .line 779
2396-    .line 780
2397-    const v2, 0x7f0b035f
2398-
2399-    .line 781
2400-    .line 782
2401-    .line 783
2402:    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
2403-
2404-    .line 784
2405-    .line 785
2406-    .line 786
2407-    move-result-object v2
2408-
2409-    .line 787
2410-    check-cast v2, Landroid/view/ViewStub;
2411-
2412-    .line 788
2413-    .line 789
2414:    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
2415-
2416-    .line 790
2417-    .line 791
2418-    .line 792
2419-    move-result-object v4
2420-
2421-    .line 793
2422-    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;
2423-
2424-    .line 794
2425-    .line 795
2426-    const/4 v6, 0x0
2427-
2428-    .line 796
2429-    iput v6, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I
2430-
2431-    .line 797
2432-    .line 798
2433-    iput v6, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I
2434-
2435-    .line 799
2436-    .line 800
2437-    iget-object v4, v0, Lp/ro61;->P0:Lp/l6p;
2438-
2439-    .line 801
2440-    .line 802
2441-    const/4 v9, 0x0
2442-
2443-    .line 803
2444-    const/4 v14, 0x3
2445-
2446-    .line 804
2447-    invoke-static {v4, v9, v9, v14}, Lp/w9h1;->y(Lp/ry8;Landroid/view/ViewGroup$LayoutParams;Lcom/spotify/nowplaying/scroll/ScrollCardType;I)Lp/rxt;
2448-
2449-    .line 805
2450-    .line 806
2451-    .line 807
2452-    move-result-object v4
2453-
2454-    .line 808
2455:    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
2456-
2457-    .line 809
2458-    .line 810
2459-    .line 811
2460-    move-result-object v9
2461-
2462-    .line 812
2463-    check-cast v9, Landroid/view/ViewGroup;
2464-
2465-    .line 813
2466-    .line 814
2467-    new-instance v10, Lp/wri;
2468-
2469-    .line 815
2470-    .line 816
2471-    const/16 v12, 0x7f9
2472-
2473-    .line 817
2474-    .line 818
2475-    const/4 v13, 0x0
2476-
2477-    .line 819
2478-    invoke-direct {v10, v13, v13, v12, v6}, Lp/wri;-><init>(FFIZ)V
2479-
2480-    .line 820
2481-    .line 821
2482-    .line 822
2483-    invoke-static {v4, v9, v10}, Lp/ro61;->c(Lp/cut;Landroid/view/ViewGroup;Ljava/lang/Object;)Lp/hxt;
2484-
2485-    .line 823
--
2493-    .line 827
2494-    .line 828
2495-    invoke-static {v2, v4}, Lp/psg1;->H(Landroid/view/View;Landroid/view/View;)V
2496-
2497-    .line 829
2498-    .line 830
2499-    .line 831
2500-    const v2, 0x7f0b0c66
2501-
2502-    .line 832
2503-    .line 833
2504-    .line 834
2505:    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
2506-
2507-    .line 835
2508-    .line 836
2509-    .line 837
2510-    move-result-object v2
2511-
2512-    .line 838
2513-    iget-object v4, v0, Lp/ro61;->r1:Lp/xul0;
2514-
2515-    .line 839
2516-    .line 840
2517:    invoke-virtual {v4}, Lp/xul0;->h()Ljava/lang/Object;
2518-
2519-    .line 841
2520-    .line 842
2521-    .line 843
2522-    move-result-object v4
2523-
2524-    .line 844
2525-    check-cast v4, Lp/ja11;
2526-
2527-    .line 845
2528-    .line 846
2529-    if-eqz v4, :cond_4
2530-
2531-    .line 847
2532-    .line 848
2533-    const v6, 0x7f0b0268
2534-
2535-    .line 849
2536-    .line 850
2537-    .line 851
2538:    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;
2539-
2540-    .line 852
2541-    .line 853
2542-    .line 854
2543-    move-result-object v6
2544-
2545-    .line 855
2546-    check-cast v6, Landroid/view/ViewStub;
2547-
2548-    .line 856
2549-    .line 857
2550:    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
2551-
2552-    .line 858
2553-    .line 859
2554-    .line 860
2555-    move-result-object v9
2556-
2557-    .line 861
2558-    check-cast v9, Landroid/view/ViewGroup;
2559-
2560-    .line 862
2561-    .line 863
2562-    new-instance v10, Lp/v911;
2563-
2564-    .line 864
2565-    .line 865
2566-    sget-object v12, Lp/i911;->a:Lp/i911;
2567-
2568-    .line 866
2569-    .line 867
2570-    invoke-direct {v10, v12}, Lp/v911;-><init>(Lp/j911;)V
2571-
2572-    .line 868
2573-    .line 869
2574-    .line 870
2575-    const/4 v12, 0x0
2576-
2577-    .line 871
2578-    const/4 v14, 0x3
2579-
2580-    .line 872
--
2600-    .line 882
2601-    invoke-static {v6, v4}, Lp/psg1;->H(Landroid/view/View;Landroid/view/View;)V
2602-
2603-    .line 883
2604-    .line 884
2605-    .line 885
2606-    :cond_4
2607-    const v4, 0x7f0b0041
2608-
2609-    .line 886
2610-    .line 887
2611-    .line 888
2612:    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;
2613-
2614-    .line 889
2615-    .line 890
2616-    .line 891
2617-    move-result-object v4
2618-
2619-    .line 892
2620-    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;
2621-
2622-    .line 893
2623-    .line 894
2624-    invoke-static {v4}, Lp/wj50;->p(Ljava/lang/Object;)V
2625-
2626-    .line 895
2627-    .line 896
2628-    .line 897
2629-    iget-object v6, v0, Lp/ro61;->u1:Lp/s1e1;
2630-
2631-    .line 898
2632-    .line 899
2633-    iget-object v9, v6, Lp/s1e1;->b:Ljava/lang/Object;
2634-
2635-    .line 900
2636-    .line 901
2637-    check-cast v9, Lp/lq0;
2638-
2639-    .line 902
2640-    .line 903
2641-    invoke-static {v9, v4}, Lp/ro61;->b(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
2642-
--
2723-
2724-    .line 945
2725-    .line 946
2726-    if-eqz v4, :cond_d
2727-
2728-    .line 947
2729-    .line 948
2730-    const v9, 0x7f0b1115
2731-
2732-    .line 949
2733-    .line 950
2734-    .line 951
2735:    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;
2736-
2737-    .line 952
2738-    .line 953
2739-    .line 954
2740-    move-result-object v9
2741-
2742-    .line 955
2743:    invoke-virtual {v4, v9}, Lcom/spotify/nowplaying/uiusecases/overlay/OverlayHidingFrameLayout;->setOverlayView(Landroid/view/View;)V
2744-
2745-    .line 956
2746-    .line 957
2747-    .line 958
2748-    const v4, 0x7f0b0eb1
2749-
2750-    .line 959
2751-    .line 960
2752-    .line 961
2753:    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;
2754-
2755-    .line 962
2756-    .line 963
2757-    .line 964
2758-    move-result-object v4
2759-
2760-    .line 965
2761-    if-eqz v4, :cond_5
2762-
2763-    .line 966
2764-    .line 967
2765:    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
2766-
2767-    .line 968
2768-    .line 969
2769-    .line 970
2770-    move-result-object v9
2771-
2772-    .line 971
2773-    check-cast v9, Landroid/view/ViewGroup;
2774-
2775-    .line 972
2776-    .line 973
2777-    new-instance v10, Lp/kk21;
2778-
2779-    .line 974
2780-    .line 975
2781-    const/4 v12, 0x5
2782-
2783-    .line 976
2784-    const/4 v13, 0x0
2785-
2786-    .line 977
2787-    invoke-direct {v10, v12, v13}, Lp/kk21;-><init>(ILp/gh00;)V
2788-
2789-    .line 978
2790-    .line 979
2791-    .line 980
2792-    const/4 v14, 0x3
2793-
2794-    .line 981
2795-    invoke-static {v5, v13, v13, v14}, Lp/w9h1;->y(Lp/ry8;Landroid/view/ViewGroup$LayoutParams;Lcom/spotify/nowplaying/scroll/ScrollCardType;I)Lp/rxt;
--
3009-    .line 1092
3010-    .line 1093
3011-    .line 1094
3012-    invoke-direct {v3, v4}, Lp/r250;-><init>(Lp/yxt;)V
3013-
3014-    .line 1095
3015-    .line 1096
3016-    .line 1097
3017-    sget-object v4, Lp/fau;->b:Lp/fau;
3018-
3019-    .line 1098
3020-    .line 1099
3021:    invoke-virtual {v2, v4}, Lp/x150;->equals(Ljava/lang/Object;)Z
3022-
3023-    .line 1100
3024-    .line 1101
3025-    .line 1102
3026-    move-result v5
3027-
3028-    .line 1103
3029-    if-eqz v5, :cond_7
3030-
3031-    .line 1104
3032-    .line 1105
3033:    invoke-virtual {v3, v4}, Lp/r250;->equals(Ljava/lang/Object;)Z
3034-
3035-    .line 1106
3036-    .line 1107
3037-    .line 1108
3038-    move-result v5
3039-
3040-    .line 1109
3041-    if-eqz v5, :cond_7
3042-
3043-    .line 1110
3044-    .line 1111
3045-    :goto_3
3046-    move-object v2, v4
3047-
3048-    .line 1112
3049-    goto :goto_4
3050-
3051-    .line 1113
3052-    :cond_7
3053:    invoke-virtual {v2, v4}, Lp/x150;->equals(Ljava/lang/Object;)Z
3054-
3055-    .line 1114
3056-    .line 1115
3057-    .line 1116
3058-    move-result v5
3059-
3060-    .line 1117
3061-    if-eqz v5, :cond_8
3062-
3063-    .line 1118
3064-    .line 1119
3065-    move-object v2, v3
3066-
3067-    .line 1120
3068-    goto :goto_4
3069-
3070-    .line 1121
3071-    :cond_8
3072:    invoke-virtual {v3, v4}, Lp/r250;->equals(Ljava/lang/Object;)Z
3073-
3074-    .line 1122
3075-    .line 1123
3076-    .line 1124
3077-    move-result v4
3078-
3079-    .line 1125
3080-    if-eqz v4, :cond_9
3081-
3082-    .line 1126
3083-    .line 1127
3084-    goto :goto_4
3085-
3086-    .line 1128
3087-    :cond_9
3088-    new-instance v4, Lp/lbf;
3089-
3090-    .line 1129
3091-    .line 1130
3092-    invoke-direct {v4, v2, v3}, Lp/lbf;-><init>(Lp/b250;Lp/b250;)V
3093-
3094-    .line 1131
3095-    .line 1132
3096-    .line 1133
3097-    goto :goto_3
3098-
3099-    .line 1134
3100-    :goto_4
3101-    invoke-static {v1, v2}, Lp/joc1;->c(Landroid/view/View;Lp/b250;)V
3102-
3103-    .line 1135
3104-    .line 1136
3105-    .line 1137
3106-    iget-object v2, v0, Lp/ro61;->L1:Lp/oc80;
3107-
3108-    .line 1138
3109-    .line 1139
3110-    sget-object v3, Lp/fb80;->b:Lp/fb80;
3111-
3112-    .line 1140
3113-    .line 1141
3114:    invoke-virtual {v2, v3}, Lp/oc80;->i(Lp/fb80;)V
3115-
3116-    .line 1142
3117-    .line 1143
3118-    .line 1144
3119-    return-object v1
3120-
3121-    .line 1145
3122-    :cond_a
3123-    invoke-static {v11}, Lp/wj50;->d0(Ljava/lang/String;)V
3124-
3125-    .line 1146
3126-    .line 1147
3127-    .line 1148
3128-    const/16 v24, 0x0
3129-
3130-    .line 1149
3131-    .line 1150
3132-    throw v24
3133-
3134-    .line 1151
3135-    :cond_b
3136-    const/16 v24, 0x0
3137-
3138-    .line 1152
3139-    .line 1153
3140-    invoke-static {v7}, Lp/wj50;->d0(Ljava/lang/String;)V
3141-
3142-    .line 1154
3143-    .line 1155
3144-    .line 1156
--
4596-.method public final destroy()V
4597-    .locals 2
4598-
4599-    .line 1
4600-    iget-object v0, p0, Lp/ro61;->L1:Lp/oc80;
4601-
4602-    .line 2
4603-    .line 3
4604-    sget-object v1, Lp/fb80;->a:Lp/fb80;
4605-
4606-    .line 4
4607-    .line 5
4608:    invoke-virtual {v0, v1}, Lp/oc80;->i(Lp/fb80;)V
4609-
4610-    .line 6
4611-    .line 7
4612-    .line 8
4613-    return-void
4614-    .line 9
4615-    .line 10
4616-    .line 11
4617-    .line 12
4618-    .line 13
4619-    .line 14
4620-    .line 15
4621-    .line 16
4622-    .line 17
4623-    .line 18
4624-.end method
4625-
4626-.method public final getLifecycle()Lp/gb80;
4627-    .locals 1
4628-
4629-    .line 1
4630-    iget-object v0, p0, Lp/ro61;->L1:Lp/oc80;
4631-
4632-    .line 2
4633-    .line 3
4634-    return-object v0
4635-    .line 4
4636-    .line 5
4637-    .line 6
4638-    .line 7
--
4652-.method public final start()V
4653-    .locals 6
4654-
4655-    .line 1
4656-    iget-object v0, p0, Lp/ro61;->L1:Lp/oc80;
4657-
4658-    .line 2
4659-    .line 3
4660-    sget-object v1, Lp/fb80;->e:Lp/fb80;
4661-
4662-    .line 4
4663-    .line 5
4664:    invoke-virtual {v0, v1}, Lp/oc80;->i(Lp/fb80;)V
4665-
4666-    .line 6
4667-    .line 7
4668-    .line 8
4669-    iget-object v0, p0, Lp/ro61;->K1:Lp/dii0;
4670-
4671-    .line 9
4672-    .line 10
4673:    invoke-virtual {v0}, Lp/dii0;->I()V
4674-
4675-    .line 11
4676-    .line 12
4677-    .line 13
4678-    iget-object v0, p0, Lp/ro61;->w1:Lcom/spotify/nowplaying/uiusecases/overlay/OverlayHidingGradientBackgroundView;
4679-
4680-    .line 14
4681-    .line 15
4682-    const-string v1, "modeRootView"
4683-
4684-    .line 16
4685-    .line 17
4686-    const/4 v2, 0x0
4687-
4688-    .line 18
4689-    if-eqz v0, :cond_5
4690-
4691-    .line 19
4692-    .line 20
4693-    new-instance v3, Lp/h3v;
4694-
4695-    .line 21
4696-    .line 22
4697-    const/4 v4, 0x2
4698-
4699-    .line 23
4700-    invoke-direct {v3, v0, v4}, Lp/h3v;-><init>(Landroid/widget/FrameLayout;I)V
4701-
4702-    .line 24
4703-    .line 25
4704-    .line 26
4705-    iget-object v0, p0, Lp/ro61;->Q0:Lp/nh61;
4706-
4707-    .line 27
4708-    .line 28
4709:    invoke-virtual {v0, v3}, Lp/nh61;->u(Lp/y8f;)V
4710-
4711-    .line 29
4712-    .line 30
4713-    .line 31
4714-    sget-object v0, Lp/we40;->c:Lp/we40;
4715-
4716-    .line 32
4717-    .line 33
4718-    invoke-static {v0}, Lio/reactivex/rxjava3/core/Flowable;->I(Ljava/lang/Object;)Lio/reactivex/rxjava3/internal/operators/flowable/FlowableJust;
4719-
4720-    .line 34
4721-    .line 35
4722-    .line 36
4723-    move-result-object v0
4724-
4725-    .line 37
4726-    iget-object v3, p0, Lp/ro61;->R0:Lp/tey;
4727-
4728-    .line 38
4729-    .line 39
4730:    invoke-virtual {v3, v0}, Lp/tey;->u(Lio/reactivex/rxjava3/core/Flowable;)V
4731-
4732-    .line 40
4733-    .line 41
4734-    .line 42
4735-    iget-object v0, p0, Lp/ro61;->H1:Lp/okj0;
4736-
4737-    .line 43
4738-    .line 44
4739-    if-eqz v0, :cond_4
4740-
4741-    .line 45
4742-    .line 46
4743-    iget-object v3, p0, Lp/ro61;->w1:Lcom/spotify/nowplaying/uiusecases/overlay/OverlayHidingGradientBackgroundView;
4744-
4745-    .line 47
4746-    .line 48
4747-    if-eqz v3, :cond_3
4748-
4749-    .line 49
4750-    .line 50
4751:    invoke-virtual {v0, v3}, Lp/okj0;->S(Lp/o0m0;)V
4752-
4753-    .line 51
4754-    .line 52
4755-    .line 53
4756-    iget-object v0, p0, Lp/ro61;->T0:Lp/z9p;
4757-
4758-    .line 54
4759-    .line 55
4760:    invoke-virtual {v0}, Lp/z9p;->F()V
4761-
4762-    .line 56
4763-    .line 57
4764-    .line 58
4765-    iget-object v0, p0, Lp/ro61;->B1:Lp/cck0;
4766-
4767-    .line 59
4768-    .line 60
4769-    if-eqz v0, :cond_0
4770-
4771-    .line 61
4772-    .line 62
4773:    invoke-virtual {v0}, Lp/cck0;->a()V
4774-
4775-    .line 63
4776-    .line 64
4777-    .line 65
4778-    :cond_0
4779-    iget-object v0, p0, Lp/ro61;->F1:Lp/di41;
4780-
4781-    .line 66
4782-    .line 67
4783-    if-eqz v0, :cond_1
4784-
4785-    .line 68
4786-    .line 69
4787:    invoke-virtual {v0, v2}, Lp/eg60;->e(Ljava/util/concurrent/CancellationException;)V
4788-
4789-    .line 70
4790-    .line 71
4791-    .line 72
4792-    :cond_1
4793:    invoke-virtual {p0}, Lp/ro61;->getLifecycle()Lp/gb80;
4794-
4795-    .line 73
4796-    .line 74
4797-    .line 75
4798-    move-result-object v0
4799-
4800-    .line 76
4801-    invoke-static {v0}, Lp/l5h1;->p(Lp/gb80;)Lp/ub80;
4802-
4803-    .line 77
4804-    .line 78
4805-    .line 79
4806-    move-result-object v0
4807-
4808-    .line 80
4809-    new-instance v1, Lp/qo61;
4810-
4811-    .line 81
4812-    .line 82
4813-    const/4 v3, 0x0
4814-
4815-    .line 83
4816-    invoke-direct {v1, p0, v2, v3}, Lp/qo61;-><init>(Lp/ro61;Lp/fbk;I)V
4817-
4818-    .line 84
4819-    .line 85
4820-    .line 86
4821-    const/4 v4, 0x3
4822-
4823-    .line 87
--
4832-    iput-object v0, p0, Lp/ro61;->F1:Lp/di41;
4833-
4834-    .line 92
4835-    .line 93
4836-    iget-object v0, p0, Lp/ro61;->M1:Lp/di41;
4837-
4838-    .line 94
4839-    .line 95
4840-    if-eqz v0, :cond_2
4841-
4842-    .line 96
4843-    .line 97
4844:    invoke-virtual {v0, v2}, Lp/eg60;->e(Ljava/util/concurrent/CancellationException;)V
4845-
4846-    .line 98
4847-    .line 99
4848-    .line 100
4849-    :cond_2
4850:    invoke-virtual {p0}, Lp/ro61;->getLifecycle()Lp/gb80;
4851-
4852-    .line 101
4853-    .line 102
4854-    .line 103
4855-    move-result-object v0
4856-
4857-    .line 104
4858-    invoke-static {v0}, Lp/l5h1;->p(Lp/gb80;)Lp/ub80;
4859-
4860-    .line 105
4861-    .line 106
4862-    .line 107
4863-    move-result-object v0
4864-
4865-    .line 108
4866-    new-instance v1, Lp/qo61;
4867-
4868-    .line 109
4869-    .line 110
4870-    const/4 v5, 0x1
4871-
4872-    .line 111
4873-    invoke-direct {v1, p0, v2, v5}, Lp/qo61;-><init>(Lp/ro61;Lp/fbk;I)V
4874-
4875-    .line 112
4876-    .line 113
4877-    .line 114
4878-    invoke-static {v0, v2, v3, v1, v4}, Lp/x0h1;->u(Lp/xuk;Lp/juk;ILp/th00;I)Lp/di41;
4879-
4880-    .line 115
--
5421-.method public final stop()V
5422-    .locals 2
5423-
5424-    .line 1
5425-    iget-object v0, p0, Lp/ro61;->L1:Lp/oc80;
5426-
5427-    .line 2
5428-    .line 3
5429-    sget-object v1, Lp/fb80;->c:Lp/fb80;
5430-
5431-    .line 4
5432-    .line 5
5433:    invoke-virtual {v0, v1}, Lp/oc80;->i(Lp/fb80;)V
5434-
5435-    .line 6
5436-    .line 7
5437-    .line 8
5438-    iget-object v0, p0, Lp/ro61;->K1:Lp/dii0;
5439-
5440-    .line 9
5441-    .line 10
5442:    invoke-virtual {v0}, Lp/dii0;->J()V
5443-
5444-    .line 11
5445-    .line 12
5446-    .line 13
5447-    iget-object v0, p0, Lp/ro61;->Q0:Lp/nh61;
5448-
5449-    .line 14
5450-    .line 15
5451-    iget-object v1, v0, Lp/nh61;->d:Ljava/lang/Object;
5452-
5453-    .line 16
5454-    .line 17
5455-    check-cast v1, Lp/iwr;
5456-
5457-    .line 18
5458-    .line 19
5459:    invoke-virtual {v1}, Lp/iwr;->a()V
5460-
5461-    .line 20
5462-    .line 21
5463-    .line 22
5464-    const/4 v1, 0x0
5465-
5466-    .line 23
5467-    iput-object v1, v0, Lp/nh61;->e:Ljava/lang/Object;
5468-
5469-    .line 24
5470-    .line 25
5471-    iget-object v0, p0, Lp/ro61;->R0:Lp/tey;
5472-
5473-    .line 26
5474-    .line 27
5475:    invoke-virtual {v0}, Lp/tey;->w()V
5476-
5477-    .line 28
5478-    .line 29
5479-    .line 30
5480-    iget-object v0, p0, Lp/ro61;->H1:Lp/okj0;
5481-
5482-    .line 31
5483-    .line 32
5484-    if-eqz v0, :cond_3
5485-
5486-    .line 33
5487-    .line 34
5488:    invoke-virtual {v0}, Lp/okj0;->T()V
5489-
5490-    .line 35
5491-    .line 36
5492-    .line 37
5493-    iget-object v0, p0, Lp/ro61;->T0:Lp/z9p;
5494-
5495-    .line 38
5496-    .line 39
5497-    iget-object v0, v0, Lp/z9p;->g:Ljava/lang/Object;
5498-
5499-    .line 40
5500-    .line 41
5501-    check-cast v0, Lp/lwr;
5502-
5503-    .line 42
5504-    .line 43
5505:    invoke-virtual {v0}, Lp/lwr;->c()V
5506-
5507-    .line 44
5508-    .line 45
5509-    .line 46
5510-    iget-object v0, p0, Lp/ro61;->F1:Lp/di41;
5511-
5512-    .line 47
5513-    .line 48
5514-    if-eqz v0, :cond_0
5515-
5516-    .line 49
5517-    .line 50
5518:    invoke-virtual {v0, v1}, Lp/eg60;->e(Ljava/util/concurrent/CancellationException;)V
5519-
5520-    .line 51
5521-    .line 52
5522-    .line 53
5523-    :cond_0
5524-    iget-object v0, p0, Lp/ro61;->B1:Lp/cck0;
5525-
5526-    .line 54
5527-    .line 55
5528-    if-eqz v0, :cond_1
5529-
5530-    .line 56
5531-    .line 57
5532:    invoke-virtual {v0}, Lp/cck0;->b()V
5533-
5534-    .line 58
5535-    .line 59
5536-    .line 60
5537-    :cond_1
5538-    iget-object v0, p0, Lp/ro61;->M1:Lp/di41;
5539-
5540-    .line 61
5541-    .line 62
5542-    if-eqz v0, :cond_2
5543-
5544-    .line 63
5545-    .line 64
5546:    invoke-virtual {v0, v1}, Lp/eg60;->e(Ljava/util/concurrent/CancellationException;)V
5547-
5548-    .line 65
5549-    .line 66
5550-    .line 67
5551-    :cond_2
5552-    return-void
5553-
5554-    .line 68
5555-    :cond_3
5556-    const-string v0, "overlayController"
5557-
5558-    .line 69
5559-    .line 70
5560-    invoke-static {v0}, Lp/wj50;->d0(Ljava/lang/String;)V
5561-
5562-    .line 71
5563-    .line 72
5564-    .line 73
5565-    throw v1
5566-    .line 74
5567-    .line 75
5568-    .line 76
5569-    .line 77
5570-    .line 78
5571-    .line 79
5572-    .line 80
5573-    .line 81
5574-    .line 82
5575-    .line 83
5576-    .line 84

### /tmp/spotify-full/smali_classes9/p/qwb1.smali
2756-
2757-    .line 447
2758-    goto :goto_1
2759-
2760-    .line 448
2761-    :cond_1
2762-    invoke-static {}, Lp/h6f;->S()V
2763-
2764-    .line 449
2765-    .line 450
2766-    .line 451
2767-    const/16 v24, 0x0
2768-
2769-    .line 452
2770-    .line 453
2771-    throw v24
2772-
2773-    .line 454
2774-    :cond_2
2775-    new-instance v56, Lp/ee20;
2776-
2777-    .line 455
2778-    .line 456
2779-    const/16 v61, 0xf
2780-
2781-    .line 457
2782-    .line 458
2783-    move-object/from16 v59, v2
2784-
2785-    .line 459
2786-    .line 460
2787-    move-object/from16 v60, v3
2788-
2789-    .line 461
2790-    .line 462
2791-    move-object/from16 v58, v4
2792-
2793-    .line 463
2794-    .line 464
2795-    move-object/from16 v57, v6
2796-
2797-    .line 465
2798-    .line 466
2799-    invoke-direct/range {v56 .. v61}, Lp/ee20;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
2800-
2801-    .line 467
2802-    .line 468
2803-    .line 469
2804-    move-object/from16 v4, v56
2805-
2806-    .line 470
2807-    .line 471
2808-    move-object/from16 v3, v59
2809-
2810-    .line 472
2811-    .line 473
2812-    move-object/from16 v2, v60
2813-
2814-    .line 474
2815-    .line 475
2816-    invoke-static {v2, v4}, Lp/exg1;->y(Landroidx/constraintlayout/widget/ConstraintLayout;Lp/gh00;)V
2817-
2818-    .line 476
2819-    .line 477
2820-    .line 478
2821-    const/4 v12, 0x0
2822-
2823-    .line 479
2824-    invoke-virtual {v3, v12}, Lp/ro80;->listIterator(I)Ljava/util/ListIterator;
2825-
2826-    .line 480
2827-    .line 481
2828-    .line 482
2829-    move-result-object v2
2830-
2831-    .line 483
2832-    :goto_2
2833-    move-object v3, v2
2834-
2835-    .line 484
2836-    check-cast v3, Lp/qo80;
2837-
2838-    .line 485
2839-    .line 486
2840-    invoke-virtual {v3}, Lp/qo80;->hasNext()Z
2841-
2842-    .line 487
2843-    .line 488
2844-    .line 489
2845-    move-result v4
2846-
2847-    .line 490
2848-    if-eqz v4, :cond_3
2849-
2850-    .line 491
2851-    .line 492
2852-    invoke-virtual {v3}, Lp/qo80;->next()Ljava/lang/Object;
2853-
2854-    .line 493
2855-    .line 494
2856-    .line 495
2857-    move-result-object v3
2858-
2859-    .line 496
2860-    check-cast v3, Landroid/view/View;
2861-
2862-    .line 497
2863-    .line 498
2864-    const/4 v4, 0x1
2865-
2866-    .line 499
2867-    invoke-virtual {v3, v4}, Landroid/view/View;->setClickable(Z)V
2868-
2869-    .line 500
2870-    .line 501
2871-    .line 502
2872-    goto :goto_2
2873-
2874-    .line 503
2875-    :cond_3
2876:    const v2, 0x7f0b0eb1
2877-
2878-    .line 504
2879-    .line 505
2880-    .line 506
2881-    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
2882-
2883-    .line 507
2884-    .line 508
2885-    .line 509
2886-    move-result-object v2
2887-
2888-    .line 510
2889-    if-eqz v2, :cond_4
2890-
2891-    .line 511
2892-    .line 512
2893-    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
2894-
2895-    .line 513
2896-    .line 514
2897-    .line 515
2898-    move-result-object v3
2899-
2900-    .line 516
2901-    check-cast v3, Landroid/view/ViewGroup;
2902-
2903-    .line 517
2904-    .line 518
2905-    new-instance v4, Lp/kk21;
2906-
2907-    .line 519
2908-    .line 520
2909-    const/4 v7, 0x0
2910-
2911-    .line 521
2912-    const/4 v10, 0x5
2913-
2914-    .line 522
2915-    invoke-direct {v4, v10, v7}, Lp/kk21;-><init>(ILp/gh00;)V
2916-
2917-    .line 523
2918-    .line 524
2919-    .line 525
2920-    const/4 v12, 0x3
2921-
2922-    .line 526
2923-    invoke-static {v11, v7, v7, v12}, Lp/w9h1;->y(Lp/ry8;Landroid/view/ViewGroup$LayoutParams;Lcom/spotify/nowplaying/scroll/ScrollCardType;I)Lp/rxt;
2924-
2925-    .line 527
2926-    .line 528
2927-    .line 529
2928-    move-result-object v5
2929-
2930-    .line 530
2931-    invoke-static {v5, v3, v4}, Lp/qwb1;->e(Lp/cut;Landroid/view/ViewGroup;Ljava/lang/Object;)Lp/hxt;
2932-
2933-    .line 531
2934-    .line 532
2935-    .line 533
2936-    move-result-object v3
2937-
2938-    .line 534
2939-    iget-object v3, v3, Lp/hxt;->t:Landroid/view/View;
2940-
2941-    .line 535
2942-    .line 536
2943-    invoke-static {v2, v3}, Lp/psg1;->H(Landroid/view/View;Landroid/view/View;)V
2944-
2945-    .line 537
2946-    .line 538
2947-    .line 539
2948-    :cond_4
2949-    new-instance v2, Lp/qcq;
2950-
2951-    .line 540
2952-    .line 541
2953-    move-object/from16 v4, v41
2954-
2955-    .line 542
2956-    .line 543
2957-    iget-object v3, v4, Lp/dju;->b:Landroid/content/Context;
2958-
2959-    .line 544
2960-    .line 545
2961-    invoke-direct {v2, v3}, Lp/qcq;-><init>(Landroid/content/Context;)V
2962-
2963-    .line 546
2964-    .line 547
2965-    .line 548
2966-    invoke-virtual/range {v27 .. v27}, Lp/wg61;->getValue()Ljava/lang/Object;
2967-
2968-    .line 549
2969-    .line 550
2970-    .line 551
2971-    move-result-object v3
2972-
2973-    .line 552
2974-    check-cast v3, Lp/sdk0;
2975-
2976-    .line 553
2977-    .line 554
2978-    iget-object v3, v3, Lp/sdk0;->g:Lp/g6m0;
2979-
2980-    .line 555
2981-    .line 556
2982-    new-instance v4, Lp/tf41;
2983-
2984-    .line 557
2985-    .line 558
2986-    const/4 v11, 0x0
2987-
2988-    .line 559
2989-    const/16 v12, 0x18
2990-
2991-    .line 560
2992-    .line 561
2993-    const/4 v5, 0x1
2994-
2995-    .line 562
2996-    iget-object v6, v0, Lp/qwb1;->i2:Lio/reactivex/rxjava3/processors/ReplayProcessor;
2997-
2998-    .line 563
2999-    .line 564
3000-    const-class v7, Lio/reactivex/rxjava3/processors/ReplayProcessor;
3001-
3002-    .line 565
3003-    .line 566
3004-    const-string v8, "onNext"
3005-
3006-    .line 567
3007-    .line 568
3008-    const-string v9, "onNext(Ljava/lang/Object;)V"
3009-
3010-    .line 569
3011-    .line 570
3012-    const/4 v10, 0x0
3013-
3014-    .line 571
3015-    invoke-direct/range {v4 .. v12}, Lp/tf41;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V
3016-
3017-    .line 572
3018-    .line 573
3019-    .line 574
3020-    move-object/from16 v6, v38
3021-
3022-    .line 575
3023-    .line 576
3024-    move-object/from16 v7, v40
3025-
3026-    .line 577
3027-    .line 578
3028-    invoke-virtual {v7, v6, v3, v4}, Lp/oge0;->i(Ljava/util/List;Lp/t9p0;Lp/gh00;)Lp/hbk0;
3029-
3030-    .line 579
3031-    .line 580
3032-    .line 581
3033-    move-result-object v3
3034-
3035-    .line 582
3036-    invoke-virtual {v2, v3}, Lp/qcq;->A(Lp/wt81;)V
3037-
3038-    .line 583
3039-    .line 584
3040-    .line 585
3041-    const v3, 0x7f0b1116
3042-
3043-    .line 586
3044-    .line 587
3045-    .line 588
3046-    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
3047-
3048-    .line 589
3049-    .line 590
3050-    .line 591
3051-    move-result-object v3
3052-
3053-    .line 592
3054-    invoke-virtual/range {v22 .. v22}, Lp/wb4;->b()Z
3055-
3056-    .line 593

#### method declarations
215:.method public constructor <init>(Lp/eju;Lp/li0;Lp/hm;Lp/cxb;Lp/cxb;Lp/oge0;Lp/zs0;Lp/d2n;Lp/o7a;Lp/gj4;Lp/hc81;Lp/hc81;Lp/wb4;Lp/c06;Lp/gzk;Lp/og81;Lp/s2o;Lp/l6p;Lp/b9k;Lp/rvb;Lp/fek0;Lp/yf00;Lp/itb1;Lp/mze;Lp/fdq0;Lp/tey;Lp/l3d0;Lp/oge0;Lp/bwt0;Lp/z9p;Lp/hzj;Lp/kv91;Lp/lt91;Lp/qu91;Lp/sef0;Lp/vbz0;Lp/oo11;Lp/lq0;Lp/lq0;Lp/bwt0;Lp/vyr0;Lp/vvv0;Lp/iv0;Lp/jo20;Lp/qce0;Lp/vbj;Lp/ood0;Lp/e6a0;Lp/okj0;Lp/b9k;Lp/du;Lp/w9r0;Lp/oyp0;Lp/ycm0;Lp/oyn0;Lp/bj4;Lp/zaz0;Lio/reactivex/rxjava3/internal/operators/flowable/FlowableObserveOn;Lio/reactivex/rxjava3/internal/operators/flowable/FlowableJust;Lio/reactivex/rxjava3/internal/operators/flowable/FlowableDistinctUntilChanged;Lio/reactivex/rxjava3/internal/operators/flowable/FlowableMap;Lp/m57;Lp/x4j0;Lp/hwb1;Lp/uvl0;Lp/lc4;Lp/luk;Lp/xul0;Lp/ljp;Lio/reactivex/rxjava3/core/Flowable;Lp/a470;Lp/p8p0;)V
753:.method public static final b(Lp/qwb1;Z)V
1379:.method public static d(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
1487:.method public static e(Lp/cut;Landroid/view/ViewGroup;Ljava/lang/Object;)Lp/hxt;
1665:.method public static f(Lp/qy8;Landroid/view/ViewGroup;)Lp/hxt;
1767:.method public static g(Landroid/view/View;Lp/st91;)V
1869:.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
8889:.method public final c(I)Lp/bjc0;
9048:.method public final destroy()V
9078:.method public final getLifecycle()Lp/gb80;
9104:.method public final h(Landroid/view/ViewGroup;)V
9289:.method public final start()V
10335:.method public final stop()V

#### listener/click/player calls
527-
528-    .line 69
529-    iget-object p6, p4, Lp/tgq;->b:Ljava/lang/Object;
530-
531-    check-cast p6, Landroid/content/Context;
532-
533-    const/4 v1, 0x0
534-
535-    .line 70
536-    invoke-direct {p5, p6, v1}, Lp/awo;-><init>(Landroid/content/Context;I)V
537-
538-    .line 71
539:    invoke-virtual {v0, p5}, Lp/ood0;->h(Lp/ovf;)Lp/b7v0;
540-
541-    move-result-object p5
542-
543-    sget-object p6, Lp/kwb1;->c:Lp/kwb1;
544-
545-    .line 72
546-    new-instance v1, Lp/bjc0;
547-
548-    invoke-direct {v1, p5, p6}, Lp/bjc0;-><init>(Lp/qy8;Lp/gh00;)V
549-
550-    .line 73
551-    new-instance p5, Lp/awo;
552-
553-    .line 74
554-    iget-object p6, p4, Lp/tgq;->b:Ljava/lang/Object;
555-
556-    check-cast p6, Landroid/content/Context;
557-
558-    const/4 v2, 0x0
559-
560-    .line 75
561-    invoke-direct {p5, p6, v2}, Lp/awo;-><init>(Landroid/content/Context;I)V
562-
563-    .line 76
564:    invoke-virtual {v0, p5}, Lp/ood0;->h(Lp/ovf;)Lp/b7v0;
565-
566-    move-result-object p5
567-
568-    sget-object p6, Lp/kwb1;->d:Lp/kwb1;
569-
570-    .line 77
571-    new-instance v0, Lp/bjc0;
572-
573-    invoke-direct {v0, p5, p6}, Lp/bjc0;-><init>(Lp/qy8;Lp/gh00;)V
574-
575-    const/16 p5, 0x13
576-
577-    const/4 p6, 0x0
578-
579-    .line 78
580-    invoke-direct {p3, v1, v0, p6, p5}, Lp/rb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
581-
582-    .line 79
583-    iput-object p3, p0, Lp/qwb1;->K1:Lp/rb5;
584-
585-    .line 80
586-    new-instance p3, Lp/ood0;
587-
588-    .line 81
589-    invoke-static {p1}, Lp/emk;->s(Lp/eju;)Lp/ovf;
590-
591-    move-result-object p1
592-
593-    move-object/from16 p5, p52
594-
595:    invoke-virtual {p5, p1}, Lp/w9r0;->B(Lp/ovf;)Lp/lq0;
596-
597-    move-result-object p1
598-
599-    .line 82
600-    new-instance p5, Lp/f6q;
601-
602-    .line 83
603-    iget-object p4, p4, Lp/tgq;->b:Ljava/lang/Object;
604-
605-    check-cast p4, Landroid/content/Context;
606-
607-    const/4 v0, 0x0
608-
609-    .line 84
610-    invoke-direct {p5, p4, v0}, Lp/f6q;-><init>(Landroid/content/Context;I)V
611-
612-    move-object/from16 p4, p50
613-
614-    .line 85
615-    invoke-static {p4, p5}, Lp/b9k;->f(Lp/b9k;Lp/ovf;)Lp/izh;
616-
617-    move-result-object p4
618-
619-    const/4 p5, 0x3
620-
621-    move-object/from16 v0, p51
622-
623-    .line 86
624-    invoke-static {v0, p6, p6, p5}, Lp/w9h1;->y(Lp/ry8;Landroid/view/ViewGroup$LayoutParams;Lcom/spotify/nowplaying/scroll/ScrollCardType;I)Lp/rxt;
625-
--
717-    .line 102
718-    new-instance p1, Lp/oc80;
719-
720-    const/4 p3, 0x1
721-
722-    .line 103
723-    invoke-direct {p1, p0, p3}, Lp/oc80;-><init>(Lp/hc80;Z)V
724-
725-    .line 104
726-    iput-object p1, p0, Lp/qwb1;->o2:Lp/oc80;
727-
728-    .line 105
729:    invoke-virtual {p2}, Lp/vbj;->b()Z
730-
731-    move-result p1
732-
733-    if-nez p1, :cond_1
734-
735-    sget-object p1, Lp/uvl0;->b:Lp/uvl0;
736-
737-    move-object/from16 p2, p65
738-
739-    if-ne p2, p1, :cond_0
740-
741-    goto :goto_0
742-
743-    :cond_0
744-    const/4 p3, 0x0
745-
746-    :cond_1
747-    :goto_0
748-    iput-boolean p3, p0, Lp/qwb1;->u2:Z
749-
750-    return-void
751-.end method
752-
753-.method public static final b(Lp/qwb1;Z)V
754-    .locals 5
755-
756-    .line 1
757-    iget-boolean v0, p0, Lp/qwb1;->t2:Z
758-
759-    .line 2
--
769-    iget-object v0, p0, Lp/qwb1;->T1:Landroid/view/View;
770-
771-    .line 7
772-    .line 8
773-    if-nez v0, :cond_1
774-
775-    .line 9
776-    .line 10
777-    goto :goto_1
778-
779-    .line 11
780-    :cond_1
781:    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
782-
783-    .line 12
784-    .line 13
785-    .line 14
786-    move-result-object v1
787-
788-    .line 15
789-    instance-of v2, v1, Landroid/view/ViewGroup;
790-
791-    .line 16
792-    .line 17
793-    const/4 v3, 0x0
794-
795-    .line 18
796-    if-eqz v2, :cond_2
797-
798-    .line 19
799-    .line 20
800-    check-cast v1, Landroid/view/ViewGroup;
801-
802-    .line 21
803-    .line 22
804-    goto :goto_0
805-
806-    .line 23
807-    :cond_2
808-    move-object v1, v3
809-
810-    .line 24
811-    :goto_0
812-    if-nez v1, :cond_3
813-
814-    .line 25
815-    .line 26
816-    :goto_1
817-    return-void
818-
819-    .line 27
820-    :cond_3
821:    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;
822-
823-    .line 28
824-    .line 29
825-    .line 30
826-    move-result-object v2
827-
828-    .line 31
829-    const v4, 0x7f070758
830-
831-    .line 32
832-    .line 33
833-    .line 34
834:    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
835-
836-    .line 35
837-    .line 36
838-    .line 37
839-    move-result v2
840-
841-    .line 38
842-    iget-object v4, p0, Lp/qwb1;->P1:Landroidx/constraintlayout/widget/ConstraintLayout;
843-
844-    .line 39
845-    .line 40
846-    if-eqz v4, :cond_7
847-
848-    .line 41
849-    .line 42
850-    invoke-static {v4, v1}, Lp/osg1;->r(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/graphics/Rect;
851-
852-    .line 43
853-    .line 44
854-    .line 45
855-    move-result-object v1
856-
857-    .line 46
858-    if-nez p1, :cond_4
859-
860-    .line 47
861-    .line 48
862-    iget p1, v1, Landroid/graphics/Rect;->top:I
863-
864-    .line 49
--
870-    goto :goto_3
871-
872-    .line 52
873-    :cond_4
874-    iget p1, v1, Landroid/graphics/Rect;->bottom:I
875-
876-    .line 53
877-    .line 54
878-    goto :goto_2
879-
880-    .line 55
881-    :goto_3
882:    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
883-
884-    .line 56
885-    .line 57
886-    .line 58
887-    move-result-object v2
888-
889-    .line 59
890-    if-eqz v2, :cond_6
891-
892-    .line 60
893-    .line 61
894-    check-cast v2, Lp/hqk;
895-
896-    .line 62
897-    .line 63
898-    iget v1, v1, Landroid/graphics/Rect;->left:I
899-
900-    .line 64
901-    .line 65
902-    iget-object p0, p0, Lp/qwb1;->U1:Landroid/view/View;
903-
904-    .line 66
905-    .line 67
906-    if-eqz p0, :cond_5
907-
908-    .line 68
909-    .line 69
910:    invoke-virtual {p0}, Landroid/view/View;->getLeft()I
911-
912-    .line 70
913-    .line 71
914-    .line 72
915-    move-result p0
916-
917-    .line 73
918-    add-int/2addr p0, v1
919-
920-    .line 74
921-    iput p0, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I
922-
923-    .line 75
924-    .line 76
925-    iput p1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I
926-
927-    .line 77
928-    .line 78
929:    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
930-
931-    .line 79
932-    .line 80
933-    .line 81
934-    return-void
935-
936-    .line 82
937-    :cond_5
938-    const-string p0, "trackInfoView"
939-
940-    .line 83
941-    .line 84
942-    invoke-static {p0}, Lp/wj50;->d0(Ljava/lang/String;)V
943-
944-    .line 85
945-    .line 86
946-    .line 87
947-    throw v3
948-
949-    .line 88
950-    :cond_6
951-    new-instance p0, Ljava/lang/NullPointerException;
952-
953-    .line 89
954-    .line 90
955-    const-string p1, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams"
956-
957-    .line 91
958-    .line 92
959-    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V
--
1375-    .line 499
1376-    .line 500
1377-.end method
1378-
1379-.method public static d(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
1380-    .locals 7
1381-
1382-    .line 1
1383-    sget-object v0, Lp/hxt;->w:Lp/up60;
1384-
1385-    .line 2
1386-    .line 3
1387:    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;
1388-
1389-    .line 4
1390-    .line 5
1391-    .line 6
1392-    move-result-object v1
1393-
1394-    .line 7
1395-    const/4 v5, 0x0
1396-
1397-    .line 8
1398-    const/16 v6, 0x70
1399-
1400-    .line 9
1401-    .line 10
1402-    sget-object v4, Lp/w2a1;->a:Lp/w2a1;
1403-
1404-    .line 11
1405-    .line 12
1406-    move-object v3, p0
1407-
1408-    .line 13
1409-    move-object v2, p1
1410-
1411-    .line 14
1412-    invoke-static/range {v1 .. v6}, Lp/ia7;->m(Landroid/content/Context;Landroid/view/ViewGroup;Lp/qy8;Ljava/lang/Object;Lp/gw41;I)Lp/hxt;
1413-
1414-    .line 15
1415-    .line 16
1416-    .line 17
1417-    move-result-object p0
--
1483-    .line 81
1484-    .line 82
1485-.end method
1486-
1487-.method public static e(Lp/cut;Landroid/view/ViewGroup;Ljava/lang/Object;)Lp/hxt;
1488-    .locals 7
1489-
1490-    .line 1
1491-    sget-object v0, Lp/hxt;->w:Lp/up60;
1492-
1493-    .line 2
1494-    .line 3
1495:    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;
1496-
1497-    .line 4
1498-    .line 5
1499-    .line 6
1500-    move-result-object v1
1501-
1502-    .line 7
1503-    const/4 v5, 0x0
1504-
1505-    .line 8
1506-    const/16 v6, 0x70
1507-
1508-    .line 9
1509-    .line 10
1510-    move-object v3, p0
1511-
1512-    .line 11
1513-    move-object v2, p1
1514-
1515-    .line 12
1516-    move-object v4, p2
1517-
1518-    .line 13
1519-    invoke-static/range {v1 .. v6}, Lp/ia7;->m(Landroid/content/Context;Landroid/view/ViewGroup;Lp/qy8;Ljava/lang/Object;Lp/gw41;I)Lp/hxt;
1520-
1521-    .line 14
1522-    .line 15
1523-    .line 16
1524-    move-result-object p0
1525-
--
1661-    .line 151
1662-    .line 152
1663-.end method
1664-
1665-.method public static f(Lp/qy8;Landroid/view/ViewGroup;)Lp/hxt;
1666-    .locals 3
1667-
1668-    .line 1
1669-    sget-object v0, Lp/hxt;->w:Lp/up60;
1670-
1671-    .line 2
1672-    .line 3
1673:    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;
1674-
1675-    .line 4
1676-    .line 5
1677-    .line 6
1678-    move-result-object v0
1679-
1680-    .line 7
1681-    const/4 v1, 0x0
1682-
1683-    .line 8
1684-    const/16 v2, 0x18
1685-
1686-    .line 9
1687-    .line 10
1688-    invoke-static {v0, p1, p0, v1, v2}, Lp/ia7;->n(Landroid/content/Context;Landroid/view/ViewGroup;Lp/qy8;Lp/gw41;I)Lp/hxt;
1689-
1690-    .line 11
1691-    .line 12
1692-    .line 13
1693-    move-result-object p0
1694-
1695-    .line 14
1696-    return-object p0
1697-    .line 15
1698-    .line 16
1699-    .line 17
1700-    .line 18
1701-    .line 19
1702-    .line 20
1703-    .line 21
--
1889-    iget-object v4, v2, Lp/eju;->c:Lp/dju;
1890-
1891-    .line 10
1892-    .line 11
1893-    iget-object v5, v2, Lp/eju;->a:Lp/tgq;
1894-
1895-    .line 12
1896-    .line 13
1897-    iget-object v6, v0, Lp/qwb1;->q1:Lp/vbj;
1898-
1899-    .line 14
1900-    .line 15
1901:    invoke-virtual {v6}, Lp/vbj;->b()Z
1902-
1903-    .line 16
1904-    .line 17
1905-    .line 18
1906-    move-result v7
1907-
1908-    .line 19
1909-    iput-boolean v7, v0, Lp/qwb1;->t2:Z
1910-
1911-    .line 20
1912-    .line 21
1913-    iget-object v13, v0, Lp/qwb1;->m2:Lp/wg61;
1914-
1915-    .line 22
1916-    .line 23
1917-    const-string v15, "trackInfoView"
1918-
1919-    .line 24
1920-    .line 25
1921-    const-string v16, "overlayControlsView"
1922-
1923-    .line 26
1924-    .line 27
1925-    iget-object v12, v0, Lp/qwb1;->z1:Lio/reactivex/rxjava3/internal/operators/flowable/FlowableDistinctUntilChanged;
1926-
1927-    .line 28
1928-    .line 29
1929-    iget-object v8, v0, Lp/qwb1;->Y0:Lp/oge0;
1930-
1931-    .line 30
--
2069-    const v10, 0x7f0e0978
2070-
2071-    .line 100
2072-    .line 101
2073-    .line 102
2074-    move-object/from16 v38, v6
2075-
2076-    .line 103
2077-    .line 104
2078-    const/4 v6, 0x0
2079-
2080-    .line 105
2081:    invoke-virtual {v1, v10, v3, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
2082-
2083-    .line 106
2084-    .line 107
2085-    .line 108
2086-    move-result-object v1
2087-
2088-    .line 109
2089-    check-cast v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;
2090-
2091-    .line 110
2092-    .line 111
2093-    const v3, 0x7f0b0bbf
2094-
2095-    .line 112
2096-    .line 113
2097-    .line 114
2098:    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
2099-
2100-    .line 115
2101-    .line 116
2102-    .line 117
2103-    move-result-object v3
2104-
2105-    .line 118
2106-    check-cast v3, Lcom/spotify/nowplaying/uiusecases/overlay/OverlayHidingFrameLayout;
2107-
2108-    .line 119
2109-    .line 120
2110-    iput-object v3, v0, Lp/qwb1;->O1:Lcom/spotify/nowplaying/uiusecases/overlay/OverlayHidingFrameLayout;
2111-
2112-    .line 121
2113-    .line 122
2114-    const v3, 0x7f0b0c63
2115-
2116-    .line 123
2117-    .line 124
2118-    .line 125
2119:    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
2120-
2121-    .line 126
2122-    .line 127
2123-    .line 128
2124-    move-result-object v3
2125-
2126-    .line 129
2127-    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;
2128-
2129-    .line 130
2130-    .line 131
2131-    invoke-static {v3}, Lp/wj50;->p(Ljava/lang/Object;)V
2132-
2133-    .line 132
2134-    .line 133
2135-    .line 134
2136:    invoke-virtual/range {v55 .. v55}, Lp/hwb1;->f()Lp/st91;
2137-
2138-    .line 135
2139-    .line 136
2140-    .line 137
2141-    move-result-object v6
2142-
2143-    .line 138
2144-    invoke-static {v3, v6}, Lp/qwb1;->g(Landroid/view/View;Lp/st91;)V
2145-
2146-    .line 139
2147-    .line 140
2148-    .line 141
2149-    iput-object v3, v0, Lp/qwb1;->a2:Landroidx/constraintlayout/widget/ConstraintLayout;
2150-
2151-    .line 142
2152-    .line 143
2153-    const v3, 0x7f0b070a
2154-
2155-    .line 144
2156-    .line 145
2157-    .line 146
2158:    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
2159-
2160-    .line 147
2161-    .line 148
2162-    .line 149
2163-    move-result-object v3
2164-
2165-    .line 150
2166-    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;
2167-
2168-    .line 151
2169-    .line 152
2170-    invoke-static {v3}, Lp/wj50;->p(Ljava/lang/Object;)V
2171-
2172-    .line 153
2173-    .line 154
2174-    .line 155
2175:    invoke-virtual/range {v55 .. v55}, Lp/hwb1;->d()Lp/st91;
2176-
2177-    .line 156
2178-    .line 157
2179-    .line 158
2180-    move-result-object v6
2181-
2182-    .line 159
2183-    invoke-static {v3, v6}, Lp/qwb1;->g(Landroid/view/View;Lp/st91;)V
2184-
2185-    .line 160
2186-    .line 161
2187-    .line 162
2188-    iput-object v3, v0, Lp/qwb1;->P1:Landroidx/constraintlayout/widget/ConstraintLayout;
2189-
2190-    .line 163
2191-    .line 164
2192-    const v3, 0x7f0b0936
2193-
2194-    .line 165
2195-    .line 166
2196-    .line 167
2197:    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
2198-
2199-    .line 168
2200-    .line 169
2201-    .line 170
2202-    move-result-object v3
2203-
2204-    .line 171
2205-    iput-object v3, v0, Lp/qwb1;->f2:Landroid/view/View;
2206-
2207-    .line 172
2208-    .line 173
2209-    iget-object v3, v0, Lp/qwb1;->P1:Landroidx/constraintlayout/widget/ConstraintLayout;
2210-
2211-    .line 174
2212-    .line 175
2213-    if-eqz v3, :cond_12
2214-
2215-    .line 176
2216-    .line 177
2217-    invoke-static {v12, v3}, Lp/qwb1;->f(Lp/qy8;Landroid/view/ViewGroup;)Lp/hxt;
2218-
2219-    .line 178
2220-    .line 179
2221-    .line 180
2222-    move-result-object v3
2223-
2224-    .line 181
2225-    iget-object v6, v3, Lp/hxt;->t:Landroid/view/View;
2226-
2227-    .line 182
--
2311-    invoke-static {v8, v10}, Lp/qwb1;->d(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
2312-
2313-    .line 224
2314-    .line 225
2315-    .line 226
2316-    move-result-object v8
2317-
2318-    .line 227
2319-    iget-object v8, v8, Lp/hxt;->t:Landroid/view/View;
2320-
2321-    .line 228
2322-    .line 229
2323:    invoke-virtual {v7, v8}, Lp/ro80;->add(Ljava/lang/Object;)Z
2324-
2325-    .line 230
2326-    .line 231
2327-    .line 232
2328-    new-instance v8, Lp/f6q;
2329-
2330-    .line 233
2331-    .line 234
2332-    iget-object v10, v5, Lp/tgq;->b:Ljava/lang/Object;
2333-
2334-    .line 235
2335-    .line 236
2336-    check-cast v10, Landroid/content/Context;
2337-
2338-    .line 237
2339-    .line 238
2340-    const/4 v12, 0x0
2341-
2342-    .line 239
2343-    invoke-direct {v8, v10, v12}, Lp/f6q;-><init>(Landroid/content/Context;I)V
2344-
2345-    .line 240
2346-    .line 241
2347-    .line 242
2348-    iget-object v10, v0, Lp/qwb1;->Q0:Lp/b9k;
2349-
2350-    .line 243
2351-    .line 244
2352-    invoke-static {v10, v8}, Lp/b9k;->f(Lp/b9k;Lp/ovf;)Lp/izh;
2353-
--
2368-    invoke-static {v8, v10}, Lp/qwb1;->d(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
2369-
2370-    .line 253
2371-    .line 254
2372-    .line 255
2373-    move-result-object v8
2374-
2375-    .line 256
2376-    iget-object v8, v8, Lp/hxt;->t:Landroid/view/View;
2377-
2378-    .line 257
2379-    .line 258
2380:    invoke-virtual {v7, v8}, Lp/ro80;->add(Ljava/lang/Object;)Z
2381-
2382-    .line 259
2383-    .line 260
2384-    .line 261
2385-    iget-object v2, v2, Lp/rb5;->b:Ljava/lang/Object;
2386-
2387-    .line 262
2388-    .line 263
2389-    check-cast v2, Lp/bjc0;
2390-
2391-    .line 264
2392-    .line 265
2393-    iget-object v8, v0, Lp/qwb1;->P1:Landroidx/constraintlayout/widget/ConstraintLayout;
2394-
2395-    .line 266
2396-    .line 267
2397-    if-eqz v8, :cond_d
2398-
2399-    .line 268
2400-    .line 269
2401-    invoke-static {v2, v8}, Lp/qwb1;->d(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
2402-
2403-    .line 270
2404-    .line 271
2405-    .line 272
2406-    move-result-object v2
2407-
2408-    .line 273
2409-    iget-object v2, v2, Lp/hxt;->t:Landroid/view/View;
2410-
2411-    .line 274
2412-    .line 275
2413:    invoke-virtual {v7, v2}, Lp/ro80;->add(Ljava/lang/Object;)Z
2414-
2415-    .line 276
2416-    .line 277
2417-    .line 278
2418-    const/4 v2, 0x0
2419-
2420-    .line 279
2421-    const/4 v12, 0x3
2422-
2423-    .line 280
2424-    invoke-static {v15, v2, v2, v12}, Lp/w9h1;->y(Lp/ry8;Landroid/view/ViewGroup$LayoutParams;Lcom/spotify/nowplaying/scroll/ScrollCardType;I)Lp/rxt;
2425-
2426-    .line 281
2427-    .line 282
2428-    .line 283
2429-    move-result-object v8
2430-
2431-    .line 284
2432-    iget-object v2, v0, Lp/qwb1;->P1:Landroidx/constraintlayout/widget/ConstraintLayout;
2433-
2434-    .line 285
2435-    .line 286
2436-    if-eqz v2, :cond_c
2437-
2438-    .line 287
2439-    .line 288
2440-    invoke-static {v8, v2}, Lp/qwb1;->d(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
2441-
2442-    .line 289
2443-    .line 290
2444-    .line 291
2445-    move-result-object v2
2446-
2447-    .line 292
2448-    iget-object v2, v2, Lp/hxt;->t:Landroid/view/View;
2449-
2450-    .line 293
2451-    .line 294
2452:    invoke-virtual {v7, v2}, Lp/ro80;->add(Ljava/lang/Object;)Z
2453-
2454-    .line 295
2455-    .line 296
2456-    .line 297
2457-    new-instance v2, Lp/v8p;
2458-
2459-    .line 298
2460-    .line 299
2461-    iget-object v5, v5, Lp/tgq;->b:Ljava/lang/Object;
2462-
2463-    .line 300
2464-    .line 301
2465-    check-cast v5, Landroid/content/Context;
2466-
2467-    .line 302
2468-    .line 303
2469-    invoke-direct {v2, v5}, Lp/v8p;-><init>(Landroid/content/Context;)V
2470-
2471-    .line 304
2472-    .line 305
2473-    .line 306
2474:    invoke-virtual {v14, v13, v9, v2}, Lp/cxb;->n(Lio/reactivex/rxjava3/core/Flowable;Lp/gh00;Lp/ovf;)Lp/a3k;
2475-
2476-    .line 307
2477-    .line 308
2478-    .line 309
2479-    move-result-object v2
2480-
2481-    .line 310
2482-    iget-object v5, v0, Lp/qwb1;->P1:Landroidx/constraintlayout/widget/ConstraintLayout;
2483-
2484-    .line 311
2485-    .line 312
2486-    if-eqz v5, :cond_b
2487-
2488-    .line 313
2489-    .line 314
2490-    invoke-static {v2, v5}, Lp/qwb1;->d(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
2491-
2492-    .line 315
2493-    .line 316
2494-    .line 317
2495-    move-result-object v2
2496-
2497-    .line 318
2498-    iget-object v2, v2, Lp/hxt;->t:Landroid/view/View;
2499-
2500-    .line 319
2501-    .line 320
2502:    invoke-virtual {v7, v2}, Lp/ro80;->add(Ljava/lang/Object;)Z
2503-
2504-    .line 321
2505-    .line 322
2506-    .line 323
2507-    invoke-static {v7}, Lp/geg1;->m(Ljava/util/List;)Lp/ro80;
2508-
2509-    .line 324
2510-    .line 325
2511-    .line 326
2512-    move-result-object v2
2513-
2514-    .line 327
2515:    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;
2516-
2517-    .line 328
2518-    .line 329
2519-    .line 330
2520-    move-result-object v5
2521-
2522-    .line 331
2523-    const v7, 0x7f0707ad
2524-
2525-    .line 332
2526-    .line 333
2527-    .line 334
2528-    invoke-static {v5, v7}, Lp/jq60;->q(Landroid/content/Context;I)I
2529-
2530-    .line 335
2531-    .line 336
2532-    .line 337
2533-    move-result v5
2534-
2535-    .line 338
2536:    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;
2537-
2538-    .line 339
2539-    .line 340
2540-    .line 341
2541-    move-result-object v7
2542-
2543-    .line 342
2544-    const v8, 0x7f070758
2545-
2546-    .line 343
2547-    .line 344
2548-    .line 345
2549-    invoke-static {v7, v8}, Lp/jq60;->q(Landroid/content/Context;I)I
2550-
2551-    .line 346
2552-    .line 347
2553-    .line 348
2554-    move-result v7
2555-
2556-    .line 349
2557-    sget-object v8, Lp/mec1;->a:Ljava/util/WeakHashMap;
2558-
2559-    .line 350
2560-    .line 351
2561-    invoke-static {}, Landroid/view/View;->generateViewId()I
2562-
2563-    .line 352
2564-    .line 353
2565-    .line 354
2566-    move-result v8
2567-
2568-    .line 355
2569:    invoke-virtual {v6, v8}, Landroid/view/View;->setId(I)V
2570-
2571-    .line 356
2572-    .line 357
2573-    .line 358
2574-    invoke-static {}, Landroid/view/View;->generateViewId()I
2575-
2576-    .line 359
2577-    .line 360
2578-    .line 361
2579-    move-result v8
2580-
2581-    .line 362
2582:    invoke-virtual {v4, v8}, Landroid/view/View;->setId(I)V
2583-
2584-    .line 363
2585-    .line 364
2586-    .line 365
2587-    const/4 v12, 0x0
2588-
2589-    .line 366
2590:    invoke-virtual {v2, v12}, Lp/ro80;->listIterator(I)Ljava/util/ListIterator;
2591-
2592-    .line 367
2593-    .line 368
2594-    .line 369
2595-    move-result-object v8
2596-
2597-    .line 370
2598-    :goto_0
2599-    move-object v9, v8
2600-
2601-    .line 371
2602-    check-cast v9, Lp/qo80;
2603-
2604-    .line 372
2605-    .line 373
2606:    invoke-virtual {v9}, Lp/qo80;->hasNext()Z
2607-
2608-    .line 374
2609-    .line 375
2610-    .line 376
2611-    move-result v10
2612-
2613-    .line 377
2614-    if-eqz v10, :cond_0
2615-
2616-    .line 378
2617-    .line 379
2618:    invoke-virtual {v9}, Lp/qo80;->next()Ljava/lang/Object;
2619-
2620-    .line 380
2621-    .line 381
2622-    .line 382
2623-    move-result-object v9
2624-
2625-    .line 383
2626-    check-cast v9, Landroid/view/View;
2627-
2628-    .line 384
2629-    .line 385
2630-    invoke-static {}, Landroid/view/View;->generateViewId()I
2631-
2632-    .line 386
2633-    .line 387
2634-    .line 388
2635-    move-result v10
2636-
2637-    .line 389
2638:    invoke-virtual {v9, v10}, Landroid/view/View;->setId(I)V
2639-
2640-    .line 390
2641-    .line 391
2642-    .line 392
2643-    goto :goto_0
2644-
2645-    .line 393
2646-    :cond_0
2647-    new-instance v8, Lp/r430;
2648-
2649-    .line 394
2650-    .line 395
2651-    const/4 v9, 0x4
2652-
2653-    .line 396
2654-    invoke-direct {v8, v7, v9}, Lp/r430;-><init>(II)V
2655-
2656-    .line 397
2657-    .line 398
2658-    .line 399
2659-    const/4 v9, -0x2
2660-
2661-    .line 400
2662-    const/4 v10, 0x0
2663-
2664-    .line 401
2665-    invoke-static {v3, v6, v10, v9, v8}, Lp/exg1;->s(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;IILp/gh00;)V
2666-
2667-    .line 402
2668-    .line 403
--
2678-
2679-    .line 408
2680-    .line 409
2681-    .line 410
2682-    invoke-static {v3, v4, v9, v9, v8}, Lp/exg1;->s(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;IILp/gh00;)V
2683-
2684-    .line 411
2685-    .line 412
2686-    .line 413
2687-    const/4 v12, 0x0
2688-
2689-    .line 414
2690:    invoke-virtual {v2, v12}, Lp/ro80;->listIterator(I)Ljava/util/ListIterator;
2691-
2692-    .line 415
2693-    .line 416
2694-    .line 417
2695-    move-result-object v8
2696-
2697-    .line 418
2698-    const/4 v9, 0x0
2699-
2700-    .line 419
2701-    :goto_1
2702-    move-object v10, v8
2703-
2704-    .line 420
2705-    check-cast v10, Lp/qo80;
2706-
2707-    .line 421
2708-    .line 422
2709:    invoke-virtual {v10}, Lp/qo80;->hasNext()Z
2710-
2711-    .line 423
2712-    .line 424
2713-    .line 425
2714-    move-result v12
2715-
2716-    .line 426
2717-    if-eqz v12, :cond_2
2718-
2719-    .line 427
2720-    .line 428
2721:    invoke-virtual {v10}, Lp/qo80;->next()Ljava/lang/Object;
2722-
2723-    .line 429
2724-    .line 430
2725-    .line 431
2726-    move-result-object v10
2727-
2728-    .line 432
2729-    add-int/lit8 v12, v9, 0x1
2730-
2731-    .line 433
2732-    .line 434
2733-    if-ltz v9, :cond_1
2734-
2735-    .line 435
2736-    .line 436
2737-    check-cast v10, Landroid/view/View;
2738-
2739-    .line 437
2740-    .line 438
2741-    new-instance v13, Lp/po70;
2742-
2743-    .line 439
2744-    .line 440
2745-    invoke-direct {v13, v9, v2, v7}, Lp/po70;-><init>(ILp/ro80;I)V
2746-
2747-    .line 441
2748-    .line 442
2749-    .line 443
2750-    invoke-static {v3, v10, v5, v5, v13}, Lp/exg1;->s(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;IILp/gh00;)V
2751-
--
2812-    move-object/from16 v2, v60
2813-
2814-    .line 474
2815-    .line 475
2816-    invoke-static {v2, v4}, Lp/exg1;->y(Landroidx/constraintlayout/widget/ConstraintLayout;Lp/gh00;)V
2817-
2818-    .line 476
2819-    .line 477
2820-    .line 478
2821-    const/4 v12, 0x0
2822-
2823-    .line 479
2824:    invoke-virtual {v3, v12}, Lp/ro80;->listIterator(I)Ljava/util/ListIterator;
2825-
2826-    .line 480
2827-    .line 481
2828-    .line 482
2829-    move-result-object v2
2830-
2831-    .line 483
2832-    :goto_2
2833-    move-object v3, v2
2834-
2835-    .line 484
2836-    check-cast v3, Lp/qo80;
2837-
2838-    .line 485
2839-    .line 486
2840:    invoke-virtual {v3}, Lp/qo80;->hasNext()Z
2841-
2842-    .line 487
2843-    .line 488
2844-    .line 489
2845-    move-result v4
2846-
2847-    .line 490
2848-    if-eqz v4, :cond_3
2849-
2850-    .line 491
2851-    .line 492
2852:    invoke-virtual {v3}, Lp/qo80;->next()Ljava/lang/Object;
2853-
2854-    .line 493
2855-    .line 494
2856-    .line 495
2857-    move-result-object v3
2858-
2859-    .line 496
2860-    check-cast v3, Landroid/view/View;
2861-
2862-    .line 497
2863-    .line 498
2864-    const/4 v4, 0x1
2865-
2866-    .line 499
2867:    invoke-virtual {v3, v4}, Landroid/view/View;->setClickable(Z)V
2868-
2869-    .line 500
2870-    .line 501
2871-    .line 502
2872-    goto :goto_2
2873-
2874-    .line 503
2875-    :cond_3
2876-    const v2, 0x7f0b0eb1
2877-
2878-    .line 504
2879-    .line 505
2880-    .line 506
2881:    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
2882-
2883-    .line 507
2884-    .line 508
2885-    .line 509
2886-    move-result-object v2
2887-
2888-    .line 510
2889-    if-eqz v2, :cond_4
2890-
2891-    .line 511
2892-    .line 512
2893:    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
2894-
2895-    .line 513
2896-    .line 514
2897-    .line 515
2898-    move-result-object v3
2899-
2900-    .line 516
2901-    check-cast v3, Landroid/view/ViewGroup;
2902-
2903-    .line 517
2904-    .line 518
2905-    new-instance v4, Lp/kk21;
2906-
2907-    .line 519
2908-    .line 520
2909-    const/4 v7, 0x0
2910-
2911-    .line 521
2912-    const/4 v10, 0x5
2913-
2914-    .line 522
2915-    invoke-direct {v4, v10, v7}, Lp/kk21;-><init>(ILp/gh00;)V
2916-
2917-    .line 523
2918-    .line 524
2919-    .line 525
2920-    const/4 v12, 0x3
2921-
2922-    .line 526
2923-    invoke-static {v11, v7, v7, v12}, Lp/w9h1;->y(Lp/ry8;Landroid/view/ViewGroup$LayoutParams;Lcom/spotify/nowplaying/scroll/ScrollCardType;I)Lp/rxt;
--
2954-
2955-    .line 542
2956-    .line 543
2957-    iget-object v3, v4, Lp/dju;->b:Landroid/content/Context;
2958-
2959-    .line 544
2960-    .line 545
2961-    invoke-direct {v2, v3}, Lp/qcq;-><init>(Landroid/content/Context;)V
2962-
2963-    .line 546
2964-    .line 547
2965-    .line 548
2966:    invoke-virtual/range {v27 .. v27}, Lp/wg61;->getValue()Ljava/lang/Object;
2967-
2968-    .line 549
2969-    .line 550
2970-    .line 551
2971-    move-result-object v3
2972-
2973-    .line 552
2974-    check-cast v3, Lp/sdk0;
2975-
2976-    .line 553
2977-    .line 554
2978-    iget-object v3, v3, Lp/sdk0;->g:Lp/g6m0;
2979-
2980-    .line 555
2981-    .line 556
2982-    new-instance v4, Lp/tf41;
2983-
2984-    .line 557
2985-    .line 558
2986-    const/4 v11, 0x0
2987-
2988-    .line 559
2989-    const/16 v12, 0x18
2990-
2991-    .line 560
2992-    .line 561
2993-    const/4 v5, 0x1
2994-
2995-    .line 562
2996-    iget-object v6, v0, Lp/qwb1;->i2:Lio/reactivex/rxjava3/processors/ReplayProcessor;
--
3016-
3017-    .line 572
3018-    .line 573
3019-    .line 574
3020-    move-object/from16 v6, v38
3021-
3022-    .line 575
3023-    .line 576
3024-    move-object/from16 v7, v40
3025-
3026-    .line 577
3027-    .line 578
3028:    invoke-virtual {v7, v6, v3, v4}, Lp/oge0;->i(Ljava/util/List;Lp/t9p0;Lp/gh00;)Lp/hbk0;
3029-
3030-    .line 579
3031-    .line 580
3032-    .line 581
3033-    move-result-object v3
3034-
3035-    .line 582
3036:    invoke-virtual {v2, v3}, Lp/qcq;->A(Lp/wt81;)V
3037-
3038-    .line 583
3039-    .line 584
3040-    .line 585
3041-    const v3, 0x7f0b1116
3042-
3043-    .line 586
3044-    .line 587
3045-    .line 588
3046:    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
3047-
3048-    .line 589
3049-    .line 590
3050-    .line 591
3051-    move-result-object v3
3052-
3053-    .line 592
3054:    invoke-virtual/range {v22 .. v22}, Lp/wb4;->b()Z
3055-
3056-    .line 593
3057-    .line 594
3058-    .line 595
3059-    move-result v4
3060-
3061-    .line 596
3062-    if-eqz v4, :cond_5
3063-
3064-    .line 597
3065-    .line 598
3066-    move-object/from16 v10, v37
3067-
3068-    .line 599
3069-    .line 600
3070-    invoke-static {v10, v2}, Lp/hc81;->a(Lp/hc81;Lp/qcq;)Lp/wk0;
3071-
3072-    .line 601
3073-    .line 602
3074-    .line 603
3075-    move-result-object v2
3076-
3077-    .line 604
3078-    invoke-static {v2, v1}, Lp/qwb1;->d(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
3079-
3080-    .line 605
3081-    .line 606
3082-    .line 607
3083-    move-result-object v2
3084-
--
3118-    .line 624
3119-    :goto_3
3120-    invoke-static {v3, v2}, Lp/psg1;->H(Landroid/view/View;Landroid/view/View;)V
3121-
3122-    .line 625
3123-    .line 626
3124-    .line 627
3125-    const v2, 0x7f0b0e53
3126-
3127-    .line 628
3128-    .line 629
3129-    .line 630
3130:    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
3131-
3132-    .line 631
3133-    .line 632
3134-    .line 633
3135-    move-result-object v2
3136-
3137-    .line 634
3138-    invoke-static {v2}, Lp/wj50;->p(Ljava/lang/Object;)V
3139-
3140-    .line 635
3141-    .line 636
3142-    .line 637
3143-    new-instance v3, Lp/iwb1;
3144-
3145-    .line 638
3146-    .line 639
3147-    const/16 v4, 0xd
3148-
3149-    .line 640
3150-    .line 641
3151-    invoke-direct {v3, v0, v4}, Lp/iwb1;-><init>(Lp/qwb1;I)V
3152-
3153-    .line 642
3154-    .line 643
3155-    .line 644
3156-    new-instance v4, Lp/iwb1;
3157-
3158-    .line 645
3159-    .line 646
3160-    const/16 v5, 0xe
3161-
3162-    .line 647
3163-    .line 648
3164-    invoke-direct {v4, v0, v5}, Lp/iwb1;-><init>(Lp/qwb1;I)V
3165-
3166-    .line 649
3167-    .line 650
3168-    .line 651
3169-    move-object/from16 v5, v54
3170-
3171-    .line 652
3172-    .line 653
3173:    invoke-virtual {v5, v3, v4}, Lp/sef0;->n(Lp/eh00;Lp/eh00;)Lp/cut;
3174-
3175-    .line 654
3176-    .line 655
3177-    .line 656
3178-    move-result-object v3
3179-
3180-    .line 657
3181:    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
3182-
3183-    .line 658
3184-    .line 659
3185-    .line 660
3186-    move-result-object v4
3187-
3188-    .line 661
3189-    check-cast v4, Landroid/view/ViewGroup;
3190-
3191-    .line 662
3192-    .line 663
3193-    invoke-static {v3, v4}, Lp/qwb1;->d(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
3194-
3195-    .line 664
3196-    .line 665
3197-    .line 666
3198-    move-result-object v3
3199-
3200-    .line 667
3201-    iget-object v3, v3, Lp/hxt;->t:Landroid/view/View;
3202-
3203-    .line 668
3204-    .line 669
3205-    invoke-static {v2, v3}, Lp/psg1;->H(Landroid/view/View;Landroid/view/View;)V
3206-
3207-    .line 670
3208-    .line 671
3209-    .line 672
3210-    const v2, 0x7f0b069f
3211-
3212-    .line 673
3213-    .line 674
3214-    .line 675
3215:    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
3216-
3217-    .line 676
3218-    .line 677
3219-    .line 678
3220-    move-result-object v2
3221-
3222-    .line 679
3223-    invoke-static {v2}, Lp/wj50;->p(Ljava/lang/Object;)V
3224-
3225-    .line 680
3226-    .line 681
3227-    .line 682
3228-    move-object/from16 v3, v33
3229-
3230-    .line 683
3231-    .line 684
3232-    const/4 v7, 0x0
3233-
3234-    .line 685
3235-    const/4 v12, 0x3
3236-
3237-    .line 686
3238-    invoke-static {v3, v7, v7, v12}, Lp/w9h1;->y(Lp/ry8;Landroid/view/ViewGroup$LayoutParams;Lcom/spotify/nowplaying/scroll/ScrollCardType;I)Lp/rxt;
3239-
3240-    .line 687
3241-    .line 688
3242-    .line 689
3243-    move-result-object v3
3244-
3245-    .line 690
3246:    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
3247-
3248-    .line 691
3249-    .line 692
3250-    .line 693
3251-    move-result-object v4
3252-
3253-    .line 694
3254-    check-cast v4, Landroid/view/ViewGroup;
3255-
3256-    .line 695
3257-    .line 696
3258-    new-instance v6, Lp/wf00;
3259-
3260-    .line 697
3261-    .line 698
3262-    const/4 v7, 0x1
3263-
3264-    .line 699
3265-    invoke-direct {v6, v7}, Lp/wf00;-><init>(Z)V
3266-
3267-    .line 700
3268-    .line 701
3269-    .line 702
3270-    invoke-static {v3, v4, v6}, Lp/qwb1;->e(Lp/cut;Landroid/view/ViewGroup;Ljava/lang/Object;)Lp/hxt;
3271-
3272-    .line 703
3273-    .line 704
3274-    .line 705
3275-    move-result-object v3
3276-
--
3280-    .line 707
3281-    .line 708
3282-    invoke-static {v2, v3}, Lp/psg1;->H(Landroid/view/View;Landroid/view/View;)V
3283-
3284-    .line 709
3285-    .line 710
3286-    .line 711
3287-    const v2, 0x7f0b0e51
3288-
3289-    .line 712
3290-    .line 713
3291-    .line 714
3292:    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
3293-
3294-    .line 715
3295-    .line 716
3296-    .line 717
3297-    move-result-object v2
3298-
3299-    .line 718
3300:    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
3301-
3302-    .line 719
3303-    .line 720
3304-    .line 721
3305-    move-result-object v3
3306-
3307-    .line 722
3308-    check-cast v3, Landroid/view/ViewGroup;
3309-
3310-    .line 723
3311-    .line 724
3312-    new-instance v4, Lp/udz0;
3313-
3314-    .line 725
3315-    .line 726
3316-    const/4 v6, 0x2
3317-
3318-    .line 727
3319-    invoke-direct {v4, v6}, Lp/udz0;-><init>(I)V
3320-
3321-    .line 728
3322-    .line 729
3323-    .line 730
3324-    iget-object v6, v0, Lp/qwb1;->W0:Lp/fdq0;
3325-
3326-    .line 731
3327-    .line 732
3328-    invoke-static {v6, v3, v4}, Lp/qwb1;->e(Lp/cut;Landroid/view/ViewGroup;Ljava/lang/Object;)Lp/hxt;
3329-
3330-    .line 733
--
3349-    iget-object v6, v0, Lp/qwb1;->a2:Landroidx/constraintlayout/widget/ConstraintLayout;
3350-
3351-    .line 744
3352-    .line 745
3353-    if-eqz v6, :cond_a
3354-
3355-    .line 746
3356-    .line 747
3357-    new-instance v7, Landroid/view/View;
3358-
3359-    .line 748
3360-    .line 749
3361:    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;
3362-
3363-    .line 750
3364-    .line 751
3365-    .line 752
3366-    move-result-object v2
3367-
3368-    .line 753
3369-    invoke-direct {v7, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V
3370-
3371-    .line 754
3372-    .line 755
3373-    .line 756
3374-    new-instance v2, Lp/iwb1;
3375-
3376-    .line 757
3377-    .line 758
3378-    const/16 v3, 0x9
3379-
3380-    .line 759
3381-    .line 760
3382-    invoke-direct {v2, v0, v3}, Lp/iwb1;-><init>(Lp/qwb1;I)V
3383-
3384-    .line 761
3385-    .line 762
3386-    .line 763
3387-    new-instance v3, Lp/iwb1;
3388-
3389-    .line 764
3390-    .line 765
3391-    const/16 v4, 0xa
3392-
3393-    .line 766
3394-    .line 767
3395-    invoke-direct {v3, v0, v4}, Lp/iwb1;-><init>(Lp/qwb1;I)V
3396-
3397-    .line 768
3398-    .line 769
3399-    .line 770
3400:    invoke-virtual {v5, v2, v3}, Lp/sef0;->n(Lp/eh00;Lp/eh00;)Lp/cut;
3401-
3402-    .line 771
3403-    .line 772
3404-    .line 773
3405-    move-result-object v2
3406-
3407-    .line 774
3408-    iget-object v3, v0, Lp/qwb1;->a2:Landroidx/constraintlayout/widget/ConstraintLayout;
3409-
3410-    .line 775
3411-    .line 776
3412-    if-eqz v3, :cond_9
3413-
3414-    .line 777
3415-    .line 778
3416-    invoke-static {v2, v3}, Lp/qwb1;->d(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
3417-
3418-    .line 779
3419-    .line 780
3420-    .line 781
3421-    move-result-object v2
3422-
3423-    .line 782
3424-    iget-object v8, v2, Lp/hxt;->t:Landroid/view/View;
3425-
3426-    .line 783
3427-    .line 784
3428:    invoke-virtual/range {v25 .. v25}, Lp/s2o;->p()Lp/a3k;
3429-
3430-    .line 785
3431-    .line 786
3432-    .line 787
3433-    move-result-object v2
3434-
3435-    .line 788
3436-    iget-object v3, v0, Lp/qwb1;->a2:Landroidx/constraintlayout/widget/ConstraintLayout;
3437-
3438-    .line 789
3439-    .line 790
3440-    if-eqz v3, :cond_8
3441-
3442-    .line 791
3443-    .line 792
3444-    new-instance v4, Lp/hpo0;
3445-
3446-    .line 793
3447-    .line 794
3448-    const/4 v9, 0x0
3449-
3450-    .line 795
3451-    const/4 v12, 0x3
3452-
3453-    .line 796
3454-    invoke-direct {v4, v9, v12}, Lp/hpo0;-><init>(Lp/gpo0;I)V
3455-
3456-    .line 797
3457-    .line 798
3458-    .line 799
--
3485-
3486-    .line 813
3487-    .line 814
3488-    const/16 v4, 0xc
3489-
3490-    .line 815
3491-    .line 816
3492-    invoke-direct {v3, v0, v4}, Lp/iwb1;-><init>(Lp/qwb1;I)V
3493-
3494-    .line 817
3495-    .line 818
3496-    .line 819
3497:    invoke-virtual {v5, v2, v3}, Lp/sef0;->n(Lp/eh00;Lp/eh00;)Lp/cut;
3498-
3499-    .line 820
3500-    .line 821
3501-    .line 822
3502-    move-result-object v2
3503-
3504-    .line 823
3505-    iget-object v3, v0, Lp/qwb1;->a2:Landroidx/constraintlayout/widget/ConstraintLayout;
3506-
3507-    .line 824
3508-    .line 825
3509-    if-eqz v3, :cond_7
3510-
3511-    .line 826
3512-    .line 827
3513-    invoke-static {v2, v3}, Lp/qwb1;->d(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
3514-
3515-    .line 828
3516-    .line 829
3517-    .line 830
3518-    move-result-object v2
3519-
3520-    .line 831
3521-    iget-object v10, v2, Lp/hxt;->t:Landroid/view/View;
3522-
3523-    .line 832
3524-    .line 833
3525-    new-instance v11, Landroid/view/View;
3526-
3527-    .line 834
3528-    .line 835
3529:    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;
3530-
3531-    .line 836
3532-    .line 837
3533-    .line 838
3534-    move-result-object v2
3535-
3536-    .line 839
3537-    invoke-direct {v11, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V
3538-
3539-    .line 840
3540-    .line 841
3541-    .line 842
3542-    invoke-static/range {v6 .. v11}, Lp/jq60;->J(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V
3543-
3544-    .line 843
3545-    .line 844
3546-    .line 845
3547:    invoke-virtual {v0, v1}, Lp/qwb1;->h(Landroid/view/ViewGroup;)V
3548-
3549-    .line 846
3550-    .line 847
3551-    .line 848
3552-    move-object/from16 v3, v31
3553-
3554-    .line 849
3555-    .line 850
3556-    move-object/from16 v2, v32
3557-
3558-    .line 851
3559-    .line 852
3560-    invoke-static {v3, v2}, Lp/oge0;->j(Lp/oge0;Lio/reactivex/rxjava3/internal/operators/flowable/FlowableDistinctUntilChanged;)Lp/okj0;
3561-
3562-    .line 853
3563-    .line 854
3564-    .line 855
3565-    move-result-object v2
3566-
3567-    .line 856
3568-    iput-object v2, v0, Lp/qwb1;->c2:Lp/okj0;
3569-
3570-    .line 857
3571-    .line 858
3572-    iget-object v2, v0, Lp/qwb1;->O1:Lcom/spotify/nowplaying/uiusecases/overlay/OverlayHidingFrameLayout;
3573-
3574-    .line 859
3575-    .line 860
3576-    if-eqz v2, :cond_6
3577-
3578-    .line 861
3579-    .line 862
3580-    const v3, 0x7f0b1115
3581-
3582-    .line 863
3583-    .line 864
3584-    .line 865
3585:    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
3586-
3587-    .line 866
3588-    .line 867
3589-    .line 868
3590-    move-result-object v3
3591-
3592-    .line 869
3593:    invoke-virtual {v2, v3}, Lcom/spotify/nowplaying/uiusecases/overlay/OverlayHidingFrameLayout;->setOverlayView(Landroid/view/View;)V
3594-
3595-    .line 870
3596-    .line 871
3597-    .line 872
3598-    goto/16 :goto_11
3599-
3600-    .line 873
3601-    .line 874
3602-    :cond_6
3603-    invoke-static/range {v16 .. v16}, Lp/wj50;->d0(Ljava/lang/String;)V
3604-
3605-    .line 875
3606-    .line 876
3607-    .line 877
3608-    const/16 v24, 0x0
3609-
3610-    .line 878
3611-    .line 879
3612-    throw v24
3613-
3614-    .line 880
3615-    :cond_7
3616-    const/16 v24, 0x0
3617-
3618-    .line 881
3619-    .line 882
3620-    invoke-static/range {v45 .. v45}, Lp/wj50;->d0(Ljava/lang/String;)V
3621-
3622-    .line 883
3623-    .line 884
--
3792-    move-object/from16 v8, v54
3793-
3794-    .line 963
3795-    .line 964
3796-    const v15, 0x7f0e0977
3797-
3798-    .line 965
3799-    .line 966
3800-    .line 967
3801-    const/4 v8, 0x0
3802-
3803-    .line 968
3804:    invoke-virtual {v1, v15, v3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
3805-
3806-    .line 969
3807-    .line 970
3808-    .line 971
3809-    move-result-object v1
3810-
3811-    .line 972
3812-    move-object v8, v1
3813-
3814-    .line 973
3815-    check-cast v8, Landroidx/coordinatorlayout/widget/CoordinatorLayout;
3816-
3817-    .line 974
3818-    .line 975
3819-    const v1, 0x7f0b0dd0
3820-
3821-    .line 976
3822-    .line 977
3823-    .line 978
3824:    invoke-virtual {v8, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
3825-
3826-    .line 979
3827-    .line 980
3828-    .line 981
3829-    move-result-object v1
3830-
3831-    .line 982
3832-    check-cast v1, Lcom/spotify/nowplaying/scroll/view/NowPlayingScrollView;
3833-
3834-    .line 983
3835-    .line 984
3836-    iput-object v1, v0, Lp/qwb1;->N1:Lcom/spotify/nowplaying/scroll/view/NowPlayingScrollView;
3837-
3838-    .line 985
3839-    .line 986
3840-    new-instance v15, Lp/d2j0;
3841-
3842-    .line 987
3843-    .line 988
3844-    invoke-direct {v15, v1}, Lp/d2j0;-><init>(Landroidx/core/widget/NestedScrollView;)V
3845-
3846-    .line 989
3847-    .line 990
3848-    .line 991
3849-    iput-object v15, v0, Lp/qwb1;->l2:Lp/d2j0;
3850-
3851-    .line 992
3852-    .line 993
3853-    const v1, 0x7f0b0bbf
3854-
3855-    .line 994
3856-    .line 995
3857-    .line 996
3858:    invoke-virtual {v8, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
3859-
3860-    .line 997
3861-    .line 998
3862-    .line 999
3863-    move-result-object v1
3864-
3865-    .line 1000
3866-    check-cast v1, Lcom/spotify/nowplaying/uiusecases/overlay/OverlayHidingFrameLayout;
3867-
3868-    .line 1001
3869-    .line 1002
3870-    iput-object v1, v0, Lp/qwb1;->O1:Lcom/spotify/nowplaying/uiusecases/overlay/OverlayHidingFrameLayout;
3871-
3872-    .line 1003
3873-    .line 1004
3874-    const v1, 0x7f0b0c63
3875-
3876-    .line 1005
3877-    .line 1006
3878-    .line 1007
3879:    invoke-virtual {v8, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
3880-
3881-    .line 1008
3882-    .line 1009
3883-    .line 1010
3884-    move-result-object v1
3885-
3886-    .line 1011
3887-    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;
3888-
3889-    .line 1012
3890-    .line 1013
3891-    invoke-static {v1}, Lp/wj50;->p(Ljava/lang/Object;)V
3892-
3893-    .line 1014
3894-    .line 1015
3895-    .line 1016
3896:    invoke-virtual/range {v55 .. v55}, Lp/hwb1;->f()Lp/st91;
3897-
3898-    .line 1017
3899-    .line 1018
3900-    .line 1019
3901-    move-result-object v15
3902-
3903-    .line 1020
3904-    invoke-static {v1, v15}, Lp/qwb1;->g(Landroid/view/View;Lp/st91;)V
3905-
3906-    .line 1021
3907-    .line 1022
3908-    .line 1023
3909-    iput-object v1, v0, Lp/qwb1;->a2:Landroidx/constraintlayout/widget/ConstraintLayout;
3910-
3911-    .line 1024
3912-    .line 1025
3913-    const v1, 0x7f0b1185
3914-
3915-    .line 1026
3916-    .line 1027
3917-    .line 1028
3918:    invoke-virtual {v8, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
3919-
3920-    .line 1029
3921-    .line 1030
3922-    .line 1031
3923-    move-result-object v1
3924-
3925-    .line 1032
3926-    check-cast v1, Lcom/spotify/nowplaying/scroll/container/ScrollCardsContainer;
3927-
3928-    .line 1033
3929-    .line 1034
3930-    invoke-static {v1}, Lp/wj50;->p(Ljava/lang/Object;)V
3931-
3932-    .line 1035
3933-    .line 1036
3934-    .line 1037
3935:    invoke-virtual/range {v55 .. v55}, Lp/hwb1;->c()Lp/eag0;
3936-
3937-    .line 1038
3938-    .line 1039
3939-    .line 1040
3940-    move-result-object v15
3941-
3942-    .line 1041
3943-    iget-object v3, v15, Lp/eag0;->c:Lp/zt91;
3944-
3945-    .line 1042
3946-    .line 1043
3947:    invoke-virtual {v3}, Lp/zt91;->c()Lp/yt91;
3948-
3949-    .line 1044
3950-    .line 1045
3951-    .line 1046
3952-    move-result-object v3
3953-
3954-    .line 1047
3955-    new-instance v56, Lp/bu91;
3956-
3957-    .line 1048
3958-    .line 1049
3959-    const-string v57, "scroll_components"
3960-
3961-    .line 1050
3962-    .line 1051
3963-    const/16 v58, 0x0
3964-
3965-    .line 1052
3966-    .line 1053
3967-    const/16 v59, 0x0
3968-
3969-    .line 1054
3970-    .line 1055
3971-    const/16 v60, 0x0
3972-
3973-    .line 1056
3974-    .line 1057
3975-    const/16 v61, 0x0
3976-
3977-    .line 1058
--
3988-    move-object/from16 v35, v12
3989-
3990-    .line 1065
3991-    .line 1066
3992-    move-object/from16 v2, v56
3993-
3994-    .line 1067
3995-    .line 1068
3996-    iget-object v12, v3, Lp/yt91;->i:Ljava/util/ArrayList;
3997-
3998-    .line 1069
3999-    .line 1070
4000:    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
4001-
4002-    .line 1071
4003-    .line 1072
4004-    .line 1073
4005-    const/4 v2, 0x1
4006-
4007-    .line 1074
4008-    iput-boolean v2, v3, Lp/yt91;->j:Z
4009-
4010-    .line 1075
4011-    .line 1076
4012:    invoke-virtual {v3}, Lp/yt91;->a()Lp/zt91;
4013-
4014-    .line 1077
4015-    .line 1078
4016-    .line 1079
4017-    move-result-object v3
4018-
4019-    .line 1080
4020-    sget-object v12, Lp/st91;->b:Lp/st91;
4021-
4022-    .line 1081
4023-    .line 1082
4024-    iget-object v12, v15, Lp/eag0;->b:Lp/st91;
4025-
4026-    .line 1083
4027-    .line 1084
4028-    new-instance v15, Ljava/util/ArrayList;
4029-
4030-    .line 1085
4031-    .line 1086
4032-    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V
4033-
4034-    .line 1087
4035-    .line 1088
4036-    .line 1089
4037-    if-eqz v12, :cond_14
4038-
4039-    .line 1090
4040-    .line 1091
4041-    iget-object v12, v12, Lp/st91;->a:Ljava/lang/Object;
4042-
4043-    .line 1092
4044-    .line 1093
4045:    invoke-virtual {v15, v12}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
4046-
4047-    .line 1094
4048-    .line 1095
4049-    .line 1096
4050-    :cond_14
4051:    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
4052-
4053-    .line 1097
4054-    .line 1098
4055-    .line 1099
4056-    new-instance v3, Lp/st91;
4057-
4058-    .line 1100
4059-    .line 1101
4060-    invoke-direct {v3, v15}, Lp/st91;-><init>(Ljava/util/List;)V
4061-
4062-    .line 1102
4063-    .line 1103
4064-    .line 1104
4065-    invoke-static {v1, v3}, Lp/qwb1;->g(Landroid/view/View;Lp/st91;)V
4066-
4067-    .line 1105
4068-    .line 1106
4069-    .line 1107
4070-    iput-object v1, v0, Lp/qwb1;->b2:Lcom/spotify/nowplaying/scroll/container/ScrollCardsContainer;
4071-
4072-    .line 1108
4073-    .line 1109
4074-    const v1, 0x7f0b0c67
4075-
4076-    .line 1110
4077-    .line 1111
4078-    .line 1112
4079:    invoke-virtual {v8, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
4080-
4081-    .line 1113
4082-    .line 1114
4083-    .line 1115
4084-    move-result-object v1
4085-
4086-    .line 1116
4087-    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;
4088-
4089-    .line 1117
4090-    .line 1118
4091-    invoke-static {v1}, Lp/wj50;->p(Ljava/lang/Object;)V
4092-
4093-    .line 1119
4094-    .line 1120
4095-    .line 1121
4096:    invoke-virtual/range {v55 .. v55}, Lp/hwb1;->d()Lp/st91;
4097-
4098-    .line 1122
4099-    .line 1123
4100-    .line 1124
4101-    move-result-object v3
4102-
4103-    .line 1125
4104-    invoke-static {v1, v3}, Lp/qwb1;->g(Landroid/view/View;Lp/st91;)V
4105-
4106-    .line 1126
4107-    .line 1127
4108-    .line 1128
4109-    iput-object v1, v0, Lp/qwb1;->P1:Landroidx/constraintlayout/widget/ConstraintLayout;
4110-
4111-    .line 1129
4112-    .line 1130
4113-    invoke-static {}, Lp/geg1;->o()Lp/ro80;
4114-
4115-    .line 1131
4116-    .line 1132
4117-    .line 1133
4118-    move-result-object v3
4119-
4120-    .line 1134
4121-    iget-object v12, v0, Lp/qwb1;->c:Lp/hm;
4122-
4123-    .line 1135
4124-    .line 1136
4125-    const/4 v2, 0x0
4126-
--
4147-    invoke-static {v12, v2}, Lp/qwb1;->d(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
4148-
4149-    .line 1147
4150-    .line 1148
4151-    .line 1149
4152-    move-result-object v2
4153-
4154-    .line 1150
4155-    iget-object v2, v2, Lp/hxt;->t:Landroid/view/View;
4156-
4157-    .line 1151
4158-    .line 1152
4159:    invoke-virtual {v3, v2}, Lp/ro80;->add(Ljava/lang/Object;)Z
4160-
4161-    .line 1153
4162-    .line 1154
4163-    .line 1155
4164-    iget-object v2, v0, Lp/qwb1;->b:Lp/li0;
4165-
4166-    .line 1156
4167-    .line 1157
4168-    const/4 v12, 0x0
4169-
4170-    .line 1158
4171-    invoke-static {v2, v12, v12, v15}, Lp/w9h1;->y(Lp/ry8;Landroid/view/ViewGroup$LayoutParams;Lcom/spotify/nowplaying/scroll/ScrollCardType;I)Lp/rxt;
4172-
4173-    .line 1159
4174-    .line 1160
4175-    .line 1161
4176-    move-result-object v2
4177-
4178-    .line 1162
4179-    iget-object v12, v0, Lp/qwb1;->P1:Landroidx/constraintlayout/widget/ConstraintLayout;
4180-
4181-    .line 1163
4182-    .line 1164
4183-    if-eqz v12, :cond_3e
4184-
4185-    .line 1165
4186-    .line 1166
4187-    invoke-static {v2, v12}, Lp/qwb1;->d(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
4188-
4189-    .line 1167
4190-    .line 1168
4191-    .line 1169
4192-    move-result-object v2
4193-
4194-    .line 1170
4195-    iget-object v2, v2, Lp/hxt;->t:Landroid/view/View;
4196-
4197-    .line 1171
4198-    .line 1172
4199:    invoke-virtual {v3, v2}, Lp/ro80;->add(Ljava/lang/Object;)Z
4200-
4201-    .line 1173
4202-    .line 1174
4203-    .line 1175
4204-    invoke-static {v3}, Lp/geg1;->m(Ljava/util/List;)Lp/ro80;
4205-
4206-    .line 1176
4207-    .line 1177
4208-    .line 1178
4209-    move-result-object v2
4210-
4211-    .line 1179
4212-    move-object/from16 v3, v30
4213-
4214-    .line 1180
4215-    .line 1181
4216-    iget-object v3, v3, Lp/eju;->d:Lp/t7q;
4217-
4218-    .line 1182
4219-    .line 1183
4220-    new-instance v12, Lp/s8p;
4221-
4222-    .line 1184
4223-    .line 1185
4224-    iget-object v3, v3, Lp/t7q;->b:Ljava/lang/Object;
4225-
4226-    .line 1186
4227-    .line 1187
4228-    check-cast v3, Landroid/content/Context;
4229-
4230-    .line 1188
4231-    .line 1189
4232-    invoke-direct {v12, v3}, Lp/s8p;-><init>(Landroid/content/Context;)V
4233-
4234-    .line 1190
4235-    .line 1191
4236-    .line 1192
4237-    iget-object v3, v0, Lp/qwb1;->d:Lp/cxb;
4238-
4239-    .line 1193
4240-    .line 1194
4241:    invoke-virtual {v3, v12}, Lp/cxb;->m(Lp/ovf;)Lp/e23;
4242-
4243-    .line 1195
4244-    .line 1196
4245-    .line 1197
4246-    move-result-object v3
4247-
4248-    .line 1198
4249-    iget-object v12, v0, Lp/qwb1;->P1:Landroidx/constraintlayout/widget/ConstraintLayout;
4250-
4251-    .line 1199
4252-    .line 1200
4253-    if-eqz v12, :cond_3d
4254-
4255-    .line 1201
4256-    .line 1202
4257-    invoke-static {v3, v12}, Lp/qwb1;->d(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
4258-
4259-    .line 1203
4260-    .line 1204
4261-    .line 1205
4262-    move-result-object v3
4263-
4264-    .line 1206
4265-    iget-object v3, v3, Lp/hxt;->t:Landroid/view/View;
4266-
4267-    .line 1207
4268-    .line 1208
4269-    invoke-static {}, Lp/geg1;->o()Lp/ro80;
4270-
4271-    .line 1209
--
4282-
4283-    .line 1215
4284-    .line 1216
4285-    check-cast v5, Landroid/content/Context;
4286-
4287-    .line 1217
4288-    .line 1218
4289-    invoke-direct {v15, v5}, Lp/v8p;-><init>(Landroid/content/Context;)V
4290-
4291-    .line 1219
4292-    .line 1220
4293-    .line 1221
4294:    invoke-virtual {v14, v13, v9, v15}, Lp/cxb;->n(Lio/reactivex/rxjava3/core/Flowable;Lp/gh00;Lp/ovf;)Lp/a3k;
4295-
4296-    .line 1222
4297-    .line 1223
4298-    .line 1224
4299-    move-result-object v5
4300-
4301-    .line 1225
4302-    iget-object v9, v0, Lp/qwb1;->P1:Landroidx/constraintlayout/widget/ConstraintLayout;
4303-
4304-    .line 1226
4305-    .line 1227
4306-    if-eqz v9, :cond_3c
4307-
4308-    .line 1228
4309-    .line 1229
4310-    invoke-static {v5, v9}, Lp/qwb1;->d(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
4311-
4312-    .line 1230
4313-    .line 1231
4314-    .line 1232
4315-    move-result-object v5
4316-
4317-    .line 1233
4318-    iget-object v5, v5, Lp/hxt;->t:Landroid/view/View;
4319-
4320-    .line 1234
4321-    .line 1235
4322:    invoke-virtual {v12, v5}, Lp/ro80;->add(Ljava/lang/Object;)Z
4323-
4324-    .line 1236
4325-    .line 1237
4326-    .line 1238
4327-    invoke-static {v12}, Lp/geg1;->m(Ljava/util/List;)Lp/ro80;
4328-
4329-    .line 1239
4330-    .line 1240
4331-    .line 1241
4332-    move-result-object v5
4333-
4334-    .line 1242
4335-    invoke-static {v1, v2, v3, v5}, Lp/jq60;->H(Landroidx/constraintlayout/widget/ConstraintLayout;Ljava/util/List;Landroid/view/View;Ljava/util/List;)V
4336-
4337-    .line 1243
4338-    .line 1244
4339-    .line 1245
4340-    new-instance v1, Lp/qcq;
4341-
4342-    .line 1246
4343-    .line 1247
4344-    iget-object v2, v4, Lp/dju;->b:Landroid/content/Context;
4345-
4346-    .line 1248
4347-    .line 1249
4348-    invoke-direct {v1, v2}, Lp/qcq;-><init>(Landroid/content/Context;)V
4349-
4350-    .line 1250
4351-    .line 1251
4352-    .line 1252
4353:    invoke-virtual/range {v27 .. v27}, Lp/wg61;->getValue()Ljava/lang/Object;
4354-
4355-    .line 1253
4356-    .line 1254
4357-    .line 1255
4358-    move-result-object v2
4359-
4360-    .line 1256
4361-    check-cast v2, Lp/sdk0;
4362-
4363-    .line 1257
4364-    .line 1258
4365-    iget-object v2, v2, Lp/sdk0;->g:Lp/g6m0;
4366-
4367-    .line 1259
4368-    .line 1260
4369-    new-instance v64, Lp/tf41;
4370-
4371-    .line 1261
4372-    .line 1262
4373-    const/16 v71, 0x0
4374-
4375-    .line 1263
4376-    .line 1264
4377-    const/16 v72, 0x19
4378-
4379-    .line 1265
4380-    .line 1266
4381-    const/16 v65, 0x1
4382-
4383-    .line 1267
--
4406-
4407-    .line 1279
4408-    .line 1280
4409-    invoke-direct/range {v64 .. v72}, Lp/tf41;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V
4410-
4411-    .line 1281
4412-    .line 1282
4413-    .line 1283
4414-    move-object/from16 v3, v64
4415-
4416-    .line 1284
4417-    .line 1285
4418:    invoke-virtual {v7, v6, v2, v3}, Lp/oge0;->i(Ljava/util/List;Lp/t9p0;Lp/gh00;)Lp/hbk0;
4419-
4420-    .line 1286
4421-    .line 1287
4422-    .line 1288
4423-    move-result-object v2
4424-
4425-    .line 1289
4426:    invoke-virtual {v1, v2}, Lp/qcq;->A(Lp/wt81;)V
4427-
4428-    .line 1290
4429-    .line 1291
4430-    .line 1292
4431-    const v3, 0x7f0b1116
4432-
4433-    .line 1293
4434-    .line 1294
4435-    .line 1295
4436:    invoke-virtual {v8, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
4437-
4438-    .line 1296
4439-    .line 1297
4440-    .line 1298
4441-    move-result-object v2
4442-
4443-    .line 1299
4444:    invoke-virtual/range {v22 .. v22}, Lp/wb4;->b()Z
4445-
4446-    .line 1300
4447-    .line 1301
4448-    .line 1302
4449-    move-result v3
4450-
4451-    .line 1303
4452-    if-eqz v3, :cond_15
4453-
4454-    .line 1304
4455-    .line 1305
4456-    invoke-static {v10, v1}, Lp/hc81;->a(Lp/hc81;Lp/qcq;)Lp/wk0;
4457-
4458-    .line 1306
4459-    .line 1307
4460-    .line 1308
4461-    move-result-object v3
4462-
4463-    .line 1309
4464-    invoke-static {v3, v8}, Lp/qwb1;->d(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
4465-
4466-    .line 1310
4467-    .line 1311
4468-    .line 1312
4469-    move-result-object v3
4470-
4471-    .line 1313
4472-    iget-object v3, v3, Lp/hxt;->t:Landroid/view/View;
4473-
4474-    .line 1314
--
4504-    .line 1329
4505-    :goto_4
4506-    invoke-static {v2, v3}, Lp/psg1;->H(Landroid/view/View;Landroid/view/View;)V
4507-
4508-    .line 1330
4509-    .line 1331
4510-    .line 1332
4511-    const v2, 0x7f0b109f
4512-
4513-    .line 1333
4514-    .line 1334
4515-    .line 1335
4516:    invoke-virtual {v8, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
4517-
4518-    .line 1336
4519-    .line 1337
4520-    .line 1338
4521-    move-result-object v2
4522-
4523-    .line 1339
4524-    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;
4525-
4526-    .line 1340
4527-    .line 1341
4528-    invoke-static {v2}, Lp/wj50;->p(Ljava/lang/Object;)V
4529-
4530-    .line 1342
4531-    .line 1343
4532-    .line 1344
4533:    invoke-virtual/range {v55 .. v55}, Lp/hwb1;->c()Lp/eag0;
4534-
4535-    .line 1345
4536-    .line 1346
4537-    .line 1347
4538-    move-result-object v3
4539-
4540-    .line 1348
4541-    iget-object v4, v3, Lp/eag0;->c:Lp/zt91;
4542-
4543-    .line 1349
4544-    .line 1350
4545:    invoke-virtual {v4}, Lp/zt91;->c()Lp/yt91;
4546-
4547-    .line 1351
4548-    .line 1352
4549-    .line 1353
4550-    move-result-object v4
4551-
4552-    .line 1354
4553-    new-instance v56, Lp/bu91;
4554-
4555-    .line 1355
4556-    .line 1356
4557-    const-string v57, "track_information"
4558-
4559-    .line 1357
4560-    .line 1358
4561-    const/16 v58, 0x0
4562-
4563-    .line 1359
4564-    .line 1360
4565-    const/16 v59, 0x0
4566-
4567-    .line 1361
4568-    .line 1362
4569-    const/16 v60, 0x0
4570-
4571-    .line 1363
4572-    .line 1364
4573-    const/16 v61, 0x0
4574-
4575-    .line 1365
--
4578-
4579-    .line 1367
4580-    .line 1368
4581-    .line 1369
4582-    move-object/from16 v5, v56
4583-
4584-    .line 1370
4585-    .line 1371
4586-    iget-object v6, v4, Lp/yt91;->i:Ljava/util/ArrayList;
4587-
4588-    .line 1372
4589-    .line 1373
4590:    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
4591-
4592-    .line 1374
4593-    .line 1375
4594-    .line 1376
4595-    const/4 v6, 0x0
4596-
4597-    .line 1377
4598-    iput-boolean v6, v4, Lp/yt91;->j:Z
4599-
4600-    .line 1378
4601-    .line 1379
4602:    invoke-virtual {v4}, Lp/yt91;->a()Lp/zt91;
4603-
4604-    .line 1380
4605-    .line 1381
4606-    .line 1382
4607-    move-result-object v4
4608-
4609-    .line 1383
4610-    iget-object v3, v3, Lp/eag0;->b:Lp/st91;
4611-
4612-    .line 1384
4613-    .line 1385
4614-    new-instance v5, Ljava/util/ArrayList;
4615-
4616-    .line 1386
4617-    .line 1387
4618-    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V
4619-
4620-    .line 1388
4621-    .line 1389
4622-    .line 1390
4623-    if-eqz v3, :cond_16
4624-
4625-    .line 1391
4626-    .line 1392
4627-    iget-object v3, v3, Lp/st91;->a:Ljava/lang/Object;
4628-
4629-    .line 1393
4630-    .line 1394
4631:    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
4632-
4633-    .line 1395
4634-    .line 1396
4635-    .line 1397
4636-    :cond_16
4637:    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
4638-
4639-    .line 1398
4640-    .line 1399
4641-    .line 1400
4642-    new-instance v3, Lp/st91;
4643-
4644-    .line 1401
4645-    .line 1402
4646-    invoke-direct {v3, v5}, Lp/st91;-><init>(Ljava/util/List;)V
4647-
4648-    .line 1403
4649-    .line 1404
4650-    .line 1405
4651-    invoke-static {v2, v3}, Lp/qwb1;->g(Landroid/view/View;Lp/st91;)V
4652-
4653-    .line 1406
4654-    .line 1407
4655-    .line 1408
4656-    const v3, 0x7f0b0615
4657-
4658-    .line 1409
4659-    .line 1410
4660-    .line 1411
4661:    invoke-virtual {v8, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
4662-
4663-    .line 1412
4664-    .line 1413
4665-    .line 1414
4666-    move-result-object v3
4667-
4668-    .line 1415
4669-    check-cast v3, Landroid/widget/LinearLayout;
4670-
4671-    .line 1416
4672-    .line 1417
4673-    iget-object v4, v0, Lp/qwb1;->t:Lp/gj4;
4674-
4675-    .line 1418
4676-    .line 1419
4677:    invoke-virtual {v4}, Lp/gj4;->a()Z
4678-
4679-    .line 1420
4680-    .line 1421
4681-    .line 1422
4682-    move-result v5
4683-
4684-    .line 1423
4685-    const/4 v6, 0x6
4686-
4687-    .line 1424
4688-    if-eqz v5, :cond_17
4689-
4690-    .line 1425
4691-    .line 1426
4692-    const/16 v67, 0x0
4693-
4694-    .line 1427
4695-    .line 1428
4696-    :goto_5
4697-    move-object/from16 v5, v35
4698-
4699-    .line 1429
4700-    .line 1430
4701-    goto :goto_6
4702-
4703-    .line 1431
4704-    :cond_17
4705-    new-instance v5, Lp/kk21;
4706-
4707-    .line 1432
--
4776-    iput-object v5, v0, Lp/qwb1;->V1:Lp/hxt;
4777-
4778-    .line 1466
4779-    .line 1467
4780-    iget-object v5, v0, Lp/qwb1;->i2:Lio/reactivex/rxjava3/processors/ReplayProcessor;
4781-
4782-    .line 1468
4783-    .line 1469
4784-    iget-object v7, v0, Lp/qwb1;->M0:Lp/gzk;
4785-
4786-    .line 1470
4787-    .line 1471
4788:    invoke-virtual {v5, v7}, Lio/reactivex/rxjava3/core/Flowable;->j(Lio/reactivex/rxjava3/core/FlowableTransformer;)Lio/reactivex/rxjava3/core/Flowable;
4789-
4790-    .line 1472
4791-    .line 1473
4792-    .line 1474
4793-    move-result-object v5
4794-
4795-    .line 1475
4796-    sget-object v7, Lp/loq0;->Y0:Lp/loq0;
4797-
4798-    .line 1476
4799-    .line 1477
4800:    invoke-virtual {v5, v7}, Lio/reactivex/rxjava3/core/Flowable;->J(Lio/reactivex/rxjava3/functions/Function;)Lio/reactivex/rxjava3/internal/operators/flowable/FlowableMap;
4801-
4802-    .line 1478
4803-    .line 1479
4804-    .line 1480
4805-    move-result-object v5
4806-
4807-    .line 1481
4808-    iget-object v7, v0, Lp/qwb1;->L0:Lp/c06;
4809-
4810-    .line 1482
4811-    .line 1483
4812:    invoke-virtual {v7, v5}, Lp/c06;->p(Lio/reactivex/rxjava3/core/Flowable;)Lp/a96;
4813-
4814-    .line 1484
4815-    .line 1485
4816-    .line 1486
4817-    move-result-object v5
4818-
4819-    .line 1487
4820-    invoke-static {v5, v2}, Lp/qwb1;->f(Lp/qy8;Landroid/view/ViewGroup;)Lp/hxt;
4821-
4822-    .line 1488
4823-    .line 1489
4824-    .line 1490
4825-    move-result-object v5
4826-
4827-    .line 1491
4828-    iput-object v5, v0, Lp/qwb1;->X1:Lp/hxt;
4829-
4830-    .line 1492
4831-    .line 1493
4832-    iget-object v5, v5, Lp/hxt;->t:Landroid/view/View;
4833-
4834-    .line 1494
4835-    .line 1495
4836-    iget-object v7, v0, Lp/qwb1;->U1:Landroid/view/View;
4837-
4838-    .line 1496
4839-    .line 1497
4840-    if-eqz v7, :cond_3b
4841-
4842-    .line 1498
--
4920-
4921-    .line 1539
4922-    .line 1540
4923-    invoke-direct {v3, v0, v5}, Lp/iwb1;-><init>(Lp/qwb1;I)V
4924-
4925-    .line 1541
4926-    .line 1542
4927-    .line 1543
4928-    move-object/from16 v7, v54
4929-
4930-    .line 1544
4931-    .line 1545
4932:    invoke-virtual {v7, v2, v3}, Lp/sef0;->n(Lp/eh00;Lp/eh00;)Lp/cut;
4933-
4934-    .line 1546
4935-    .line 1547
4936-    .line 1548
4937-    move-result-object v2
4938-
4939-    .line 1549
4940-    invoke-static {v2, v8}, Lp/qwb1;->d(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
4941-
4942-    .line 1550
4943-    .line 1551
4944-    .line 1552
4945-    move-result-object v2
4946-
4947-    .line 1553
4948-    iget-object v2, v2, Lp/hxt;->t:Landroid/view/View;
4949-
4950-    .line 1554
4951-    .line 1555
4952-    const v3, 0x7f0b0e53
4953-
4954-    .line 1556
4955-    .line 1557
4956-    .line 1558
4957:    invoke-virtual {v8, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
4958-
4959-    .line 1559
4960-    .line 1560
4961-    .line 1561
4962-    move-result-object v3
4963-
4964-    .line 1562
4965-    invoke-static {v3, v2}, Lp/psg1;->H(Landroid/view/View;Landroid/view/View;)V
4966-
4967-    .line 1563
4968-    .line 1564
4969-    .line 1565
4970-    const v2, 0x7f0b073d
4971-
4972-    .line 1566
4973-    .line 1567
4974-    .line 1568
4975:    invoke-virtual {v8, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
4976-
4977-    .line 1569
4978-    .line 1570
4979-    .line 1571
4980-    move-result-object v2
4981-
4982-    .line 1572
4983-    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;
4984-
4985-    .line 1573
4986-    .line 1574
4987-    invoke-static {v2}, Lp/wj50;->p(Ljava/lang/Object;)V
4988-
4989-    .line 1575
4990-    .line 1576
4991-    .line 1577
4992-    invoke-static {}, Lp/geg1;->o()Lp/ro80;
4993-
4994-    .line 1578
4995-    .line 1579
4996-    .line 1580
4997-    move-result-object v3
4998-
4999-    .line 1581
5000-    sget-object v10, Lp/hxt;->w:Lp/up60;
5001-
5002-    .line 1582
5003-    .line 1583
5004:    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;
5005-
5006-    .line 1584
5007-    .line 1585
5008-    .line 1586
5009-    move-result-object v10
5010-
5011-    .line 1587
5012-    iget-object v12, v0, Lp/qwb1;->g:Lp/zs0;
5013-
5014-    .line 1588
5015-    .line 1589
5016:    invoke-virtual {v12}, Lp/zs0;->m()Lp/g87;
5017-
5018-    .line 1590
5019-    .line 1591
5020-    .line 1592
5021-    move-result-object v12
5022-
5023-    .line 1593
5024-    const/4 v13, 0x0
5025-
5026-    .line 1594
5027-    invoke-static {v10, v2, v12, v13, v5}, Lp/ia7;->n(Landroid/content/Context;Landroid/view/ViewGroup;Lp/qy8;Lp/gw41;I)Lp/hxt;
5028-
5029-    .line 1595
5030-    .line 1596
5031-    .line 1597
5032-    move-result-object v5
5033-
5034-    .line 1598
5035-    iput-object v5, v0, Lp/qwb1;->Y1:Lp/hxt;
5036-
5037-    .line 1599
5038-    .line 1600
5039-    iget-object v5, v5, Lp/hxt;->t:Landroid/view/View;
5040-
5041-    .line 1601
5042-    .line 1602
5043:    invoke-virtual {v3, v5}, Lp/ro80;->add(Ljava/lang/Object;)Z
5044-
5045-    .line 1603
5046-    .line 1604
5047-    .line 1605
5048-    new-instance v47, Lp/ntv;
5049-
5050-    .line 1606
5051-    .line 1607
5052-    iget-object v5, v0, Lp/qwb1;->h:Lp/d2n;
5053-
5054-    .line 1608
5055-    .line 1609
5056-    iget-object v10, v5, Lp/d2n;->e:Ljava/lang/Object;
5057-
5058-    .line 1610
5059-    .line 1611
5060-    move-object/from16 v48, v10
5061-
5062-    .line 1612
5063-    .line 1613
5064-    check-cast v48, Lio/reactivex/rxjava3/core/Flowable;
5065-
5066-    .line 1614
5067-    .line 1615
5068-    iget-object v10, v5, Lp/d2n;->b:Ljava/lang/Object;
5069-
5070-    .line 1616
5071-    .line 1617
5072-    move-object/from16 v49, v10
5073-
--
5156-    invoke-static {v5, v2, v14}, Lp/qwb1;->e(Lp/cut;Landroid/view/ViewGroup;Ljava/lang/Object;)Lp/hxt;
5157-
5158-    .line 1660
5159-    .line 1661
5160-    .line 1662
5161-    move-result-object v5
5162-
5163-    .line 1663
5164-    iget-object v5, v5, Lp/hxt;->t:Landroid/view/View;
5165-
5166-    .line 1664
5167-    .line 1665
5168:    invoke-virtual {v3, v5}, Lp/ro80;->add(Ljava/lang/Object;)Z
5169-
5170-    .line 1666
5171-    .line 1667
5172-    .line 1668
5173-    iget-object v5, v0, Lp/qwb1;->i:Lp/o7a;
5174-
5175-    .line 1669
5176-    .line 1670
5177-    invoke-static {v5, v13, v13, v12}, Lp/opo;->G(Lp/dfo;Landroid/view/ViewGroup$LayoutParams;Lcom/spotify/nowplaying/scroll/ScrollCardType;I)Lp/kks;
5178-
5179-    .line 1671
5180-    .line 1672
5181-    .line 1673
5182-    move-result-object v5
5183-
5184-    .line 1674
5185-    invoke-static {v5, v2}, Lp/qwb1;->f(Lp/qy8;Landroid/view/ViewGroup;)Lp/hxt;
5186-
5187-    .line 1675
5188-    .line 1676
5189-    .line 1677
5190-    move-result-object v5
5191-
5192-    .line 1678
5193-    iput-object v5, v0, Lp/qwb1;->Z1:Lp/hxt;
5194-
5195-    .line 1679
5196-    .line 1680
5197-    iget-object v5, v5, Lp/hxt;->t:Landroid/view/View;
5198-
5199-    .line 1681
5200-    .line 1682
5201:    invoke-virtual {v3, v5}, Lp/ro80;->add(Ljava/lang/Object;)Z
5202-
5203-    .line 1683
5204-    .line 1684
5205-    .line 1685
5206-    invoke-static {v11, v13, v13, v12}, Lp/w9h1;->y(Lp/ry8;Landroid/view/ViewGroup$LayoutParams;Lcom/spotify/nowplaying/scroll/ScrollCardType;I)Lp/rxt;
5207-
5208-    .line 1686
5209-    .line 1687
5210-    .line 1688
5211-    move-result-object v24
5212-
5213-    .line 1689
5214:    invoke-virtual {v4}, Lp/gj4;->a()Z
5215-
5216-    .line 1690
5217-    .line 1691
5218-    .line 1692
5219-    move-result v4
5220-
5221-    .line 1693
5222-    if-eqz v4, :cond_18
5223-
5224-    .line 1694
5225-    .line 1695
5226-    move-object/from16 v4, v24
5227-
5228-    .line 1696
5229-    .line 1697
5230-    goto :goto_7
5231-
5232-    .line 1698
5233-    :cond_18
5234-    move-object v4, v13
5235-
5236-    .line 1699
5237-    :goto_7
5238-    if-eqz v4, :cond_19
5239-
5240-    .line 1700
5241-    .line 1701
5242-    new-instance v5, Lp/kk21;
5243-
5244-    .line 1702
--
5255-    .line 1709
5256-    move-result-object v4
5257-
5258-    .line 1710
5259-    iget-object v4, v4, Lp/hxt;->t:Landroid/view/View;
5260-
5261-    .line 1711
5262-    .line 1712
5263-    if-eqz v4, :cond_19
5264-
5265-    .line 1713
5266-    .line 1714
5267:    invoke-virtual {v3, v4}, Lp/ro80;->add(Ljava/lang/Object;)Z
5268-
5269-    .line 1715
5270-    .line 1716
5271-    .line 1717
5272-    :cond_19
5273-    invoke-static {v3}, Lp/geg1;->m(Ljava/util/List;)Lp/ro80;
5274-
5275-    .line 1718
5276-    .line 1719
5277-    .line 1720
5278-    move-result-object v3
5279-
5280-    .line 1721
5281-    invoke-static {v2, v3}, Lp/jq60;->I(Landroidx/constraintlayout/widget/ConstraintLayout;Ljava/util/AbstractList;)V
5282-
5283-    .line 1722
5284-    .line 1723
5285-    .line 1724
5286-    iget-object v2, v0, Lp/qwb1;->a2:Landroidx/constraintlayout/widget/ConstraintLayout;
5287-
5288-    .line 1725
5289-    .line 1726
5290-    if-eqz v2, :cond_3a
5291-
5292-    .line 1727
5293-    .line 1728
5294-    new-instance v3, Lp/iwb1;
5295-
5296-    .line 1729
5297-    .line 1730
--
5308-
5309-    .line 1736
5310-    .line 1737
5311-    const/16 v5, 0x10
5312-
5313-    .line 1738
5314-    .line 1739
5315-    invoke-direct {v4, v0, v5}, Lp/iwb1;-><init>(Lp/qwb1;I)V
5316-
5317-    .line 1740
5318-    .line 1741
5319-    .line 1742
5320:    invoke-virtual {v7, v3, v4}, Lp/sef0;->n(Lp/eh00;Lp/eh00;)Lp/cut;
5321-
5322-    .line 1743
5323-    .line 1744
5324-    .line 1745
5325-    move-result-object v3
5326-
5327-    .line 1746
5328-    iget-object v4, v0, Lp/qwb1;->a2:Landroidx/constraintlayout/widget/ConstraintLayout;
5329-
5330-    .line 1747
5331-    .line 1748
5332-    if-eqz v4, :cond_39
5333-
5334-    .line 1749
5335-    .line 1750
5336-    invoke-static {v3, v4}, Lp/qwb1;->d(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
5337-
5338-    .line 1751
5339-    .line 1752
5340-    .line 1753
5341-    move-result-object v3
5342-
5343-    .line 1754
5344-    iget-object v3, v3, Lp/hxt;->t:Landroid/view/View;
5345-
5346-    .line 1755
5347-    .line 1756
5348-    new-instance v4, Lp/iwb1;
5349-
5350-    .line 1757
--
5362-
5363-    .line 1764
5364-    .line 1765
5365-    const/16 v11, 0x12
5366-
5367-    .line 1766
5368-    .line 1767
5369-    invoke-direct {v5, v0, v11}, Lp/iwb1;-><init>(Lp/qwb1;I)V
5370-
5371-    .line 1768
5372-    .line 1769
5373-    .line 1770
5374:    invoke-virtual {v7, v4, v5}, Lp/sef0;->n(Lp/eh00;Lp/eh00;)Lp/cut;
5375-
5376-    .line 1771
5377-    .line 1772
5378-    .line 1773
5379-    move-result-object v4
5380-
5381-    .line 1774
5382-    iget-object v5, v0, Lp/qwb1;->a2:Landroidx/constraintlayout/widget/ConstraintLayout;
5383-
5384-    .line 1775
5385-    .line 1776
5386-    if-eqz v5, :cond_38
5387-
5388-    .line 1777
5389-    .line 1778
5390-    invoke-static {v4, v5}, Lp/qwb1;->d(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
5391-
5392-    .line 1779
5393-    .line 1780
5394-    .line 1781
5395-    move-result-object v4
5396-
5397-    .line 1782
5398-    iget-object v4, v4, Lp/hxt;->t:Landroid/view/View;
5399-
5400-    .line 1783
5401-    .line 1784
5402:    invoke-virtual/range {v25 .. v25}, Lp/s2o;->p()Lp/a3k;
5403-
5404-    .line 1785
5405-    .line 1786
5406-    .line 1787
5407-    move-result-object v5
5408-
5409-    .line 1788
5410-    iget-object v11, v0, Lp/qwb1;->a2:Landroidx/constraintlayout/widget/ConstraintLayout;
5411-
5412-    .line 1789
5413-    .line 1790
5414-    if-eqz v11, :cond_37
5415-
5416-    .line 1791
5417-    .line 1792
5418-    new-instance v12, Lp/hpo0;
5419-
5420-    .line 1793
5421-    .line 1794
5422-    const/4 v13, 0x0
5423-
5424-    .line 1795
5425-    invoke-direct {v12, v13, v10}, Lp/hpo0;-><init>(Lp/gpo0;I)V
5426-
5427-    .line 1796
5428-    .line 1797
5429-    .line 1798
5430-    invoke-static {v5, v11, v12}, Lp/qwb1;->e(Lp/cut;Landroid/view/ViewGroup;Ljava/lang/Object;)Lp/hxt;
5431-
5432-    .line 1799
--
5456-
5457-    .line 1812
5458-    .line 1813
5459-    const/16 v13, 0x14
5460-
5461-    .line 1814
5462-    .line 1815
5463-    invoke-direct {v12, v0, v13}, Lp/iwb1;-><init>(Lp/qwb1;I)V
5464-
5465-    .line 1816
5466-    .line 1817
5467-    .line 1818
5468:    invoke-virtual {v7, v11, v12}, Lp/sef0;->n(Lp/eh00;Lp/eh00;)Lp/cut;
5469-
5470-    .line 1819
5471-    .line 1820
5472-    .line 1821
5473-    move-result-object v11
5474-
5475-    .line 1822
5476-    iget-object v12, v0, Lp/qwb1;->a2:Landroidx/constraintlayout/widget/ConstraintLayout;
5477-
5478-    .line 1823
5479-    .line 1824
5480-    if-eqz v12, :cond_36
5481-
5482-    .line 1825
5483-    .line 1826
5484-    invoke-static {v11, v12}, Lp/qwb1;->d(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
5485-
5486-    .line 1827
5487-    .line 1828
5488-    .line 1829
5489-    move-result-object v11
5490-
5491-    .line 1830
5492-    iget-object v11, v11, Lp/hxt;->t:Landroid/view/View;
5493-
5494-    .line 1831
5495-    .line 1832
5496-    new-instance v12, Lp/iwb1;
5497-
5498-    .line 1833
--
5510-
5511-    .line 1840
5512-    .line 1841
5513-    const/16 v14, 0x16
5514-
5515-    .line 1842
5516-    .line 1843
5517-    invoke-direct {v13, v0, v14}, Lp/iwb1;-><init>(Lp/qwb1;I)V
5518-
5519-    .line 1844
5520-    .line 1845
5521-    .line 1846
5522:    invoke-virtual {v7, v12, v13}, Lp/sef0;->n(Lp/eh00;Lp/eh00;)Lp/cut;
5523-
5524-    .line 1847
5525-    .line 1848
5526-    .line 1849
5527-    move-result-object v12
5528-
5529-    .line 1850
5530-    iget-object v13, v0, Lp/qwb1;->a2:Landroidx/constraintlayout/widget/ConstraintLayout;
5531-
5532-    .line 1851
5533-    .line 1852
5534-    if-eqz v13, :cond_35
5535-
5536-    .line 1853
5537-    .line 1854
5538-    invoke-static {v12, v13}, Lp/qwb1;->d(Lp/cut;Landroid/view/ViewGroup;)Lp/hxt;
5539-
5540-    .line 1855
5541-    .line 1856
5542-    .line 1857
5543-    move-result-object v12
5544-
5545-    .line 1858
5546-    iget-object v12, v12, Lp/hxt;->t:Landroid/view/View;
5547-
5548-    .line 1859
5549-    .line 1860
5550-    move-object/from16 v47, v2
5551-
5552-    .line 1861
--
5572-    .line 1871
5573-    .line 1872
5574-    invoke-static/range {v47 .. v52}, Lp/jq60;->J(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V
5575-
5576-    .line 1873
5577-    .line 1874
5578-    .line 1875
5579-    const v2, 0x7f0b035f
5580-
5581-    .line 1876
5582-    .line 1877
5583-    .line 1878
5584:    invoke-virtual {v8, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
5585-
5586-    .line 1879
5587-    .line 1880
5588-    .line 1881
5589-    move-result-object v2
5590-
5591-    .line 1882
5592-    check-cast v2, Landroid/view/ViewStub;
5593-
5594-    .line 1883
5595-    .line 1884
5596:    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
5597-
5598-    .line 1885
5599-    .line 1886
5600-    .line 1887
5601-    move-result-object v3
5602-
5603-    .line 1888
5604-    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;
5605-
5606-    .line 1889
5607-    .line 1890
5608-    const/4 v4, 0x0
5609-
5610-    .line 1891
5611-    iput v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I
5612-
5613-    .line 1892
5614-    .line 1893
5615-    iput v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I
5616-
5617-    .line 1894
5618-    .line 1895
5619-    iget-object v3, v0, Lp/qwb1;->P0:Lp/l6p;
5620-
5621-    .line 1896
5622-    .line 1897
5623-    const/4 v12, 0x3
5624-
5625-    .line 1898
5626-    const/4 v13, 0x0
5627-
5628-    .line 1899
5629-    invoke-static {v3, v13, v13, v12}, Lp/w9h1;->y(Lp/ry8;Landroid/view/ViewGroup$LayoutParams;Lcom/spotify/nowplaying/scroll/ScrollCardType;I)Lp/rxt;
5630-
5631-    .line 1900
5632-    .line 1901
5633-    .line 1902
5634-    move-result-object v3
5635-
5636-    .line 1903
5637:    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
5638-
5639-    .line 1904
5640-    .line 1905
5641-    .line 1906
5642-    move-result-object v4
5643-
5644-    .line 1907
5645-    check-cast v4, Landroid/view/ViewGroup;
5646-
5647-    .line 1908
5648-    .line 1909
5649-    new-instance v5, Lp/wri;
5650-
5651-    .line 1910
5652-    .line 1911
5653-    const/16 v11, 0x7f9
5654-
5655-    .line 1912
5656-    .line 1913
5657-    const/4 v12, 0x0
5658-
5659-    .line 1914
5660-    const/4 v13, 0x0
5661-
5662-    .line 1915
5663-    invoke-direct {v5, v12, v12, v11, v13}, Lp/wri;-><init>(FFIZ)V
5664-
5665-    .line 1916
5666-    .line 1917
5667-    .line 1918
--
5678-    .line 1923
5679-    .line 1924
5680-    invoke-static {v2, v3}, Lp/psg1;->H(Landroid/view/View;Landroid/view/View;)V
5681-
5682-    .line 1925
5683-    .line 1926
5684-    .line 1927
5685-    const v2, 0x7f0b066a
5686-
5687-    .line 1928
5688-    .line 1929
5689-    .line 1930
5690:    invoke-virtual {v8, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
5691-
5692-    .line 1931
5693-    .line 1932
5694-    .line 1933
5695-    move-result-object v2
5696-
5697-    .line 1934
5698:    invoke-virtual/range {v55 .. v55}, Lp/hwb1;->c()Lp/eag0;
5699-
5700-    .line 1935
5701-    .line 1936
5702-    .line 1937
5703-    move-result-object v3
5704-
5705-    .line 1938
5706-    iget-object v4, v3, Lp/eag0;->c:Lp/zt91;
5707-
5708-    .line 1939
5709-    .line 1940
5710:    invoke-virtual {v4}, Lp/zt91;->c()Lp/yt91;
5711-
5712-    .line 1941
5713-    .line 1942
5714-    .line 1943
5715-    move-result-object v4
5716-
5717-    .line 1944
5718-    new-instance v47, Lp/bu91;
5719-
5720-    .line 1945
5721-    .line 1946
5722-    const-string v48, "bottom_bar"
5723-
5724-    .line 1947
5725-    .line 1948
5726-    const/16 v49, 0x0
5727-
5728-    .line 1949
5729-    .line 1950
5730-    const/16 v50, 0x0
5731-
5732-    .line 1951
5733-    .line 1952
5734-    const/16 v51, 0x0
5735-
5736-    .line 1953
5737-    .line 1954
5738-    const/16 v52, 0x0
5739-
5740-    .line 1955
--
5743-
5744-    .line 1957
5745-    .line 1958
5746-    .line 1959
5747-    move-object/from16 v5, v47
5748-
5749-    .line 1960
5750-    .line 1961
5751-    iget-object v11, v4, Lp/yt91;->i:Ljava/util/ArrayList;
5752-
5753-    .line 1962
5754-    .line 1963
5755:    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
5756-
5757-    .line 1964
5758-    .line 1965
5759-    .line 1966
5760-    const/4 v5, 0x0
5761-
5762-    .line 1967
5763-    iput-boolean v5, v4, Lp/yt91;->j:Z
5764-
5765-    .line 1968
5766-    .line 1969
5767:    invoke-virtual {v4}, Lp/yt91;->a()Lp/zt91;
5768-
5769-    .line 1970
5770-    .line 1971
5771-    .line 1972
5772-    move-result-object v4
5773-
5774-    .line 1973
5775-    iget-object v3, v3, Lp/eag0;->b:Lp/st91;
5776-
5777-    .line 1974
5778-    .line 1975
5779-    new-instance v5, Ljava/util/ArrayList;
5780-
5781-    .line 1976
5782-    .line 1977
5783-    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V
5784-
5785-    .line 1978
5786-    .line 1979
5787-    .line 1980
5788-    if-eqz v3, :cond_1a
5789-
5790-    .line 1981
5791-    .line 1982
5792-    iget-object v3, v3, Lp/st91;->a:Ljava/lang/Object;
5793-
5794-    .line 1983
5795-    .line 1984
5796:    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
5797-
5798-    .line 1985
5799-    .line 1986
5800-    .line 1987
5801-    :cond_1a
5802:    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
5803-
5804-    .line 1988
5805-    .line 1989
5806-    .line 1990
5807-    new-instance v3, Lp/st91;
5808-
5809-    .line 1991
5810-    .line 1992
5811-    invoke-direct {v3, v5}, Lp/st91;-><init>(Ljava/util/List;)V
5812-
5813-    .line 1993
5814-    .line 1994
5815-    .line 1995
5816-    invoke-static {v2, v3}, Lp/qwb1;->g(Landroid/view/View;Lp/st91;)V
5817-
5818-    .line 1996
5819-    .line 1997
5820-    .line 1998
5821-    iget-object v2, v0, Lp/qwb1;->F1:Lp/xul0;
5822-
5823-    .line 1999
5824-    .line 2000
5825:    invoke-virtual {v2}, Lp/xul0;->h()Ljava/lang/Object;
5826-
5827-    .line 2001
5828-    .line 2002
5829-    .line 2003
5830-    move-result-object v2
5831-
5832-    .line 2004
5833-    check-cast v2, Lp/ja11;
5834-
5835-    .line 2005
5836-    .line 2006
5837-    if-eqz v2, :cond_1b
5838-
5839-    .line 2007
5840-    .line 2008
5841-    const v3, 0x7f0b0268
5842-
5843-    .line 2009
5844-    .line 2010
5845-    .line 2011
5846:    invoke-virtual {v8, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
5847-
5848-    .line 2012
5849-    .line 2013
5850-    .line 2014
5851-    move-result-object v3
5852-
5853-    .line 2015
5854-    check-cast v3, Landroid/view/ViewStub;
5855-
5856-    .line 2016
5857-    .line 2017
5858:    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
5859-
5860-    .line 2018
5861-    .line 2019
5862-    .line 2020
5863-    move-result-object v4
5864-
5865-    .line 2021
5866-    check-cast v4, Landroid/view/ViewGroup;
5867-
5868-    .line 2022
5869-    .line 2023
5870-    new-instance v5, Lp/v911;
5871-
5872-    .line 2024
5873-    .line 2025
5874-    sget-object v11, Lp/i911;->a:Lp/i911;
5875-
5876-    .line 2026
5877-    .line 2027
5878-    invoke-direct {v5, v11}, Lp/v911;-><init>(Lp/j911;)V
5879-
5880-    .line 2028
5881-    .line 2029
5882-    .line 2030
5883-    const/4 v12, 0x3
5884-
5885-    .line 2031
5886-    const/4 v13, 0x0
5887-
5888-    .line 2032
--
5908-    .line 2042
5909-    invoke-static {v3, v2}, Lp/psg1;->H(Landroid/view/View;Landroid/view/View;)V
5910-
5911-    .line 2043
5912-    .line 2044
5913-    .line 2045
5914-    :cond_1b
5915-    const v2, 0x7f0b0041
5916-
5917-    .line 2046
5918-    .line 2047
5919-    .line 2048
5920:    invoke-virtual {v8, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
5921-
5922-    .line 2049
5923-    .line 2050
5924-    .line 2051
5925-    move-result-object v2
5926-
5927-    .line 2052
5928-    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;
5929-

