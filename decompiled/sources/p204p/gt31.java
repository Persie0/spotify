package p204p;

import java.io.File;

/* JADX INFO: loaded from: classes8.dex */
public final class gt31 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f84083a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ it31 f84084b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gt31(it31 it31Var, int i) {
        super(0);
        this.f84083a = i;
        this.f84084b = it31Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        Object c6x0Var;
        switch (this.f84083a) {
            case 0:
                File file = new File(this.f84084b.f105411a.getCacheDir(), "music-quiz-sound-effects");
                file.mkdirs();
                return file;
            default:
                it31 it31Var = this.f84084b;
                try {
                    c6x0Var = new File(it31Var.m51602e(), "metadata.json").exists() ? (y3b) it31Var.f105414d.m41880a(pxy.m71564X(new File(it31Var.m51602e(), "metadata.json")), y3b.Companion.serializer()) : new y3b();
                    break;
                } catch (Throwable th) {
                    c6x0Var = new c6x0(th);
                }
                if (s6x0.m77348a(c6x0Var) != null) {
                    File[] fileArrListFiles = it31Var.m51602e().listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            file2.delete();
                        }
                    }
                    c6x0Var = new y3b();
                }
                return (y3b) c6x0Var;
        }
    }
}
