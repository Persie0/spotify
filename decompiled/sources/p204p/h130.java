package p204p;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.common.ParserException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class h130 implements v2n0 {

    /* JADX INFO: renamed from: a */
    public final e130 f86507a;

    /* JADX INFO: renamed from: b */
    public final a130 f86508b;

    /* JADX INFO: renamed from: c */
    public static final Pattern f86473c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: d */
    public static final Pattern f86476d = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: e */
    public static final Pattern f86479e = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: f */
    public static final Pattern f86481f = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: g */
    public static final Pattern f86483g = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: h */
    public static final Pattern f86485h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: i */
    public static final Pattern f86487i = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: t */
    public static final Pattern f86499t = Pattern.compile("SAMPLE-RATE=(\\d+)\\b");

    /* JADX INFO: renamed from: X */
    public static final Pattern f86460X = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");

    /* JADX INFO: renamed from: Y */
    public static final Pattern f86463Y = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: Z */
    public static final Pattern f86466Z = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: L0 */
    public static final Pattern f86436L0 = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: M0 */
    public static final Pattern f86438M0 = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: N0 */
    public static final Pattern f86440N0 = Pattern.compile("SCORE=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: O0 */
    public static final Pattern f86442O0 = Pattern.compile("SERVER-URI=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: P0 */
    public static final Pattern f86444P0 = Pattern.compile("PATHWAY-ID=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: Q0 */
    public static final Pattern f86446Q0 = Pattern.compile("STABLE-VARIANT-ID=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: R0 */
    public static final Pattern f86448R0 = Pattern.compile("STABLE-RENDITION-ID=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: S0 */
    public static final Pattern f86450S0 = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: T0 */
    public static final Pattern f86452T0 = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: U0 */
    public static final Pattern f86454U0 = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: V0 */
    public static final Pattern f86456V0 = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: W0 */
    public static final Pattern f86458W0 = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: X0 */
    public static final Pattern f86461X0 = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: Y0 */
    public static final Pattern f86464Y0 = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: Z0 */
    public static final Pattern f86467Z0 = m46383a("CAN-SKIP-DATERANGES");

    /* JADX INFO: renamed from: a1 */
    public static final Pattern f86469a1 = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* JADX INFO: renamed from: b1 */
    public static final Pattern f86471b1 = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: c1 */
    public static final Pattern f86474c1 = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: d1 */
    public static final Pattern f86477d1 = m46383a("CAN-BLOCK-RELOAD");

    /* JADX INFO: renamed from: e1 */
    public static final Pattern f86480e1 = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* JADX INFO: renamed from: f1 */
    public static final Pattern f86482f1 = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: g1 */
    public static final Pattern f86484g1 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* JADX INFO: renamed from: h1 */
    public static final Pattern f86486h1 = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* JADX INFO: renamed from: i1 */
    public static final Pattern f86488i1 = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* JADX INFO: renamed from: j1 */
    public static final Pattern f86489j1 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: k1 */
    public static final Pattern f86490k1 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* JADX INFO: renamed from: l1 */
    public static final Pattern f86491l1 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* JADX INFO: renamed from: m1 */
    public static final Pattern f86492m1 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* JADX INFO: renamed from: n1 */
    public static final Pattern f86493n1 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* JADX INFO: renamed from: o1 */
    public static final Pattern f86494o1 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* JADX INFO: renamed from: p1 */
    public static final Pattern f86495p1 = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: q1 */
    public static final Pattern f86496q1 = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: r1 */
    public static final Pattern f86497r1 = Pattern.compile("URI=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: s1 */
    public static final Pattern f86498s1 = Pattern.compile("IV=([^,.*]+)");

    /* JADX INFO: renamed from: t1 */
    public static final Pattern f86500t1 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* JADX INFO: renamed from: u1 */
    public static final Pattern f86501u1 = Pattern.compile("TYPE=(PART|MAP)");

    /* JADX INFO: renamed from: v1 */
    public static final Pattern f86502v1 = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: w1 */
    public static final Pattern f86503w1 = Pattern.compile("NAME=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: x1 */
    public static final Pattern f86504x1 = Pattern.compile("QUERYPARAM=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: y1 */
    public static final Pattern f86505y1 = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: z1 */
    public static final Pattern f86506z1 = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: A1 */
    public static final Pattern f86425A1 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* JADX INFO: renamed from: B1 */
    public static final Pattern f86426B1 = m46383a("AUTOSELECT");

    /* JADX INFO: renamed from: C1 */
    public static final Pattern f86427C1 = m46383a("DEFAULT");

    /* JADX INFO: renamed from: D1 */
    public static final Pattern f86428D1 = m46383a("FORCED");

    /* JADX INFO: renamed from: E1 */
    public static final Pattern f86429E1 = m46383a("INDEPENDENT");

    /* JADX INFO: renamed from: F1 */
    public static final Pattern f86430F1 = m46383a("GAP");

    /* JADX INFO: renamed from: G1 */
    public static final Pattern f86431G1 = m46383a("PRECISE");

    /* JADX INFO: renamed from: H1 */
    public static final Pattern f86432H1 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: I1 */
    public static final Pattern f86433I1 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: J1 */
    public static final Pattern f86434J1 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: K1 */
    public static final Pattern f86435K1 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: L1 */
    public static final Pattern f86437L1 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: M1 */
    public static final Pattern f86439M1 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: N1 */
    public static final Pattern f86441N1 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: O1 */
    public static final Pattern f86443O1 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: P1 */
    public static final Pattern f86445P1 = m46383a("END-ON-NEXT");

    /* JADX INFO: renamed from: Q1 */
    public static final Pattern f86447Q1 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: R1 */
    public static final Pattern f86449R1 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: S1 */
    public static final Pattern f86451S1 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: T1 */
    public static final Pattern f86453T1 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: U1 */
    public static final Pattern f86455U1 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: V1 */
    public static final Pattern f86457V1 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: W1 */
    public static final Pattern f86459W1 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: X1 */
    public static final Pattern f86462X1 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: Y1 */
    public static final Pattern f86465Y1 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: Z1 */
    public static final Pattern f86468Z1 = Pattern.compile("X-SKIP-CONTROL-OFFSET=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: a2 */
    public static final Pattern f86470a2 = Pattern.compile("X-SKIP-CONTROL-DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: b2 */
    public static final Pattern f86472b2 = Pattern.compile("X-SKIP-CONTROL-LABEL-ID=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: c2 */
    public static final Pattern f86475c2 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* JADX INFO: renamed from: d2 */
    public static final Pattern f86478d2 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public h130() {
        this(e130.f55103o, null);
    }

    /* JADX INFO: renamed from: a */
    public static Pattern m46383a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    /* JADX INFO: renamed from: c */
    public static ahs m46384c(String str, zgs[] zgsVarArr) {
        zgs[] zgsVarArr2 = new zgs[zgsVarArr.length];
        for (int i = 0; i < zgsVarArr.length; i++) {
            zgs zgsVar = zgsVarArr[i];
            zgsVarArr2[i] = new zgs(zgsVar.f282701b, zgsVar.f282702c, zgsVar.f282703d, null);
        }
        return new ahs(str, true, zgsVarArr2);
    }

    /* JADX INFO: renamed from: d */
    public static zgs m46385d(String str, String str2, HashMap map, g130 g130Var) throws ParserException {
        String strM46392k = m46392k(str, f86496q1, "1", map, g130Var);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f86497r1;
        if (zEquals) {
            String strM46393l = m46393l(str, pattern, map, g130Var);
            return new zgs(mva.f147548e, null, "video/mp4", Base64.decode(strM46393l.substring(strM46393l.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = mva.f147548e;
            String str3 = h0b1.f86200a;
            return new zgs(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strM46392k)) {
            return null;
        }
        String strM46393l2 = m46393l(str, pattern, map, g130Var);
        byte[] bArrDecode = Base64.decode(strM46393l2.substring(strM46393l2.indexOf(44)), 0);
        UUID uuid2 = mva.f147549f;
        return new zgs(uuid2, null, "video/mp4", kjg1.m56586i(uuid2, null, bArrDecode));
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 47801. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: e */
    public static p204p.a130 m46386e(p204p.e130 r126, p204p.a130 r127, p204p.u010 r128, android.net.Uri r129, p204p.g130 r130) {
        /*
            Method dump skipped, instruction units count: 4780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.h130.m46386e(p.e130, p.a130, p.u010, android.net.Uri, p.g130):p.a130");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:102:0x0272  */
    /* JADX WARN: Code duplicated, block: B:103:0x0279  */
    /* JADX WARN: Code duplicated, block: B:106:0x0281  */
    /* JADX WARN: Code duplicated, block: B:109:0x0291  */
    /* JADX WARN: Code duplicated, block: B:112:0x029a  */
    /* JADX WARN: Code duplicated, block: B:113:0x029c  */
    /* JADX WARN: Code duplicated, block: B:115:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:117:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:119:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:124:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:126:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:132:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:138:0x030c  */
    /* JADX WARN: Code duplicated, block: B:139:0x0311  */
    /* JADX WARN: Code duplicated, block: B:142:0x031a  */
    /* JADX WARN: Code duplicated, block: B:145:0x0342  */
    /* JADX WARN: Code duplicated, block: B:147:0x034d  */
    /* JADX WARN: Code duplicated, block: B:149:0x0353  */
    /* JADX WARN: Code duplicated, block: B:152:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:202:0x0562  */
    /* JADX WARN: Code duplicated, block: B:299:0x03dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x02c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:66:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:67:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:84:0x0234  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v5 */
    /* JADX WARN: Type inference failed for: r29v9 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [int] */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX INFO: renamed from: f */
    public static e130 m46387f(u010 u010Var, Uri uri, g130 g130Var) throws IOException {
        ?? r29;
        int i;
        int i2;
        ArrayList arrayList;
        d130 d130Var;
        String strM35788e;
        ArrayList arrayList2;
        int i3;
        String str;
        d130 d130Var2;
        String strM35788e2;
        d130 d130Var3;
        int i4;
        String str2;
        String str3;
        String strM46274B;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        p7f p7fVar;
        String[] strArrM46318j0;
        StringBuilder sb;
        int length;
        int i10;
        String string;
        String str4;
        p7f p7fVar2;
        String strM46392k;
        int i11;
        int i12;
        String strM46392k2;
        float f;
        Uri uriM73999D;
        Uri uri2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String string2 = uri.toString();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        boolean z = false;
        boolean z2 = false;
        tey teyVar = null;
        while (true) {
            boolean zM82100r = u010Var.m82100r();
            Pattern pattern = f86497r1;
            ArrayList arrayList13 = arrayList9;
            Pattern pattern2 = f86503w1;
            boolean zContains = z;
            boolean z3 = z2;
            if (!zM82100r) {
                ArrayList arrayList14 = arrayList5;
                HashMap map3 = map;
                ArrayList arrayList15 = arrayList10;
                ArrayList arrayList16 = arrayList12;
                ArrayList arrayList17 = arrayList6;
                ArrayList arrayList18 = arrayList7;
                ArrayList arrayList19 = arrayList8;
                ArrayList arrayList20 = arrayList11;
                ArrayList arrayList21 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i13 = 0;
                while (i13 < arrayList14.size()) {
                    d130 d130Var4 = (d130) arrayList14.get(i13);
                    Uri uri3 = d130Var4.f44142a;
                    r300 r300Var = d130Var4.f44143b;
                    if (hashSet.add(uri3)) {
                        c95.m31855u(r300Var.f195384m == null);
                        ArrayList arrayList22 = (ArrayList) map3.get(d130Var4.f44142a);
                        arrayList22.getClass();
                        j6f0 j6f0Var = new j6f0(new t130(null, arrayList22, null));
                        p300 p300VarM74564a = r300Var.m74564a();
                        p300VarM74564a.f173524l = j6f0Var;
                        arrayList21.add(new d130(d130Var4.f44142a, new r300(p300VarM74564a), d130Var4.f44144c, d130Var4.f44145d, d130Var4.f44146e, d130Var4.f44147f, d130Var4.f44148g, d130Var4.f44149h));
                    }
                    i13++;
                    hashSet = hashSet;
                    map3 = map3;
                }
                int i14 = 0;
                ArrayList arrayList23 = null;
                r300 r300Var2 = null;
                while (i14 < arrayList15.size()) {
                    ArrayList arrayList24 = arrayList15;
                    String str5 = (String) arrayList24.get(i14);
                    String strM46393l = m46393l(str5, f86505y1, map2, g130Var);
                    String strM46393l2 = m46393l(str5, pattern2, map2, g130Var);
                    ArrayList arrayList25 = arrayList23;
                    ArrayList arrayList26 = arrayList21;
                    String strM46392k3 = m46392k(str5, f86448R0, null, map2, g130Var);
                    p300 p300Var = new p300();
                    p300Var.f173513a = klh.m56834f(strM46393l, ":", strM46393l2);
                    p300Var.f173514b = strM46393l2;
                    p300Var.f173526n = def0.m35799p("application/x-mpegURL");
                    boolean zM46388g = m46388g(str5, f86427C1, g130Var);
                    if (m46388g(str5, f86428D1, g130Var)) {
                        r29 = zM46388g;
                        r29 = (zM46388g ? 1 : 0) | 2;
                    }
                    r29 = zM46388g;
                    p300Var.f173517e = m46388g(str5, f86426B1, g130Var) ? r29 | 4 : r29;
                    r300 r300Var3 = r300Var2;
                    String strM46392k4 = m46392k(str5, f86506z1, null, map2, g130Var);
                    if (TextUtils.isEmpty(strM46392k4)) {
                        i2 = i14;
                        i = 0;
                    } else {
                        String str6 = h0b1.f86200a;
                        String[] strArrSplit = strM46392k4.split(",", -1);
                        i = h0b1.m46323m(strArrSplit, "public.accessibility.describes-video") ? 512 : 0;
                        i2 = i14;
                        if (h0b1.m46323m(strArrSplit, "public.accessibility.transcribes-spoken-dialog")) {
                            i |= 4096;
                        }
                        if (h0b1.m46323m(strArrSplit, "public.accessibility.describes-music-and-sound")) {
                            i |= 1024;
                        }
                        if (h0b1.m46323m(strArrSplit, "public.easy-to-read")) {
                            i |= 8192;
                        }
                    }
                    p300Var.f173518f = i;
                    p300Var.f173516d = m46392k(str5, f86502v1, null, map2, g130Var);
                    String strM46392k5 = m46392k(str5, pattern, null, map2, g130Var);
                    Uri uriM73999D2 = strM46392k5 == null ? null : qvf1.m73999D(string2, strM46392k5);
                    String str7 = string2;
                    j6f0 j6f0Var2 = new j6f0(new t130(strM46393l, Collections.EMPTY_LIST, strM46393l2));
                    switch (m46393l(str5, f86500t1, map2, g130Var)) {
                        case "SUBTITLES":
                            arrayList = arrayList18;
                            int i15 = 0;
                            while (true) {
                                if (i15 < arrayList14.size()) {
                                    d130 d130Var5 = (d130) arrayList14.get(i15);
                                    if (strM46393l.equals(d130Var5.f44146e)) {
                                        d130Var = d130Var5;
                                    } else {
                                        i15++;
                                    }
                                } else {
                                    d130Var = null;
                                }
                            }
                            if (d130Var != null) {
                                String strM46274B2 = h0b1.m46274B(3, d130Var.f44143b.f195383l);
                                p300Var.f173523k = strM46274B2;
                                strM35788e = def0.m35788e(strM46274B2);
                            } else {
                                strM35788e = null;
                            }
                            if (strM35788e == null) {
                                strM35788e = "text/vtt";
                            }
                            p300Var.f173527o = def0.m35799p(strM35788e);
                            p300Var.f173524l = j6f0Var2;
                            if (uriM73999D2 != null) {
                                arrayList2 = arrayList19;
                                arrayList2.add(new c130(uriM73999D2, new r300(p300Var), strM46393l, strM46393l2, strM46392k3));
                            } else {
                                arrayList2 = arrayList19;
                                yif1.m93819w0("EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            arrayList23 = arrayList25;
                            r300Var2 = r300Var3;
                            break;
                        case "CLOSED-CAPTIONS":
                            arrayList = arrayList18;
                            String strM46393l3 = m46393l(str5, f86425A1, map2, g130Var);
                            if (strM46393l3.startsWith("CC")) {
                                i3 = Integer.parseInt(strM46393l3.substring(2));
                                str = "application/cea-608";
                            } else {
                                i3 = Integer.parseInt(strM46393l3.substring(7));
                                str = "application/cea-708";
                            }
                            ArrayList arrayList27 = arrayList25 == null ? new ArrayList() : arrayList25;
                            p300Var.f173527o = def0.m35799p(str);
                            p300Var.f173508O = i3;
                            arrayList27.add(new r300(p300Var));
                            arrayList23 = arrayList27;
                            arrayList2 = arrayList19;
                            r300Var2 = r300Var3;
                            break;
                        case "AUDIO":
                            ArrayList arrayList28 = arrayList17;
                            int i16 = 0;
                            while (true) {
                                if (i16 < arrayList14.size()) {
                                    d130Var2 = (d130) arrayList14.get(i16);
                                    if (!strM46393l.equals(d130Var2.f44145d)) {
                                        i16++;
                                    }
                                } else {
                                    d130Var2 = null;
                                }
                            }
                            if (d130Var2 != null) {
                                String strM46274B3 = h0b1.m46274B(1, d130Var2.f44143b.f195383l);
                                p300Var.f173523k = strM46274B3;
                                strM35788e2 = def0.m35788e(strM46274B3);
                            } else {
                                strM35788e2 = null;
                            }
                            arrayList17 = arrayList28;
                            String strM46392k6 = m46392k(str5, f86487i, null, map2, g130Var);
                            if (strM46392k6 != null) {
                                String str8 = h0b1.f86200a;
                                p300Var.f173502I = Integer.parseInt(strM46392k6.split("/", 2)[0]);
                                if ("audio/eac3".equals(strM35788e2) && strM46392k6.endsWith("/JOC")) {
                                    p300Var.f173523k = "ec+3";
                                    strM35788e2 = "audio/eac3-joc";
                                }
                            }
                            int iM46390i = m46390i(str5, f86499t, g130Var);
                            if (iM46390i != -1) {
                                p300Var.f173504K = iM46390i;
                            }
                            p300Var.m68978e(strM35788e2);
                            if (uriM73999D2 == null) {
                                arrayList = arrayList18;
                                if (d130Var2 != null) {
                                    r300 r300Var4 = new r300(p300Var);
                                    arrayList23 = arrayList25;
                                    r300Var2 = r300Var4;
                                    arrayList2 = arrayList19;
                                }
                                break;
                            } else {
                                p300Var.f173524l = j6f0Var2;
                                arrayList = arrayList18;
                                arrayList.add(new c130(uriM73999D2, new r300(p300Var), strM46393l, strM46393l2, strM46392k3));
                            }
                            arrayList2 = arrayList19;
                            arrayList23 = arrayList25;
                            r300Var2 = r300Var3;
                            break;
                        case "VIDEO":
                            int i17 = 0;
                            while (true) {
                                if (i17 < arrayList14.size()) {
                                    d130Var3 = (d130) arrayList14.get(i17);
                                    if (!strM46393l.equals(d130Var3.f44144c)) {
                                        i17++;
                                    }
                                } else {
                                    d130Var3 = null;
                                }
                            }
                            if (d130Var3 != null) {
                                r300 r300Var5 = d130Var3.f44143b;
                                String strM46274B4 = h0b1.m46274B(2, r300Var5.f195383l);
                                p300Var.f173523k = strM46274B4;
                                p300Var.f173527o = def0.m35799p(def0.m35788e(strM46274B4));
                                p300Var.f173534v = r300Var5.f195394w;
                                p300Var.f173535w = r300Var5.f195395x;
                                p300Var.m68976c(r300Var5.f195352B);
                            }
                            if (uriM73999D2 != null) {
                                p300Var.f173524l = j6f0Var2;
                                arrayList17.add(new c130(uriM73999D2, new r300(p300Var), strM46393l, strM46393l2, strM46392k3));
                                break;
                            }
                        default:
                            arrayList2 = arrayList19;
                            arrayList = arrayList18;
                            arrayList23 = arrayList25;
                            r300Var2 = r300Var3;
                            break;
                    }
                    i14 = i2 + 1;
                    arrayList18 = arrayList;
                    arrayList15 = arrayList24;
                    arrayList19 = arrayList2;
                    arrayList21 = arrayList26;
                    string2 = str7;
                }
                return new e130(uri.toString(), arrayList16, arrayList21, arrayList17, arrayList18, arrayList19, arrayList13, r300Var2, zContains ? Collections.EMPTY_LIST : arrayList23, z3, map2, arrayList20, teyVar);
            }
            String strM82106x = u010Var.m82106x();
            ArrayList arrayList29 = arrayList8;
            if (strM82106x.startsWith("#EXT")) {
                arrayList12.add(strM82106x);
            }
            boolean zStartsWith = strM82106x.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList30 = arrayList12;
            if (strM82106x.startsWith("#EXT-X-DEFINE")) {
                String strM46392k7 = m46392k(strM82106x, pattern2, null, map2, g130Var);
                if (strM46392k7 != null) {
                    m46395n(strM46392k7, map2);
                    map2.put(strM46392k7, m46393l(strM82106x, f86432H1, map2, g130Var));
                } else {
                    String strM46393l4 = m46393l(strM82106x, f86504x1, map2, g130Var);
                    m46395n(strM46393l4, map2);
                    String queryParameter = uri.getQueryParameter(strM46393l4);
                    if (queryParameter == null) {
                        throw ParserException.m753b("QUERYPARAM \"" + strM46393l4 + "\" not found in playlist URI");
                    }
                    map2.put(strM46393l4, queryParameter);
                }
            } else {
                if (strM82106x.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    ArrayList arrayList31 = arrayList5;
                    map = map;
                    arrayList3 = arrayList31;
                    arrayList10 = arrayList10;
                    arrayList6 = arrayList6;
                    arrayList7 = arrayList7;
                    arrayList11 = arrayList11;
                    z = zContains;
                    z2 = true;
                } else if (strM82106x.startsWith("#EXT-X-MEDIA")) {
                    arrayList10.add(strM82106x);
                } else if (strM82106x.startsWith("#EXT-X-SESSION-KEY")) {
                    zgs zgsVarM46385d = m46385d(strM82106x, m46392k(strM82106x, f86495p1, "identity", map2, g130Var), map2, g130Var);
                    if (zgsVarM46385d != null) {
                        String strM46393l5 = m46393l(strM82106x, f86494o1, map2, g130Var);
                        arrayList11.add(new ahs(("SAMPLE-AES-CENC".equals(strM46393l5) || "SAMPLE-AES-CTR".equals(strM46393l5)) ? "cenc" : "cbcs", true, zgsVarM46385d));
                    }
                } else {
                    boolean zStartsWith2 = strM82106x.startsWith("#EXT-X-CONTENT-STEERING");
                    Pattern pattern3 = f86444P0;
                    if (zStartsWith2) {
                        if (teyVar != null) {
                            throw ParserException.m753b("The #EXT-X-CONTENT-STEERING tag must not appear more than once in a multivariant playlist");
                        }
                        arrayList3 = arrayList5;
                        teyVar = new tey(14, qvf1.m73999D(string2, m46393l(strM82106x, f86442O0, map2, g130Var)), m46392k(strM82106x, pattern3, null, map2, g130Var));
                    } else if (strM82106x.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                        zContains |= strM82106x.contains("CLOSED-CAPTIONS=NONE");
                        int i18 = zStartsWith ? 16384 : 0;
                        int i19 = Integer.parseInt(m46393l(strM82106x, f86485h, Collections.EMPTY_MAP, g130Var));
                        int iM46390i2 = m46390i(strM82106x, f86473c, g130Var);
                        arrayList7 = arrayList7;
                        arrayList6 = arrayList6;
                        String strM46392k8 = m46392k(strM82106x, f86460X, null, map2, g130Var);
                        arrayList10 = arrayList10;
                        String strM46392k9 = m46392k(strM82106x, f86463Y, null, map2, g130Var);
                        HashMap map4 = map;
                        String strM46392k10 = m46392k(strM82106x, f86466Z, null, map2, g130Var);
                        if (strM46392k10 != null) {
                            String str9 = h0b1.f86200a;
                            String[] strArrSplit2 = strM46392k10.split(",", 2)[0].split("/", -1);
                            str2 = strArrSplit2[0];
                            if (strArrSplit2.length > 1) {
                                str3 = strArrSplit2[1];
                                arrayList5 = arrayList5;
                                i4 = 2;
                            } else {
                                i4 = 2;
                            }
                            strM46274B = h0b1.m46274B(i4, strM46392k9);
                            if (def0.m35795l(strM46274B, str2)) {
                                if (str2 == null) {
                                    i5 = i18;
                                } else {
                                    if (strM46392k8 != null || str3 == null) {
                                        i5 = i18;
                                    } else {
                                        i5 = i18;
                                        if ((!strM46392k8.equals("PQ") || str3.equals("db1p")) && ((!strM46392k8.equals("SDR") || str3.equals("db2g")) && (!strM46392k8.equals("HLG") || str3.startsWith("db4")))) {
                                        }
                                    }
                                    p7fVar2 = null;
                                }
                                if (strM46392k9 == null && def0.m35795l(strM46392k9, str2)) {
                                    i6 = 6;
                                    if (!strM46392k9.startsWith("dvhe") || strM46392k9.startsWith("dvh1") || strM46392k9.startsWith("dav1")) {
                                        i7 = 6;
                                        i8 = -1;
                                        i9 = 1;
                                    } else if (str3 == null) {
                                        i8 = -1;
                                        i6 = -1;
                                        i9 = -1;
                                        i7 = -1;
                                    } else if (str3.equals("db1p")) {
                                        i7 = 6;
                                        i8 = -1;
                                        i9 = 2;
                                    } else if (str3.startsWith("db4")) {
                                        i8 = -1;
                                        i9 = 2;
                                        i7 = 7;
                                    } else {
                                        i8 = -1;
                                        i6 = -1;
                                        i9 = -1;
                                        i7 = -1;
                                    }
                                    if (i6 == i8) {
                                        p7fVar = null;
                                    } else {
                                        p7fVar = new p7f(i6, i9, i7, null, -1, -1);
                                    }
                                } else {
                                    p7fVar = null;
                                }
                                if (str2 == null) {
                                    str2 = strM46274B;
                                }
                                strArrM46318j0 = h0b1.m46318j0(strM46392k9);
                                if (strArrM46318j0.length == 0) {
                                    string = null;
                                } else {
                                    sb = new StringBuilder();
                                    length = strArrM46318j0.length;
                                    i10 = 0;
                                    while (i10 < length) {
                                        str4 = strArrM46318j0[i10];
                                        String[] strArr = strArrM46318j0;
                                        if (2 == def0.m35792i(def0.m35788e(str4))) {
                                            if (sb.length() > 0) {
                                                sb.append(",");
                                            }
                                            sb.append(str4);
                                        }
                                        i10++;
                                        strArrM46318j0 = strArr;
                                    }
                                    if (sb.length() > 0) {
                                        string = sb.toString();
                                    } else {
                                        string = null;
                                    }
                                }
                                if (string != null) {
                                    strM46392k9 = klh.m56834f(str2, ",", string);
                                } else {
                                    strM46392k9 = str2;
                                }
                                p7fVar2 = p7fVar;
                            } else {
                                i5 = i18;
                                p7fVar2 = null;
                            }
                            strM46392k = m46392k(strM82106x, f86436L0, null, map2, g130Var);
                            if (strM46392k != null) {
                                String[] strArrSplit3 = strM46392k.split("x", -1);
                                i12 = Integer.parseInt(strArrSplit3[0]);
                                i11 = Integer.parseInt(strArrSplit3[1]);
                                if (i12 > 0 || i11 <= 0) {
                                    i11 = -1;
                                    i12 = -1;
                                }
                            } else {
                                i11 = -1;
                                i12 = -1;
                            }
                            strM46392k2 = m46392k(strM82106x, f86438M0, null, map2, g130Var);
                            if (strM46392k2 != null) {
                                f = Float.parseFloat(strM46392k2);
                            } else {
                                f = -1.0f;
                            }
                            String strM46392k11 = m46392k(strM82106x, f86440N0, null, map2, g130Var);
                            float f2 = strM46392k11 != null ? Float.parseFloat(strM46392k11) : -1.0f;
                            String strM46392k12 = m46392k(strM82106x, pattern3, null, map2, g130Var);
                            String strM46392k13 = m46392k(strM82106x, f86476d, null, map2, g130Var);
                            String strM46392k14 = m46392k(strM82106x, f86479e, null, map2, g130Var);
                            String strM46392k15 = m46392k(strM82106x, f86481f, null, map2, g130Var);
                            String strM46392k16 = m46392k(strM82106x, f86483g, null, map2, g130Var);
                            String strM46392k17 = m46392k(strM82106x, f86446Q0, null, map2, g130Var);
                            if (zStartsWith) {
                                uriM73999D = qvf1.m73999D(string2, m46393l(strM82106x, pattern, map2, g130Var));
                            } else {
                                if (u010Var.m82100r()) {
                                    throw ParserException.m753b("#EXT-X-STREAM-INF must be followed by another line");
                                }
                                uriM73999D = qvf1.m73999D(string2, m46394m(u010Var.m82106x(), map2, g130Var));
                            }
                            uri2 = uriM73999D;
                            p300 p300Var2 = new p300();
                            p300Var2.f173513a = Integer.toString(arrayList5.size());
                            p300Var2.f173526n = def0.m35799p("application/x-mpegURL");
                            p300Var2.f173523k = strM46392k9;
                            p300Var2.f173521i = iM46390i2;
                            p300Var2.f173522j = i19;
                            p300Var2.f173534v = i12;
                            p300Var2.f173535w = i11;
                            p300Var2.m68976c(f);
                            p300Var2.f173519g = f2;
                            p300Var2.f173518f = i5;
                            p300Var2.f173500G = p7fVar2;
                            arrayList3 = arrayList5;
                            arrayList3.add(new d130(uri2, new r300(p300Var2), strM46392k13, strM46392k14, strM46392k15, strM46392k16, strM46392k12, strM46392k17));
                            map = map4;
                            arrayList4 = (ArrayList) map.get(uri2);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                map.put(uri2, arrayList4);
                            }
                            arrayList4.add(new s130(iM46390i2, i19, strM46392k13, strM46392k14, strM46392k15, strM46392k16));
                        } else {
                            i4 = 2;
                            str2 = null;
                        }
                        str3 = null;
                        strM46274B = h0b1.m46274B(i4, strM46392k9);
                        if (def0.m35795l(strM46274B, str2)) {
                            if (str2 == null) {
                                i5 = i18;
                            } else {
                                if (strM46392k8 != null) {
                                    i5 = i18;
                                } else {
                                    i5 = i18;
                                }
                                p7fVar2 = null;
                            }
                            if (strM46392k9 == null) {
                                p7fVar = null;
                            } else {
                                i6 = 6;
                                if (strM46392k9.startsWith("dvhe")) {
                                    i7 = 6;
                                    i8 = -1;
                                    i9 = 1;
                                } else {
                                    i7 = 6;
                                    i8 = -1;
                                    i9 = 1;
                                }
                                if (i6 == i8) {
                                    p7fVar = null;
                                } else {
                                    p7fVar = new p7f(i6, i9, i7, null, -1, -1);
                                }
                            }
                            if (str2 == null) {
                                str2 = strM46274B;
                            }
                            strArrM46318j0 = h0b1.m46318j0(strM46392k9);
                            if (strArrM46318j0.length == 0) {
                                string = null;
                            } else {
                                sb = new StringBuilder();
                                length = strArrM46318j0.length;
                                i10 = 0;
                                while (i10 < length) {
                                    str4 = strArrM46318j0[i10];
                                    String[] strArr2 = strArrM46318j0;
                                    if (2 == def0.m35792i(def0.m35788e(str4))) {
                                        if (sb.length() > 0) {
                                            sb.append(",");
                                        }
                                        sb.append(str4);
                                    }
                                    i10++;
                                    strArrM46318j0 = strArr2;
                                }
                                if (sb.length() > 0) {
                                    string = sb.toString();
                                } else {
                                    string = null;
                                }
                            }
                            if (string != null) {
                                strM46392k9 = klh.m56834f(str2, ",", string);
                            } else {
                                strM46392k9 = str2;
                            }
                            p7fVar2 = p7fVar;
                        } else {
                            i5 = i18;
                            p7fVar2 = null;
                        }
                        strM46392k = m46392k(strM82106x, f86436L0, null, map2, g130Var);
                        if (strM46392k != null) {
                            String[] strArrSplit4 = strM46392k.split("x", -1);
                            i12 = Integer.parseInt(strArrSplit4[0]);
                            i11 = Integer.parseInt(strArrSplit4[1]);
                            if (i12 > 0) {
                                i11 = -1;
                                i12 = -1;
                            } else {
                                i11 = -1;
                                i12 = -1;
                            }
                        } else {
                            i11 = -1;
                            i12 = -1;
                        }
                        strM46392k2 = m46392k(strM82106x, f86438M0, null, map2, g130Var);
                        if (strM46392k2 != null) {
                            f = Float.parseFloat(strM46392k2);
                        } else {
                            f = -1.0f;
                        }
                        String strM46392k18 = m46392k(strM82106x, f86440N0, null, map2, g130Var);
                        if (strM46392k18 != null) {
                        }
                        String strM46392k19 = m46392k(strM82106x, pattern3, null, map2, g130Var);
                        String strM46392k110 = m46392k(strM82106x, f86476d, null, map2, g130Var);
                        String strM46392k111 = m46392k(strM82106x, f86479e, null, map2, g130Var);
                        String strM46392k112 = m46392k(strM82106x, f86481f, null, map2, g130Var);
                        String strM46392k113 = m46392k(strM82106x, f86483g, null, map2, g130Var);
                        String strM46392k114 = m46392k(strM82106x, f86446Q0, null, map2, g130Var);
                        if (zStartsWith) {
                            uriM73999D = qvf1.m73999D(string2, m46393l(strM82106x, pattern, map2, g130Var));
                        } else {
                            if (u010Var.m82100r()) {
                                throw ParserException.m753b("#EXT-X-STREAM-INF must be followed by another line");
                            }
                            uriM73999D = qvf1.m73999D(string2, m46394m(u010Var.m82106x(), map2, g130Var));
                        }
                        uri2 = uriM73999D;
                        p300 p300Var3 = new p300();
                        p300Var3.f173513a = Integer.toString(arrayList5.size());
                        p300Var3.f173526n = def0.m35799p("application/x-mpegURL");
                        p300Var3.f173523k = strM46392k9;
                        p300Var3.f173521i = iM46390i2;
                        p300Var3.f173522j = i19;
                        p300Var3.f173534v = i12;
                        p300Var3.f173535w = i11;
                        p300Var3.m68976c(f);
                        p300Var3.f173519g = f2;
                        p300Var3.f173518f = i5;
                        p300Var3.f173500G = p7fVar2;
                        arrayList3 = arrayList5;
                        arrayList3.add(new d130(uri2, new r300(p300Var3), strM46392k110, strM46392k111, strM46392k112, strM46392k113, strM46392k19, strM46392k114));
                        map = map4;
                        arrayList4 = (ArrayList) map.get(uri2);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            map.put(uri2, arrayList4);
                        }
                        arrayList4.add(new s130(iM46390i2, i19, strM46392k110, strM46392k111, strM46392k112, strM46392k113));
                    }
                    z = zContains;
                    z2 = z3;
                }
                HashMap map5 = map;
                arrayList5 = arrayList3;
                map = map5;
                arrayList9 = arrayList13;
                arrayList8 = arrayList29;
                arrayList12 = arrayList30;
                arrayList11 = arrayList11;
                arrayList7 = arrayList7;
                arrayList6 = arrayList6;
                arrayList10 = arrayList10;
            }
            arrayList3 = arrayList5;
            z = zContains;
            z2 = z3;
            HashMap map6 = map;
            arrayList5 = arrayList3;
            map = map6;
            arrayList9 = arrayList13;
            arrayList8 = arrayList29;
            arrayList12 = arrayList30;
            arrayList11 = arrayList11;
            arrayList7 = arrayList7;
            arrayList6 = arrayList6;
            arrayList10 = arrayList10;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m46388g(String str, Pattern pattern, g130 g130Var) {
        Matcher matcherM43320b = g130.m43320b(str, pattern, g130Var);
        if (matcherM43320b.find()) {
            return "YES".equals(matcherM43320b.group(1));
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static double m46389h(String str, Pattern pattern, double d, g130 g130Var) {
        Matcher matcherM43320b = g130.m43320b(str, pattern, g130Var);
        if (!matcherM43320b.find()) {
            return d;
        }
        String strGroup = matcherM43320b.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    /* JADX INFO: renamed from: i */
    public static int m46390i(String str, Pattern pattern, g130 g130Var) {
        Matcher matcherM43320b = g130.m43320b(str, pattern, g130Var);
        if (!matcherM43320b.find()) {
            return -1;
        }
        String strGroup = matcherM43320b.group(1);
        strGroup.getClass();
        return Integer.parseInt(strGroup);
    }

    /* JADX INFO: renamed from: j */
    public static long m46391j(String str, Pattern pattern, g130 g130Var) {
        Matcher matcherM43320b = g130.m43320b(str, pattern, g130Var);
        if (!matcherM43320b.find()) {
            return -1L;
        }
        String strGroup = matcherM43320b.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    /* JADX INFO: renamed from: k */
    public static String m46392k(String str, Pattern pattern, String str2, Map map, g130 g130Var) {
        Matcher matcherM43320b = g130.m43320b(str, pattern, g130Var);
        if (matcherM43320b.find()) {
            str2 = matcherM43320b.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : m46394m(str2, map, g130Var);
    }

    /* JADX INFO: renamed from: l */
    public static String m46393l(String str, Pattern pattern, Map map, g130 g130Var) throws ParserException {
        String strM46392k = m46392k(str, pattern, null, map, g130Var);
        if (strM46392k != null) {
            return strM46392k;
        }
        throw ParserException.m753b("Couldn't match " + pattern.pattern() + " in " + str);
    }

    /* JADX INFO: renamed from: m */
    public static String m46394m(String str, Map map, g130 g130Var) {
        Matcher matcherM43320b = g130.m43320b(str, f86475c2, g130Var);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcherM43320b.find()) {
            String strGroup = matcherM43320b.group(1);
            if (map.containsKey(strGroup)) {
                matcherM43320b.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcherM43320b.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: n */
    public static void m46395n(String str, HashMap map) throws ParserException {
        if (map.containsKey(str)) {
            throw ParserException.m753b("duplicate variable name \"" + str + "\"");
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0049 A[Catch: all -> 0x009b, TryCatch #0 {all -> 0x009b, blocks: (B:3:0x0019, B:5:0x0022, B:7:0x002a, B:10:0x0033, B:31:0x0072, B:33:0x0078, B:36:0x0083, B:38:0x008b, B:43:0x009d, B:45:0x00a5, B:47:0x00ad, B:49:0x00b5, B:51:0x00bd, B:53:0x00c5, B:55:0x00cd, B:57:0x00d5, B:60:0x00de, B:61:0x00e2, B:66:0x0100, B:67:0x0106, B:13:0x003a, B:15:0x0040, B:19:0x0049, B:22:0x0052, B:24:0x005b, B:26:0x0061, B:28:0x0067, B:29:0x006c), top: B:70:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0052 A[Catch: all -> 0x009b, LOOP:2: B:17:0x0046->B:22:0x0052, LOOP_END, TryCatch #0 {all -> 0x009b, blocks: (B:3:0x0019, B:5:0x0022, B:7:0x002a, B:10:0x0033, B:31:0x0072, B:33:0x0078, B:36:0x0083, B:38:0x008b, B:43:0x009d, B:45:0x00a5, B:47:0x00ad, B:49:0x00b5, B:51:0x00bd, B:53:0x00c5, B:55:0x00cd, B:57:0x00d5, B:60:0x00de, B:61:0x00e2, B:66:0x0100, B:67:0x0106, B:13:0x003a, B:15:0x0040, B:19:0x0049, B:22:0x0052, B:24:0x005b, B:26:0x0061, B:28:0x0067, B:29:0x006c), top: B:70:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0051 A[SYNTHETIC] */
    @Override // p204p.v2n0
    /* JADX INFO: renamed from: b */
    public final Object mo30394b(Uri uri, ljo ljoVar) throws ParserException {
        int i;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ljoVar));
        ArrayDeque arrayDeque = new ArrayDeque();
        g130 g130Var = new g130(0.75f, 16, true);
        try {
            int i2 = bufferedReader.read();
            boolean zM46290R = false;
            if (i2 == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    i2 = bufferedReader.read();
                    while (i2 != -1) {
                        i2 = bufferedReader.read();
                    }
                    i = 0;
                    while (true) {
                        if (i < 7) {
                            while (i2 != -1) {
                                i2 = bufferedReader.read();
                            }
                            zM46290R = h0b1.m46290R(i2);
                            break;
                        }
                        if (i2 != "#EXTM3U".charAt(i)) {
                            break;
                            break;
                        }
                        i2 = bufferedReader.read();
                        i++;
                    }
                }
            } else {
                while (i2 != -1 && Character.isWhitespace(i2)) {
                    i2 = bufferedReader.read();
                }
                i = 0;
                while (true) {
                    if (i < 7) {
                        while (i2 != -1 && Character.isWhitespace(i2) && !h0b1.m46290R(i2)) {
                            i2 = bufferedReader.read();
                        }
                        zM46290R = h0b1.m46290R(i2);
                        break;
                    }
                    if (i2 != "#EXTM3U".charAt(i)) {
                        break;
                    }
                    i2 = bufferedReader.read();
                    i++;
                }
            }
            if (!zM46290R) {
                throw ParserException.m753b("Input does not start with the #EXTM3U header.");
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    h0b1.m46313h(bufferedReader);
                    throw ParserException.m753b("Failed to parse the playlist, could not identify any tags.");
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        arrayDeque.add(strTrim);
                        e130 e130VarM46387f = m46387f(new u010(arrayDeque, bufferedReader), uri, g130Var);
                        h0b1.m46313h(bufferedReader);
                        return e130VarM46387f;
                    }
                    if (!strTrim.startsWith("#EXT-X-TARGETDURATION") && !strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") && !strTrim.startsWith("#EXTINF") && !strTrim.startsWith("#EXT-X-KEY") && !strTrim.startsWith("#EXT-X-BYTERANGE") && !strTrim.equals("#EXT-X-DISCONTINUITY") && !strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") && !strTrim.equals("#EXT-X-ENDLIST")) {
                        arrayDeque.add(strTrim);
                    }
                    arrayDeque.add(strTrim);
                    a130 a130VarM46386e = m46386e(this.f86507a, this.f86508b, new u010(arrayDeque, bufferedReader), uri, g130Var);
                    h0b1.m46313h(bufferedReader);
                    return a130VarM46386e;
                }
            }
        } catch (Throwable th) {
            h0b1.m46313h(bufferedReader);
            throw th;
        }
    }

    public h130(e130 e130Var, a130 a130Var) {
        this.f86507a = e130Var;
        this.f86508b = a130Var;
    }
}
