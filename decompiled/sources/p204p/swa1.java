package p204p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class swa1 implements Update {
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        rwa1 rwa1Var = (rwa1) obj2;
        if (rwa1Var instanceof qwa1) {
            return Next.m15605a(Effects.m15571a(new hwa1(((qwa1) rwa1Var).f193219a)));
        }
        if (rwa1Var instanceof owa1) {
            return Next.m15605a(Effects.m15571a(new gwa1(((owa1) rwa1Var).f170683a)));
        }
        if (rwa1Var instanceof pwa1) {
            pwa1 pwa1Var = (pwa1) rwa1Var;
            return Next.m15605a(Effects.m15571a(new iwa1(pwa1Var.f181976a, pwa1Var.f181977b)));
        }
        if (rwa1Var.equals(nwa1.f159077a)) {
            return Next.m15605a(Effects.m15571a(fwa1.f74037a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
