package p204p;

import com.android.installreferrer.api.InstallReferrerClient;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class rpm0 implements eiq0 {

    /* JADX INFO: renamed from: e */
    public static final HashSet f201613e = s601.m77303f0("huawei");

    /* JADX INFO: renamed from: a */
    public final spm0 f201614a;

    /* JADX INFO: renamed from: b */
    public final InstallReferrerClient f201615b;

    /* JADX INFO: renamed from: c */
    public final u7p f201616c;

    /* JADX INFO: renamed from: d */
    public final Single f201617d;

    public rpm0(spm0 spm0Var, InstallReferrerClient installReferrerClient, u7p u7pVar, wc20 wc20Var, Scheduler scheduler) {
        this.f201614a = spm0Var;
        this.f201615b = installReferrerClient;
        this.f201616c = u7pVar;
        this.f201617d = Single.fromCallable(new ic9(this, 12)).flatMap(new wel0(this, 3)).subscribeOn(scheduler).cache();
    }

    @Override // p204p.eiq0
    /* JADX INFO: renamed from: a */
    public final Single mo39110a() {
        return this.f201617d;
    }
}
