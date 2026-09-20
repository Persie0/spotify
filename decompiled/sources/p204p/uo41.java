package p204p;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class uo41 extends ln91 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f232330c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f232331d;

    public /* synthetic */ uo41(Object obj, int i) {
        this.f232330c = i;
        this.f232331d = obj;
    }

    @Override // p204p.mo91
    /* JADX INFO: renamed from: a */
    public boolean mo45445a() {
        switch (this.f232330c) {
            case 1:
                return false;
            default:
                return super.mo45445a();
        }
    }

    @Override // p204p.mo91
    /* JADX INFO: renamed from: e */
    public boolean mo26562e() {
        switch (this.f232330c) {
            case 1:
                return ((Map) this.f232331d).isEmpty();
            default:
                return super.mo26562e();
        }
    }

    @Override // p204p.ln91
    /* JADX INFO: renamed from: g */
    public final ho91 mo59492g(jn91 jn91Var) {
        switch (this.f232330c) {
            case 0:
                if (((ArrayList) this.f232331d).contains(jn91Var)) {
                    return so91.m78639j((bo91) jn91Var.mo25169G());
                }
                return null;
            default:
                return (ho91) ((Map) this.f232331d).get(jn91Var);
        }
    }
}
