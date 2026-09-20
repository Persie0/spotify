package p204p;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import androidx.appcompat.widget.Toolbar;
import androidx.car.app.C0023j;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import spotify.your_library.esperanto.proto.IsCuratedResponse;

/* JADX INFO: loaded from: classes5.dex */
public class gd8 implements Predicate, BiFunction, Function, InterfaceC2207oa, ffz, eru0, yvx, ant {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f78758a;

    /* JADX INFO: renamed from: b */
    public Object f78759b;

    public /* synthetic */ gd8() {
        this.f78758a = 18;
    }

    /* JADX INFO: renamed from: v */
    public static gd8 m44371v(uwe uweVar) {
        gd8 gd8Var = uweVar.f234639h;
        return gd8Var != null ? gd8Var : new gd8(uweVar);
    }

    /* JADX INFO: renamed from: A */
    public void m44372A(int i, gva gvaVar) {
        ((uwe) this.f78759b).mo74058T(i, gvaVar);
    }

    /* JADX INFO: renamed from: B */
    public void m44373B(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((uwe) this.f78759b).mo74058T(i, (gva) list.get(i2));
        }
    }

    /* JADX INFO: renamed from: C */
    public void m44374C(double d, int i) {
        uwe uweVar = (uwe) this.f78759b;
        uweVar.getClass();
        uweVar.mo74062X(i, Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: D */
    public void m44375D(int i, List list, boolean z) {
        uwe uweVar = (uwe) this.f78759b;
        int i2 = 0;
        if (!(list instanceof y1s)) {
            if (!z) {
                while (i2 < list.size()) {
                    double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                    uweVar.getClass();
                    uweVar.mo74062X(i, Double.doubleToRawLongBits(dDoubleValue));
                    i2++;
                }
                return;
            }
            uweVar.mo74071g0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                Logger logger = uwe.f234637i;
                i3 += 8;
            }
            uweVar.mo74073i0(i3);
            while (i2 < list.size()) {
                uweVar.mo74063Y(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        y1s y1sVar = (y1s) list;
        if (!z) {
            while (i2 < y1sVar.f268382c) {
                y1sVar.m92667d(i2);
                double d = y1sVar.f268381b[i2];
                uweVar.getClass();
                uweVar.mo74062X(i, Double.doubleToRawLongBits(d));
                i2++;
            }
            return;
        }
        uweVar.mo74071g0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < y1sVar.f268382c; i6++) {
            y1sVar.m92667d(i6);
            double d2 = y1sVar.f268381b[i6];
            Logger logger2 = uwe.f234637i;
            i5 += 8;
        }
        uweVar.mo74073i0(i5);
        while (i2 < y1sVar.f268382c) {
            y1sVar.m92667d(i2);
            uweVar.mo74063Y(Double.doubleToRawLongBits(y1sVar.f268381b[i2]));
            i2++;
        }
    }

    /* JADX INFO: renamed from: E */
    public void m44376E(int i) {
        ((uwe) this.f78759b).mo74071g0(i, 4);
    }

    /* JADX INFO: renamed from: F */
    public void m44377F(int i, int i2) {
        ((uwe) this.f78759b).mo74064Z(i, i2);
    }

    /* JADX INFO: renamed from: G */
    public void m44378G(int i, List list, boolean z) {
        uwe uweVar = (uwe) this.f78759b;
        int i2 = 0;
        if (!(list instanceof n350)) {
            if (!z) {
                while (i2 < list.size()) {
                    uweVar.mo74064Z(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            uweVar.mo74071g0(i, 2);
            int iM84100O = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM84100O += uwe.m84100O(((Integer) list.get(i3)).intValue());
            }
            uweVar.mo74073i0(iM84100O);
            while (i2 < list.size()) {
                uweVar.mo74065a0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        n350 n350Var = (n350) list;
        if (!z) {
            while (i2 < n350Var.f149937c) {
                uweVar.mo74064Z(i, n350Var.m63583e(i2));
                i2++;
            }
            return;
        }
        uweVar.mo74071g0(i, 2);
        int iM84100O2 = 0;
        for (int i4 = 0; i4 < n350Var.f149937c; i4++) {
            iM84100O2 += uwe.m84100O(n350Var.m63583e(i4));
        }
        uweVar.mo74073i0(iM84100O2);
        while (i2 < n350Var.f149937c) {
            uweVar.mo74065a0(n350Var.m63583e(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: H */
    public void m44379H(int i, int i2) {
        ((uwe) this.f78759b).mo74060V(i, i2);
    }

    /* JADX INFO: renamed from: I */
    public void m44380I(int i, List list, boolean z) {
        uwe uweVar = (uwe) this.f78759b;
        int i2 = 0;
        if (!(list instanceof n350)) {
            if (!z) {
                while (i2 < list.size()) {
                    uweVar.mo74060V(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            uweVar.mo74071g0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = uwe.f234637i;
                i3 += 4;
            }
            uweVar.mo74073i0(i3);
            while (i2 < list.size()) {
                uweVar.mo74061W(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        n350 n350Var = (n350) list;
        if (!z) {
            while (i2 < n350Var.f149937c) {
                uweVar.mo74060V(i, n350Var.m63583e(i2));
                i2++;
            }
            return;
        }
        uweVar.mo74071g0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < n350Var.f149937c; i6++) {
            n350Var.m63583e(i6);
            Logger logger2 = uwe.f234637i;
            i5 += 4;
        }
        uweVar.mo74073i0(i5);
        while (i2 < n350Var.f149937c) {
            uweVar.mo74061W(n350Var.m63583e(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: J */
    public void m44381J(int i, long j) {
        ((uwe) this.f78759b).mo74062X(i, j);
    }

    /* JADX INFO: renamed from: K */
    public void m44382K(int i, List list, boolean z) {
        uwe uweVar = (uwe) this.f78759b;
        int i2 = 0;
        if (!(list instanceof y1b0)) {
            if (!z) {
                while (i2 < list.size()) {
                    uweVar.mo74062X(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            uweVar.mo74071g0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = uwe.f234637i;
                i3 += 8;
            }
            uweVar.mo74073i0(i3);
            while (i2 < list.size()) {
                uweVar.mo74063Y(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        y1b0 y1b0Var = (y1b0) list;
        if (!z) {
            while (i2 < y1b0Var.f268224c) {
                uweVar.mo74062X(i, y1b0Var.m92644e(i2));
                i2++;
            }
            return;
        }
        uweVar.mo74071g0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < y1b0Var.f268224c; i6++) {
            y1b0Var.m92644e(i6);
            Logger logger2 = uwe.f234637i;
            i5 += 8;
        }
        uweVar.mo74073i0(i5);
        while (i2 < y1b0Var.f268224c) {
            uweVar.mo74063Y(y1b0Var.m92644e(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: L */
    public void m44383L(float f, int i) {
        uwe uweVar = (uwe) this.f78759b;
        uweVar.getClass();
        uweVar.mo74060V(i, Float.floatToRawIntBits(f));
    }

    /* JADX INFO: renamed from: M */
    public void m44384M(int i, List list, boolean z) {
        uwe uweVar = (uwe) this.f78759b;
        int i2 = 0;
        if (!(list instanceof shz)) {
            if (!z) {
                while (i2 < list.size()) {
                    float fFloatValue = ((Float) list.get(i2)).floatValue();
                    uweVar.getClass();
                    uweVar.mo74060V(i, Float.floatToRawIntBits(fFloatValue));
                    i2++;
                }
                return;
            }
            uweVar.mo74071g0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                Logger logger = uwe.f234637i;
                i3 += 4;
            }
            uweVar.mo74073i0(i3);
            while (i2 < list.size()) {
                uweVar.mo74061W(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        shz shzVar = (shz) list;
        if (!z) {
            while (i2 < shzVar.f209300c) {
                shzVar.m78146d(i2);
                float f = shzVar.f209299b[i2];
                uweVar.getClass();
                uweVar.mo74060V(i, Float.floatToRawIntBits(f));
                i2++;
            }
            return;
        }
        uweVar.mo74071g0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < shzVar.f209300c; i6++) {
            shzVar.m78146d(i6);
            float f2 = shzVar.f209299b[i6];
            Logger logger2 = uwe.f234637i;
            i5 += 4;
        }
        uweVar.mo74073i0(i5);
        while (i2 < shzVar.f209300c) {
            shzVar.m78146d(i2);
            uweVar.mo74061W(Float.floatToRawIntBits(shzVar.f209299b[i2]));
            i2++;
        }
    }

    /* JADX INFO: renamed from: N */
    public void m44385N(int i, Object obj, lgy0 lgy0Var) {
        uwe uweVar = (uwe) this.f78759b;
        uweVar.mo74071g0(i, 3);
        lgy0Var.mo2154e((pre0) obj, uweVar.f234639h);
        uweVar.mo74071g0(i, 4);
    }

    /* JADX INFO: renamed from: O */
    public void m44386O(int i, List list, lgy0 lgy0Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            m44385N(i, list.get(i2), lgy0Var);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m44387P(int i, int i2) {
        ((uwe) this.f78759b).mo74064Z(i, i2);
    }

    /* JADX INFO: renamed from: Q */
    public void m44388Q(int i, List list, boolean z) {
        uwe uweVar = (uwe) this.f78759b;
        int i2 = 0;
        if (!(list instanceof n350)) {
            if (!z) {
                while (i2 < list.size()) {
                    uweVar.mo74064Z(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            uweVar.mo74071g0(i, 2);
            int iM84100O = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM84100O += uwe.m84100O(((Integer) list.get(i3)).intValue());
            }
            uweVar.mo74073i0(iM84100O);
            while (i2 < list.size()) {
                uweVar.mo74065a0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        n350 n350Var = (n350) list;
        if (!z) {
            while (i2 < n350Var.f149937c) {
                uweVar.mo74064Z(i, n350Var.m63583e(i2));
                i2++;
            }
            return;
        }
        uweVar.mo74071g0(i, 2);
        int iM84100O2 = 0;
        for (int i4 = 0; i4 < n350Var.f149937c; i4++) {
            iM84100O2 += uwe.m84100O(n350Var.m63583e(i4));
        }
        uweVar.mo74073i0(iM84100O2);
        while (i2 < n350Var.f149937c) {
            uweVar.mo74065a0(n350Var.m63583e(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: R */
    public void m44389R(int i, long j) {
        ((uwe) this.f78759b).mo74074j0(i, j);
    }

    /* JADX INFO: renamed from: S */
    public void m44390S(int i, List list, boolean z) {
        uwe uweVar = (uwe) this.f78759b;
        int i2 = 0;
        if (!(list instanceof y1b0)) {
            if (!z) {
                while (i2 < list.size()) {
                    uweVar.mo74074j0(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            uweVar.mo74071g0(i, 2);
            int iM84100O = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM84100O += uwe.m84100O(((Long) list.get(i3)).longValue());
            }
            uweVar.mo74073i0(iM84100O);
            while (i2 < list.size()) {
                uweVar.mo74075k0(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        y1b0 y1b0Var = (y1b0) list;
        if (!z) {
            while (i2 < y1b0Var.f268224c) {
                uweVar.mo74074j0(i, y1b0Var.m92644e(i2));
                i2++;
            }
            return;
        }
        uweVar.mo74071g0(i, 2);
        int iM84100O2 = 0;
        for (int i4 = 0; i4 < y1b0Var.f268224c; i4++) {
            iM84100O2 += uwe.m84100O(y1b0Var.m92644e(i4));
        }
        uweVar.mo74073i0(iM84100O2);
        while (i2 < y1b0Var.f268224c) {
            uweVar.mo74075k0(y1b0Var.m92644e(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: T */
    public void m44391T(int i, d5a0 d5a0Var, Map map) {
        uwe uweVar = (uwe) this.f78759b;
        uweVar.getClass();
        for (Map.Entry entry : map.entrySet()) {
            uweVar.mo74071g0(i, 2);
            uweVar.mo74073i0(vgc0.m85428a(d5a0Var, entry.getKey(), entry.getValue()));
            Object key = entry.getKey();
            Object value = entry.getValue();
            kuy.m57417o(uweVar, (vyd1) d5a0Var.f45380b, 1, key);
            kuy.m57417o(uweVar, (vyd1) d5a0Var.f45382d, 2, value);
        }
    }

    /* JADX INFO: renamed from: U */
    public void m44392U(int i, Object obj, lgy0 lgy0Var) {
        AbstractC2118m8 abstractC2118m8 = (AbstractC2118m8) obj;
        uwe uweVar = (uwe) this.f78759b;
        uweVar.mo74071g0(i, 2);
        uweVar.mo74073i0(abstractC2118m8.getSerializedSize(lgy0Var));
        lgy0Var.mo2154e(abstractC2118m8, this);
    }

    /* JADX INFO: renamed from: V */
    public void m44393V(int i, List list, lgy0 lgy0Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            m44392U(i, list.get(i2), lgy0Var);
        }
    }

    /* JADX INFO: renamed from: W */
    public void m44394W(int i, Object obj) {
        uwe uweVar = (uwe) this.f78759b;
        if (obj instanceof gva) {
            uweVar.mo74068d0(i, (gva) obj);
        } else {
            uweVar.mo74067c0(i, (pre0) obj);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m44395X(int i, int i2) {
        ((uwe) this.f78759b).mo74060V(i, i2);
    }

    /* JADX INFO: renamed from: Y */
    public void m44396Y(int i, List list, boolean z) {
        uwe uweVar = (uwe) this.f78759b;
        int i2 = 0;
        if (!(list instanceof n350)) {
            if (!z) {
                while (i2 < list.size()) {
                    uweVar.mo74060V(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            uweVar.mo74071g0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = uwe.f234637i;
                i3 += 4;
            }
            uweVar.mo74073i0(i3);
            while (i2 < list.size()) {
                uweVar.mo74061W(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        n350 n350Var = (n350) list;
        if (!z) {
            while (i2 < n350Var.f149937c) {
                uweVar.mo74060V(i, n350Var.m63583e(i2));
                i2++;
            }
            return;
        }
        uweVar.mo74071g0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < n350Var.f149937c; i6++) {
            n350Var.m63583e(i6);
            Logger logger2 = uwe.f234637i;
            i5 += 4;
        }
        uweVar.mo74073i0(i5);
        while (i2 < n350Var.f149937c) {
            uweVar.mo74061W(n350Var.m63583e(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m44397Z(int i, long j) {
        ((uwe) this.f78759b).mo74062X(i, j);
    }

    /* JADX INFO: renamed from: a0 */
    public void m44398a0(int i, List list, boolean z) {
        uwe uweVar = (uwe) this.f78759b;
        int i2 = 0;
        if (!(list instanceof y1b0)) {
            if (!z) {
                while (i2 < list.size()) {
                    uweVar.mo74062X(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            uweVar.mo74071g0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = uwe.f234637i;
                i3 += 8;
            }
            uweVar.mo74073i0(i3);
            while (i2 < list.size()) {
                uweVar.mo74063Y(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        y1b0 y1b0Var = (y1b0) list;
        if (!z) {
            while (i2 < y1b0Var.f268224c) {
                uweVar.mo74062X(i, y1b0Var.m92644e(i2));
                i2++;
            }
            return;
        }
        uweVar.mo74071g0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < y1b0Var.f268224c; i6++) {
            y1b0Var.m92644e(i6);
            Logger logger2 = uwe.f234637i;
            i5 += 8;
        }
        uweVar.mo74073i0(i5);
        while (i2 < y1b0Var.f268224c) {
            uweVar.mo74063Y(y1b0Var.m92644e(i2));
            i2++;
        }
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        switch (this.f78758a) {
            case 4:
                return ((ihi) obj).f102296c == u300.BLEND && ((hn9) this.f78759b).f93260a.m80330a();
            case 13:
                return ((ihi) obj).f102296c == u300.CELEBRITY_BLEND && ((ud4) this.f78759b).m82824a();
            default:
                dik dikVar = (dik) this.f78759b;
                return dikVar.f49384b && !dikVar.m36125a().isEmpty();
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f78758a) {
            case 2:
                String str = (String) obj;
                t6s t6sVarM82602a = ((c99) this.f78759b).f35423a.m82602a(str);
                return t6sVarM82602a != null ? Maybe.m23363f(new pqm0(str, t6sVarM82602a)) : MaybeEmpty.f8264a;
            case 3:
                tvx0 tvx0Var = ((vc9) this.f78759b).f240076a;
                tvx0Var.getClass();
                return Single.create(new t9w0(tvx0Var, 2, 2)).toObservable().map(xwe.f266660Z);
            case 5:
                return ((bl9) this.f78759b).m29749a(((to9) obj).f222204b).onErrorReturnItem(new kg60()).toObservable();
            case 7:
                return (s8a) this.f78759b;
            case 8:
                pqm0 pqm0Var = (pqm0) obj;
                kza kzaVar = (kza) pqm0Var.f180350a;
                return new rza(((iza) this.f78759b).f107180a.m80436n(), kzaVar.f128052a, TriggerType.PLAYBACK_STARTED, (String) pqm0Var.f180351b, null, null, new DynamicTagsMetadata(kzaVar.f128052a, null, null, null, 14, null), new ase0(new wre0(false), ure0.f233341a), 368);
            case 10:
                ghb ghbVar = ((chb) this.f78759b).f37980f;
                Single singleFlatMap = ghbVar.f79878b.flatMap(new id8(ghb.f79875e, 8));
                fv31 fv31Var = ghb.f79874d;
                Single single = ghbVar.f79878b;
                return Single.zip(singleFlatMap, single.flatMap(new id8(fv31Var, 8)), single.flatMap(new kca(ghbVar, 2)), let.f132690M0);
            case 14:
                bxb bxbVar = (bxb) this.f78759b;
                return (SingleSource) ((p2x0) obj).m68969b(new uee(bxbVar, 0), new uee(bxbVar, 1));
            case 16:
                x0f x0fVar = (x0f) obj;
                a1f a1fVar = (a1f) this.f78759b;
                String strM35700G = a1fVar.f11396a.m35700G();
                if (strM35700G == null) {
                    return CompletableEmpty.f7437a;
                }
                return g0b1.m43282x(dau.f47107a, new xvd((Object) x0fVar, (Object) a1fVar, strM35700G, (fbk) null, 6));
            case 17:
                return x5f.m89990l((IsCuratedResponse) obj, ((v5f) this.f78759b).f237475b, null);
            case 21:
                esd1 esd1Var = (esd1) obj;
                tti ttiVar = (tti) this.f78759b;
                if ((esd1Var instanceof csd1) && ttiVar.f223621t.m43976h()) {
                    return ttiVar.f223614c.m43378j();
                }
                Single singleJust = Single.just(esd1Var);
                wj50.m88279p(singleJust);
                return singleJust;
            case 23:
                return kp7.m57020d((kp7) this.f78759b, (o2x0) obj);
            default:
                ptp0 ptp0Var = ((mt2) this.f78759b).f146934a;
                return new yt2((String) obj);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m44399b0(int i, int i2) {
        ((uwe) this.f78759b).mo74072h0(i, (i2 >> 31) ^ (i2 << 1));
    }

    /* JADX INFO: renamed from: c0 */
    public void m44400c0(int i, List list, boolean z) {
        uwe uweVar = (uwe) this.f78759b;
        int i2 = 0;
        if (!(list instanceof n350)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    uweVar.mo74072h0(i, (iIntValue >> 31) ^ (iIntValue << 1));
                    i2++;
                }
                return;
            }
            uweVar.mo74071g0(i, 2);
            int iM84095J = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM84095J += uwe.m84095J(((Integer) list.get(i3)).intValue());
            }
            uweVar.mo74073i0(iM84095J);
            while (i2 < list.size()) {
                int iIntValue2 = ((Integer) list.get(i2)).intValue();
                uweVar.mo74073i0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                i2++;
            }
            return;
        }
        n350 n350Var = (n350) list;
        if (!z) {
            while (i2 < n350Var.f149937c) {
                int iM63583e = n350Var.m63583e(i2);
                uweVar.mo74072h0(i, (iM63583e >> 31) ^ (iM63583e << 1));
                i2++;
            }
            return;
        }
        uweVar.mo74071g0(i, 2);
        int iM84095J2 = 0;
        for (int i4 = 0; i4 < n350Var.f149937c; i4++) {
            iM84095J2 += uwe.m84095J(n350Var.m63583e(i4));
        }
        uweVar.mo74073i0(iM84095J2);
        while (i2 < n350Var.f149937c) {
            int iM63583e2 = n350Var.m63583e(i2);
            uweVar.mo74073i0((iM63583e2 >> 31) ^ (iM63583e2 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m44401d0(int i, long j) {
        ((uwe) this.f78759b).mo74074j0(i, (j >> 63) ^ (j << 1));
    }

    @Override // p204p.ffz
    /* JADX INFO: renamed from: e */
    public Object mo24334e() {
        return Integer.valueOf(((m0a) ((i4t0) this.f78759b).get()).m60429e());
    }

    /* JADX INFO: renamed from: e0 */
    public void m44402e0(int i, List list, boolean z) {
        uwe uweVar = (uwe) this.f78759b;
        int i2 = 0;
        if (!(list instanceof y1b0)) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    uweVar.mo74074j0(i, (jLongValue >> 63) ^ (jLongValue << 1));
                    i2++;
                }
                return;
            }
            uweVar.mo74071g0(i, 2);
            int iM84096K = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM84096K += uwe.m84096K(((Long) list.get(i3)).longValue());
            }
            uweVar.mo74073i0(iM84096K);
            while (i2 < list.size()) {
                long jLongValue2 = ((Long) list.get(i2)).longValue();
                uweVar.mo74075k0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                i2++;
            }
            return;
        }
        y1b0 y1b0Var = (y1b0) list;
        if (!z) {
            while (i2 < y1b0Var.f268224c) {
                long jM92644e = y1b0Var.m92644e(i2);
                uweVar.mo74074j0(i, (jM92644e >> 63) ^ (jM92644e << 1));
                i2++;
            }
            return;
        }
        uweVar.mo74071g0(i, 2);
        int iM84096K2 = 0;
        for (int i4 = 0; i4 < y1b0Var.f268224c; i4++) {
            iM84096K2 += uwe.m84096K(y1b0Var.m92644e(i4));
        }
        uweVar.mo74073i0(iM84096K2);
        while (i2 < y1b0Var.f268224c) {
            long jM92644e2 = y1b0Var.m92644e(i2);
            uweVar.mo74075k0((jM92644e2 >> 63) ^ (jM92644e2 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m44403f0(int i) {
        ((uwe) this.f78759b).mo74071g0(i, 3);
    }

    /* JADX INFO: renamed from: g0 */
    public void m44404g0(int i, String str) {
        ((uwe) this.f78759b).mo74069e0(i, str);
    }

    /* JADX INFO: renamed from: h0 */
    public void m44405h0(int i, List list) {
        uwe uweVar = (uwe) this.f78759b;
        int i2 = 0;
        if (!(list instanceof yy70)) {
            while (i2 < list.size()) {
                uweVar.mo74069e0(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        yy70 yy70Var = (yy70) list;
        while (i2 < list.size()) {
            Object objMo74625k = yy70Var.mo74625k(i2);
            if (objMo74625k instanceof String) {
                uweVar.mo74069e0(i, (String) objMo74625k);
            } else {
                uweVar.mo74058T(i, (gva) objMo74625k);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m44406i0(int i, int i2) {
        ((uwe) this.f78759b).mo74072h0(i, i2);
    }

    @Override // p204p.yvx
    /* JADX INFO: renamed from: j */
    public void mo44407j(d850 d850Var) {
        ((bsq) ((b7k) this.f78759b).f24302d).f30377a.invoke(d850Var);
    }

    /* JADX INFO: renamed from: j0 */
    public void m44408j0(int i, List list, boolean z) {
        uwe uweVar = (uwe) this.f78759b;
        int i2 = 0;
        if (!(list instanceof n350)) {
            if (!z) {
                while (i2 < list.size()) {
                    uweVar.mo74072h0(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            uweVar.mo74071g0(i, 2);
            int iM84099N = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM84099N += uwe.m84099N(((Integer) list.get(i3)).intValue());
            }
            uweVar.mo74073i0(iM84099N);
            while (i2 < list.size()) {
                uweVar.mo74073i0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        n350 n350Var = (n350) list;
        if (!z) {
            while (i2 < n350Var.f149937c) {
                uweVar.mo74072h0(i, n350Var.m63583e(i2));
                i2++;
            }
            return;
        }
        uweVar.mo74071g0(i, 2);
        int iM84099N2 = 0;
        for (int i4 = 0; i4 < n350Var.f149937c; i4++) {
            iM84099N2 += uwe.m84099N(n350Var.m63583e(i4));
        }
        uweVar.mo74073i0(iM84099N2);
        while (i2 < n350Var.f149937c) {
            uweVar.mo74073i0(n350Var.m63583e(i2));
            i2++;
        }
    }

    @Override // p204p.eru0
    /* JADX INFO: renamed from: k */
    public phi mo39834k() {
        return (phi) this.f78759b;
    }

    /* JADX INFO: renamed from: k0 */
    public void m44409k0(int i, long j) {
        ((uwe) this.f78759b).mo74074j0(i, j);
    }

    /* JADX INFO: renamed from: l0 */
    public void m44410l0(int i, List list, boolean z) {
        uwe uweVar = (uwe) this.f78759b;
        int i2 = 0;
        if (!(list instanceof y1b0)) {
            if (!z) {
                while (i2 < list.size()) {
                    uweVar.mo74074j0(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            uweVar.mo74071g0(i, 2);
            int iM84100O = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM84100O += uwe.m84100O(((Long) list.get(i3)).longValue());
            }
            uweVar.mo74073i0(iM84100O);
            while (i2 < list.size()) {
                uweVar.mo74075k0(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        y1b0 y1b0Var = (y1b0) list;
        if (!z) {
            while (i2 < y1b0Var.f268224c) {
                uweVar.mo74074j0(i, y1b0Var.m92644e(i2));
                i2++;
            }
            return;
        }
        uweVar.mo74071g0(i, 2);
        int iM84100O2 = 0;
        for (int i4 = 0; i4 < y1b0Var.f268224c; i4++) {
            iM84100O2 += uwe.m84100O(y1b0Var.m92644e(i4));
        }
        uweVar.mo74073i0(iM84100O2);
        while (i2 < y1b0Var.f268224c) {
            uweVar.mo74075k0(y1b0Var.m92644e(i2));
            i2++;
        }
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        int iIntValue;
        switch (this.f78758a) {
            case 28:
                Integer num = (Integer) obj;
                cgl cglVar = (cgl) this.f78759b;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    TypedValue typedValue = new TypedValue();
                    cglVar.f37727Z0.getContext().getTheme().resolveAttribute(R.attr.baseBackgroundBase, typedValue, true);
                    iIntValue = typedValue.data;
                }
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(iIntValue, PorterDuff.Mode.DST_OVER);
                Drawable background = cglVar.f37719U0.findViewById(R.id.cwp_header_artwork_background).getBackground();
                if (background != null) {
                    background.setColorFilter(porterDuffColorFilter);
                }
                Drawable background2 = ((Toolbar) cglVar.f37718T0.f225645X).getBackground();
                if (background2 != null) {
                    background2.setColorFilter(porterDuffColorFilter);
                }
                break;
            default:
                Set set = (Set) obj;
                s6m s6mVar = (s6m) this.f78759b;
                wj50.m88279p(set);
                s6mVar.mo28300a(set);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        return ((List) obj).size() == ((Number) ((jd8) this.f78759b).f111285c.f165022e.mo24334e()).intValue();
    }

    /* JADX INFO: renamed from: u */
    public Uri m44411u(c7b c7bVar) {
        if (c7bVar instanceof w6b) {
            return new Uri.Builder().scheme("content").authority(m44412w()).appendPath("avatar").appendQueryParameter("name", ((w6b) c7bVar).f248319a).build();
        }
        if (c7bVar instanceof y6b) {
            Uri.Builder builderAppendPath = new Uri.Builder().scheme("content").authority(m44412w()).appendPath("placeholder");
            String str = ((y6b) c7bVar).f269717a;
            if (str != null) {
                builderAppendPath.appendQueryParameter("uri", str);
            }
            return builderAppendPath.appendQueryParameter("darkMode", String.valueOf((((C0023j) ((er70) this.f78759b).get()).getResources().getConfiguration().uiMode & 48) == 32)).build();
        }
        if (c7bVar instanceof z6b) {
            z6b z6bVar = (z6b) c7bVar;
            return new Uri.Builder().scheme("content").authority(m44412w()).appendPath("qrcode").appendQueryParameter("content", z6bVar.f279818a).appendQueryParameter("size", String.valueOf(z6bVar.f279819b)).build();
        }
        if (c7bVar instanceof v6b) {
            v6b v6bVar = (v6b) c7bVar;
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("content").authority(m44412w()).appendPath("encircled").appendQueryParameter("iconRes", String.valueOf(v6bVar.f237795a));
            Integer num = v6bVar.f237796b;
            if (num != null) {
                builderAppendQueryParameter.appendQueryParameter("iconColor", String.format("%08X", Arrays.copyOf(new Object[]{Integer.valueOf(num.intValue())}, 1)));
            }
            return builderAppendQueryParameter.appendQueryParameter("iconSize", String.valueOf(v6bVar.f237797c)).appendQueryParameter("circleSize", String.valueOf(v6bVar.f237798d)).appendQueryParameter("circleColor", String.format("%08X", Arrays.copyOf(new Object[]{Integer.valueOf(v6bVar.f237799e)}, 1))).build();
        }
        if (!(c7bVar instanceof x6b)) {
            if (c7bVar instanceof a7b) {
                throw new IllegalArgumentException("ResourceImage uses direct resource icons, not content URIs");
            }
            if (c7bVar instanceof b7b) {
                throw new IllegalArgumentException("UriImage should use MediaUriUtil.toLocalContentUri() instead");
            }
            throw new NoWhenBranchMatchedException();
        }
        x6b x6bVar = (x6b) c7bVar;
        Uri.Builder builderAppendQueryParameter2 = new Uri.Builder().scheme("content").authority(m44412w()).appendPath("gradient_v3").appendQueryParameter("imageLink", x6bVar.f258631a).appendQueryParameter("backgroundHexColor", x6bVar.f258632b);
        String str2 = x6bVar.f258633c;
        if (str2 != null) {
            builderAppendQueryParameter2.appendQueryParameter("entityUri", str2);
        }
        return builderAppendQueryParameter2.build();
    }

    /* JADX INFO: renamed from: w */
    public String m44412w() {
        return s571.m77250i(((C0023j) ((er70) this.f78759b).get()).getPackageName(), ".calimage");
    }

    /* JADX INFO: renamed from: x */
    public boolean m44413x() {
        return ((sp4) this.f78759b).m78851a();
    }

    /* JADX INFO: renamed from: y */
    public void m44414y(int i, boolean z) {
        ((uwe) this.f78759b).mo74056R(i, z);
    }

    /* JADX INFO: renamed from: z */
    public void m44415z(int i, List list, boolean z) {
        uwe uweVar = (uwe) this.f78759b;
        int i2 = 0;
        if (!(list instanceof e8a)) {
            if (!z) {
                while (i2 < list.size()) {
                    uweVar.mo74056R(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            uweVar.mo74071g0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).getClass();
                Logger logger = uwe.f234637i;
                i3++;
            }
            uweVar.mo74073i0(i3);
            while (i2 < list.size()) {
                uweVar.mo74055Q(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        e8a e8aVar = (e8a) list;
        if (!z) {
            while (i2 < e8aVar.f57119c) {
                e8aVar.m38086d(i2);
                uweVar.mo74056R(i, e8aVar.f57118b[i2]);
                i2++;
            }
            return;
        }
        uweVar.mo74071g0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < e8aVar.f57119c; i6++) {
            e8aVar.m38086d(i6);
            boolean z2 = e8aVar.f57118b[i6];
            Logger logger2 = uwe.f234637i;
            i5++;
        }
        uweVar.mo74073i0(i5);
        while (i2 < e8aVar.f57119c) {
            e8aVar.m38086d(i2);
            uweVar.mo74055Q(e8aVar.f57118b[i2] ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public /* synthetic */ gd8(Object obj, int i) {
        this.f78758a = i;
        this.f78759b = obj;
    }

    public gd8(x5f x5fVar, v5f v5fVar) {
        this.f78758a = 17;
        this.f78759b = v5fVar;
    }

    public gd8(uwe uweVar) {
        this.f78758a = 15;
        ee50.m38645a(uweVar, "output");
        this.f78759b = uweVar;
        uweVar.f234639h = this;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return Boolean.valueOf(((o040) ((er70) ((twy) this.f78759b).f224514f).get()).m65976a((PlayerState) obj) || ydj.m93442a(k231.m55147a((ContextTrack) obj2)));
    }
}
