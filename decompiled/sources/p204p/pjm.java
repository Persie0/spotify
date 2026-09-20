package p204p;

import com.comscore.streaming.ContentType;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes10.dex */
public final class pjm implements h4t0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f178278a;

    public /* synthetic */ pjm(int i) {
        this.f178278a = i;
    }

    @Override // p204p.i4t0
    public final Object get() {
        int i = 1;
        int i2 = 0;
        switch (this.f178278a) {
            case 0:
                return new ojm();
            case 1:
                return new dkm();
            case 2:
                return new jmm();
            case 3:
                return Optional.of(BehaviorSubject.m23796g(Boolean.FALSE));
            case 4:
                return new tk9(3);
            case 5:
                return new spm();
            case 6:
                return new h6p();
            case 7:
                return new trm(i2);
            case 8:
                return new trm(i);
            case 9:
                return new vrm();
            case 10:
                AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
                return new pfm0(new qfm0[]{new q040(xgg1.m90662N1("AUDIOBOOK_HYDE_GATE", "audiobook/hyde/gate", ContentType.BUMPER, "audiobook"), xoc1.f263904I1, null)}, false);
            case 11:
                return new izm();
            case 12:
                return new h0n();
            case 13:
                return new ibd0();
            case 14:
                return new kqg0();
            case 15:
                return new v7n();
            case 16:
                return new d8n();
            case 17:
                return new j8n();
            case 18:
                return new xbn();
            case 19:
                return new ku51();
            case 20:
                return new vn80(UUID.randomUUID().toString());
            case 21:
                return new szn();
            case 22:
                return new b1o();
            case 23:
                return jq60.f114818b;
            case 24:
                return new jv31(null, false);
            case 25:
                return new e7o();
            case 26:
                st91 st91Var = st91.f213865b;
                return new dxg0();
            case 27:
                return new cco();
            default:
                return new e2f1();
        }
    }

    public pjm(j7n0 j7n0Var) {
        this.f178278a = 28;
    }
}
