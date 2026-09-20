package p204p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final class lyb implements Connectable {

    /* JADX INFO: renamed from: b */
    public static final lyb f138021b = new lyb(0);

    /* JADX INFO: renamed from: c */
    public static final lyb f138022c = new lyb(1);

    /* JADX INFO: renamed from: d */
    public static final lyb f138023d = new lyb(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f138024a;

    public /* synthetic */ lyb(int i) {
        this.f138024a = i;
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        switch (this.f138024a) {
            case 0:
                return new kyb(0);
            case 1:
                return new kyb(1);
            case 2:
                return new kyb(3);
            default:
                return new kyb(2);
        }
    }
}
