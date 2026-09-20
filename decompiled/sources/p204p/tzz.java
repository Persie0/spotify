package p204p;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class tzz implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f225324a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f225325b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f225326c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f225327d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f225328e;

    public /* synthetic */ tzz(String str, Context context, Object obj, int i, int i2) {
        this.f225324a = i2;
        this.f225325b = str;
        this.f225326c = context;
        this.f225328e = obj;
        this.f225327d = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f225324a) {
            case 0:
                Object[] objArr = {(pzz) this.f225328e};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return vzz.m86917b(this.f225325b, this.f225326c, Collections.unmodifiableList(arrayList), this.f225327d);
            default:
                try {
                    return vzz.m86917b(this.f225325b, this.f225326c, (List) this.f225328e, this.f225327d);
                } catch (Throwable unused) {
                    return new uzz(-3);
                }
        }
    }
}
