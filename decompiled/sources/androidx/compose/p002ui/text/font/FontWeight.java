package androidx.compose.p002ui.text.font;

import com.spotify.concertcampaignview.p047v1.CtaType;
import java.util.List;
import p204p.edb;
import p204p.h6f;
import p204p.nt40;
import p204p.wj50;

/* JADX INFO: loaded from: classes.dex */
public final class FontWeight implements Comparable {

    /* JADX INFO: renamed from: L0 */
    public static final FontWeight f518L0;

    /* JADX INFO: renamed from: M0 */
    public static final FontWeight f519M0;

    /* JADX INFO: renamed from: N0 */
    public static final List f520N0;

    /* JADX INFO: renamed from: X */
    public static final FontWeight f521X;

    /* JADX INFO: renamed from: Y */
    public static final FontWeight f522Y;

    /* JADX INFO: renamed from: Z */
    public static final FontWeight f523Z;

    /* JADX INFO: renamed from: b */
    public static final FontWeight f524b;

    /* JADX INFO: renamed from: c */
    public static final FontWeight f525c;

    /* JADX INFO: renamed from: d */
    public static final FontWeight f526d;

    /* JADX INFO: renamed from: e */
    public static final FontWeight f527e;

    /* JADX INFO: renamed from: f */
    public static final FontWeight f528f;

    /* JADX INFO: renamed from: g */
    public static final FontWeight f529g;

    /* JADX INFO: renamed from: h */
    public static final FontWeight f530h;

    /* JADX INFO: renamed from: i */
    public static final FontWeight f531i;

    /* JADX INFO: renamed from: t */
    public static final FontWeight f532t;

    /* JADX INFO: renamed from: a */
    public final int f533a;

    static {
        FontWeight fontWeight = new FontWeight(100);
        FontWeight fontWeight2 = new FontWeight(200);
        FontWeight fontWeight3 = new FontWeight(300);
        FontWeight fontWeight4 = new FontWeight(400);
        f524b = fontWeight4;
        FontWeight fontWeight5 = new FontWeight(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER);
        f525c = fontWeight5;
        FontWeight fontWeight6 = new FontWeight(CtaType.BUY_TICKETS_FIELD_NUMBER);
        f526d = fontWeight6;
        FontWeight fontWeight7 = new FontWeight(CtaType.SEE_ALL_SHOWS_FIELD_NUMBER);
        f527e = fontWeight7;
        FontWeight fontWeight8 = new FontWeight(CtaType.CTA_SHARE_FIELD_NUMBER);
        f528f = fontWeight8;
        FontWeight fontWeight9 = new FontWeight(900);
        f529g = fontWeight;
        f530h = fontWeight2;
        f531i = fontWeight3;
        f532t = fontWeight4;
        f521X = fontWeight5;
        f522Y = fontWeight6;
        f523Z = fontWeight7;
        f518L0 = fontWeight8;
        f519M0 = fontWeight9;
        f520N0 = h6f.m46715L(fontWeight, fontWeight2, fontWeight3, fontWeight4, fontWeight5, fontWeight6, fontWeight7, fontWeight8, fontWeight9);
    }

    public FontWeight(int i) {
        this.f533a = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        nt40.m65597a("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(FontWeight fontWeight) {
        return wj50.m88282u(this.f533a, fontWeight.f533a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FontWeight) {
            return this.f533a == ((FontWeight) obj).f533a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f533a;
    }

    public final String toString() {
        return edb.m38567p(new StringBuilder("FontWeight(weight="), this.f533a, ')');
    }
}
