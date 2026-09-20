package p204p;

import android.content.res.Resources;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.completable.CompletableSubscribeOn;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
public final class x3f {

    /* JADX INFO: renamed from: a */
    public final q831 f257800a;

    /* JADX INFO: renamed from: b */
    public final xmv f257801b;

    /* JADX INFO: renamed from: c */
    public final luk f257802c;

    /* JADX INFO: renamed from: d */
    public final Scheduler f257803d;

    /* JADX INFO: renamed from: e */
    public final Resources f257804e;

    public x3f(q831 q831Var, xmv xmvVar, luk lukVar, Scheduler scheduler, Resources resources) {
        this.f257800a = q831Var;
        this.f257801b = xmvVar;
        this.f257802c = lukVar;
        this.f257803d = scheduler;
        this.f257804e = resources;
    }

    /* JADX INFO: renamed from: a */
    public final CompletableSubscribeOn m89788a() {
        return m89794g(R.string.snackbar_added_to_liked_songs);
    }

    /* JADX INFO: renamed from: b */
    public final CompletableSubscribeOn m89789b() {
        return m89794g(R.string.collection_feedback_toast_liked_show_your_library);
    }

    /* JADX INFO: renamed from: c */
    public final CompletableSubscribeOn m89790c() {
        return m89794g(R.string.toast_banned_track);
    }

    /* JADX INFO: renamed from: d */
    public final CompletableSubscribeOn m89791d() {
        return m89794g(R.string.snackbar_removed_from_liked_songs);
    }

    /* JADX INFO: renamed from: e */
    public final CompletableSubscribeOn m89792e() {
        return m89794g(R.string.collection_feedback_toast_removed_from_collection_your_library);
    }

    /* JADX INFO: renamed from: f */
    public final Object m89793f(String str, js3 js3Var, b0p b0pVar) {
        rlv0 rlv0Var = new rlv0();
        Set set = dd41.f47702f;
        Object objM96565n = zn91.m96565n(this.f257801b.m91475a(str, r46.m74726U(str).f47709c).timeout(200L, TimeUnit.MILLISECONDS, Single.error(new TimeoutException())).map(new it9(this, 12)).onErrorReturn(new gl8(this, 13)).flatMapCompletable(new bxb(this, rlv0Var, js3Var, 16)), b0pVar);
        return objM96565n == yuk.f276404a ? objM96565n : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: g */
    public final CompletableSubscribeOn m89794g(int i) {
        return new CompletableFromAction(new ok0(17, this, new g631(null, this.f257804e.getString(i), null, null, null, null, null, null, false))).m23303t(this.f257803d);
    }
}
