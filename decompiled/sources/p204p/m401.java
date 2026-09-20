package p204p;

import com.spotify.interapp.model.AppProtocol$HelloDetailsAppProtocol$HelloDetails;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class m401 {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f139788a = new ConcurrentHashMap(1);

    /* JADX INFO: renamed from: b */
    public final BehaviorSubject f139789b = BehaviorSubject.m23795f();

    /* JADX INFO: renamed from: a */
    public final void m60752a(b6q b6qVar) {
        AppProtocol$HelloDetailsAppProtocol$HelloDetails appProtocol$HelloDetailsAppProtocol$HelloDetails;
        Integer numValueOf = Integer.valueOf(b6qVar.f24009e);
        ConcurrentHashMap concurrentHashMap = this.f139788a;
        r3r r3rVar = (r3r) concurrentHashMap.get(numValueOf);
        if (r3rVar != null) {
            q3r q3rVar = (q3r) r3rVar.f195562a.get();
            if (q3rVar == null || (appProtocol$HelloDetailsAppProtocol$HelloDetails = q3rVar.f184927a) == null) {
                appProtocol$HelloDetailsAppProtocol$HelloDetails = null;
            }
            if (appProtocol$HelloDetailsAppProtocol$HelloDetails != null) {
                this.f139789b.onNext(new ArrayList(concurrentHashMap.values()));
            }
        }
    }
}
