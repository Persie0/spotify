package p204p;

import android.content.Context;
import com.ravelin.core.model.Events;
import com.ravelin.core.model.RavelinError;
import com.ravelin.core.repository.RavelinFingerprintWorker;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes11.dex */
public final class nab0 extends n1f1 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f152015h;

    /* JADX INFO: renamed from: i */
    public final String f152016i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nab0(Context context, String str, h2f1 h2f1Var, int i) {
        super(context, str, h2f1Var);
        this.f152015h = i;
        this.f152016i = str;
    }

    @Override // p204p.n1f1, p204p.p2f1
    /* JADX INFO: renamed from: b */
    public void mo63481b(lau0 lau0Var) {
        switch (this.f152015h) {
            case 0:
                x8b x8bVarMo63482c = mo63482c();
                if (!x8bVarMo63482c.mo52179f()) {
                    x8bVarMo63482c.mo52182p(new mab0(lau0Var, 0));
                } else if (lau0Var != null) {
                    lau0Var.mo46940a(new RavelinError("This request is already enqueued", null, 2, null));
                }
                break;
            default:
                super.mo63481b(lau0Var);
                break;
        }
    }

    @Override // p204p.n1f1
    /* JADX INFO: renamed from: c */
    public final x8b mo63482c() {
        switch (this.f152015h) {
            case 0:
                return this.f149412c.f86966a.m79874c(edb.m38564m("token ", this.f152016i), this.f149414e);
            default:
                return h2f1.m46487a(this.f149412c, edb.m38564m("token ", this.f152016i), this.f149413d);
        }
    }

    @Override // p204p.n1f1
    /* JADX INFO: renamed from: d */
    public String mo63483d() {
        switch (this.f152015h) {
            case 1:
                return "RavelinSendFingerprint";
            default:
                return super.mo63483d();
        }
    }

    @Override // p204p.n1f1
    /* JADX INFO: renamed from: e */
    public a8j mo63484e() {
        switch (this.f152015h) {
            case 1:
                return new a8j(new thj0(null), 2, false, false, false, false, -1L, -1L, g6f.m43736n1(new LinkedHashSet()));
            default:
                return super.mo63484e();
        }
    }

    @Override // p204p.n1f1
    /* JADX INFO: renamed from: f */
    public sco mo63485f() {
        switch (this.f152015h) {
            case 1:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("Api", this.f152016i);
                linkedHashMap.put("Payload", q0f1.m71831e(new p4b1(13)).m41881b(epv0.m39700t(Events.INSTANCE.serializer()), this.f149413d));
                sco scoVar = new sco(linkedHashMap);
                n0e1.m63412T(scoVar);
                return scoVar;
            default:
                return super.mo63485f();
        }
    }

    @Override // p204p.n1f1
    /* JADX INFO: renamed from: g */
    public Class mo63486g() {
        switch (this.f152015h) {
            case 1:
                return RavelinFingerprintWorker.class;
            default:
                return super.mo63486g();
        }
    }
}
