package p204p;

import com.spotify.jam.features.dialogs.impl.SocialListeningOnboardingActivity;

/* JADX INFO: loaded from: classes7.dex */
public final class hj31 extends ibk {

    /* JADX INFO: renamed from: a */
    public SocialListeningOnboardingActivity f91951a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f91952b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SocialListeningOnboardingActivity f91953c;

    /* JADX INFO: renamed from: d */
    public int f91954d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj31(SocialListeningOnboardingActivity socialListeningOnboardingActivity, ibk ibkVar) {
        super(ibkVar);
        this.f91953c = socialListeningOnboardingActivity;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f91952b = obj;
        this.f91954d |= Integer.MIN_VALUE;
        return SocialListeningOnboardingActivity.m12032u0(this.f91953c, this);
    }
}
