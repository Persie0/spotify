package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class gse1 implements jcj {

    /* JADX INFO: renamed from: a */
    public final q8p f83949a;

    public gse1(q8p q8pVar) {
        this.f83949a = q8pVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        icj icjVar = (icj) obj;
        if (icjVar.f100828b instanceof hbj) {
            return icjVar.f100827a ? dcj.f47567a : new gcj(icjVar.f100829c.m98206s().getTagName());
        }
        return (hcj) this.f83949a.invoke(icjVar);
    }
}
