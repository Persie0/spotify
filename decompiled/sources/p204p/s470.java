package p204p;

import com.spotify.genalphagraduation.graduationapi.KidsGraduationException;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes7.dex */
public final class s470 implements Function {

    /* JADX INFO: renamed from: a */
    public static final s470 f205507a = new s470();

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        return Single.error(new KidsGraduationException.GraduationTokenFetchException("Failed to fetch graduation token", (Throwable) obj));
    }
}
