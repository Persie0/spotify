package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class r160 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f194775a;

    /* JADX INFO: renamed from: b */
    public final Object f194776b;

    public /* synthetic */ r160(Object obj, int i) {
        this.f194775a = i;
        this.f194776b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX INFO: renamed from: a */
    public final Object m74460a(ibk ibkVar) {
        q160 q160Var;
        d0y0 d0y0Var;
        switch (this.f194775a) {
            case 0:
                if (ibkVar instanceof q160) {
                    q160Var = (q160) ibkVar;
                    int i = q160Var.f184221c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        q160Var.f184221c = i - Integer.MIN_VALUE;
                    } else {
                        q160Var = new q160(this, ibkVar);
                    }
                } else {
                    q160Var = new q160(this, ibkVar);
                }
                Object objM96567o = q160Var.f184219a;
                int i2 = q160Var.f184221c;
                if (i2 == 0) {
                    bga.m29073P(objM96567o);
                    Single singleFirstOrError = ((Observable) this.f194776b).firstOrError();
                    q160Var.f184221c = 1;
                    objM96567o = zn91.m96567o(singleFirstOrError, q160Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM96567o == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM96567o);
                }
                return ((Boolean) objM96567o).booleanValue() ? new C2606ya(1) : C2526wa.f249307a;
            default:
                if (ibkVar instanceof d0y0) {
                    d0y0Var = (d0y0) ibkVar;
                    int i3 = d0y0Var.f44106c;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        d0y0Var.f44106c = i3 - Integer.MIN_VALUE;
                    } else {
                        d0y0Var = new d0y0(this, ibkVar);
                    }
                } else {
                    d0y0Var = new d0y0(this, ibkVar);
                }
                Object objM96567o2 = d0y0Var.f44104a;
                int i4 = d0y0Var.f44106c;
                if (i4 == 0) {
                    bga.m29073P(objM96567o2);
                    Single singleM49856q = ((i780) this.f194776b).m49856q();
                    d0y0Var.f44106c = 1;
                    objM96567o2 = zn91.m96567o(singleM49856q, d0y0Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objM96567o2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM96567o2);
                }
                return ((Boolean) objM96567o2).booleanValue() ? C2526wa.f249307a : new C2606ya(4);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m74461b(xz8 xz8Var) {
        switch (this.f194775a) {
            case 0:
                Set set = dd41.f47702f;
                return r46.m74726U(xz8Var.f267544a.f19702c).f47709c == gn80.JAM_PENDING_REQUESTS_SHEET;
            default:
                return xz8Var.f267549f;
        }
    }
}
