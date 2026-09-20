package p204p;

import com.spotify.extendedmetadata.extensions.extendedcreditsimpl.proto.ExtendedCredits;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class yox implements aqx {
    @Override // p204p.aqx
    /* JADX INFO: renamed from: a */
    public final ktx mo26903a(byte[] bArr) {
        ae50<ExtendedCredits.Credit> ae50VarM10127n = ExtendedCredits.m10126o(bArr).m10127n();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM10127n, 10));
        for (ExtendedCredits.Credit credit : ae50VarM10127n) {
            arrayList.add(new ksl(credit.m10131q(), credit.m10129o(), credit.m10128n(), credit.m10130p(), credit.getRole()));
        }
        return new xox(arrayList);
    }

    @Override // p204p.aqx
    /* JADX INFO: renamed from: b */
    public final int mo26904b() {
        return 96;
    }

    @Override // p204p.aqx
    public final Class type() {
        return xox.class;
    }
}
