package com.ravelin.core.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.dq60;
import p204p.wj50;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, m24212d2 = {"Lcom/ravelin/core/model/RavelinError;", "", "", "message", "stackTrace", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ravelin/core/model/RavelinError;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getMessage", "b", "getStackTrace", "core_release"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final /* data */ class RavelinError {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String message;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String stackTrace;

    public RavelinError(String str, String str2) {
        this.message = str;
        this.stackTrace = str2;
    }

    public static /* synthetic */ RavelinError copy$default(RavelinError ravelinError, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ravelinError.message;
        }
        if ((i & 2) != 0) {
            str2 = ravelinError.stackTrace;
        }
        return ravelinError.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStackTrace() {
        return this.stackTrace;
    }

    public final RavelinError copy(String message, String stackTrace) {
        return new RavelinError(message, stackTrace);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RavelinError)) {
            return false;
        }
        RavelinError ravelinError = (RavelinError) other;
        return wj50.m88271j(this.message, ravelinError.message) && wj50.m88271j(this.stackTrace, ravelinError.stackTrace);
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getStackTrace() {
        return this.stackTrace;
    }

    public int hashCode() {
        String str = this.message;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.stackTrace;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return dq60.m36615o("RavelinError(message=", this.message, ", stackTrace=", this.stackTrace, ")");
    }

    public /* synthetic */ RavelinError(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
