# jwp-shopping-cart

# 장바구니 미션 

## 💡프로젝트 개요
- 상품 목록을 보고 장바구니에 담을 수 있는 웹 애플리케이션 프로젝트입니다.
---


## 📋 구현 기능 목록

## Task 정리
- [X] 상품 목록 페이지 연동
  - [X] '/products' url로 이동 시 product 페이지 볼 수 있도록 연동하기
- [X] 관리자 도구 페이지 연동
  - [X] '/admin' url로 이동 시 product 페이지 볼 수 있도록 연동하기
- 상품관리 CRUD API 작성
  - 상품 목록 페이지는 등록된 모든 상품을 Read 한다.
- 관리자 도구 페이지 CRUD API 작성
  - [X] 관리자 도구 페이지는 등록되어 있는 단일 상품의 정보를 Create 한다.
  - [X] 관리자 도구 페이지는 등록된 모든 상품을 Read 한다.
  - [X] 관리자 도구 페이지는 등록되어 있는 단일 상품의 정보를 Update 한다.
  - 관리자 도구 페이지는 등록되어 있는 단일 상품의 정보를 Delete 한다.


## domain(model)
- [X] 상품 기본 정보는 상품 ID, 상품 이름, 상품 이미지, 상품 가격들을 포함한다.
- [X] 도메인에 종속된 검증 기능
  - [X] 상품 이름 길이는 1 ~ 10자로 제한한다.
  - [X] 가격 산정 범위는 1000원 ~ 100만원 사이다.


## 예외 처리
- 값의 null 검증

