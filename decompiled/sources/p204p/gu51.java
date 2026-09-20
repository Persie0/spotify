package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gu51 {

    /* JADX INFO: renamed from: a */
    public final String f84379a;

    public gu51(String str, StackTraceElement[] stackTraceElementArr) {
        this.f84379a = str;
    }

    /* JADX INFO: renamed from: a */
    public final RuntimeException m45723a(String str) {
        RuntimeException runtimeException = new RuntimeException(str);
        runtimeException.setStackTrace(iag1.f100255a);
        return runtimeException;
    }

    /* JADX INFO: renamed from: b */
    public final String m45724b() {
        return this.f84379a;
    }
}
