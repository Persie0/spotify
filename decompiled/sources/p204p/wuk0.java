package p204p;

import android.companion.virtual.VirtualDevice;
import android.companion.virtual.VirtualDeviceManager;
import android.content.Intent;
import android.graphics.Gainmap;
import android.view.textclassifier.TextClassifier;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wuk0 implements f5y, rb9, w3n0, Predicate, Function, BiFunction, BiPredicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f255224a;

    public /* synthetic */ wuk0(int i) {
        this.f255224a = i;
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ VirtualDevice m89059c(Object obj) {
        return (VirtualDevice) obj;
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ VirtualDeviceManager m89060d(Object obj) {
        return (VirtualDeviceManager) obj;
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ Gainmap m89061f(Object obj) {
        return (Gainmap) obj;
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ TextClassifier m89063i(Object obj) {
        return (TextClassifier) obj;
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ Class m89064j() {
        return VirtualDeviceManager.class;
    }

    @Override // p204p.rb9
    public Object apply(Object obj, Object obj2) {
        switch (this.f255224a) {
            case 7:
                return Boolean.FALSE;
            case 8:
            default:
                return (PlayerState) obj;
            case 9:
                return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: b */
    public Object m89065b(Object obj, Object obj2) {
        switch (this.f255224a) {
            case 0:
                ((l3n) obj).getClass();
                ((tvp0) obj2).getClass();
                return new gvc(4);
            case 1:
                ((l3n) obj).getClass();
                ((cu50) obj2).getClass();
                return new nvc(2);
            case 2:
                ((l3n) obj).getClass();
                ((cu50) obj2).getClass();
                return new pvc(1);
            case 3:
                ((yww0) obj).getClass();
                ((oww0) obj2).getClass();
                return new r790();
            case 28:
                srq srqVar = (srq) obj2;
                ((l3n) obj).getClass();
                srqVar.getClass();
                kq80 kq80Var = srqVar.f213370a;
                jg31.m53271i(kq80Var);
                return new rre(kq80Var, 5);
            default:
                esq esqVar = (esq) obj2;
                ((l3n) obj).getClass();
                esqVar.getClass();
                h4t0 h4t0VarM28868a = be21.m28868a(new pjm(21));
                kq80 kq80Var2 = esqVar.f62457e;
                jg31.m53271i(kq80Var2);
                return new zx2(kq80Var2, (szn) h4t0VarM28868a.get());
        }
    }

    @Override // p204p.w3n0
    /* JADX INFO: renamed from: e */
    public boolean mo71204e(int i, int i2, Intent intent) {
        return false;
    }

    @Override // p204p.f5y
    /* JADX INFO: renamed from: g */
    public c5y[] mo25402g() {
        return new c5y[]{new o4l0()};
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f255224a) {
            case 10:
                return ((i4n0) obj) == i4n0.f98546a;
            default:
                e301 e301Var = (e301) obj;
                return (e301Var.f55573c || e301Var.f55574d) ? false : true;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f255224a) {
            case 12:
                return Observable.just(!((e301) obj).f55572b ? i4n0.f98547b : i4n0.f98546a);
            case 17:
                xul0 xul0Var = (xul0) obj;
                return Boolean.valueOf(xul0Var instanceof hzq0 ? "premium".equals(((hzq0) xul0Var).f96997a) : false);
            case 18:
                xul0 xul0Var2 = (xul0) obj;
                return Boolean.valueOf(xul0Var2 instanceof hzq0 ? "premium".equals(((hzq0) xul0Var2).f96997a) : false);
            case 20:
                return new l241();
            case 21:
                PlayerState playerState = (PlayerState) obj;
                return Boolean.valueOf(playerState.isPlaying() && !playerState.isPaused());
            default:
                return Boolean.valueOf(((e301) obj).f55572b);
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiPredicate
    public boolean test(Object obj, Object obj2) {
        w18 w18VarM89623b = ((x18) obj).m89623b();
        w18VarM89623b.f247014g = 0L;
        x18 x18VarM86977a = w18VarM89623b.m86977a();
        w18 w18VarM89623b2 = ((x18) obj2).m89623b();
        w18VarM89623b2.f247014g = 0L;
        return x18VarM86977a.equals(w18VarM89623b2.m86977a());
    }
}
