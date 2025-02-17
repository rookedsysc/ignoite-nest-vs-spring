package org.rookedsysc.ignitespring.post.domain.usecase

import org.rookedsysc.ignitespring.post.infrastructure.web.dto.PostCreateDto

interface PostCreateUsecase {
    fun execute(postCreateDto: PostCreateDto): Unit
}
