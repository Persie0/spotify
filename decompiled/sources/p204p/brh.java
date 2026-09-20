package p204p;

import com.spotify.mobius.Connection;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class brh implements Connection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30096a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f30097b;

    public /* synthetic */ brh(int i, ArrayList arrayList) {
        this.f30096a = i;
        this.f30097b = arrayList;
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f30096a) {
            case 0:
                Iterator it = this.f30097b.iterator();
                while (it.hasNext()) {
                    ((Connection) it.next()).accept(obj);
                }
                break;
            case 1:
                Iterator it2 = this.f30097b.iterator();
                while (it2.hasNext()) {
                    ((Connection) it2.next()).accept(obj);
                }
                break;
            case 2:
                Iterator it3 = this.f30097b.iterator();
                while (it3.hasNext()) {
                    ((Connection) it3.next()).accept(obj);
                }
                break;
            case 3:
                Iterator it4 = this.f30097b.iterator();
                while (it4.hasNext()) {
                    ((Connection) it4.next()).accept(obj);
                }
                break;
            default:
                Iterator it5 = this.f30097b.iterator();
                while (it5.hasNext()) {
                    ((Connection) it5.next()).accept(obj);
                }
                break;
        }
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.disposables.Disposable
    public final void dispose() {
        switch (this.f30096a) {
            case 0:
                Iterator it = this.f30097b.iterator();
                while (it.hasNext()) {
                    ((Connection) it.next()).dispose();
                }
                break;
            case 1:
                Iterator it2 = this.f30097b.iterator();
                while (it2.hasNext()) {
                    ((Connection) it2.next()).dispose();
                }
                break;
            case 2:
                Iterator it3 = this.f30097b.iterator();
                while (it3.hasNext()) {
                    ((Connection) it3.next()).dispose();
                }
                break;
            case 3:
                Iterator it4 = this.f30097b.iterator();
                while (it4.hasNext()) {
                    ((Connection) it4.next()).dispose();
                }
                break;
            default:
                Iterator it5 = this.f30097b.iterator();
                while (it5.hasNext()) {
                    ((Connection) it5.next()).dispose();
                }
                break;
        }
    }
}
