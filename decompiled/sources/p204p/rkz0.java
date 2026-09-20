package p204p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes9.dex */
public final class rkz0 {

    /* JADX INFO: renamed from: b */
    public static final fv31 f200183b = fv31.f73628b.m78183U("offline_backup_selected_filter_concept_uri");

    /* JADX INFO: renamed from: a */
    public final Single f200184a;

    public rkz0(Single single) {
        this.f200184a = single;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m75806a(ibk ibkVar) {
        okz0 okz0Var;
        if (ibkVar instanceof okz0) {
            okz0Var = (okz0) ibkVar;
            int i = okz0Var.f166700c;
            if ((i & Integer.MIN_VALUE) != 0) {
                okz0Var.f166700c = i - Integer.MIN_VALUE;
            } else {
                okz0Var = new okz0(this, ibkVar);
            }
        } else {
            okz0Var = new okz0(this, ibkVar);
        }
        Object objM96567o = okz0Var.f166698a;
        int i2 = okz0Var.f166700c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            okz0Var.f166700c = 1;
            objM96567o = zn91.m96567o(this.f200184a, okz0Var);
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
        lv31 lv31VarEdit = ((hv31) objM96567o).edit();
        lv31VarEdit.m60053f(f200183b);
        lv31VarEdit.m60054g();
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m75807b(ibk ibkVar) {
        pkz0 pkz0Var;
        if (ibkVar instanceof pkz0) {
            pkz0Var = (pkz0) ibkVar;
            int i = pkz0Var.f178602c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pkz0Var.f178602c = i - Integer.MIN_VALUE;
            } else {
                pkz0Var = new pkz0(this, ibkVar);
            }
        } else {
            pkz0Var = new pkz0(this, ibkVar);
        }
        Object objM96567o = pkz0Var.f178600a;
        int i2 = pkz0Var.f178602c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            pkz0Var.f178602c = 1;
            objM96567o = zn91.m96567o(this.f200184a, pkz0Var);
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
        return ((hv31) objM96567o).mo48710e(f200183b, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m75808c(String str, ibk ibkVar) {
        qkz0 qkz0Var;
        if (ibkVar instanceof qkz0) {
            qkz0Var = (qkz0) ibkVar;
            int i = qkz0Var.f189680d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qkz0Var.f189680d = i - Integer.MIN_VALUE;
            } else {
                qkz0Var = new qkz0(this, ibkVar);
            }
        } else {
            qkz0Var = new qkz0(this, ibkVar);
        }
        Object objM96567o = qkz0Var.f189678b;
        int i2 = qkz0Var.f189680d;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            qkz0Var.f189677a = str;
            qkz0Var.f189680d = 1;
            objM96567o = zn91.m96567o(this.f200184a, qkz0Var);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = qkz0Var.f189677a;
            bga.m29073P(objM96567o);
        }
        lv31 lv31VarEdit = ((hv31) objM96567o).edit();
        lv31VarEdit.m60051d(f200183b, str);
        lv31VarEdit.m60054g();
        return w2a1.f247311a;
    }
}
