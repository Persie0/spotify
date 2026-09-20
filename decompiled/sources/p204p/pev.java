package p204p;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.music.R;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class pev implements Connectable {

    /* JADX INFO: renamed from: L0 */
    public Set f176852L0;

    /* JADX INFO: renamed from: M0 */
    public int f176853M0;

    /* JADX INFO: renamed from: N0 */
    public tev f176854N0;

    /* JADX INFO: renamed from: O0 */
    public int f176855O0;

    /* JADX INFO: renamed from: P0 */
    public final vc61 f176856P0;

    /* JADX INFO: renamed from: Q0 */
    public final boolean f176857Q0;

    /* JADX INFO: renamed from: R0 */
    public final vc61 f176858R0;

    /* JADX INFO: renamed from: X */
    public String f176859X;

    /* JADX INFO: renamed from: Y */
    public boolean f176860Y;

    /* JADX INFO: renamed from: Z */
    public ibj f176861Z;

    /* JADX INFO: renamed from: a */
    public final Activity f176862a;

    /* JADX INFO: renamed from: b */
    public final dse1 f176863b;

    /* JADX INFO: renamed from: c */
    public final boolean f176864c;

    /* JADX INFO: renamed from: d */
    public final boolean f176865d;

    /* JADX INFO: renamed from: e */
    public final hqe1 f176866e;

    /* JADX INFO: renamed from: f */
    public final lev f176867f;

    /* JADX INFO: renamed from: g */
    public final ygv f176868g;

    /* JADX INFO: renamed from: h */
    public List f176869h = lau.f131415a;

    /* JADX INFO: renamed from: i */
    public Object f176870i;

    /* JADX INFO: renamed from: t */
    public boolean f176871t;

    public pev(Activity activity, dd41 dd41Var, dse1 dse1Var, boolean z, boolean z2, hqe1 hqe1Var, lev levVar, ygv ygvVar) {
        this.f176862a = activity;
        this.f176863b = dse1Var;
        this.f176864c = z;
        this.f176865d = z2;
        this.f176866e = hqe1Var;
        this.f176867f = levVar;
        this.f176868g = ygvVar;
        gbu gbuVar = gbu.f78413a;
        this.f176870i = gbuVar;
        this.f176861Z = fbj.f67843a;
        this.f176852L0 = gbuVar;
        this.f176855O0 = -1;
        this.f176856P0 = new vc61(vtg1.m86386m(activity, R.attr.essentialBrightAccent, -1), new qvp(m69736g(R.drawable.encore_icon_pin_active_24), m69736g(R.drawable.encore_icon_pin_24)));
        he41 he41Var = dd41Var.f47710d;
        this.f176857Q0 = wj50.m88271j(he41Var != null ? he41Var.getType() : null, nvp0.f158938f);
        this.f176858R0 = new vc61(activity.getColor(R.color.your_library_unpin_background), new qvp(m69736g(R.drawable.encore_icon_pin_24), m69736g(R.drawable.encore_icon_pin_active_24)));
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        return new C2185np(this, 22);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC2376sh m69730a(dhv dhvVar) {
        jev jevVar = dhvVar.f49173b.f29428e;
        jev jevVar2 = jev.f111664M0;
        C2338rh c2338rh = C2338rh.f199072a;
        if (jevVar == jevVar2) {
            return c2338rh;
        }
        if (dhvVar.f49174c) {
            return C2256ph.f177436a;
        }
        return this.f176866e.m48245d() ? C2214oh.f165307a : c2338rh;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Set] */
    /* JADX INFO: renamed from: b */
    public final boolean m69731b() {
        return this.f176870i.contains("artists") || this.f176870i.contains("downloaded_artists");
    }

    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX INFO: renamed from: c */
    public final Set m69732c(bpe1 bpe1Var, boolean z) {
        w9s w9sVar;
        boolean z2 = bpe1Var.f29426c;
        n4y n4yVar = bpe1Var.f29430g;
        jev jevVar = bpe1Var.f29428e;
        np8 np8Var = np8.f156894a;
        if (z) {
            return z2 ? Collections.singleton(np8Var) : gbu.f78413a;
        }
        x401 x401Var = new x401();
        int iM38547C = edb.m38547C(bpe1Var.f29431h);
        if (iM38547C == 0) {
            w9sVar = w9s.f249255a;
        } else if (iM38547C == 1) {
            w9sVar = w9s.f249256b;
        } else if (iM38547C == 2) {
            w9sVar = w9s.f249257c;
        } else if (iM38547C == 3) {
            w9sVar = w9s.f249258d;
        } else {
            if (iM38547C != 4) {
                throw new NoWhenBranchMatchedException();
            }
            w9sVar = w9s.f249259e;
        }
        x401Var.add(new ip8(w9sVar));
        jev jevVar2 = jev.f111679t;
        if (jevVar == jevVar2 && this.f176852L0.contains(bpe1Var.f29424a)) {
            x401Var.add(qp8.f191184a);
        }
        if (z2) {
            x401Var.add(np8Var);
        }
        if (jevVar == jevVar2) {
            ckp0 ckp0Var = n4yVar instanceof ckp0 ? (ckp0) n4yVar : null;
            if (ckp0Var != null && ckp0Var.f39069f && this.f176865d) {
                x401Var.add(lp8.f135696a);
            }
            if ((ckp0Var != null ? ckp0Var.f39070g : 0) == 3) {
                x401Var.add(jp8.f114580a);
            } else {
                if ((ckp0Var != null ? ckp0Var.f39070g : 0) == 4) {
                    x401Var.add(jp8.f114580a);
                }
            }
        }
        if (jevVar == jev.f111667X) {
            x401Var.add(op8.f167808a);
        }
        jev jevVar3 = jev.f111670a;
        kp8 kp8Var = kp8.f125007a;
        if (jevVar == jevVar3) {
            d5a d5aVar = n4yVar instanceof d5a ? (d5a) n4yVar : null;
            if ((d5aVar != null ? d5aVar.f45376c : 0) == 2) {
                x401Var.add(kp8Var);
            }
        } else if (jevVar == jev.f111672c) {
            h03 h03Var = n4yVar instanceof h03 ? (h03) n4yVar : null;
            if (h03Var != null && h03Var.f86117d) {
                x401Var.add(kp8Var);
            }
            if (h03Var != null && h03Var.f86116c && this.f176866e.m48242a()) {
                x401Var.add(mp8.f145942a);
            }
        }
        if (jevVar == jev.f111663L0) {
            x401Var.add(pp8.f179942a);
        }
        return n0e1.m63425d(x401Var);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: d */
    public final lmo m69733d(bpe1 bpe1Var) {
        jev jevVar = bpe1Var.f29428e;
        h5x h5xVar = null;
        if (jevVar != jev.f111673d) {
            return null;
        }
        if (wj50.m88271j(bpe1.f29423i.get(jevVar), h5x.class)) {
            n4y n4yVar = bpe1Var.f29430g;
            if (n4yVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.yourlibrary.yourlibraryx.shared.domain.EventExtraInfo");
            }
            h5xVar = (h5x) n4yVar;
        }
        return new lmo(h5xVar != null ? h5xVar.f87920a : 0L);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Set] */
    /* JADX INFO: renamed from: e */
    public final String m69734e(dhv dhvVar, boolean z) {
        if (z) {
            return this.f176862a.getString(R.string.your_library_playlist_unavailable);
        }
        int i = this.f176855O0;
        int i2 = this.f176853M0;
        if (i != i2) {
            this.f176854N0 = new tev(this.f176857Q0, this.f176871t, this.f176869h, false, this.f176870i);
            this.f176855O0 = i2;
        }
        tev tevVar = this.f176854N0;
        if (tevVar == null) {
            wj50.m88260d0("cachedBaseExtraInfo");
            throw null;
        }
        bpe1 bpe1Var = dhvVar.f49173b;
        if (dhvVar.f49180i) {
            tevVar = new tev(tevVar.f219794a, tevVar.f219795b, tevVar.f219796c, true, tevVar.f219798e);
        }
        return this.f176867f.mo56242a(bpe1Var, tevVar);
    }

    /* JADX INFO: renamed from: f */
    public final String m69735f(bpe1 bpe1Var, boolean z) {
        String str = bpe1Var.f29425b;
        if (z) {
            return "";
        }
        n4y n4yVar = bpe1Var.f29430g;
        ckp0 ckp0Var = n4yVar instanceof ckp0 ? (ckp0) n4yVar : null;
        if (ckp0Var == null) {
            return str;
        }
        String str2 = ckp0Var.f39068e;
        dse1 dse1Var = this.f176863b;
        dse1Var.getClass();
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        String string = dse1Var.f52556b.getString(R.string.item_title_playlist, str2, str);
        wj50.m88279p(string);
        return string;
    }

    /* JADX INFO: renamed from: g */
    public final Drawable m69736g(int i) {
        Drawable drawable = this.f176862a.getDrawable(i);
        wj50.m88279p(drawable);
        drawable.setTint(-1);
        return drawable;
    }
}
