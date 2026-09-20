package p204p;

import com.spotify.genalphagraduation.graduationapi.KidsGraduationException;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes7.dex */
public final class u470 implements Function {

    /* JADX INFO: renamed from: a */
    public static final u470 f226617a = new u470();

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        return Single.error(new KidsGraduationException.RuntimeDependenciesFetchException("Failed to fetch KidsGraduationAccountRuntimeDependencies", (Throwable) obj));
    }
}
