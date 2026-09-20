package p204p;

import com.spotify.genalphagraduation.graduationapi.KidsGraduationException;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes7.dex */
public final class x470 implements Function {

    /* JADX INFO: renamed from: a */
    public static final x470 f258002a = new x470();

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        return Single.error(new KidsGraduationException.LogoutUserException("Failed to fetch logged-in dependencies", (Throwable) obj));
    }
}
