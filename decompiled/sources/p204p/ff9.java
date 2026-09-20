package p204p;

import org.java_websocket.exceptions.InvalidDataException;

/* JADX INFO: loaded from: classes16.dex */
public final class ff9 extends fmk {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f68950i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ff9(int i, int i2) {
        super(i, 1);
        this.f68950i = i2;
    }

    @Override // p204p.fmk
    /* JADX INFO: renamed from: b */
    public void mo41513b() throws InvalidDataException {
        switch (this.f68950i) {
            case 2:
                if (!uuc.m83976a(this.f71065c)) {
                    throw new InvalidDataException(1007, "Received text is no valid utf8 string!");
                }
                return;
            default:
                super.mo41513b();
                return;
        }
    }
}
