package p204p;

import android.content.Context;
import android.os.Bundle;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class kid implements fft0 {

    /* JADX INFO: renamed from: a */
    public final twy f122923a;

    /* JADX INFO: renamed from: b */
    public final yho f122924b;

    /* JADX INFO: renamed from: c */
    public final zrr0 f122925c;

    /* JADX INFO: renamed from: d */
    public final Context f122926d;

    /* JADX INFO: renamed from: e */
    public final bx3 f122927e;

    /* JADX INFO: renamed from: f */
    public final cob f122928f;

    /* JADX INFO: renamed from: g */
    public final djs0 f122929g;

    /* JADX INFO: renamed from: h */
    public final up60 f122930h = qpv0.f191387a.mo54112b(h2k0.class);

    public kid(twy twyVar, yho yhoVar, zrr0 zrr0Var, Context context, bx3 bx3Var, cob cobVar, djs0 djs0Var) {
        this.f122923a = twyVar;
        this.f122924b = yhoVar;
        this.f122925c = zrr0Var;
        this.f122926d = context;
        this.f122927e = bx3Var;
        this.f122928f = cobVar;
        this.f122929g = djs0Var;
    }

    @Override // p204p.fft0
    /* JADX INFO: renamed from: a */
    public final up60 mo36355a() {
        return this.f122930h;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0118 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // p204p.fft0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object mo36356b(h2k0 h2k0Var, ibk ibkVar) {
        hid hidVar;
        boolean z;
        Object objM56684z;
        ome0 ome0Var;
        atj0 atj0Var;
        h2k0 h2k0Var2;
        boolean z2;
        Object objM81781A;
        h2k0 h2k0Var3 = h2k0Var;
        if (ibkVar instanceof hid) {
            hidVar = (hid) ibkVar;
            int i = hidVar.f91793g;
            if ((i & Integer.MIN_VALUE) != 0) {
                hidVar.f91793g = i - Integer.MIN_VALUE;
            } else {
                hidVar = new hid(this, ibkVar);
            }
        } else {
            hidVar = new hid(this, ibkVar);
        }
        Object obj = hidVar.f91791e;
        int i2 = hidVar.f91793g;
        int i3 = 0;
        int i4 = 1;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            atj0 atj0Var2 = h2k0Var3.f87016c;
            esz0 esz0Var = h2k0Var3.f87017d;
            String str = atj0Var2.f19702c;
            String str2 = this.f122928f.f40220a;
            Set set = dd41.f47702f;
            String strM61966b = mjd.m61966b(r46.m74726U(str));
            z = (strM61966b == null || str2 == null || !str2.equals(strM61966b)) ? false : true;
            if (z) {
                return new vb20(new jqj0(2), h2k0Var3.f87023j, h2k0Var3.f87016c.f19702c);
            }
            String str3 = esz0Var.f62531b;
            if (str3 == null || str3.length() == 0) {
                str3 = esz0Var.f62530a;
            }
            iid iidVar = new iid(h2k0Var3, str3, this, null);
            hidVar.f91787a = h2k0Var3;
            hidVar.f91790d = z;
            hidVar.f91793g = 1;
            objM56684z = kk40.m56684z(iidVar, hidVar);
            if (objM56684z != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            boolean z3 = hidVar.f91790d;
            h2k0 h2k0Var4 = hidVar.f91787a;
            bga.m29073P(obj);
            z = z3;
            h2k0Var3 = h2k0Var4;
            objM56684z = obj;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
                return obj;
            }
            z2 = hidVar.f91790d;
            ome0Var = hidVar.f91789c;
            atj0 atj0Var3 = hidVar.f91788b;
            h2k0Var2 = hidVar.f91787a;
            bga.m29073P(obj);
            atj0Var = atj0Var3;
        }
        ome0 ome0Var2 = ome0Var;
        String str4 = h2k0Var2.f87019f;
        e8d0 e8d0Var = h2k0Var2.f87018e;
        wdt0 wdt0Var = h2k0Var2.f87023j;
        List list = h2k0Var2.f87021h;
        Bundle bundle = new Bundle();
        bundle.putString("uri", h2k0Var2.f87016c.f19702c);
        tid tidVar = new tid(atj0Var, ome0Var2, str4, e8d0Var, new jid(this, h2k0Var2, i3), new jid(this, h2k0Var2, i4), bundle, wdt0Var, list);
        hidVar.f91787a = null;
        hidVar.f91788b = null;
        hidVar.f91789c = null;
        hidVar.f91790d = z2;
        hidVar.f91793g = 3;
        objM81781A = this.f122923a.m81781A(tidVar, hidVar);
        if (objM81781A != yukVar) {
            return yukVar;
        }
        return objM81781A;
        pqm0 pqm0Var = (pqm0) objM56684z;
        atj0 atj0Var4 = (atj0) pqm0Var.f180350a;
        ome0Var = (ome0) pqm0Var.f180351b;
        hidVar.f91787a = h2k0Var3;
        hidVar.f91788b = atj0Var4;
        hidVar.f91789c = ome0Var;
        hidVar.f91790d = z;
        hidVar.f91793g = 2;
        if (mlg1.m62222o("presenter_type", "chat_message", hidVar) != yukVar) {
            atj0Var = atj0Var4;
            h2k0Var2 = h2k0Var3;
            z2 = z;
            ome0 ome0Var3 = ome0Var;
            String str5 = h2k0Var2.f87019f;
            e8d0 e8d0Var2 = h2k0Var2.f87018e;
            wdt0 wdt0Var2 = h2k0Var2.f87023j;
            List list2 = h2k0Var2.f87021h;
            Bundle bundle2 = new Bundle();
            bundle2.putString("uri", h2k0Var2.f87016c.f19702c);
            tid tidVar2 = new tid(atj0Var, ome0Var3, str5, e8d0Var2, new jid(this, h2k0Var2, i3), new jid(this, h2k0Var2, i4), bundle2, wdt0Var2, list2);
            hidVar.f91787a = null;
            hidVar.f91788b = null;
            hidVar.f91789c = null;
            hidVar.f91790d = z2;
            hidVar.f91793g = 3;
            objM81781A = this.f122923a.m81781A(tidVar2, hidVar);
            if (objM81781A != yukVar) {
                return objM81781A;
            }
        }
        return yukVar;
    }
}
