package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: p.r0 */
/* JADX INFO: loaded from: classes16.dex */
public final class C2321r0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2435u0 f194340a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f194341b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2321r0(C2435u0 c2435u0, String str) {
        super(0);
        this.f194340a = c2435u0;
        this.f194341b = str;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        C2435u0 c2435u0 = this.f194340a;
        LinkedHashMap linkedHashMap = c2435u0.f225338d;
        String str = this.f194341b;
        synchronized (linkedHashMap) {
            c2435u0.f225338d.remove(str);
        }
        return w2a1.f247311a;
    }
}
