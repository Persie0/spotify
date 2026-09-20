package p204p;

import com.spotify.genalphagraduation.graduationapi.KidsGraduationException;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes7.dex */
public final class t470 implements Function {

    /* JADX INFO: renamed from: a */
    public static final t470 f216931a = new t470();

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        dt10 dt10Var = (dt10) obj;
        String str = dt10Var.f52694a;
        if (dt10Var.f52695b) {
            return Single.error(new KidsGraduationException.GraduationGeoIpMismatchException("GeoIP mismatch", null));
        }
        return str.length() == 0 ? Single.error(new KidsGraduationException.GraduationTokenFetchException("Graduation token is empty", null)) : Single.just(str);
    }
}
