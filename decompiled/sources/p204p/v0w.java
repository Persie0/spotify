package p204p;

import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFilter;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class v0w {

    /* JADX INFO: renamed from: a */
    public final Flowable f236149a;

    public /* synthetic */ v0w(Flowable flowable) {
        this.f236149a = flowable;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m84412a(int i, String str, ibk ibkVar) {
        ycp0 ycp0Var;
        if (ibkVar instanceof ycp0) {
            ycp0Var = (ycp0) ibkVar;
            int i2 = ycp0Var.f271543c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ycp0Var.f271543c = i2 - Integer.MIN_VALUE;
            } else {
                ycp0Var = new ycp0(this, ibkVar);
            }
        } else {
            ycp0Var = new ycp0(this, ibkVar);
        }
        Object objM86757v = ycp0Var.f271541a;
        int i3 = ycp0Var.f271543c;
        rcp0 rcp0Var = rcp0.f197911a;
        try {
            if (i3 == 0) {
                bga.m29073P(objM86757v);
                FlowableFilter flowableFilterM23360y = this.f236149a.m23360y(new d7f1(str, 7));
                d0k[] d0kVarArr = bmu0.f28619a;
                onc oncVar = new onc(flowableFilterM23360y);
                hvi0 hvi0Var = cks.f39079b;
                ysk yskVarM46157w = gyf1.m46157w(oncVar, jwg1.m54449D(i, ils.MILLISECONDS));
                ycp0Var.f271543c = 1;
                objM86757v = vyf1.m86757v(yskVarM46157w, ycp0Var);
                yuk yukVar = yuk.f276404a;
                if (objM86757v == yukVar) {
                    return yukVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM86757v);
            }
            return ((PlayerState) objM86757v) != null ? pcp0.f176195a : rcp0Var;
        } catch (TimeoutCancellationException unused) {
            return rcp0Var;
        } catch (Throwable th) {
            return new qcp0(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m84413b(String str, ibk ibkVar) {
        zcp0 zcp0Var;
        if (ibkVar instanceof zcp0) {
            zcp0Var = (zcp0) ibkVar;
            int i = zcp0Var.f281559c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zcp0Var.f281559c = i - Integer.MIN_VALUE;
            } else {
                zcp0Var = new zcp0(this, ibkVar);
            }
        } else {
            zcp0Var = new zcp0(this, ibkVar);
        }
        Object objM86757v = zcp0Var.f281557a;
        int i2 = zcp0Var.f281559c;
        vcp0 vcp0Var = vcp0.f240243a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM86757v);
                FlowableFilter flowableFilterM23360y = this.f236149a.m23360y(new it2(str, 7));
                d0k[] d0kVarArr = bmu0.f28619a;
                onc oncVar = new onc(flowableFilterM23360y);
                hvi0 hvi0Var = cks.f39079b;
                ysk yskVarM46157w = gyf1.m46157w(oncVar, jwg1.m54450E(60000L, ils.MILLISECONDS));
                zcp0Var.f281559c = 1;
                objM86757v = vyf1.m86757v(yskVarM46157w, zcp0Var);
                yuk yukVar = yuk.f276404a;
                if (objM86757v == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM86757v);
            }
            return ((PlayerState) objM86757v) != null ? ucp0.f229095a : vcp0Var;
        } catch (TimeoutCancellationException unused) {
            return vcp0Var;
        } catch (Throwable th) {
            return new tcp0(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public Object m84414c(ibk ibkVar) {
        vya1 vya1Var;
        if (ibkVar instanceof vya1) {
            vya1Var = (vya1) ibkVar;
            int i = vya1Var.f246035c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vya1Var.f246035c = i - Integer.MIN_VALUE;
            } else {
                vya1Var = new vya1(this, ibkVar);
            }
        } else {
            vya1Var = new vya1(this, ibkVar);
        }
        Object obj = vya1Var.f246033a;
        int i2 = vya1Var.f246035c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        Single singleM23327A = this.f236149a.m23360y(qyq0.f193996T0).m23331J(f8r0.f67055V0).m23327A();
        vya1Var.f246035c = 1;
        Object objM96567o = zn91.m96567o(singleM23327A, vya1Var);
        yuk yukVar = yuk.f276404a;
        return objM96567o == yukVar ? yukVar : objM96567o;
    }
}
