package p204p;

import android.content.res.Resources;
import com.spotify.music.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class hyp {

    /* JADX INFO: renamed from: a */
    public final Resources f96627a;

    /* JADX INFO: renamed from: b */
    public final xre f96628b;

    /* JADX INFO: renamed from: c */
    public final als f96629c;

    /* JADX INFO: renamed from: d */
    public final xbp f96630d;

    /* JADX INFO: renamed from: e */
    public final iaw f96631e;

    /* JADX INFO: renamed from: j */
    public final boolean f96636j;

    /* JADX INFO: renamed from: n */
    public final boolean f96640n;

    /* JADX INFO: renamed from: f */
    public int f96632f = 1;

    /* JADX INFO: renamed from: g */
    public boolean f96633g = false;

    /* JADX INFO: renamed from: h */
    public boolean f96634h = false;

    /* JADX INFO: renamed from: i */
    public boolean f96635i = false;

    /* JADX INFO: renamed from: k */
    public SimpleDateFormat f96637k = null;

    /* JADX INFO: renamed from: l */
    public SimpleDateFormat f96638l = null;

    /* JADX INFO: renamed from: m */
    public y6s0 f96639m = null;

    public hyp(Resources resources, xre xreVar, als alsVar, xbp xbpVar, iaw iawVar, boolean z, boolean z2) {
        this.f96627a = resources;
        this.f96628b = xreVar;
        this.f96629c = alsVar;
        this.f96630d = xbpVar;
        this.f96631e = iawVar;
        this.f96636j = z;
        this.f96640n = z2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX INFO: renamed from: a */
    public final String m49192a() {
        String strM49193b;
        String strM49193b2;
        iaw iawVar = this.f96631e;
        int i = iawVar.f100353b;
        boolean z = this.f96633g;
        int i2 = 0;
        xbp xbpVar = this.f96630d;
        if (!z || this.f96637k == null || this.f96638l == null) {
            strM49193b = z ? m49193b(xbpVar.m90334b(i)) : iawVar.f100352a;
        } else {
            long j = i;
            ((wy3) this.f96628b).getClass();
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = (Calendar) calendar.clone();
            calendar2.setTimeInMillis(1000 * j);
            if (calendar2.get(0) == calendar.get(0) && calendar2.get(1) == calendar.get(1) && calendar2.get(6) == calendar.get(6)) {
                strM49193b2 = m49193b(xbpVar.m90334b(j));
            } else {
                int i3 = calendar.get(6) - calendar2.get(6);
                if (calendar.get(1) == calendar2.get(1) && i3 == 1) {
                    strM49193b2 = m49193b(xbpVar.m90334b(j));
                } else {
                    int i4 = calendar.get(6) - calendar2.get(6);
                    if (calendar.get(1) == calendar2.get(1) && i4 > 0 && i4 <= 7) {
                        strM49193b2 = m49193b(xbpVar.m90334b(j));
                    } else if (calendar.get(1) == calendar2.get(1)) {
                        SimpleDateFormat simpleDateFormat = this.f96637k;
                        wj50.m88279p(simpleDateFormat);
                        strM49193b2 = simpleDateFormat.format(calendar2.getTime());
                        wj50.m88279p(strM49193b2);
                    } else {
                        SimpleDateFormat simpleDateFormat2 = this.f96638l;
                        wj50.m88279p(simpleDateFormat2);
                        strM49193b2 = simpleDateFormat2.format(calendar2.getTime());
                        wj50.m88279p(strM49193b2);
                    }
                }
            }
            strM49193b = m49193b(strM49193b2);
        }
        y6s0 y6s0Var = this.f96639m;
        Resources resources = this.f96627a;
        if (y6s0Var != null) {
            return this.f96634h ? m49196e(y6s0Var) : resources.getString(R.string.subtitle_general_structure, strM49193b, m49196e(y6s0Var));
        }
        Integer num = iawVar.f100355d;
        int iIntValue = num != null ? num.intValue() : -1;
        boolean z2 = iawVar.f100356e;
        boolean z3 = this.f96635i;
        int i5 = iawVar.f100354c;
        if (z2 || iIntValue == 0) {
            i2 = 2;
        } else {
            int i6 = i5 - iIntValue;
            if (iIntValue >= 0 && (z3 || i6 > 0)) {
                i2 = 1;
            }
        }
        return this.f96634h ? m49195d(iIntValue, i2) : resources.getString(R.string.subtitle_general_structure, strM49193b, m49195d(iIntValue, i2));
    }

    /* JADX INFO: renamed from: b */
    public final String m49193b(String str) {
        return this.f96632f == 1 ? str.toUpperCase(Locale.getDefault()) : str;
    }

    /* JADX INFO: renamed from: c */
    public final String m49194c(int i, boolean z) {
        return ((bls) this.f96629c).m29783a(i, new zks(z ? 3 : 4, this.f96632f));
    }

    /* JADX INFO: renamed from: d */
    public final String m49195d(int i, int i2) {
        String strM49194c;
        int i3 = this.f96631e.f100354c;
        boolean z = this.f96640n;
        Resources resources = this.f96627a;
        if (z) {
            boolean z2 = i >= 0 && i < 61;
            if (i3 == i || !this.f96635i) {
                strM49194c = m49194c(i, z2);
            } else if (z2) {
                strM49194c = resources.getString(R.string.subtitle_time_less_than_minute);
                wj50.m88279p(strM49194c);
            } else {
                strM49194c = m49193b(resources.getString(R.string.subtitle_time_left, m49194c(i, false)));
            }
            return this.f96636j ? klh.m56834f(strM49194c, " • ", m49193b(resources.getString(R.string.subtitle_finished))) : strM49194c;
        }
        boolean z3 = this.f96635i;
        boolean z4 = z3 && 1 <= i && i < 61;
        boolean z5 = !z3 && 1 <= i && i < 61;
        if (i2 == 2) {
            return m49193b(resources.getString(R.string.subtitle_finished));
        }
        if (z4) {
            String string = resources.getString(R.string.subtitle_time_less_than_minute);
            wj50.m88279p(string);
            return string;
        }
        if (z5) {
            return m49194c(i, true);
        }
        return i2 == 1 ? m49193b(resources.getString(R.string.subtitle_time_left, m49194c(i, false))) : m49194c(i3, false);
    }

    /* JADX INFO: renamed from: e */
    public final String m49196e(y6s0 y6s0Var) {
        String str;
        boolean z = y6s0Var instanceof x6s0;
        Resources resources = this.f96627a;
        if (z) {
            long j = ((x6s0) y6s0Var).f258746b;
            if (j != 0) {
                uz3 uz3Var = new uz3(2, resources);
                hvi0 hvi0Var = cks.f39079b;
                str = ((sl71) uz3Var.invoke(new cks(jwg1.m54450E(j, ils.MILLISECONDS)))).f210315a;
            } else {
                str = "";
            }
        } else {
            if (!(y6s0Var instanceof w6s0)) {
                throw new NoWhenBranchMatchedException();
            }
            uz3 uz3Var2 = new uz3(1, resources);
            hvi0 hvi0Var2 = cks.f39079b;
            w6s0 w6s0Var = (w6s0) y6s0Var;
            str = ((sl71) uz3Var2.invoke(new cks(jwg1.m54450E(w6s0Var.f248465b - w6s0Var.f248466c, ils.MILLISECONDS)))).f210315a;
        }
        return y6s0Var.mo87307f() ? klh.m56834f(str, " • ", m49193b(resources.getString(R.string.subtitle_finished))) : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hyp)) {
            return false;
        }
        hyp hypVar = (hyp) obj;
        return this.f96627a.equals(hypVar.f96627a) && wj50.m88271j(this.f96628b, hypVar.f96628b) && wj50.m88271j(this.f96629c, hypVar.f96629c) && wj50.m88271j(this.f96630d, hypVar.f96630d) && this.f96631e.equals(hypVar.f96631e) && this.f96632f == hypVar.f96632f && this.f96633g == hypVar.f96633g && this.f96634h == hypVar.f96634h && this.f96635i == hypVar.f96635i && this.f96636j == hypVar.f96636j && wj50.m88271j(this.f96637k, hypVar.f96637k) && wj50.m88271j(this.f96638l, hypVar.f96638l) && wj50.m88271j(this.f96639m, hypVar.f96639m) && this.f96640n == hypVar.f96640n;
    }

    /* JADX INFO: renamed from: f */
    public final hyp m49197f() {
        this.f96633g = true;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final hyp m49198g(String str) {
        this.f96637k = new SimpleDateFormat("d MMM", Locale.getDefault());
        this.f96638l = new SimpleDateFormat(str, Locale.getDefault());
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final hyp m49199h() {
        this.f96632f = 2;
        return this;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(f710.m40938f(this.f96632f, (this.f96631e.hashCode() + ((this.f96630d.hashCode() + ((this.f96629c.hashCode() + ((this.f96628b.hashCode() + (this.f96627a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31), 31, this.f96633g), 31, false), 31, this.f96634h), 31, this.f96635i), 31, this.f96636j), 31, true), 31, false), 31, false);
        SimpleDateFormat simpleDateFormat = this.f96637k;
        int iHashCode = (iM77245d + (simpleDateFormat == null ? 0 : simpleDateFormat.hashCode())) * 31;
        SimpleDateFormat simpleDateFormat2 = this.f96638l;
        int iHashCode2 = (iHashCode + (simpleDateFormat2 == null ? 0 : simpleDateFormat2.hashCode())) * 31;
        y6s0 y6s0Var = this.f96639m;
        return Boolean.hashCode(this.f96640n) + ((iHashCode2 + (y6s0Var != null ? y6s0Var.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i */
    public final hyp m49200i() {
        this.f96634h = false;
        return this;
    }
}
