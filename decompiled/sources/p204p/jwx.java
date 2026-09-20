package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;

/* JADX INFO: loaded from: classes2.dex */
public final class jwx {

    /* JADX INFO: renamed from: c */
    public static final ExternalAccessoryDescription f116732c = new ExternalAccessoryDescription("npv_recommendations_widget", null, null, "app_to_app", null, "widget", null, null, null, "media_session", null, 1494, null);

    /* JADX INFO: renamed from: a */
    public final myx f116733a;

    /* JADX INFO: renamed from: b */
    public final luk f116734b;

    public jwx(myx myxVar, luk lukVar) {
        this.f116733a = myxVar;
        this.f116734b = lukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m54485a(String str, d850 d850Var, ibk ibkVar) throws Throwable {
        hwx hwxVar;
        if (ibkVar instanceof hwx) {
            hwxVar = (hwx) ibkVar;
            int i = hwxVar.f96070c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hwxVar.f96070c = i - Integer.MIN_VALUE;
            } else {
                hwxVar = new hwx(this, ibkVar);
            }
        } else {
            hwxVar = new hwx(this, ibkVar);
        }
        Object obj = hwxVar.f96068a;
        int i2 = hwxVar.f96070c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        m5u m5uVar = new m5u(this, str, d850Var, null, 19);
        hwxVar.f96070c = 1;
        Object objM89557A = x0h1.m89557A(this.f116734b, m5uVar, hwxVar);
        yuk yukVar = yuk.f276404a;
        return objM89557A == yukVar ? yukVar : objM89557A;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m54486b(ibk ibkVar) throws Throwable {
        iwx iwxVar;
        if (ibkVar instanceof iwx) {
            iwxVar = (iwx) ibkVar;
            int i = iwxVar.f106527c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iwxVar.f106527c = i - Integer.MIN_VALUE;
            } else {
                iwxVar = new iwx(this, ibkVar);
            }
        } else {
            iwxVar = new iwx(this, ibkVar);
        }
        Object obj = iwxVar.f106525a;
        int i2 = iwxVar.f106527c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        t8s t8sVar = new t8s(this, null, 25);
        iwxVar.f106527c = 1;
        Object objM89557A = x0h1.m89557A(this.f116734b, t8sVar, iwxVar);
        yuk yukVar = yuk.f276404a;
        return objM89557A == yukVar ? yukVar : objM89557A;
    }
}
