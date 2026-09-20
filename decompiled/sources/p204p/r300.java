package p204p;

import android.text.TextUtils;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class r300 {

    /* JADX INFO: renamed from: A0 */
    public static final String f195309A0;

    /* JADX INFO: renamed from: B0 */
    public static final String f195310B0;

    /* JADX INFO: renamed from: C0 */
    public static final String f195311C0;

    /* JADX INFO: renamed from: D0 */
    public static final String f195312D0;

    /* JADX INFO: renamed from: E0 */
    public static final String f195313E0;

    /* JADX INFO: renamed from: F0 */
    public static final String f195314F0;

    /* JADX INFO: renamed from: G0 */
    public static final String f195315G0;

    /* JADX INFO: renamed from: H0 */
    public static final String f195316H0;

    /* JADX INFO: renamed from: I0 */
    public static final String f195317I0;

    /* JADX INFO: renamed from: J0 */
    public static final String f195318J0;

    /* JADX INFO: renamed from: K0 */
    public static final String f195319K0;

    /* JADX INFO: renamed from: V */
    public static final r300 f195320V = new r300(new p300());

    /* JADX INFO: renamed from: W */
    public static final String f195321W = Integer.toString(0, 36);

    /* JADX INFO: renamed from: X */
    public static final String f195322X = Integer.toString(1, 36);

    /* JADX INFO: renamed from: Y */
    public static final String f195323Y = Integer.toString(2, 36);

    /* JADX INFO: renamed from: Z */
    public static final String f195324Z = Integer.toString(3, 36);

    /* JADX INFO: renamed from: a0 */
    public static final String f195325a0 = Integer.toString(4, 36);

    /* JADX INFO: renamed from: b0 */
    public static final String f195326b0 = Integer.toString(5, 36);

    /* JADX INFO: renamed from: c0 */
    public static final String f195327c0 = Integer.toString(6, 36);

    /* JADX INFO: renamed from: d0 */
    public static final String f195328d0 = Integer.toString(7, 36);

    /* JADX INFO: renamed from: e0 */
    public static final String f195329e0;

    /* JADX INFO: renamed from: f0 */
    public static final String f195330f0;

    /* JADX INFO: renamed from: g0 */
    public static final String f195331g0;

    /* JADX INFO: renamed from: h0 */
    public static final String f195332h0;

    /* JADX INFO: renamed from: i0 */
    public static final String f195333i0;

    /* JADX INFO: renamed from: j0 */
    public static final String f195334j0;

    /* JADX INFO: renamed from: k0 */
    public static final String f195335k0;

    /* JADX INFO: renamed from: l0 */
    public static final String f195336l0;

    /* JADX INFO: renamed from: m0 */
    public static final String f195337m0;

    /* JADX INFO: renamed from: n0 */
    public static final String f195338n0;

    /* JADX INFO: renamed from: o0 */
    public static final String f195339o0;

    /* JADX INFO: renamed from: p0 */
    public static final String f195340p0;

    /* JADX INFO: renamed from: q0 */
    public static final String f195341q0;

    /* JADX INFO: renamed from: r0 */
    public static final String f195342r0;

    /* JADX INFO: renamed from: s0 */
    public static final String f195343s0;

    /* JADX INFO: renamed from: t0 */
    public static final String f195344t0;

    /* JADX INFO: renamed from: u0 */
    public static final String f195345u0;

    /* JADX INFO: renamed from: v0 */
    public static final String f195346v0;

    /* JADX INFO: renamed from: w0 */
    public static final String f195347w0;

    /* JADX INFO: renamed from: x0 */
    public static final String f195348x0;

    /* JADX INFO: renamed from: y0 */
    public static final String f195349y0;

    /* JADX INFO: renamed from: z0 */
    public static final String f195350z0;

    /* JADX INFO: renamed from: A */
    public final int f195351A;

    /* JADX INFO: renamed from: B */
    public final float f195352B;

    /* JADX INFO: renamed from: C */
    public final int f195353C;

    /* JADX INFO: renamed from: D */
    public final boolean f195354D;

    /* JADX INFO: renamed from: E */
    public final float f195355E;

    /* JADX INFO: renamed from: F */
    public final byte[] f195356F;

    /* JADX INFO: renamed from: G */
    public final int f195357G;

    /* JADX INFO: renamed from: H */
    public final p7f f195358H;

    /* JADX INFO: renamed from: I */
    public final int f195359I;

    /* JADX INFO: renamed from: J */
    public final int f195360J;

    /* JADX INFO: renamed from: K */
    public final int f195361K;

    /* JADX INFO: renamed from: L */
    public final int f195362L;

    /* JADX INFO: renamed from: M */
    public final int f195363M;

    /* JADX INFO: renamed from: N */
    public final int f195364N;

    /* JADX INFO: renamed from: O */
    public final int f195365O;

    /* JADX INFO: renamed from: P */
    public final int f195366P;

    /* JADX INFO: renamed from: Q */
    public final int f195367Q;

    /* JADX INFO: renamed from: R */
    public final int f195368R;

    /* JADX INFO: renamed from: S */
    public final int f195369S;

    /* JADX INFO: renamed from: T */
    public final int f195370T;

    /* JADX INFO: renamed from: U */
    public int f195371U;

    /* JADX INFO: renamed from: a */
    public final String f195372a;

    /* JADX INFO: renamed from: b */
    public final String f195373b;

    /* JADX INFO: renamed from: c */
    public final pf40 f195374c;

    /* JADX INFO: renamed from: d */
    public final String f195375d;

    /* JADX INFO: renamed from: e */
    public final int f195376e;

    /* JADX INFO: renamed from: f */
    public final int f195377f;

    /* JADX INFO: renamed from: g */
    public final float f195378g;

    /* JADX INFO: renamed from: h */
    public final int f195379h;

    /* JADX INFO: renamed from: i */
    public final int f195380i;

    /* JADX INFO: renamed from: j */
    public final int f195381j;

    /* JADX INFO: renamed from: k */
    public final int f195382k;

    /* JADX INFO: renamed from: l */
    public final String f195383l;

    /* JADX INFO: renamed from: m */
    public final j6f0 f195384m;

    /* JADX INFO: renamed from: n */
    public final String f195385n;

    /* JADX INFO: renamed from: o */
    public final String f195386o;

    /* JADX INFO: renamed from: p */
    public final String f195387p;

    /* JADX INFO: renamed from: q */
    public final int f195388q;

    /* JADX INFO: renamed from: r */
    public final int f195389r;

    /* JADX INFO: renamed from: s */
    public final List f195390s;

    /* JADX INFO: renamed from: t */
    public final ahs f195391t;

    /* JADX INFO: renamed from: u */
    public final long f195392u;

    /* JADX INFO: renamed from: v */
    public final boolean f195393v;

    /* JADX INFO: renamed from: w */
    public final int f195394w;

    /* JADX INFO: renamed from: x */
    public final int f195395x;

    /* JADX INFO: renamed from: y */
    public final int f195396y;

    /* JADX INFO: renamed from: z */
    public final int f195397z;

    static {
        Integer.toString(8, 36);
        f195329e0 = Integer.toString(9, 36);
        f195330f0 = Integer.toString(10, 36);
        f195331g0 = Integer.toString(11, 36);
        f195332h0 = Integer.toString(12, 36);
        f195333i0 = Integer.toString(13, 36);
        f195334j0 = Integer.toString(14, 36);
        f195335k0 = Integer.toString(15, 36);
        f195336l0 = Integer.toString(16, 36);
        f195337m0 = Integer.toString(17, 36);
        f195338n0 = Integer.toString(18, 36);
        f195339o0 = Integer.toString(19, 36);
        f195340p0 = Integer.toString(20, 36);
        f195341q0 = Integer.toString(21, 36);
        f195342r0 = Integer.toString(22, 36);
        f195343s0 = Integer.toString(23, 36);
        f195344t0 = Integer.toString(24, 36);
        f195345u0 = Integer.toString(25, 36);
        f195346v0 = Integer.toString(26, 36);
        f195347w0 = Integer.toString(27, 36);
        f195348x0 = Integer.toString(28, 36);
        f195349y0 = Integer.toString(29, 36);
        f195350z0 = Integer.toString(30, 36);
        f195309A0 = Integer.toString(31, 36);
        f195310B0 = Integer.toString(32, 36);
        f195311C0 = Integer.toString(33, 36);
        f195312D0 = Integer.toString(34, 36);
        f195313E0 = Integer.toString(35, 36);
        f195314F0 = Integer.toString(36, 36);
        f195315G0 = Integer.toString(37, 36);
        f195316H0 = Integer.toString(38, 36);
        f195317I0 = Integer.toString(39, 36);
        f195318J0 = Integer.toString(40, 36);
        f195319K0 = Integer.toString(41, 36);
    }

    public r300(p300 p300Var) {
        boolean z;
        String str;
        this.f195372a = p300Var.f173513a;
        String strM46296X = h0b1.m46296X(p300Var.f173516d);
        this.f195375d = strM46296X;
        if (p300Var.f173515c.isEmpty() && p300Var.f173514b != null) {
            this.f195374c = pf40.m69794t(new ee70(strM46296X, p300Var.f173514b));
            this.f195373b = p300Var.f173514b;
        } else if (p300Var.f173515c.isEmpty() || p300Var.f173514b != null) {
            if (!p300Var.f173515c.isEmpty() || p300Var.f173514b != null) {
                int i = 0;
                while (true) {
                    if (i >= p300Var.f173515c.size()) {
                        z = false;
                        break;
                    } else {
                        if (((ee70) p300Var.f173515c.get(i)).f58701b.equals(p300Var.f173514b)) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                }
            } else {
                z = true;
                break;
            }
            c95.m31855u(z);
            this.f195374c = p300Var.f173515c;
            this.f195373b = p300Var.f173514b;
        } else {
            pf40 pf40Var = p300Var.f173515c;
            this.f195374c = pf40Var;
            Iterator it = pf40Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((ee70) pf40Var.get(0)).f58701b;
                    break;
                }
                ee70 ee70Var = (ee70) it.next();
                if (TextUtils.equals(ee70Var.f58700a, strM46296X)) {
                    str = ee70Var.f58701b;
                    break;
                }
            }
            this.f195373b = str;
        }
        this.f195376e = p300Var.f173517e;
        c95.m31856v(p300Var.f173520h == 0 || (p300Var.f173518f & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.f195377f = p300Var.f173518f;
        this.f195378g = p300Var.f173519g;
        this.f195379h = p300Var.f173520h;
        int i2 = p300Var.f173521i;
        this.f195380i = i2;
        int i3 = p300Var.f173522j;
        this.f195381j = i3;
        this.f195382k = i3 != -1 ? i3 : i2;
        this.f195383l = p300Var.f173523k;
        this.f195384m = p300Var.f173524l;
        this.f195385n = p300Var.f173525m;
        this.f195386o = p300Var.f173526n;
        this.f195387p = p300Var.f173527o;
        this.f195388q = p300Var.f173528p;
        this.f195389r = p300Var.f173529q;
        List list = p300Var.f173530r;
        this.f195390s = list == null ? Collections.EMPTY_LIST : list;
        ahs ahsVar = p300Var.f173531s;
        this.f195391t = ahsVar;
        this.f195392u = p300Var.f173532t;
        this.f195393v = p300Var.f173533u;
        this.f195394w = p300Var.f173534v;
        this.f195395x = p300Var.f173535w;
        this.f195396y = p300Var.f173536x;
        this.f195397z = p300Var.f173537y;
        this.f195351A = p300Var.f173538z;
        this.f195352B = p300Var.f173494A;
        int i4 = p300Var.f173495B;
        this.f195353C = i4 == -1 ? 0 : i4;
        this.f195354D = p300Var.f173496C;
        float f = p300Var.f173497D;
        this.f195355E = f == -1.0f ? 1.0f : f;
        this.f195356F = p300Var.f173498E;
        this.f195357G = p300Var.f173499F;
        this.f195358H = p300Var.f173500G;
        this.f195359I = p300Var.f173501H;
        int i5 = p300Var.f173502I;
        this.f195360J = i5;
        int i6 = p300Var.f173503J;
        this.f195361K = i6;
        if (i5 != -1 && i6 != -1) {
            if (!(Integer.bitCount(i6) == i5)) {
                throw new IllegalStateException(vie1.m85638t("channelCount and channelMask are inconsistent. channelCount=%s, channelMask=%s", Integer.valueOf(i5), Integer.valueOf(i6)));
            }
        }
        this.f195362L = p300Var.f173504K;
        this.f195363M = p300Var.f173505L;
        int i7 = p300Var.f173506M;
        this.f195364N = i7 == -1 ? 0 : i7;
        int i8 = p300Var.f173507N;
        this.f195365O = i8 != -1 ? i8 : 0;
        this.f195366P = p300Var.f173508O;
        this.f195367Q = p300Var.f173509P;
        this.f195368R = p300Var.f173510Q;
        this.f195369S = p300Var.f173511R;
        int i9 = p300Var.f173512S;
        if (i9 != 0 || ahsVar == null) {
            this.f195370T = i9;
        } else {
            this.f195370T = 1;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m74563e(r300 r300Var) {
        float f;
        int i;
        String str;
        String strM75190h;
        String str2;
        if (r300Var == null) {
            return "null";
        }
        int i2 = r300Var.f195376e;
        pf40 pf40Var = r300Var.f195374c;
        String str3 = r300Var.f195375d;
        int i3 = r300Var.f195362L;
        int i4 = r300Var.f195361K;
        int i5 = r300Var.f195360J;
        int i6 = r300Var.f195359I;
        int i7 = r300Var.f195353C;
        float f2 = r300Var.f195352B;
        int i8 = r300Var.f195396y;
        p7f p7fVar = r300Var.f195358H;
        float f3 = r300Var.f195355E;
        int i9 = r300Var.f195351A;
        int i10 = r300Var.f195397z;
        int i11 = r300Var.f195395x;
        int i12 = r300Var.f195394w;
        ahs ahsVar = r300Var.f195391t;
        String str4 = r300Var.f195383l;
        float f4 = r300Var.f195378g;
        int i13 = r300Var.f195382k;
        String str5 = r300Var.f195385n;
        String str6 = r300Var.f195386o;
        int i14 = r300Var.f195377f;
        bk60 bk60Var = new bk60(String.valueOf(','));
        StringBuilder sbM36620t = dq60.m36620t("id=");
        sbM36620t.append(r300Var.f195372a);
        sbM36620t.append(", mimeType=");
        sbM36620t.append(r300Var.f195387p);
        if (str6 != null) {
            sbM36620t.append(", container=");
            sbM36620t.append(str6);
        }
        if (str5 != null) {
            sbM36620t.append(", primaryGroupId=");
            sbM36620t.append(str5);
        }
        if (i13 != -1) {
            sbM36620t.append(", bitrate=");
            sbM36620t.append(i13);
        }
        float f5 = -1.0f;
        if (f4 != -1.0f) {
            sbM36620t.append(", selectionPriority=");
            sbM36620t.append(f4);
        }
        if (str4 != null) {
            sbM36620t.append(", codecs=");
            sbM36620t.append(str4);
        }
        if (ahsVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i15 = 0;
            while (i15 < ahsVar.f15762d) {
                UUID uuid = ahsVar.f15759a[i15].f282701b;
                if (uuid.equals(mva.f147546c)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(mva.f147547d)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(mva.f147549f)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(mva.f147548e)) {
                    linkedHashSet.add("widevine");
                } else {
                    if (uuid.equals(mva.f147545b)) {
                        linkedHashSet.add("universal");
                    } else {
                        linkedHashSet.add("unknown (" + uuid + ")");
                    }
                    i15++;
                    f5 = f5;
                }
                i15++;
                f5 = f5;
            }
            f = f5;
            sbM36620t.append(", drm=[");
            bk60Var.m29644b(sbM36620t, linkedHashSet.iterator());
            sbM36620t.append(']');
        } else {
            f = -1.0f;
        }
        if (i12 != -1 && i11 != -1) {
            sbM36620t.append(", res=");
            sbM36620t.append(i12);
            sbM36620t.append("x");
            sbM36620t.append(i11);
        }
        if (i10 != -1 && i9 != -1) {
            sbM36620t.append(", decRes=");
            sbM36620t.append(i10);
            sbM36620t.append("x");
            sbM36620t.append(i9);
        }
        double d = f3;
        int i16 = f2s.f65260a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            sbM36620t.append(", par=");
            Object[] objArr = {Float.valueOf(f3)};
            String str7 = h0b1.f86200a;
            sbM36620t.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (p7fVar != null) {
            int i17 = p7fVar.f174680f;
            int i18 = p7fVar.f174679e;
            if ((i18 != -1 && i17 != -1) || p7fVar.m69264f()) {
                sbM36620t.append(", color=");
                if (p7fVar.m69264f()) {
                    String strM69256c = p7f.m69256c(p7fVar.f174675a);
                    String strM69255b = p7f.m69255b(p7fVar.f174676b);
                    String strM69258e = p7f.m69258e(p7fVar.f174677c);
                    String str8 = h0b1.f86200a;
                    Locale locale = Locale.US;
                    strM75190h = rbz.m75190h(strM69256c, "/", strM69255b, "/", strM69258e);
                } else {
                    strM75190h = "NA/NA/NA";
                }
                if (i18 == -1 || i17 == -1) {
                    str2 = "NA/NA";
                } else {
                    str2 = i18 + "/" + i17;
                }
                sbM36620t.append(strM75190h + "/" + str2);
            }
        }
        if (i8 != -1) {
            sbM36620t.append(", pixelFormat=");
            sbM36620t.append(i8);
        }
        if (f2 != f) {
            sbM36620t.append(", fps=");
            sbM36620t.append(f2);
        }
        if (i7 != 0) {
            sbM36620t.append(", rotation=");
            sbM36620t.append(i7);
        }
        if (r300Var.f195354D) {
            sbM36620t.append(", mirrorHorizontal");
        }
        if (i6 != -1) {
            sbM36620t.append(", maxSubLayers=");
            sbM36620t.append(i6);
        }
        if (i5 != -1) {
            sbM36620t.append(", channels=");
            sbM36620t.append(i5);
        }
        if (i4 != -1) {
            sbM36620t.append(", channel_mask=");
            sbM36620t.append(i4);
        }
        if (i3 != -1) {
            sbM36620t.append(", sample_rate=");
            sbM36620t.append(i3);
        }
        if (str3 != null) {
            sbM36620t.append(", language=");
            sbM36620t.append(str3);
        }
        if (!pf40Var.isEmpty()) {
            sbM36620t.append(", labels=[");
            bk60Var.m29644b(sbM36620t, pmf0.m70314D(pf40Var, new qg9(6)).iterator());
            sbM36620t.append("]");
        }
        if (i2 != 0) {
            sbM36620t.append(", selectionFlags=[");
            String str9 = h0b1.f86200a;
            ArrayList arrayList = new ArrayList();
            if ((i2 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i2 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i2 & 2) != 0) {
                arrayList.add("forced");
            }
            bk60Var.m29644b(sbM36620t, arrayList.iterator());
            sbM36620t.append("]");
        }
        if (i14 != 0) {
            sbM36620t.append(", roleFlags=[");
            String str10 = h0b1.f86200a;
            ArrayList arrayList2 = new ArrayList();
            if ((i14 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i14 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i14 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i14 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i14 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i14 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i14 & 64) != 0) {
                arrayList2.add("caption");
            }
            i = i14;
            if ((i & 128) != 0) {
                arrayList2.add(ContextTrack.Metadata.KEY_SUBTITLE);
            }
            if ((i & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            bk60Var.m29644b(sbM36620t, arrayList2.iterator());
            sbM36620t.append("]");
        } else {
            i = i14;
        }
        if ((i & 32768) != 0) {
            sbM36620t.append(", auxiliaryTrackType=");
            int i19 = r300Var.f195379h;
            String str11 = h0b1.f86200a;
            if (i19 == 0) {
                str = "undefined";
            } else if (i19 == 1) {
                str = "original";
            } else if (i19 == 2) {
                str = "depth-linear";
            } else if (i19 == 3) {
                str = "depth-inverse";
            } else {
                if (i19 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sbM36620t.append(str);
        }
        return sbM36620t.toString();
    }

    /* JADX INFO: renamed from: a */
    public final p300 m74564a() {
        p300 p300Var = new p300();
        p300Var.f173513a = this.f195372a;
        p300Var.f173514b = this.f195373b;
        p300Var.f173515c = this.f195374c;
        p300Var.f173516d = this.f195375d;
        p300Var.f173517e = this.f195376e;
        p300Var.f173518f = this.f195377f;
        p300Var.f173519g = this.f195378g;
        p300Var.f173521i = this.f195380i;
        p300Var.f173522j = this.f195381j;
        p300Var.f173523k = this.f195383l;
        p300Var.f173524l = this.f195384m;
        p300Var.f173525m = this.f195385n;
        p300Var.f173526n = this.f195386o;
        p300Var.f173527o = this.f195387p;
        p300Var.f173528p = this.f195388q;
        p300Var.f173529q = this.f195389r;
        p300Var.f173530r = this.f195390s;
        p300Var.f173531s = this.f195391t;
        p300Var.f173532t = this.f195392u;
        p300Var.f173533u = this.f195393v;
        p300Var.f173534v = this.f195394w;
        p300Var.f173535w = this.f195395x;
        p300Var.f173536x = this.f195396y;
        p300Var.f173537y = this.f195397z;
        p300Var.f173538z = this.f195351A;
        p300Var.f173494A = this.f195352B;
        p300Var.f173495B = this.f195353C;
        p300Var.f173496C = this.f195354D;
        p300Var.f173497D = this.f195355E;
        p300Var.f173498E = this.f195356F;
        p300Var.f173499F = this.f195357G;
        p300Var.f173500G = this.f195358H;
        p300Var.f173501H = this.f195359I;
        p300Var.f173502I = this.f195360J;
        p300Var.f173503J = this.f195361K;
        p300Var.f173504K = this.f195362L;
        p300Var.f173505L = this.f195363M;
        p300Var.f173506M = this.f195364N;
        p300Var.f173507N = this.f195365O;
        p300Var.f173508O = this.f195366P;
        p300Var.f173509P = this.f195367Q;
        p300Var.f173510Q = this.f195368R;
        p300Var.f173511R = this.f195369S;
        p300Var.f173512S = this.f195370T;
        return p300Var;
    }

    /* JADX INFO: renamed from: b */
    public final r300 m74565b(int i) {
        p300 p300VarM74564a = m74564a();
        p300VarM74564a.f173512S = i;
        return new r300(p300VarM74564a);
    }

    /* JADX INFO: renamed from: c */
    public final int m74566c() {
        int i;
        int i2 = this.f195394w;
        if (i2 == -1 || (i = this.f195395x) == -1) {
            return -1;
        }
        return i2 * i;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m74567d(r300 r300Var) {
        List list = this.f195390s;
        if (list.size() != r300Var.f195390s.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) r300Var.f195390s.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || r300.class != obj.getClass()) {
            return false;
        }
        r300 r300Var = (r300) obj;
        int i2 = this.f195371U;
        if ((i2 != 0 && (i = r300Var.f195371U) != 0 && i2 != i) || this.f195376e != r300Var.f195376e || this.f195377f != r300Var.f195377f || this.f195379h != r300Var.f195379h || this.f195380i != r300Var.f195380i || this.f195381j != r300Var.f195381j || this.f195388q != r300Var.f195388q || this.f195392u != r300Var.f195392u || this.f195394w != r300Var.f195394w || this.f195395x != r300Var.f195395x || this.f195396y != r300Var.f195396y || this.f195397z != r300Var.f195397z || this.f195351A != r300Var.f195351A || this.f195353C != r300Var.f195353C || this.f195354D != r300Var.f195354D || this.f195357G != r300Var.f195357G || this.f195359I != r300Var.f195359I || this.f195360J != r300Var.f195360J || this.f195361K != r300Var.f195361K || this.f195362L != r300Var.f195362L || this.f195363M != r300Var.f195363M || this.f195364N != r300Var.f195364N || this.f195365O != r300Var.f195365O || this.f195366P != r300Var.f195366P || this.f195368R != r300Var.f195368R || this.f195369S != r300Var.f195369S || this.f195370T != r300Var.f195370T || Float.compare(this.f195352B, r300Var.f195352B) != 0 || Float.compare(this.f195378g, r300Var.f195378g) != 0 || Float.compare(this.f195355E, r300Var.f195355E) != 0 || !Objects.equals(this.f195372a, r300Var.f195372a) || !Objects.equals(this.f195373b, r300Var.f195373b)) {
            return false;
        }
        pf40 pf40Var = r300Var.f195374c;
        pf40 pf40Var2 = this.f195374c;
        pf40Var2.getClass();
        return pmf0.m70330p(pf40Var2, pf40Var) && Objects.equals(this.f195383l, r300Var.f195383l) && Objects.equals(this.f195385n, r300Var.f195385n) && Objects.equals(this.f195386o, r300Var.f195386o) && Objects.equals(this.f195387p, r300Var.f195387p) && Objects.equals(this.f195375d, r300Var.f195375d) && Arrays.equals(this.f195356F, r300Var.f195356F) && Objects.equals(this.f195384m, r300Var.f195384m) && Objects.equals(this.f195358H, r300Var.f195358H) && Objects.equals(this.f195391t, r300Var.f195391t) && m74567d(r300Var);
    }

    /* JADX INFO: renamed from: f */
    public final r300 m74568f(r300 r300Var) {
        String str;
        pf40 pf40Var;
        String str2;
        int i;
        float f;
        if (this == r300Var) {
            return this;
        }
        int iM35792i = def0.m35792i(this.f195387p);
        String str3 = r300Var.f195372a;
        j6f0 j6f0VarM52574b = r300Var.f195384m;
        pf40 pf40Var2 = r300Var.f195374c;
        float f2 = r300Var.f195378g;
        int i2 = r300Var.f195368R;
        int i3 = r300Var.f195369S;
        String str4 = r300Var.f195373b;
        if (str4 == null) {
            str4 = this.f195373b;
        }
        if (pf40Var2.isEmpty()) {
            pf40Var2 = this.f195374c;
        }
        if ((iM35792i != 3 && iM35792i != 1) || (str = r300Var.f195375d) == null) {
            str = this.f195375d;
        }
        int i4 = this.f195380i;
        if (i4 == -1) {
            i4 = r300Var.f195380i;
        }
        int i5 = this.f195381j;
        if (i5 == -1) {
            i5 = r300Var.f195381j;
        }
        String str5 = this.f195383l;
        if (str5 == null) {
            String strM46274B = h0b1.m46274B(iM35792i, r300Var.f195383l);
            pf40Var = pf40Var2;
            if (h0b1.m46318j0(strM46274B).length == 1) {
                str5 = strM46274B;
            }
        } else {
            pf40Var = pf40Var2;
        }
        String str6 = this.f195385n;
        if (str6 == null) {
            str6 = r300Var.f195385n;
        }
        j6f0 j6f0Var = this.f195384m;
        if (j6f0Var != null) {
            j6f0VarM52574b = j6f0Var.m52574b(j6f0VarM52574b);
        }
        float f3 = this.f195352B;
        if (f3 == -1.0f && iM35792i == 2) {
            f3 = r300Var.f195352B;
        }
        int i6 = this.f195376e | r300Var.f195376e;
        int i7 = this.f195377f | r300Var.f195377f;
        ahs ahsVar = r300Var.f195391t;
        ArrayList arrayList = new ArrayList();
        if (ahsVar != null) {
            String str7 = ahsVar.f15761c;
            zgs[] zgsVarArr = ahsVar.f15759a;
            int length = zgsVarArr.length;
            int i8 = 0;
            while (i8 < length) {
                int i9 = i8;
                zgs zgsVar = zgsVarArr[i9];
                int i10 = length;
                if (zgsVar.f282704e != null) {
                    arrayList.add(zgsVar);
                }
                i8 = i9 + 1;
                length = i10;
            }
            str2 = str7;
        } else {
            str2 = null;
        }
        ahs ahsVar2 = this.f195391t;
        if (ahsVar2 != null) {
            if (str2 == null) {
                str2 = ahsVar2.f15761c;
            }
            int size = arrayList.size();
            zgs[] zgsVarArr2 = ahsVar2.f15759a;
            String str8 = str2;
            int length2 = zgsVarArr2.length;
            int i11 = 0;
            while (i11 < length2) {
                int i12 = i11;
                zgs zgsVar2 = zgsVarArr2[i12];
                int i13 = length2;
                if (zgsVar2.f282704e != null) {
                    UUID uuid = zgsVar2.f282701b;
                    f = f3;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size) {
                            i = size;
                            arrayList.add(zgsVar2);
                            break;
                        }
                        i = size;
                        if (((zgs) arrayList.get(i14)).f282701b.equals(uuid)) {
                            break;
                        }
                        i14++;
                        size = i;
                    }
                } else {
                    i = size;
                    f = f3;
                }
                i11 = i12 + 1;
                length2 = i13;
                f3 = f;
                size = i;
            }
            str2 = str8;
        }
        float f4 = f3;
        ahs ahsVar3 = arrayList.isEmpty() ? null : new ahs(str2, false, (zgs[]) arrayList.toArray(new zgs[0]));
        p300 p300VarM74564a = m74564a();
        p300VarM74564a.f173513a = str3;
        p300VarM74564a.f173514b = str4;
        p300VarM74564a.f173515c = pf40.m69791p(pf40Var);
        p300VarM74564a.f173516d = str;
        p300VarM74564a.f173517e = i6;
        p300VarM74564a.f173518f = i7;
        p300VarM74564a.f173519g = f2;
        p300VarM74564a.f173521i = i4;
        p300VarM74564a.f173522j = i5;
        p300VarM74564a.f173523k = str5;
        p300VarM74564a.f173524l = j6f0VarM52574b;
        p300VarM74564a.f173525m = str6;
        p300VarM74564a.f173531s = ahsVar3;
        p300VarM74564a.m68976c(f4);
        p300VarM74564a.f173510Q = i2;
        p300VarM74564a.f173511R = i3;
        return new r300(p300VarM74564a);
    }

    public final int hashCode() {
        if (this.f195371U == 0) {
            String str = this.f195372a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f195373b;
            int iHashCode2 = (this.f195374c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.f195375d;
            int iFloatToIntBits = (((((((Float.floatToIntBits(this.f195378g) + ((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f195376e) * 31) + this.f195377f) * 31)) * 31) + this.f195379h) * 31) + this.f195380i) * 31) + this.f195381j) * 31;
            String str4 = this.f195383l;
            int iHashCode3 = (iFloatToIntBits + (str4 == null ? 0 : str4.hashCode())) * 31;
            j6f0 j6f0Var = this.f195384m;
            int iHashCode4 = (iHashCode3 + (j6f0Var == null ? 0 : j6f0Var.hashCode())) * 961;
            String str5 = this.f195385n;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f195386o;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f195387p;
            this.f195371U = ((((((((((((((((((((((((Float.floatToIntBits(this.f195355E) + ((((((Float.floatToIntBits(this.f195352B) + ((((((((((((((((iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.f195388q) * 31) + ((int) this.f195392u)) * 31) + this.f195394w) * 31) + this.f195395x) * 31) + this.f195396y) * 31) + this.f195397z) * 31) + this.f195351A) * 31)) * 31) + this.f195353C) * 31) + (this.f195354D ? 1 : 0)) * 31)) * 31) + this.f195357G) * 31) + this.f195359I) * 31) + this.f195360J) * 31) + this.f195361K) * 31) + this.f195362L) * 31) + this.f195363M) * 31) + this.f195364N) * 31) + this.f195365O) * 31) + this.f195366P) * 31) + this.f195368R) * 31) + this.f195369S) * 31) + this.f195370T;
        }
        return this.f195371U;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f195372a);
        sb.append(", ");
        sb.append(this.f195373b);
        sb.append(", ");
        sb.append(this.f195386o);
        sb.append(", ");
        sb.append(this.f195387p);
        sb.append(", ");
        sb.append(this.f195383l);
        sb.append(", ");
        sb.append(this.f195382k);
        sb.append(", ");
        sb.append(this.f195375d);
        sb.append(", [");
        sb.append(this.f195394w);
        sb.append(", ");
        sb.append(this.f195395x);
        sb.append(", ");
        sb.append(this.f195352B);
        sb.append(", ");
        sb.append(this.f195358H);
        sb.append("], [");
        sb.append(this.f195360J);
        sb.append(", ");
        sb.append(this.f195361K);
        sb.append(", ");
        return klh.m56832d(this.f195362L, "])", sb);
    }
}
