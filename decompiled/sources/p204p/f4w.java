package p204p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f4w implements Update {

    /* JADX INFO: renamed from: a */
    public static final f4w f65846a = new f4w();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        x3w x3wVar = (x3w) obj2;
        if (x3wVar instanceof v3w) {
            return Next.m15606h(((v3w) x3wVar).f236943a);
        }
        if (x3wVar instanceof w3w) {
            return Next.m15605a(Effects.m15571a(new s3w(((w3w) x3wVar).f247657a)));
        }
        throw new NoWhenBranchMatchedException();
    }
}
