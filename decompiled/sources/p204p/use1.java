package p204p;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.play_billing.zzfa;
import io.reactivex.rxjava3.functions.Function;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import spotify.your_library.esperanto.proto.YourLibraryRequest;

/* JADX INFO: loaded from: classes6.dex */
public final class use1 implements Function, y8f1, lhf1, j890 {

    /* JADX INFO: renamed from: a */
    public Object f233622a;

    public /* synthetic */ use1(Object obj) {
        this.f233622a = obj;
    }

    @Override // p204p.j890
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ void mo52700a(Object obj) {
        DataHolder dataHolder = (DataHolder) this.f233622a;
        try {
            ((ado) obj).mo24626d(new jfo(dataHolder));
        } finally {
            dataHolder.close();
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        pqm0 pqm0Var = (pqm0) obj;
        return ((vse1) this.f233622a).f244417a.m81347b((YourLibraryRequest) pqm0Var.f180350a).map(new py51((cse1) pqm0Var.f180351b, 20));
    }

    /* JADX INFO: renamed from: b */
    public void m83881b(int i, Object obj, w9g1 w9g1Var) throws zzfa {
        v0g1 v0g1Var = (v0g1) this.f233622a;
        sxf1 sxf1Var = (sxf1) obj;
        v0g1Var.m84387K(i, 2);
        v0g1Var.m84389M(sxf1Var.mo74645c(w9g1Var));
        w9g1Var.mo28480f(sxf1Var, this);
    }

    @Override // p204p.lhf1
    /* JADX INFO: renamed from: c */
    public void mo29655c(long j, long j2, String str, long j3) {
        ejf1 ejf1Var = (ejf1) this.f233622a;
        try {
            ejf1Var.m1493a(new eif1(ejf1Var, new Status(2103, null, null, null)));
        } catch (IllegalStateException unused) {
            ydw0.f271863j.m83850c("Result already set when calling onRequestReplaced", new Object[0]);
        }
        Iterator it = ejf1Var.f60221Z0.f271871h.iterator();
        while (it.hasNext()) {
            ((aqg1) it.next()).m26797e(str, j, 2103, j2, j3);
        }
    }

    @Override // p204p.lhf1
    /* JADX INFO: renamed from: d */
    public void mo29656d(String str, long j, int i, Object obj, long j2, long j3) {
        int i2;
        ejf1 ejf1Var = (ejf1) this.f233622a;
        try {
            i2 = i;
            try {
                ejf1Var.m1493a(new eif1(new Status(i2, null, null, null)));
            } catch (IllegalStateException unused) {
                ydw0.f271863j.m83850c("Result already set when calling onRequestCompleted", new Object[0]);
            }
        } catch (IllegalStateException unused2) {
            i2 = i;
        }
        Iterator it = ejf1Var.f60221Z0.f271871h.iterator();
        while (it.hasNext()) {
            ((aqg1) it.next()).m26797e(str, j, i2, j2, j3);
            i2 = i;
        }
    }

    @Override // p204p.j890
    /* JADX INFO: renamed from: e */
    public void mo52701e() {
        ((DataHolder) this.f233622a).close();
    }

    @Override // p204p.y8f1
    public Object zza(String str) {
        a9f1 a9f1Var = (a9f1) this.f233622a;
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                return a9f1Var.mo24339b(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return a9f1Var.mo24339b(str, null);
    }
}
