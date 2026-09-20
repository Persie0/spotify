package p204p;

/* JADX INFO: loaded from: classes3.dex */
public interface vu40 {
    /* JADX INFO: renamed from: a */
    boolean mo81548a();

    /* JADX INFO: renamed from: b */
    default tu40 m86410b(boolean z) {
        String uri = getUri();
        String uid = getUid();
        boolean zMo81548a = mo81548a();
        return new tu40(uri, uid, getContextUri(), mo81549c(), z, zMo81548a, mo81553g(), mo81550d(), mo81552f(), mo81551e());
    }

    /* JADX INFO: renamed from: c */
    String mo81549c();

    /* JADX INFO: renamed from: d */
    boolean mo81550d();

    /* JADX INFO: renamed from: e */
    boolean mo81551e();

    /* JADX INFO: renamed from: f */
    boolean mo81552f();

    /* JADX INFO: renamed from: g */
    boolean mo81553g();

    String getContextUri();

    String getUid();

    String getUri();
}
