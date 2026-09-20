package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class wof1 extends Throwable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f253467a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wof1(String str, int i) {
        super(str);
        this.f253467a = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        int i = this.f253467a;
        return this;
    }
}
