package p204p;

import android.os.SystemClock;
import androidx.media3.common.PlaybackException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class lb21 {

    /* JADX INFO: renamed from: A */
    public final int f131493A;

    /* JADX INFO: renamed from: B */
    public final int f131494B;

    /* JADX INFO: renamed from: C */
    public final jb21 f131495C;

    /* JADX INFO: renamed from: D */
    public final jb21 f131496D;

    /* JADX INFO: renamed from: E */
    public final f77 f131497E;

    /* JADX INFO: renamed from: F */
    public final jb21 f131498F;

    /* JADX INFO: renamed from: G */
    public final f77 f131499G;

    /* JADX INFO: renamed from: H */
    public final int f131500H;

    /* JADX INFO: renamed from: I */
    public final boolean f131501I;

    /* JADX INFO: renamed from: a */
    public final b7p0 f131502a;

    /* JADX INFO: renamed from: b */
    public final boolean f131503b;

    /* JADX INFO: renamed from: c */
    public final int f131504c;

    /* JADX INFO: renamed from: d */
    public final int f131505d;

    /* JADX INFO: renamed from: e */
    public final PlaybackException f131506e;

    /* JADX INFO: renamed from: f */
    public final int f131507f;

    /* JADX INFO: renamed from: g */
    public final boolean f131508g;

    /* JADX INFO: renamed from: h */
    public final long f131509h;

    /* JADX INFO: renamed from: i */
    public final long f131510i;

    /* JADX INFO: renamed from: j */
    public final long f131511j;

    /* JADX INFO: renamed from: k */
    public final h1p0 f131512k;

    /* JADX INFO: renamed from: l */
    public final dr81 f131513l;

    /* JADX INFO: renamed from: m */
    public final xs6 f131514m;

    /* JADX INFO: renamed from: n */
    public final float f131515n;

    /* JADX INFO: renamed from: o */
    public final float f131516o;

    /* JADX INFO: renamed from: p */
    public final k9c1 f131517p;

    /* JADX INFO: renamed from: q */
    public final o0m f131518q;

    /* JADX INFO: renamed from: r */
    public final x6r f131519r;

    /* JADX INFO: renamed from: s */
    public final int f131520s;

    /* JADX INFO: renamed from: t */
    public final di21 f131521t;

    /* JADX INFO: renamed from: u */
    public final j6f0 f131522u;

    /* JADX INFO: renamed from: v */
    public final qp71 f131523v;

    /* JADX INFO: renamed from: w */
    public final tt81 f131524w;

    /* JADX INFO: renamed from: x */
    public final phd0 f131525x;

    /* JADX INFO: renamed from: y */
    public final phd0 f131526y;

    /* JADX INFO: renamed from: z */
    public final int f131527z;

    public lb21(kb21 kb21Var) {
        int i;
        tt81 tt81Var = kb21Var.f121070x;
        jb21 f77Var = kb21Var.f121041E;
        phd0 phd0Var = kb21Var.f121071y;
        boolean z = false;
        if (kb21Var.f121069w.m73436p()) {
            int i2 = kb21Var.f121050d;
            c95.m31844j(i2 == 1 || i2 == 4, "Empty playlist only allowed in STATE_IDLE or STATE_ENDED");
            c95.m31844j(kb21Var.f121038B == -1 && kb21Var.f121039C == -1, "Ads not allowed if playlist is empty");
            tt81Var = tt81Var == null ? tt81.f223553b : tt81Var;
            if (phd0Var == null) {
                phd0Var = phd0.f177558M;
            }
        } else {
            int i3 = kb21Var.f121037A;
            if (i3 == -1) {
                i = 0;
            } else {
                c95.m31844j(i3 < kb21Var.f121069w.mo26655o(), "currentMediaItemIndex must be less than playlist.size()");
                i = i3;
            }
            if (kb21Var.f121038B != -1) {
                bp71 bp71Var = new bp71();
                mp71 mp71Var = new mp71();
                Long l = kb21Var.f121040D;
                long jLongValue = l != null ? l.longValue() : f77Var.get();
                qp71 qp71Var = kb21Var.f121069w;
                kb21Var.f121069w.mo26651f(qp71Var.mo26650b(qp71Var.m73433i(mp71Var, bp71Var, i, h0b1.m46295W(jLongValue)).first), bp71Var, false);
                c95.m31844j(kb21Var.f121038B < bp71Var.f29349g.f126094a, "PeriodData has less ad groups than adGroupIndex");
                int i4 = bp71Var.f29349g.m57289a(kb21Var.f121038B).f94879b;
                if (i4 != -1) {
                    c95.m31844j(kb21Var.f121039C < i4, "Ad group has less ads than adIndexInGroupIndex");
                }
            }
            pf40 pf40Var = kb21Var.f121068v;
            if (pf40Var != null) {
                eb21 eb21Var = (eb21) pf40Var.get(i);
                tt81 tt81Var2 = eb21Var.f57785b;
                phd0Var = eb21Var.f57787d;
                tt81Var = tt81Var2;
            }
            if (phd0Var == null) {
                ufd0 ufd0Var = kb21Var.f121069w.mo26654n(i, new mp71(), 0L).f145928c;
                tt81Var.getClass();
                nhd0 nhd0Var = new nhd0();
                pf40 pf40Var2 = tt81Var.f223555a;
                int size = pf40Var2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    st81 st81Var = (st81) pf40Var2.get(i5);
                    for (int i6 = 0; i6 < st81Var.f213853a; i6++) {
                        if (st81Var.f213857e[i6]) {
                            r300 r300Var = st81Var.f213854b.f122102d[i6];
                            if (r300Var.f195384m != null) {
                                int i7 = 0;
                                while (true) {
                                    s5f0[] s5f0VarArr = r300Var.f195384m.f109303a;
                                    if (i7 < s5f0VarArr.length) {
                                        s5f0VarArr[i7].mo35404b(nhd0Var);
                                        i7++;
                                    }
                                }
                            }
                        }
                    }
                }
                nhd0Var.m64471b(ufd0Var.f229765d);
                phd0Var = new phd0(nhd0Var);
                z = true;
            } else {
                z = false;
            }
        }
        if (kb21Var.f121051e != null) {
            c95.m31844j(kb21Var.f121050d == 1, "Player error only allowed in STATE_IDLE");
        }
        if (kb21Var.f121050d != 1) {
        }
        Long l2 = kb21Var.f121040D;
        if (l2 != null) {
            if (kb21Var.f121038B == -1 && kb21Var.f121048b && kb21Var.f121050d == 3 && l2.longValue() != -9223372036854775807L) {
                final long jLongValue2 = kb21Var.f121040D.longValue();
                final float f = kb21Var.f121057k.f86674a;
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                f77Var = new jb21() { // from class: p.ib21
                    @Override // p204p.jb21
                    public final long get() {
                        return jLongValue2 + ((long) ((SystemClock.elapsedRealtime() - jElapsedRealtime) * f));
                    }
                };
            } else {
                f77Var = new f77(kb21Var.f121040D.longValue());
            }
        }
        jb21 jb21Var = kb21Var.f121042F;
        this.f131502a = kb21Var.f121047a;
        this.f131503b = kb21Var.f121048b;
        this.f131504c = kb21Var.f121049c;
        this.f131505d = kb21Var.f121050d;
        this.f131506e = kb21Var.f121051e;
        this.f131507f = kb21Var.f121052f;
        this.f131508g = kb21Var.f121053g;
        this.f131509h = kb21Var.f121054h;
        this.f131510i = kb21Var.f121055i;
        this.f131511j = kb21Var.f121056j;
        this.f131512k = kb21Var.f121057k;
        this.f131513l = kb21Var.f121058l;
        this.f131514m = kb21Var.f121059m;
        this.f131515n = kb21Var.f121060n;
        this.f131516o = kb21Var.f121061o;
        this.f131517p = kb21Var.f121062p;
        this.f131518q = kb21Var.f121063q;
        this.f131519r = kb21Var.f121064r;
        this.f131520s = kb21Var.f121065s;
        this.f131521t = kb21Var.f121066t;
        this.f131522u = kb21Var.f121067u;
        this.f131523v = kb21Var.f121069w;
        tt81Var.getClass();
        this.f131524w = tt81Var;
        this.f131525x = phd0Var;
        this.f131526y = kb21Var.f121072z;
        this.f131527z = kb21Var.f121037A;
        this.f131493A = kb21Var.f121038B;
        this.f131494B = kb21Var.f121039C;
        this.f131495C = f77Var;
        this.f131496D = jb21Var;
        this.f131497E = kb21Var.f121043G;
        this.f131498F = kb21Var.f121044H;
        this.f131499G = kb21Var.f121045I;
        this.f131500H = kb21Var.f121046J;
        this.f131501I = z;
    }

    /* JADX INFO: renamed from: a */
    public final kb21 m58593a() {
        kb21 kb21Var = new kb21();
        kb21Var.f121047a = this.f131502a;
        kb21Var.f121048b = this.f131503b;
        kb21Var.f121049c = this.f131504c;
        kb21Var.f121050d = this.f131505d;
        kb21Var.f121051e = this.f131506e;
        kb21Var.f121052f = this.f131507f;
        kb21Var.f121053g = this.f131508g;
        kb21Var.f121054h = this.f131509h;
        kb21Var.f121055i = this.f131510i;
        kb21Var.f121056j = this.f131511j;
        kb21Var.f121057k = this.f131512k;
        kb21Var.f121058l = this.f131513l;
        kb21Var.f121059m = this.f131514m;
        kb21Var.f121060n = this.f131515n;
        kb21Var.f121061o = this.f131516o;
        kb21Var.f121062p = this.f131517p;
        kb21Var.f121063q = this.f131518q;
        kb21Var.f121064r = this.f131519r;
        kb21Var.f121065s = this.f131520s;
        kb21Var.f121066t = this.f131521t;
        kb21Var.f121067u = this.f131522u;
        qp71 qp71Var = this.f131523v;
        kb21Var.f121069w = qp71Var;
        if (qp71Var instanceof hb21) {
            kb21Var.f121068v = ((hb21) qp71Var).f89368e;
        } else {
            kb21Var.f121070x = this.f131524w;
            kb21Var.f121071y = this.f131501I ? null : this.f131525x;
        }
        kb21Var.f121072z = this.f131526y;
        kb21Var.f121037A = this.f131527z;
        kb21Var.f121038B = this.f131493A;
        kb21Var.f121039C = this.f131494B;
        kb21Var.f121040D = null;
        kb21Var.f121041E = this.f131495C;
        kb21Var.f121042F = this.f131496D;
        kb21Var.f121043G = this.f131497E;
        kb21Var.f121044H = this.f131498F;
        kb21Var.f121045I = this.f131499G;
        kb21Var.f121046J = this.f131500H;
        return kb21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb21)) {
            return false;
        }
        lb21 lb21Var = (lb21) obj;
        return this.f131503b == lb21Var.f131503b && this.f131504c == lb21Var.f131504c && this.f131502a.equals(lb21Var.f131502a) && this.f131505d == lb21Var.f131505d && Objects.equals(this.f131506e, lb21Var.f131506e) && this.f131507f == lb21Var.f131507f && this.f131508g == lb21Var.f131508g && this.f131509h == lb21Var.f131509h && this.f131510i == lb21Var.f131510i && this.f131511j == lb21Var.f131511j && this.f131512k.equals(lb21Var.f131512k) && this.f131513l.equals(lb21Var.f131513l) && this.f131514m.equals(lb21Var.f131514m) && this.f131515n == lb21Var.f131515n && this.f131516o == lb21Var.f131516o && this.f131517p.equals(lb21Var.f131517p) && this.f131518q.equals(lb21Var.f131518q) && this.f131519r.equals(lb21Var.f131519r) && this.f131520s == lb21Var.f131520s && this.f131521t.equals(lb21Var.f131521t) && this.f131522u.equals(lb21Var.f131522u) && this.f131523v.equals(lb21Var.f131523v) && this.f131524w.equals(lb21Var.f131524w) && this.f131525x.equals(lb21Var.f131525x) && this.f131526y.equals(lb21Var.f131526y) && this.f131527z == lb21Var.f131527z && this.f131493A == lb21Var.f131493A && this.f131494B == lb21Var.f131494B && this.f131495C.equals(lb21Var.f131495C) && this.f131496D.equals(lb21Var.f131496D) && this.f131497E.equals(lb21Var.f131497E) && this.f131498F.equals(lb21Var.f131498F) && this.f131499G.equals(lb21Var.f131499G) && this.f131500H == lb21Var.f131500H;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f131502a.hashCode() + 217) * 31) + (this.f131503b ? 1 : 0)) * 31) + this.f131504c) * 31) + this.f131505d) * 961;
        PlaybackException playbackException = this.f131506e;
        int iHashCode2 = (((((iHashCode + (playbackException == null ? 0 : playbackException.hashCode())) * 31) + this.f131507f) * 31) + (this.f131508g ? 1 : 0)) * 961;
        long j = this.f131509h;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f131510i;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f131511j;
        return ((((this.f131499G.hashCode() + ((this.f131498F.hashCode() + ((this.f131497E.hashCode() + ((this.f131496D.hashCode() + ((this.f131495C.hashCode() + ((((((((this.f131526y.hashCode() + ((this.f131525x.hashCode() + ((this.f131524w.f223555a.hashCode() + ((this.f131523v.hashCode() + ((this.f131522u.hashCode() + ((this.f131521t.hashCode() + ((((this.f131519r.hashCode() + ((this.f131518q.hashCode() + ((this.f131517p.hashCode() + ((Float.floatToRawIntBits(this.f131516o) + ((Float.floatToRawIntBits(this.f131515n) + ((this.f131514m.hashCode() + ((this.f131513l.hashCode() + ((this.f131512k.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + this.f131520s) * 961)) * 961)) * 31)) * 31)) * 31)) * 31)) * 31) + this.f131527z) * 31) + this.f131493A) * 31) + this.f131494B) * 31)) * 31)) * 31)) * 31)) * 31)) * 961) + this.f131500H) * 31) + ((int) 0);
    }
}
