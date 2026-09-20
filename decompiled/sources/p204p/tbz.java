package p204p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class tbz extends CancellationException {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f218971a = 1;

    public /* synthetic */ tbz(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        switch (this.f218971a) {
            case 1:
                setStackTrace(new StackTraceElement[0]);
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    public tbz() {
        super("Window insets animation cancelled");
    }
}
