package p204p;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class tad0 {

    /* JADX INFO: renamed from: m */
    public static final j561 f218543m = kgg1.m56358u(new j77(6));

    /* JADX INFO: renamed from: a */
    public final String f218544a;

    /* JADX INFO: renamed from: b */
    public final String f218545b;

    /* JADX INFO: renamed from: c */
    public final String f218546c;

    /* JADX INFO: renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f218547d;

    /* JADX INFO: renamed from: e */
    public final boolean f218548e;

    /* JADX INFO: renamed from: f */
    public final boolean f218549f;

    /* JADX INFO: renamed from: g */
    public final boolean f218550g;

    /* JADX INFO: renamed from: h */
    public final boolean f218551h;

    /* JADX INFO: renamed from: i */
    public final boolean f218552i;

    /* JADX INFO: renamed from: j */
    public int f218553j;

    /* JADX INFO: renamed from: k */
    public int f218554k;

    /* JADX INFO: renamed from: l */
    public float f218555l;

    public tad0(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.f218544a = str;
        this.f218545b = str2;
        this.f218546c = str3;
        this.f218547d = codecCapabilities;
        this.f218550g = z;
        this.f218548e = z4;
        this.f218549f = z5;
        this.f218551h = z6;
        this.f218552i = def0.m35798o(str2);
        this.f218555l = -3.4028235E38f;
        this.f218553j = -1;
        this.f218554k = -1;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m80341a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(h0b1.m46311g(i, widthAlignment) * widthAlignment, h0b1.m46311g(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double dFloor = Math.floor(d);
        if (!videoCapabilities.areSizeAndRateSupported(i3, i4, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x008b  */
    /* JADX INFO: renamed from: i */
    public static tad0 m80342i(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        boolean z6 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z7 = z4 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (Build.VERSION.SDK_INT < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface")) {
            z5 = false;
        } else {
            Integer num = (Integer) f218543m.get();
            if (num != null && num.intValue() <= 202604) {
                String str4 = Build.MANUFACTURER;
                if (str4.equals("Xiaomi") || str4.equals("OPPO") || str4.equals("realme") || str4.equals("motorola") || str4.equals("LENOVO") || str4.equals("Fairphone")) {
                    z5 = false;
                }
            }
            z5 = true;
        }
        return new tad0(str, str2, str3, codecCapabilities, z, z2, z3, z6, z7, z5);
    }

    /* JADX INFO: renamed from: b */
    public final kro m80343b(r300 r300Var, r300 r300Var2) {
        r300 r300Var3;
        r300 r300Var4;
        int i;
        String str = r300Var.f195387p;
        p7f p7fVar = r300Var.f195358H;
        String str2 = r300Var2.f195387p;
        p7f p7fVar2 = r300Var2.f195358H;
        int i2 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.f218552i) {
            if (r300Var.f195353C != r300Var2.f195353C) {
                i2 |= 1024;
            }
            boolean z = (r300Var.f195394w == r300Var2.f195394w && r300Var.f195395x == r300Var2.f195395x) ? false : true;
            if (!this.f218548e && z) {
                i2 |= 512;
            }
            if ((!p7f.m69259g(p7fVar) || !p7f.m69259g(p7fVar2)) && !Objects.equals(p7fVar, p7fVar2)) {
                i2 |= 2048;
            }
            HashSet hashSet = dgd0.f48781a;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f218544a) && !r300Var.m74567d(r300Var2)) {
                i2 |= 2;
            }
            int i3 = r300Var.f195397z;
            if (i3 != -1 && (i = r300Var.f195351A) != -1 && i3 == r300Var2.f195397z && i == r300Var2.f195351A && z) {
                i2 |= 2;
            }
            if (i2 == 0 && Objects.equals(r300Var2.f195387p, "video/dolby-vision")) {
                Pair pairM63005c = mwe.m63005c(r300Var);
                Pair pairM63005c2 = mwe.m63005c(r300Var2);
                if (pairM63005c == null || pairM63005c2 == null || !((Integer) pairM63005c.first).equals(pairM63005c2.first)) {
                    i2 |= 2;
                }
            }
            if (i2 == 0) {
                return new kro(this.f218544a, r300Var, r300Var2, r300Var.m74567d(r300Var2) ? 3 : 2, 0);
            }
            r300Var3 = r300Var;
            r300Var4 = r300Var2;
        } else {
            r300Var3 = r300Var;
            r300Var4 = r300Var2;
            if (r300Var3.f195360J != r300Var4.f195360J) {
                i2 |= 4096;
            }
            if (r300Var3.f195362L != r300Var4.f195362L) {
                i2 |= 8192;
            }
            if (r300Var3.f195363M != r300Var4.f195363M) {
                i2 |= 16384;
            }
            String str3 = this.f218545b;
            if (i2 == 0 && (str3.equals("audio/mp4a-latm") || str3.equals("audio/ac4"))) {
                Pair pairM63005c3 = mwe.m63005c(r300Var3);
                Pair pairM63005c4 = mwe.m63005c(r300Var4);
                if (pairM63005c3 != null && pairM63005c4 != null) {
                    int iIntValue = ((Integer) pairM63005c3.first).intValue();
                    int iIntValue2 = ((Integer) pairM63005c4.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new kro(this.f218544a, r300Var3, r300Var4, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && pairM63005c3.equals(pairM63005c4)) {
                        return new kro(this.f218544a, r300Var3, r300Var4, 3, 0);
                    }
                }
            }
            if (i2 == 0 && (str3.equals("audio/eac3-joc") || str3.equals("audio/eac3"))) {
                return new kro(this.f218544a, r300Var3, r300Var4, 3, 0);
            }
            if (!r300Var3.m74567d(r300Var4)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new kro(this.f218544a, r300Var3, r300Var4, 1, 0);
            }
        }
        return new kro(this.f218544a, r300Var3, r300Var4, 0, i2);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x0088  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x0098  */
    /* JADX WARN: Code duplicated, block: B:40:0x009b  */
    /* JADX WARN: Code duplicated, block: B:48:0x00af  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:72:0x0113  */
    /* JADX WARN: Code duplicated, block: B:74:0x0119  */
    /* JADX WARN: Code duplicated, block: B:93:0x013d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0056, please report this as an issue */
    /* JADX INFO: renamed from: c */
    public final boolean m80344c(Context context, r300 r300Var, boolean z) {
        int iM60122c;
        int iM60121b;
        boolean zEquals;
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int length;
        int i;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel;
        int maxInputChannelCount;
        int i2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr2;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        lwe lweVarM63007e = mwe.m63007e(r300Var);
        String str2 = r300Var.f195387p;
        String str3 = this.f218546c;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String strM35799p = def0.m35799p(str3);
            if (!strM35799p.equals("video/mv-hevc")) {
                if (strM35799p.equals("video/hevc")) {
                    HashMap map = zad0.f281041a;
                    String strM47807o = hkf1.m47807o(r300Var.f195390s);
                    if (strM47807o == null) {
                        lweVarM63007e = null;
                    } else {
                        String strTrim = strM47807o.trim();
                        String str4 = h0b1.f86200a;
                        lweVarM63007e = mwe.m63006d(strM47807o, strTrim.split("\\.", -1), r300Var.f195358H);
                    }
                }
                if (lweVarM63007e != null) {
                    if (!lweVarM63007e.m60123d()) {
                        return false;
                    }
                    iM60122c = lweVarM63007e.m60122c();
                    iM60121b = lweVarM63007e.m60121b();
                    zEquals = "video/dolby-vision".equals(str2);
                    str = this.f218545b;
                    if (zEquals) {
                        str.getClass();
                        switch (str) {
                            case "video/av01":
                            case "video/hevc":
                                iM60121b = 0;
                                iM60122c = 2;
                                break;
                            case "video/avc":
                                iM60121b = 0;
                                iM60122c = 8;
                                break;
                        }
                    }
                    if (this.f218552i) {
                        codecCapabilities = this.f218547d;
                        if (codecCapabilities != null) {
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                        } else {
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                        }
                        if (str.equals("audio/ac4")) {
                            if (codecCapabilities != null) {
                                maxInputChannelCount = 2;
                            } else {
                                maxInputChannelCount = 2;
                            }
                            if (maxInputChannelCount > 18) {
                            }
                            if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                codecProfileLevelArr2 = new MediaCodecInfo.CodecProfileLevel[]{zad0.m95772b(1026, i2)};
                            } else {
                                codecProfileLevelArr2 = new MediaCodecInfo.CodecProfileLevel[]{zad0.m95772b(257, i2), zad0.m95772b(513, i2), zad0.m95772b(514, i2), zad0.m95772b(1026, i2), zad0.m95772b(1028, i2)};
                            }
                            codecProfileLevelArr = codecProfileLevelArr2;
                        }
                        length = codecProfileLevelArr.length;
                        for (i = 0; i < length; i++) {
                            codecProfileLevel = codecProfileLevelArr[i];
                            if (codecProfileLevel.profile != iM60122c) {
                            }
                        }
                        m80349h("codec.profileLevel, " + r300Var.f195383l + ", " + str3);
                        return false;
                    }
                    codecCapabilities = this.f218547d;
                    if (codecCapabilities != null) {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    } else {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    }
                    if (str.equals("audio/ac4")) {
                        if (codecCapabilities != null) {
                            maxInputChannelCount = 2;
                        } else {
                            maxInputChannelCount = 2;
                        }
                        if (maxInputChannelCount > 18) {
                        }
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            codecProfileLevelArr2 = new MediaCodecInfo.CodecProfileLevel[]{zad0.m95772b(1026, i2)};
                        } else {
                            codecProfileLevelArr2 = new MediaCodecInfo.CodecProfileLevel[]{zad0.m95772b(257, i2), zad0.m95772b(513, i2), zad0.m95772b(514, i2), zad0.m95772b(1026, i2), zad0.m95772b(1028, i2)};
                        }
                        codecProfileLevelArr = codecProfileLevelArr2;
                    }
                    length = codecProfileLevelArr.length;
                    while (i < length) {
                        codecProfileLevel = codecProfileLevelArr[i];
                        if (codecProfileLevel.profile != iM60122c) {
                        }
                    }
                    m80349h("codec.profileLevel, " + r300Var.f195383l + ", " + str3);
                    return false;
                }
            }
        } else if (lweVarM63007e != null) {
            if (!lweVarM63007e.m60123d()) {
                return false;
            }
            iM60122c = lweVarM63007e.m60122c();
            iM60121b = lweVarM63007e.m60121b();
            zEquals = "video/dolby-vision".equals(str2);
            str = this.f218545b;
            if (zEquals) {
                str.getClass();
                switch (str) {
                    case -1662735862:
                        if (str.equals("video/av01")) {
                        }
                        break;
                    case -1662541442:
                        if (str.equals("video/hevc")) {
                        }
                        break;
                    case 1331836730:
                        if (str.equals("video/avc")) {
                        }
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    */
                /*
                    Method dump skipped, instruction units count: 372
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p204p.tad0.m80344c(android.content.Context, p.r300, boolean):boolean");
            }

            /* JADX INFO: renamed from: d */
            public final boolean m80345d(r300 r300Var) {
                return (Objects.equals(r300Var.f195387p, "audio/flac") && r300Var.f195363M == 22 && Build.VERSION.SDK_INT < 34 && this.f218544a.equals("c2.android.flac.decoder")) ? false : true;
            }

            /* JADX INFO: renamed from: e */
            public final boolean m80346e(Context context, r300 r300Var) {
                int i;
                int i2;
                String str = r300Var.f195387p;
                String str2 = this.f218545b;
                if ((!str2.equals(str) && !str2.equals(zad0.m95773c(r300Var))) || !m80344c(context, r300Var, true) || !m80345d(r300Var)) {
                    return false;
                }
                if (this.f218552i) {
                    int i3 = r300Var.f195394w;
                    if (i3 > 0 && (i2 = r300Var.f195395x) > 0) {
                        return m80348g(r300Var.f195352B, i3, i2);
                    }
                } else {
                    int i4 = r300Var.f195362L;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = this.f218547d;
                    if (i4 != -1) {
                        if (codecCapabilities == null) {
                            m80349h("sampleRate.caps");
                            return false;
                        }
                        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                        if (audioCapabilities == null) {
                            m80349h("sampleRate.aCaps");
                            return false;
                        }
                        if (!audioCapabilities.isSampleRateSupported(i4)) {
                            m80349h("sampleRate.support, " + i4);
                            return false;
                        }
                    }
                    int i5 = r300Var.f195360J;
                    if (i5 != -1) {
                        if (codecCapabilities == null) {
                            m80349h("channelCount.caps");
                            return false;
                        }
                        MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                        if (audioCapabilities2 == null) {
                            m80349h("channelCount.aCaps");
                            return false;
                        }
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                            if ("audio/ac3".equals(str2)) {
                                i = 6;
                            } else {
                                i = "audio/eac3".equals(str2) ? 16 : 30;
                            }
                            StringBuilder sbM38571t = edb.m38571t(maxInputChannelCount, "AssumedMaxChannelAdjustment: ", this.f218544a, ", [", " to ");
                            sbM38571t.append(i);
                            sbM38571t.append("]");
                            yif1.m93819w0(sbM38571t.toString());
                            maxInputChannelCount = i;
                        }
                        if (maxInputChannelCount < i5) {
                            m80349h("channelCount.support, " + i5);
                            return false;
                        }
                    }
                }
                return true;
            }

            /* JADX INFO: renamed from: f */
            public final boolean m80347f(r300 r300Var) {
                if (this.f218552i) {
                    return this.f218548e;
                }
                lwe lweVarM63007e = mwe.m63007e(r300Var);
                return lweVarM63007e != null && lweVarM63007e.m60123d() && lweVarM63007e.m60122c() == 42;
            }

            /* JADX WARN: Code duplicated, block: B:20:0x0044 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:21:0x0046  */
            /* JADX INFO: renamed from: g */
            public final boolean m80348g(double d, int i, int i2) {
                String str;
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.f218547d;
                if (codecCapabilities == null) {
                    m80349h("sizeAndRate.caps");
                    return false;
                }
                MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
                if (videoCapabilities == null) {
                    m80349h("sizeAndRate.vCaps");
                    return false;
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    int iM97030g = zug1.m97030g(videoCapabilities, i, i2, d);
                    if (iM97030g != 2) {
                        if (iM97030g == 1) {
                            StringBuilder sbM36619s = dq60.m36619s(i, i2, "sizeAndRate.cover, ", "x", "@");
                            sbM36619s.append(d);
                            m80349h(sbM36619s.toString());
                            return false;
                        }
                        if (!m80341a(videoCapabilities, i, i2, d)) {
                            if (i < i2) {
                                HashSet hashSet = dgd0.f48781a;
                                str = this.f218544a;
                                if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str)) {
                                    StringBuilder sbM36619s2 = dq60.m36619s(i, i2, "sizeAndRate.rotated, ", "x", "@");
                                    sbM36619s2.append(d);
                                    StringBuilder sbM38573v = edb.m38573v("AssumedSupport [", sbM36619s2.toString(), "] [", str, ", ");
                                    sbM38573v.append(this.f218545b);
                                    sbM38573v.append("] [");
                                    sbM38573v.append(h0b1.f86200a);
                                    sbM38573v.append("]");
                                    yif1.m93806q(sbM38573v.toString());
                                    return true;
                                }
                                StringBuilder sbM36619s3 = dq60.m36619s(i, i2, "sizeAndRate.rotated, ", "x", "@");
                                sbM36619s3.append(d);
                                StringBuilder sbM38573v2 = edb.m38573v("AssumedSupport [", sbM36619s3.toString(), "] [", str, ", ");
                                sbM38573v2.append(this.f218545b);
                                sbM38573v2.append("] [");
                                sbM38573v2.append(h0b1.f86200a);
                                sbM38573v2.append("]");
                                yif1.m93806q(sbM38573v2.toString());
                                return true;
                            }
                            StringBuilder sbM36619s4 = dq60.m36619s(i, i2, "sizeAndRate.support, ", "x", "@");
                            sbM36619s4.append(d);
                            m80349h(sbM36619s4.toString());
                            return false;
                        }
                    }
                } else if (!m80341a(videoCapabilities, i, i2, d)) {
                    if (i < i2) {
                        HashSet hashSet2 = dgd0.f48781a;
                        str = this.f218544a;
                        if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && m80341a(videoCapabilities, i2, i, d)) {
                            StringBuilder sbM36619s5 = dq60.m36619s(i, i2, "sizeAndRate.rotated, ", "x", "@");
                            sbM36619s5.append(d);
                            StringBuilder sbM38573v3 = edb.m38573v("AssumedSupport [", sbM36619s5.toString(), "] [", str, ", ");
                            sbM38573v3.append(this.f218545b);
                            sbM38573v3.append("] [");
                            sbM38573v3.append(h0b1.f86200a);
                            sbM38573v3.append("]");
                            yif1.m93806q(sbM38573v3.toString());
                            return true;
                        }
                    }
                    StringBuilder sbM36619s6 = dq60.m36619s(i, i2, "sizeAndRate.support, ", "x", "@");
                    sbM36619s6.append(d);
                    m80349h(sbM36619s6.toString());
                    return false;
                }
                return true;
            }

            /* JADX INFO: renamed from: h */
            public final void m80349h(String str) {
                StringBuilder sbM38572u = edb.m38572u("NoSupport [", str, "] [");
                sbM38572u.append(this.f218544a);
                sbM38572u.append(", ");
                sbM38572u.append(this.f218545b);
                sbM38572u.append("] [");
                sbM38572u.append(h0b1.f86200a);
                sbM38572u.append("]");
                yif1.m93806q(sbM38572u.toString());
            }

            public final String toString() {
                return this.f218544a;
            }
        }
