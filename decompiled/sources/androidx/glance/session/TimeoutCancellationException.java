package androidx.glance.session;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p204p.edb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m24212d2 = {"Landroidx/glance/session/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "glance_release"}, m24213k = 1, m24214mv = {1, 8, 0}, m24216xi = 48)
public final class TimeoutCancellationException extends CancellationException {

    /* JADX INFO: renamed from: a */
    public final String f947a;

    /* JADX INFO: renamed from: b */
    public final int f948b;

    public TimeoutCancellationException(String str, int i) {
        super(str);
        this.f947a = str;
        this.f948b = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f947a;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeoutCancellationException(");
        sb.append(this.f947a);
        sb.append(", ");
        return edb.m38567p(sb, this.f948b, ')');
    }
}
