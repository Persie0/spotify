package com.spotify.contribution.repositoryimpl;

import com.spotify.campfire.contribution.proto.p037v1.ErrorStatus;

/* JADX INFO: renamed from: com.spotify.contribution.repositoryimpl.b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC0564b {
    /* JADX INFO: renamed from: a */
    public static final ContributionApiError.ServerError m8033a(ErrorStatus errorStatus) {
        return new ContributionApiError.ServerError(errorStatus.m4323n(), errorStatus.getMessage());
    }
}
